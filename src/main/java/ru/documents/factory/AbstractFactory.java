package ru.documents.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.documents.entity.Document;
import ru.documents.exceptions.DocumentExistException;
import ru.generate.RandomValue;

import java.util.UUID;

/**
 * Заполянет поля  документа и возвращает его
 *
 * @author BespoyasovaV
 */
public abstract class AbstractFactory<T extends Document> extends RandomValue {
    /**
     * С помощью рандома заполняет поля докумета
     */
    private static final Logger logger = LoggerFactory.getLogger(AbstractFactory.class);

    void getDocument(Document document) {
        try {
            document.setId(UUID.randomUUID());
            document.setName(generateNameDoc());
            document.setText(generateNameText());
            document.setReg_num(generateRandomNumber(100));

        } catch (DocumentExistException e) {
            logger.error("Документ с генерируемым номером уже есть");
        }
        document.setDate_reg(generateDate());
        document.setAuthor(generateFio());
    }
}

