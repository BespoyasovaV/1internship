package ru.documents;

/**
 * Выбрасывает исключение, если документ с генерируемым номером уже существует
 *
 * @author BespoyasovaV
 */
public class DocumentExistException extends Exception {
    /**
     * Метод для исключения
     */
    public DocumentExistException(String description) {
        super(description);

    }
}
