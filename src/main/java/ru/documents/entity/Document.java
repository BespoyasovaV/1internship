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
    String name;
    /**
     * Текст документа
     */
    String text;
    /**
     * Регистрационный номер документа
     */
    int regNum;
    /**
     * Дата регистрации документа
     */
    Date dateReg;
    /**
     * Автор документа
     */
    String author;

    public UUID getId() {
        return id;
    }

    public int getReg_num() {
        return regNum;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }

    public Date getDateReg() {
        return dateReg;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDate_reg(Date dateReg) {
        this.dateReg = dateReg;
    }

    public void setReg_num(int regNum) {
        this.regNum = regNum;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(UUID id) {
       this.id=id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return regNum == document.regNum && Objects.equals(id, document.id) && Objects.equals(name, document.name) && Objects.equals(text, document.text) && Objects.equals(dateReg, document.dateReg) && Objects.equals(author, document.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, text, regNum, dateReg, author);
    }

    @Override
    public int compareTo(Document o) {
        if (this.dateReg==o.getDateReg()) {
           Integer.compare(this.regNum,o.regNum);
        }
            return this.dateReg.compareTo(o.getDateReg());
    }
}

