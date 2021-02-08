package test;

import org.junit.jupiter.api.Test;
import ru.documents.entity.Task;
import ru.documents.exceptions.DocumentExistException;
import ru.documents.factory.TaskFactory;

import static org.junit.jupiter.api.Assertions.*;

class TaskFactoryTest {
    TaskFactory taskFactory=new TaskFactory();
    Task document = new Task();
    @Test
    void generateRandomPropertiesForDocument() throws DocumentExistException {
        taskFactory.generateRandomPropertiesForDocument();
        assertNotNull( document.getController());
        assertNotNull( document.getDateIssue());
        assertNotNull( document.getExecutorName());
        assertNotNull( document.getSign());
        assertNotNull( document.getTerm());
        assertNotNull( taskFactory.generateRandomPropertiesForDocument());
    }
}