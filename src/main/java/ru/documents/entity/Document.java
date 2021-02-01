package ru.documents.entity;

import java.util.Date;
import java.util.UUID;

/**
 * Класс родитель для видов документов
 *
 * @author BespoyasovaV
 */
public class Document<T> implements Comparable<Document> {
    /**
     * Идентификатор документа
     */
    UUID id;
    /**
     * Название документа
     */
    String name;
    /**
     * Текст  документа
     */
    String text;
    /**
     * Регистрационный номер документа
     */
    int reg_num;
    /**
     * Дата регистрации документа
     */
    Date date_reg;
    /**
     * Автор документа
     */
    String author;

    //getters
    public UUID getId() {
        return id;
    }

    public int getReg_num() {
        return reg_num;
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

    public Date getDate_reg() {
        return date_reg;
    }

    //setters
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDate_reg(Date date_reg) {
        this.date_reg = date_reg;
    }

    public void setReg_num(int reg_num) {
        this.reg_num = reg_num;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public int compareTo(Document o) {
        if (this.reg_num - o.reg_num < 0) {
            return -1;
        }
        if (this.reg_num - o.reg_num > 0) {
            return 1;
        } else {
            return this.date_reg.compareTo(o.getDate_reg());
        }
    }
}


