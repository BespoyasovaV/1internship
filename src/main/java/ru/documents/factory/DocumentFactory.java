/**
 * класс создает документы Task, Incoming,Outgoing и, при создании, находит ему место в мапе под нужными ФИО
 */
package ru.documents.factory;

import ru.documents.*;
import ru.generate.RandomValue;

import java.util.ArrayList;
import java.util.HashMap;

public class DocumentFactory extends RandomValue {
    public HashMap<String, ArrayList<Document>> person_and_document = new HashMap<String, ArrayList<Document>>();

    public DocumentCreate getDocument(String documentType) {
        if (documentType == null) {
            return null;
        }
        if (documentType.equalsIgnoreCase("Task")) {
            Document task = new Task(generateid(), generate_name_doc(), generateName_text(), getReg_num_for_Task(), generate_date(), generatePerson(), generate_date(), generate_term(), generate_fio_executor(), generate_sign(), generate_controller());
            for (int i = 0; i < list_fio.length; i++) {
                ArrayList<Document> doc_list = person_and_document.get(list_fio[i]);
                if (doc_list == null) {
                    doc_list = new ArrayList<Document>();
                }
                if (task.getAuthor() == list_fio[i]) {
                    doc_list.add(task);
                    person_and_document.put(list_fio[i], doc_list);
                }
            }
            return (Task) task;
        }
        if (documentType.equalsIgnoreCase("Incoming")) {
            Document incoming = new Incoming(generateid(), generate_name_doc(), generateName_text(), getReg_num_for_Incoming(), generate_date(), generatePerson(), generate_fio_sender(), generate_fio_executor(), generate_ish_num(), generate_date());
            for (int i = 0; i < list_fio.length; i++) {
                ArrayList<Document> doc_list = person_and_document.get(list_fio[i]);
                if (doc_list == null) {
                    doc_list = new ArrayList<Document>();
                }
                if (incoming.getAuthor() == list_fio[i]) {
                    doc_list.add(incoming);
                    person_and_document.put(list_fio[i], doc_list);
                }
            }
            //System.out.println(person_and_document.values()+"***");
            return (Incoming) incoming;
        }
        if (documentType.equalsIgnoreCase("Outgoing")) {
            Outgoing outgoing = new Outgoing(generateid(), generate_name_doc(), generateName_text(), getReg_num_for_Outcoming(), generate_date(), generatePerson(), generate_fio_executor(), generateDelivery());
            for (int i = 0; i < list_fio.length; i++) {
                ArrayList<Document> doc_list = person_and_document.get(list_fio[i]);
                if (doc_list == null) {
                    doc_list = new ArrayList<Document>();
                }
                if (outgoing.getAuthor() == list_fio[i]) {

                    doc_list.add(outgoing);
                    person_and_document.put(list_fio[i], doc_list);
                }

            }
            return (Outgoing) outgoing;
        }

        return null;

    }
}

