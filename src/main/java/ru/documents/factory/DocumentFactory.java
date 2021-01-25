package ru.documents.factory;

import ru.documents.*;
import ru.generate.RandomValue;

public class DocumentFactory extends RandomValue {


    public DocumentCreate getDocument(String documentType) throws DocumentExistException {
        if (documentType == null) {
            return null;
        }
        if (documentType.equalsIgnoreCase("Task")) {
            Document t = new Task(generateid(), generate_name_doc(), generateName_text(), getReg_num_for_Task(), generate_date(), generatePerson(), generate_date(), generate_term(), generate_fio_executor(), generate_sign(), generate_controller());
            for (int i = 0; i < getPerson_and_document().size(); i++) {
                if (t.author.equals(getPerson_and_document().get(person_list().get(i)))) {
                    person_and_document.get(person_list().get(i)).add(t);
                }
            }


            return (Task) t;

        }
        if (documentType.equalsIgnoreCase("Incoming")) {
            Document in = new Incoming(generateid(), generate_name_doc(), generateName_text(), getReg_num_for_Incoming(), generate_date(), generatePerson(), generate_fio_sender(), generate_fio_executor(), generate_ish_num(), generate_date());
            for (int i = 0; i < getPerson_and_document().size(); i++) {
                if (in.author.equals(getPerson_and_document().get(person_list().get(i)))) {
                    person_and_document.get(person_list().get(i)).add(in);
                }
            }
            return (Incoming) in;
        }
        if (documentType.equalsIgnoreCase("Outgoing")) {
            Outgoing o = new Outgoing(generateid(), generate_name_doc(), generateName_text(), getReg_num_for_Outcoming(), generate_date(), generatePerson(), generate_fio_executor(), generateDelivery());
            for (int i = 0; i < getPerson_and_document().size(); i++) {
                if (o.author.equals(getPerson_and_document().get(person_list().get(i)))) {
                    person_and_document.get(person_list().get(i)).add(o);
                }
            }
            return (Outgoing)o;
        }
        return null;

    }
}

