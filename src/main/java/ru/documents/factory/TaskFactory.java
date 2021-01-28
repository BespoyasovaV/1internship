package ru.documents.factory;

import ru.documents.Document;
import ru.documents.Task;
import ru.documents.factory.AbstractFactory;
import ru.documents.factory.DocumentCreate;

/**
 * класс создает документ Task, но без полей родителя
 */
public class TaskFactory extends AbstractFactory<Task> implements Conclusion,DocumentCreate<Task> {
    @Override
    public Task create() {
        return new Task();
    }

    @Override
    public Task generateRandomPropertiesForDocument(Task document) {
        getDocument(document);
        document.setDate_issue(generateDate());
        document.setTerm(generateTerm());
        document.setExecutor_name(generateFio());
        document.setSign(generateSign());
        document.setController(generateController());
        return document;
    }


    @Override
    public String toString(Document document) {
        return null;
    }
}
