package ru.documents.entity;

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
    private Date dateIssue;
    /**
     * Срок исполнения пручения
     */
    private int term;
    /**
     * Ответственный исполнитель
     */
    private String executorName;
    /**
     * Признак контрольности
     */
    private boolean sign;
    /**
     * Контролер поручения
     */
    private Boolean controller;

    public int getTerm() {
        return term;
    }

    public Date getDateIssue() {
        return dateIssue;
    }

    public String getExecutorName() {
        return executorName;
    }

    public boolean getSign() {
        return sign;
    }

    public boolean getController() {
        return controller;
    }

    public void setController(Boolean controller) {
        this.controller = controller;
    }

    public void setSign(Boolean sign) {
        this.sign = sign;
    }

    public void setExecutorName(String executorName) {
        this.executorName = executorName;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public void setDateIssue(Date dateIssue) {
        this.dateIssue = dateIssue;
    }

    @Override
    public String toString() {
        return "Task{" +
                "dateIssue=" + dateIssue +
                ", term=" + term +
                ", executorName='" + executorName + '\'' +
                ", sign=" + sign +
                ", controller=" + controller +
                '}';
    }
}

