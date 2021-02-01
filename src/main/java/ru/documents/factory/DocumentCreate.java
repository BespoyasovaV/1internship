package ru.documents.factory;

import ru.documents.entity.Document;

/**
 * От этого класса  наследуются фабрики, которые оздают документы разных видов
 */
public interface DocumentCreate<T extends Document> {
    /**
     * Создает пустой документ
     */
    T create();

    /**
     * Заполняет поля пустого докуметна, но не все, а те, которые относятся к его классу
     */
    T generateRandomPropertiesForDocument(T document);
}

