package ru.documents;

import ru.documents.Document;
import ru.documents.DocumentExistException;

import java.util.ArrayList;

public class RandomValue {


    static int reg_num_for_Task = 0;
    static int reg_num_for_Incomming = 0;
    static int reg_num_for_Outcoming = 0;


    String[] wordListOne = new String[]{"Доменная", "Схематичная", "Базовая", "Первичная"};
    String[] wordListTwo = new String[]{"интеграция", "конфигурация", "верификация"};
    public int one = wordListOne.length;
    public int two = wordListTwo.length;


    String[] textList = new String[]{"Текст про птичек", "Текст про бабочек", "Биографя Шрека", "Чек-лист по заработку", "Как научиться вышивать?"};
    String[] fioList = new String[]{"Барсуков Сергей Геннадиевич", "Полянская Кристина Викторовна", "Березнянкова Анфиса Кирилловна", "Киреева Надежда Семенова", "Бесполова Катерина Никитична", "Никитина Юлия Игоревна", "Галлямутдинова Камилла Ринатовна", "Латипов Александр Сергеевич"};

    String[] fioExecutorList = new String[]{"Карамов Валерий Степанов", "Полянская Карина Аликовна", "Березнянский Никита Вячеславович", "Подорожная Светлана Петровна"};
    String[] fioSenderList = new String[]{"Бесполова Катерина Никитична", "Никитина Юлия Игоревна", "Галлямутдинова Камилла Ринатовна", "Латипов Александр Сергеевич"};
    String[] DeliveryList = new String[]{"Самовывоз", "Курьером", "ПочтаРоссии"};
    ArrayList<Document> person_doc = new ArrayList<>();
    ArrayList<Person> person_list = new ArrayList<>();


    public ArrayList<Person> person_list() {

        person_list.add(new Person("Барсуков", "Сергей", "Геннадиевич"));
        person_list.add(new Person("Березнянкова", " Анфиса", "Кирилловна"));
        person_list.add(new Person("Киреева", "Надежда", "Семенова"));
        person_list.add(new Person("Никитина", "Юлия", "Игоревна"));
        person_list.add(new Person("Полянская", "Кристина", "Викторовна"));
        return person_list;
    }

    public String generateName_text() {
        int gen_text = (int) (Math.random() * 4);
        String new_text = textList[gen_text];
        return new_text;
    }

    public String generateDelivery() {
        int gen_del = (int) (Math.random() * 3);
        String delivery = textList[gen_del];
        return delivery;
    }

    ArrayList<Integer> check_id = new ArrayList<Integer>();


    public int generateid() throws DocumentExistException {
        int id = (int) (Math.random() * 100);
        if (check_id.contains(id)) {
            throw new DocumentExistException("вызвано исключение, совпадают номера id");
        } else {
            check_id.add(id);
            return id;
        }
    }


    public String generate_name_doc() {
        int rand1 = (int) (Math.random() * one);
        int rand2 = (int) (Math.random() * two);
        String name = wordListOne[rand1] + " " + wordListTwo[rand2];
        return name;

    }


    public String generate_fio() {
        int fio_rand = (int) (Math.random() * 8);
        String fio = fioList[fio_rand];
        return fio;
    }

    public String generate_fio_sender() {
        int fio_rand = (int) (Math.random() * 3);
        String fio = fioSenderList[fio_rand];
        return fio;
    }

    public String generate_fio_executor() {
        int executor_rand = (int) (Math.random() * 3);
        String fio = fioExecutorList[executor_rand];
        return fio;
    }

    public int generate_term() {
        int term = (int) (Math.random() * 56);

        return term;
    }

    public int generate_ish_num() {
        int num = (int) (Math.random() * 10000);

        return num;
    }

    public boolean generate_sign() {

        int sign = (int) (Math.random() * 100);
        if (sign / 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean generate_controller() {

        int sign = (int) (Math.random() * 100);
        if (sign / 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public int getReg_num_for_Task() {
        return reg_num_for_Task++;
    }

    public int getReg_num_for_Incoming() {
        return reg_num_for_Incomming++;
    }

    public int getReg_num_for_Outcoming() {
        return reg_num_for_Outcoming++;
    }

    public String generate_date() {
        java.util.Random day = new java.util.Random();
        int max1 = 28;
        int min1 = 1;
        int d = day.nextInt((max1 - min1) + 1) + min1;
        java.util.Random month = new java.util.Random();
        int max2 = 12;
        int min2 = 1;
        int m = month.nextInt((max2 - min2) + 1) + min2;
        java.util.Random year = new java.util.Random();
        int max3 = 2021;
        int min3 = 2000;
        int y = year.nextInt((max3 - min3) + 1) + min3;
        String date1 = y + "-" + m + "-" + d;
        return date1;

    }

    public String generate_date_issue() {
        java.util.Random day = new java.util.Random();
        int max1 = 28;
        int min1 = 1;
        int d = day.nextInt((max1 - min1) + 1) + min1;
        java.util.Random month = new java.util.Random();
        int max2 = 12;
        int min2 = 1;
        int m = month.nextInt((max2 - min2) + 1) + min2;
        java.util.Random year = new java.util.Random();
        int max3 = 2021;
        int min3 = 2000;
        int y = year.nextInt((max3 - min3) + 1) + max3;
        String date1 = y + "-" + m + "-" + d;
        return date1;

    }

    public Person generatePerson() {

        int n = (int) (Math.random() * 5);

        return person_list().get(n);

    }


}
