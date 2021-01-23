package ru.documents;

public class DocumentExistException extends Exception{
    private String number;

    public String getNumber() {
        System.out.println("вызвано исключение, совпадают номера id");
        return number;
    }
    public DocumentExistException(String number ){
        System.out.println("вызвано исключение, совпадают номера id");
    }
}
