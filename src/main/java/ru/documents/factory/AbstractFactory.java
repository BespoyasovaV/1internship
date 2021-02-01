package ru.documents.factory;

import ru.documents.entity.Document;
import ru.documents.DocumentExistException;
import ru.generate.RandomValue;

import java.util.UUID;

/**
 * Заполянет поля документа и возвращает его
 *
 * @author BespoyasovaV
 */
public abstract class AbstractFactory<T extends Document> extends RandomValue {
    /**
     * С помощью рандома заполняет поля докуметна
     */
    void getDocument(Document document) {
        try {
            document.setId(UUID.randomUUID());
            document.setName(generateNameDoc());
            document.setText(generateNameText());
            document.setReg_num(generateRandomNumber(100));
        } catch (DocumentExistException e) {
            System.out.println(e.getMessage());
        }
        document.setDate_reg(generateDate());
        document.setAuthor(generateFio());

    }
}

