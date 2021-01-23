package ru.documents;

import ru.documents.Document;

public class Task extends Document implements DocumentCreate {
    String date_issue;
    int term;
    String executor_name;
    Boolean sign;
    Boolean controller;
    String name_first = "Поручение";
    static int check_num = 0;
//getters

    private static int getCheck_num() {
        check_num = check_num + 1;
        return check_num;
    }

    public int getTerm() {
        return term;
    }

    public String getDate_issue() {
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

    public void setDate_issue(String date_issue) {
        this.date_issue = date_issue;
    }

    //constructor
    public Task(int id, String name, String text, int reg_num, String date_reg, Person author, String date_issue, int term, String executor_name, boolean sign, boolean controller) {
        super(id, name, text, reg_num, date_reg, author);
        this.date_issue = date_issue;
        this.term = term;
        this.executor_name = executor_name;
        this.sign = sign;
        this.controller = controller;
    }

    @Override
    public String toString() {
        return name;

        /*"Дата выдачи поручения"+date_issue +
                "Срок исполнения поручения: "+term+
                "Отвественный исполнитель: "+executor_name+
                "Признак контрольности"+sign+
                "Контроллер поручения"+controller;*/
    }

    @Override
    public void create() {
        System.out.print("Поручение" + " ");
    }

    @Override
    public void conclusion() {

        System.out.println("      " + author.name+" "+ author.Surname+" "+author.patronymic);
        //message format
        //toString переопр


    }

    @Override
    public void norm_concl() {

        System.out.print(name_first + " " + "№" + getCheck_num() + " " + "от" + " " + getDate_reg() + " " + getName());
        System.out.println(" ");
    }


    public String returnClass() {
        return "Task";
    }


}

