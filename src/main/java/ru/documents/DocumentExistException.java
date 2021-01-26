package ru.documents;

public class DocumentExistException extends Exception {

    public DocumentExistException() {
        System.out.println("Документ с генерируемым номером уже существует");
    }
}
