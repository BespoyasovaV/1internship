package ru.documents.factory;

import ru.documents.entity.Document;
import ru.documents.exceptions.DocumentExistException;

/**
 * Этот интерфейс реализуют фабрики, которые создают документы разных видов
 *
 * @author BespoyasovaV
 */
public interface DocumentCreate<T extends Document> {
    /**
     * Заполняет поля пустого докуметна, но не все, а те, которые относятся к его классу
     */
    T generateRandomPropertiesForDocument() throws DocumentExistException;
}

