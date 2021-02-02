package ru.documents.entity;

import java.text.MessageFormat;
import java.util.Date;

/**
 * Наследник класса Document, нужен для создания документов поручений
 *
 * @author BespoyasovaV
 */
public class Task extends Document {
    /**
     * Дата выдачи поручения
     */
    Date dateIssue;
    /**
     * Срок исполнения пручения
     */
    int term;
    /**
     * Ответственный исполнитель
     */
    String executorName;
    /**
     * Признак контрольности
     */
    Boolean sign;
    /**
     * Контролер поручения
     */
    Boolean controller;

    /**
     * Название вида  документа
     */
    public int getTerm() {
        return term;
    }

    public Date getDateIssue() {
        return dateIssue;
    }

    public String getExecutorName() {
        return executorName;
    }

    public Boolean getSign() {
        return sign;
    }

    public Boolean getController() {
        return controller;
    }

    public void setController(Boolean controller) {
        this.controller = controller;
    }

    public void setSign(Boolean sign) {
        this.sign = sign;
    }

    public void setExecutorName(String executor_name) {
        this.executorName = executorName;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public void setDateIssue(Date dateIssue) {
        this.dateIssue = dateIssue;
    }

    public String toString() {
        String text = MessageFormat.format("Поручение № {0,number,integer} от {1,date} {2}", getReg_num(), getDateReg(), getName());
        return text;
    }
}

