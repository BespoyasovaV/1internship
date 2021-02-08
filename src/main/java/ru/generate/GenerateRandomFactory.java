package ru.generate;

import ru.documents.factory.DocumentCreate;
import ru.documents.factory.IncomingFactory;
import ru.documents.factory.OutgoingFactory;
import ru.documents.factory.TaskFactory;

import java.util.Random;

/**
 * Класс для создания рандомной фабрики
 *
 * @author BespoyasovaV
 */
public class GenerateRandomFactory {
    /**
     * Метод создает рандомную фабрику
     */
    public static DocumentCreate generateRandomFactory() {
        int generateRandomNum = new Random().nextInt(Delivery.values().length);
        DocumentCreate documentCreate = null;
        switch (DocumentType.values()[generateRandomNum]) {
            case TASK:
                documentCreate = new TaskFactory();
                break;

            case INCOMING:
                documentCreate = new IncomingFactory();
                break;

            case OUTGOING:
                documentCreate = new OutgoingFactory();
                break;
        }
        return documentCreate;
    }
}
