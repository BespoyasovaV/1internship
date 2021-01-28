package ru.documents.factory;

import ru.documents.Document;
import ru.generate.RandomValue;

/**
 * заполянет поля документа и возвращает его
 */
public abstract class AbstractFactory<T extends Document> extends RandomValue {
    void getDocument(Document document) {

        document.setId(generateId());
        document.setName(generateNameDoc());
        document.setText(generateNameText());
        document.setReg_num(generateRandomNumber());
        document.setDate_reg(generateDate());
        document.setAuthor(generateFio());

    }


}
