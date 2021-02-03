package test;

import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.Test;
import ru.documents.entity.Incoming;
import ru.documents.entity.Task;
import ru.generate.RandomValue;

import static org.junit.jupiter.api.Assertions.*;

class TaskFactoryTest {

    @Test
    void create() {
        Incoming incoming = new Incoming();
        assertNotNull(incoming);
    }

    @Test
    void generateRandomPropertiesForDocument() {
        Task document = new Task();
        document.setDateIssue(RandomValue.generateDate());
        document.setTerm(RandomUtils.nextInt(0, 56));
        document.setExecutorName(RandomValue.generateFio());
        document.setSign(RandomUtils.nextBoolean());
        document.setController(RandomUtils.nextBoolean());
        assertNotNull(document.getDateIssue());
        assertNotNull(document.getTerm());
        assertNotNull(document.getController());
        assertNotNull(document.getSign());
        assertNotNull(document);
    }
}