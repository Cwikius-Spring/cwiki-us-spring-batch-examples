package com.ossez.batch.service.step;

import com.ossez.batch.service.model.User;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LinesWriter implements ItemWriter<User>, StepExecutionListener {

    private final Logger logger = LoggerFactory.getLogger(LinesWriter.class);
    //    private FileUtils fu;
    public static final String MY_QUEUE_NAME = "com.ossez.real.estate";


    @Autowired
    private RabbitTemplate rabbitTemplate;
    private CachingConnectionFactory cachingConnectionFactory;

    @Bean
    Queue myQueue() {
        Map<String, Object> args = new HashMap<>();
        args.put("x-queue-type", "classic");

        return new Queue(MY_QUEUE_NAME, true, false, false, args);
    }

    @Override
    public void beforeStep(StepExecution stepExecution) {
        rabbitTemplate.setRoutingKey(MY_QUEUE_NAME);
        rabbitTemplate.setDefaultReceiveQueue(MY_QUEUE_NAME);
    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        cachingConnectionFactory = (CachingConnectionFactory) rabbitTemplate.getConnectionFactory();
        cachingConnectionFactory.destroy();
        return ExitStatus.COMPLETED;
    }

    @Override
    public void write(List<? extends User> items) throws Exception {

        DateTime dateTime = new DateTime();

//        items.parallelStream().forEach(item -> rabbitTemplate.convertAndSend(item));
//        for (Listing item : items) {
//            rabbitTemplate.convertAndSend(item);
//        }

        logger.info(">------->>{}", new DateTime().getMillis() - dateTime.getMillis());

//        rabbitTemplate.stop();
    }
}
