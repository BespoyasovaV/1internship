/**
 * цикл для создания документов, в консоль выводится мапа с ФИО и документами
 */

import ru.documents.factory.DocumentCreate;
import ru.documents.factory.DocumentFactory;
import ru.generate.RandomValue;

public class MainClass {
    public static void main(String[] args) {
        RandomValue randomValue = new RandomValue();
        DocumentFactory list = new DocumentFactory();
        int rand_number = randomValue.generate_rand_number();
        DocumentCreate[] doc = new DocumentCreate[rand_number];
        System.out.println(rand_number);
        for (int i = 0; i < rand_number; i++) {

            doc[i] = list.getDocument(randomValue.generate_doc_name());
            //doc[i].toString();
        }

        System.out.println("***************************");
        System.out.println();
        System.out.println("ФИО:" + " " + list.person_and_document);


    }


}
