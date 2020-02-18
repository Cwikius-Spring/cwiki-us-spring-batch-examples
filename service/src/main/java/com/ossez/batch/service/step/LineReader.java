package com.ossez.batch.service.step;

import com.ossez.batch.service.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.item.ItemReader;

import java.util.ArrayList;
import java.util.List;

public class LineReader implements ItemReader<User>, StepExecutionListener {

    private final Logger logger = LoggerFactory.getLogger(LineReader.class);
    private int nextUserIndex;
    private List<User> userList = new ArrayList<User>();

    @Override
    public void beforeStep(StepExecution stepExecution) {
//        fu = new FileUtils("taskletsvschunks/input/tasklets-vs-chunks.csv");
        User user = new User();
        user.setFirstName("Honey-1");
        user.setLastName("Moose-1");
        userList.add(user);

        user = new User();
        user.setFirstName("Honey-2");
        user.setLastName("Moose-2");
        userList.add(user);

        logger.debug("Line Reader initialized.");
    }

    @Override
    public User read() throws Exception {
//        Line line = fu.readLine();
//        if (line != null) logger.debug("Read line: " + line.toString());

        User nextUser = null;

        if (nextUserIndex < 1) {
            nextUser = userList.get(nextUserIndex);
            nextUserIndex++;
        }

        return nextUser;


    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
//        fu.closeReader();
        logger.debug("Line Reader ended.");
        return ExitStatus.COMPLETED;
    }
}
