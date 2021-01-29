package ru.documents;

/**
 * Выбрасывает исключение, если документ с генерируемым номером уже существует
 *
 * @author BespoyasovaV
 */
public class DocumentExistException extends Exception {
    private static final String description = null;

    /**
     * Метод для исключения
     */
    public DocumentExistException() {
        super(description);
        System.out.println("Документ с генерируемым номером уже существует");
    }
}
