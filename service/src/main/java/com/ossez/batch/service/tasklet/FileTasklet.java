package com.ossez.batch.service.tasklet;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.core.io.Resource;

/**
 *
 */
public class FileTasklet implements Tasklet {
    private final Logger logger = LoggerFactory.getLogger(FileTasklet.class);
    private Resource directory;

    public FileTasklet(Resource directory) {
        this.directory = directory;
    }

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        logger.info(">>++>{}", new DateTime().getMillis());

        return RepeatStatus.FINISHED;
    }
}
