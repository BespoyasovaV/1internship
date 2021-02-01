package ru.generate;

import ru.documents.CollectionsForAllYourNeeds;
import ru.documents.factory.DocumentCreate;
import ru.documents.factory.IncomingFactory;
import ru.documents.factory.OutgoingFactory;
import ru.documents.factory.TaskFactory;

public class GenerateRandomFactory {
    public static DocumentCreate generateRandomFactory() {
        int generateRandomNum = (int) (Math.random() * 3);
        DocumentCreate documentCreate = null;
        if (CollectionsForAllYourNeeds.arr.get(generateRandomNum).equals("Task")) {
            documentCreate = new TaskFactory();
            return documentCreate;
        }
        if (CollectionsForAllYourNeeds.arr.get(generateRandomNum).equals("Incoming")) {
            documentCreate = new IncomingFactory();
            return documentCreate;
        }
        if (CollectionsForAllYourNeeds.arr.get(generateRandomNum).equals("Outgoing")) {
            documentCreate = new OutgoingFactory();
        }
        return documentCreate;
    }
}
