package ru.documents.entity;

/**
 * Класс Сотрудник для реализации "Элемнта организационной структуры"
 *
 * @author BespoyasovaV
 */
public class Person {
    String name;
    String lastname;
    String patronymic;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        lastname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return lastname;
    }

    public String getPatronymic() {
        return patronymic;
    }

}
