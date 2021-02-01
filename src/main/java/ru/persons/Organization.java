package ru.persons;
/** Наследник класса Staff, нужен для создания организаций
 * @author BespoyasovaV*/
public class Organization extends Staff{
    String fullName;
    String shortName;
    Person person;
    String contactPhoneNumbers;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setContactPhoneNumbers(String contactPhoneNumbers) {
        this.contactPhoneNumbers = contactPhoneNumbers;
    }

    public String getFullName() {
        return fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public Person getPerson() {
        return person;
    }

    public String getContactPhoneNumbers() {
        return contactPhoneNumbers;
    }
}
