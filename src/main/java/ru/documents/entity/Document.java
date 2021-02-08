package ru.documents.entity;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

/**
 * Класс родитель для видов документов
 *
 * @author BespoyasovaV
 */
public abstract class Document implements Comparable<Document> {
    /**
     * Идентификатор документа
     */
    private UUID id;
    /**
     * Название документа
     */
    private String name;
    /**
     * Текст документа
     */
    private String text;
    /**
     * Регистрационный номер документа
     */
    private int regNumber;
    /**
     * Дата регистрации документа
     */
    private Date registrationDate;
    /**
     * Автор документа
     */
    private String author;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Document document = (Document) o;
        return regNumber == document.regNumber && Objects.equals(id, document.id) && Objects.equals(name, document.name)
                && Objects.equals(text, document.text) && Objects.equals(registrationDate, document.registrationDate)
                && Objects.equals(author, document.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, text, regNumber, registrationDate, author);
    }

    @Override
    public int compareTo(Document o) {
        if (this.registrationDate == o.getRegistrationDate()) {
            return Integer.compare(this.regNumber, o.regNumber);
        }
        return this.registrationDate.compareTo(o.getRegistrationDate());
    }
}



