package ru.documents.factory;

import org.apache.commons.lang3.RandomUtils;
import ru.documents.entity.Task;
import ru.documents.exceptions.DocumentExistException;
import ru.generate.ProgramCollections;

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
    public Task generateRandomPropertiesForDocument() throws DocumentExistException {
        Task document = new Task();
        generateRandomProperties(document);
        document.setDateIssue(generateDate());
        document.setTerm(RandomUtils.nextInt(0, 56));
        document.setExecutorName(generateListMeaning(ProgramCollections.listFio));
        document.setSign(RandomUtils.nextBoolean());
        document.setController(RandomUtils.nextBoolean());
        return document;
    }
}

