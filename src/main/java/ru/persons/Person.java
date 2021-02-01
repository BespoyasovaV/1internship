package ru.persons;
/**
 * Класс Сотрудник для реализации "Элемнта организационной структуры"
 *
 * @author BespoyasovaV
 */
public class Person extends Staff{
    String name;
    String lastname;
    String patronymic;
    String post;
    String birthDay;
    String phoneNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        lastname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public void setPhoneNumber(String telephoneNumber) {
        this.phoneNumber = telephoneNumber;
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

    public String getPost() {
        return post;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
