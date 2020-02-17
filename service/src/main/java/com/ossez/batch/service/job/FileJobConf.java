package com.ossez.batch.service.job;

import com.ossez.batch.service.JobCompletionNotificationListener;
import com.ossez.batch.service.model.User;
import com.ossez.batch.service.tasklet.FileTasklet;
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
import org.springframework.core.io.FileSystemResource;

@Configuration
public class FileJobConf {
    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Bean
    public Job cloudClean(JobCompletionNotificationListener listener, Step stepAws, Step deleteFilesStep) {
        return jobBuilderFactory.get("cloudClean")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .flow(stepAws).next(deleteFilesStep)
                .end()
                .build();
    }

    @Bean
    public Step stepAws(ItemReader<User> itemReader, ItemProcessor<User, User> itemProcessor, ItemWriter<User> awsWriter) {
        return stepBuilderFactory.get("step1")
                .<User, User>chunk(100)
                .reader(itemReader)
                .processor(itemProcessor)
                .writer(awsWriter)
                .build();
    }

    @Bean
    public Step deleteFilesStep(StepBuilderFactory stepBuilders) {
        return stepBuilders.get("deleteFilesStep")
                .tasklet(fileDeletingTasklet()).build();
    }


    @Bean
    public FileTasklet fileDeletingTasklet() {
        return new FileTasklet(
                new FileSystemResource("target/test-inputs"));
    }

}
