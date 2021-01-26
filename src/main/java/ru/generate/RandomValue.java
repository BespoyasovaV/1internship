//** класс для генерации рандомных значений*/
package ru.generate;

import ru.documents.Person;

import java.util.ArrayList;
import java.util.Random;

public class RandomValue {
    static int reg_num_for_Task = 0;
    static int reg_num_for_Incomming = 0;
    static int reg_num_for_Outcoming = 0;
    ArrayList<Integer> check_id = new ArrayList<Integer>();
    String[] arr = new String[]{"Task", "Incoming", "Outgoing"};
    String[] wordListOne = new String[]{"Доменная", "Схематичная", "Базовая", "Первичная"};
    String[] wordListTwo = new String[]{"интеграция", "конфигурация", "верификация"};
    public int one = wordListOne.length;
    public int two = wordListTwo.length;


    String[] textList = new String[]{"Текст про птичек", "Текст про бабочек", "Биографя Шрека", "Чек-лист по заработку", "Как научиться вышивать?"};
    public String[] list_fio = new String[]{"Барсуков Сергей Геннадиевич", "Березнянкова Анфиса Кирилловна", "Киреева Надежда Семенова", "Никитина Юлия Игоревна", "Полянская Кристина Викторовна",};
    ArrayList<Person> person_list = new ArrayList<>();

    public enum Delivery {
        Самовывоз,
        Курьером,
        ПочтаРоссии
    }

    public int generate_rand_number() {
        int rand_number = (int) (Math.random() * 7);
        return rand_number;
    }

    public String generate_doc_name() {
        int rand_number_of_doc = (int) (Math.random() * 3);
        return arr[rand_number_of_doc];
    }

    public String generateName_text() {
        int gen_text = (int) (Math.random() * 4);
        String new_text = textList[gen_text];
        return new_text;
    }

    public Delivery generateDelivery() {
        int gen_del = new Random().nextInt(Delivery.values().length);
        return Delivery.values()[gen_del];
    }

    public int generateid() {
        int id = (int) (Math.random() * 100);
        return id;

    }

    public String generate_name_doc() {
        int rand1 = (int) (Math.random() * one);
        int rand2 = (int) (Math.random() * two);
        String name = wordListOne[rand1] + " " + wordListTwo[rand2];
        return name;
    }

    public String generate_fio_sender() {
        int fio_rand = (int) (Math.random() * 3);
        String fio = list_fio[fio_rand];
        return fio;
    }

    public String generate_fio_executor() {
        int executor_rand = (int) (Math.random() * 3);
        String fio = list_fio[executor_rand];
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

    public String generatePerson() {
        int n = (int) (Math.random() * 5);
        return list_fio[n];
    }
}
