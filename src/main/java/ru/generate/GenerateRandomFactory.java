package ru.generate;

import ru.documents.factory.DocumentCreate;
import ru.documents.factory.IncomingFactory;
import ru.documents.factory.OutgoingFactory;
import ru.documents.factory.TaskFactory;

public class GenerateRandomFactory {
    public static DocumentCreate generateRandomFactory() {
        int generateRandomNum = (int) (Math.random() * 3);
        DocumentCreate documentCreate = null;
        if (RandomValue.arr.get(generateRandomNum) == "Task") {
            documentCreate = new TaskFactory();
            return documentCreate;
        }
        if (RandomValue.arr.get(generateRandomNum) == "Incoming") {
            documentCreate = new IncomingFactory();
            return documentCreate;
        }
        if (RandomValue.arr.get(generateRandomNum) == "Outgoing") {
            documentCreate = new OutgoingFactory();
        }
        return documentCreate;
    }
}
