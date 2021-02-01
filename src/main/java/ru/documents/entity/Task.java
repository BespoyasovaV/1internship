package ru.documents.entity;

import java.util.ArrayList;
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
    Date date_issue;
    /**
     * Срок исполнения пручения
     */
    int term;
    /**
     * Ответственный исполнитель
     */
    String executor_name;
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
    String name_first = "Поручение";
    ArrayList<Integer> check_id = new ArrayList<Integer>();

    //getter
    public int getTerm() {
        return term;
    }

    public Date getDate_issue() {
        return date_issue;
    }

    public String getExecutor_name() {
        return executor_name;
    }

    public Boolean getSign() {
        return sign;
    }

    public Boolean getController() {
        return controller;
    }

    //setters
    public void setController(Boolean controller) {
        this.controller = controller;
    }

    public void setSign(Boolean sign) {
        this.sign = sign;
    }

    public void setExecutor_name(String executor_name) {
        this.executor_name = executor_name;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public void setDate_issue(Date date_issue) {
        this.date_issue = date_issue;
    }

    public String toString() {
        int month = getDate_reg().getMonth() + 1;
        int year = getDate_reg().getYear() + 1900;
        if (month >=10) {
            return name_first + " " + "№" + " " + getReg_num() + " " + "от" + " " + getDate_reg().getDay() + "." + month + "." + year + " " + getName();
        }
        return name_first + " " + "№" + " " + getReg_num() + " " + "от" + " " + getDate_reg().getDay() + ".0" + month + "." + year + " " + getName();
    }
}

