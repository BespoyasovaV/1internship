package ru.documents.factory;

import ru.documents.Document;

public interface Conclusion <T extends Document> {
   String toString(T document);
}
