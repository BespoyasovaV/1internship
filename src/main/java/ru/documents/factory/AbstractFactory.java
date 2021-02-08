package ru.documents.factory;

import ru.documents.entity.Document;
import ru.documents.exceptions.DocumentExistException;
import ru.generate.ProgramCollections;
import ru.generate.RandomValue;

import java.util.UUID;

/**
 * Заполянет поля документа и возвращает его
 *
 * @author BespoyasovaV
 */
public abstract class AbstractFactory<T extends Document> extends RandomValue {

    /**
     * С помощью рандома заполняет поля докумета
     */
    void generateRandomProperties(Document document) throws DocumentExistException {

        document.setId(UUID.randomUUID());
        document.setName(generateListMeaning(ProgramCollections.wordListOne));
        document.setText(generateListMeaning(ProgramCollections.textList));
        document.setRegNumber(generateRandomNumber(100));
        document.setRegistrationDate(generateDate());
        document.setAuthor(generateListMeaning(ProgramCollections.listFio));
    }
}



