package ru.documents.factory;

import org.apache.commons.lang3.RandomUtils;
import ru.documents.entity.Task;

/**
 * Класс создает  документ Task, но без полей родителя
 *
 * @author BespoyasovaV
 */
public class TaskFactory extends AbstractFactory<Task> implements DocumentCreate<Task> {
    /**
     * {@inheritDoc}
     */
    @Override
    public Task create() {
        return new Task();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Task generateRandomPropertiesForDocument(Task document) {
        getDocument(document);
        document.setDateIssue(generateDate());
        document.setTerm(RandomUtils.nextInt(0, 56));
        document.setExecutorName(generateFio());
        document.setSign(RandomUtils.nextBoolean());
        document.setController(RandomUtils.nextBoolean());
        return document;
    }
}
