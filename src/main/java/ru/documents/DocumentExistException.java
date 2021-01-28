package ru.documents;
/**  выбрасывает исключение, если документ с генерируемым номером уже существует*/
public class DocumentExistException extends Exception {

    public DocumentExistException() {
        System.out.println("Документ с генерируемым номером уже существует");
    }
}
