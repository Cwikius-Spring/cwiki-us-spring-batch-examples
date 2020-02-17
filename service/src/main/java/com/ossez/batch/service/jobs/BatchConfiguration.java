package com.ossez.batch.service.jobs;

import com.ossez.batch.service.JobCompletionNotificationListener;
import com.ossez.batch.service.model.User;
import com.ossez.batch.service.steps.LineProcessor;
import com.ossez.batch.service.steps.LineReader;
import com.ossez.batch.service.steps.LinesWriter;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BatchConfiguration {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Bean
    public ItemReader<User> itemReader() {
        return new LineReader();
    }

    @Bean
    public ItemProcessor<User, User> itemProcessor() {
        return new LineProcessor();
    }

    @Bean
    public ItemWriter<User> itemWriter() {
        return new LinesWriter();
    }


    @Bean
    public Job importUserJob(JobCompletionNotificationListener listener, Step step1) {
        return jobBuilderFactory.get("importUserJob")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .flow(step1)
                .end()
                .build();
    }

    @Bean
    public Step step1(ItemReader<User> itemReader, ItemProcessor<User, User> itemProcessor, ItemWriter<User> itemWriter) {
        return stepBuilderFactory.get("step1")
                .<User, User>chunk(100)
                .reader(itemReader)
                .processor(itemProcessor)
                .writer(itemWriter)
                .build();
    }


}
