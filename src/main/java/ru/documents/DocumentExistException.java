package ru.documents;

/**
 * Выбрасывает исключение, если документ с генерируемым номером уже существует
 *
 * @author BespoyasovaV
 */
public class DocumentExistException extends Exception {
    public DocumentExistException(String description) {
        super(description);
    }
}
