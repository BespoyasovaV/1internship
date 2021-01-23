package ru.documents;

import ru.documents.DocumentExistException;
import ru.documents.Incoming;
import ru.documents.Outgoing;
import ru.documents.Task;
import ru.documents.DocumentCreate;

public class DocumentFactory extends RandomValue {




    public void parse() {


    }



    public DocumentFactory() {
        System.out.println("Создана фабрика");
    }

    public DocumentCreate getDocument(String documentType) throws DocumentExistException {
        if (documentType == null) {
            return null;
        }
        if (documentType.equalsIgnoreCase("Task")) {
            Task t = new Task(generateid(), generate_name_doc(), generateName_text(), getReg_num_for_Task(), generate_date(), generatePerson(), generate_date_issue(), generate_term(), generate_fio_executor(), generate_sign(), generate_controller());
            person_doc.add(t);
            return t;

        }
        if (documentType.equalsIgnoreCase("Incoming")) {
            Incoming i = new Incoming(generateid(), generate_name_doc(), generateName_text(), getReg_num_for_Incoming(), generate_date(), generatePerson(), generate_fio_sender(), generate_fio_executor(), generate_ish_num(), generate_date_issue());
            person_doc.add(i);
            return i;
        }
        if (documentType.equalsIgnoreCase("Outgoing")) {
            Outgoing o = new Outgoing(generateid(), generate_name_doc(), generateName_text(), getReg_num_for_Outcoming(), generate_date(), generatePerson(), generate_fio_executor(), generateDelivery());
            person_doc.add(o);
            return o;
        }
        return null;

    }
}

