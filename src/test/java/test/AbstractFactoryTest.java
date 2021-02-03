package test;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.documents.entity.Task;
import ru.documents.exceptions.DocumentExistException;
import ru.documents.factory.AbstractFactory;
import ru.generate.RandomValue;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryTest {
    Logger logger = LoggerFactory.getLogger(AbstractFactory.class);

    @Test
    void getDocument() {
        Task document = new Task();
        try {
            document.setId(UUID.randomUUID());
            document.setName(RandomValue.generateNameDoc());
            document.setText(RandomValue.generateNameText());
            document.setReg_num(RandomValue.generateRandomNumber(100));

        } catch (DocumentExistException e) {
            logger.error("Документ с генерируемым номером уже есть");
        }
        document.setDate_reg(RandomValue.generateDate());
        document.setAuthor(RandomValue.generateFio());
        assertNotNull(document.getName());
        assertNotNull(document.getText());
        assertNotNull(document.getRegNum());
        assertNotNull(document.getDateReg());
        assertNotNull(document.getAuthor());
        assertNotEquals(document.getId(), 56);
        assertNotNull(document);
    }
}