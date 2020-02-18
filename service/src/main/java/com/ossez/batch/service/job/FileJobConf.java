package com.ossez.batch.service.job;

import com.ossez.batch.service.JobCompletionNotificationListener;
import com.ossez.batch.service.tasklet.FileTasklet;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
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

    //--- JOB ---
    @Bean
    public Job fileClean(JobCompletionNotificationListener listener, Step readFilesStep, Step deleteFilesStep) {
        return jobBuilderFactory.get("cloudClean")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .flow(readFilesStep).next(deleteFilesStep)
                .end()
                .build();
    }

    //--- STEP ---
    @Bean
    public Step readFilesStep(StepBuilderFactory stepBuilders) {
        return stepBuilders.get("readFilesStep")
                .tasklet(fileReadTasklet()).build();
    }

    @Bean
    public Step deleteFilesStep(StepBuilderFactory stepBuilders) {
        return stepBuilders.get("deleteFilesStep")
                .tasklet(fileDeletingTasklet()).build();
    }

    //--- TASKLET ---
    @Bean
    public FileTasklet fileReadTasklet() {
        return new FileTasklet(
                new FileSystemResource("target/test-inputs"));
    }

    @Bean
    public FileTasklet fileDeletingTasklet() {
        return new FileTasklet(
                new FileSystemResource("target/test-inputs"));
    }
}
