package ru.documents;

public class DocumentExistException extends Exception {

    public DocumentExistException() {
        System.out.println("вызвано исключение, совпадают номера id");
    }
}
