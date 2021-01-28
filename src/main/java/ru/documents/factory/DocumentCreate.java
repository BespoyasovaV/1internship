package ru.documents.factory;

import ru.documents.Document;

/**
 * от этого класса наследуются фабрики, которые оздают документы разных видов
 */
public interface DocumentCreate <T extends  Document> {
    T create();

    T generateRandomPropertiesForDocument(T document);
}

