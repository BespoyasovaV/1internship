import ru.documents.DocumentExistException;
import ru.documents.DocumentCreate;
import ru.documents.DocumentFactory;

public class MainClass {
    public static void main(String[] args) throws DocumentExistException {

        String[] arr = new String[]{"Task", "Incoming", "Outgoing"};

        DocumentFactory list = new DocumentFactory();
        int rand_number = (int) (Math.random() * 7);
        DocumentCreate[] doc = new DocumentCreate[rand_number];
        System.out.println(rand_number);
        for (int i = 0; i < rand_number; i++) {
            int rand_number_of_doc = (int) (Math.random() * 3);
            doc[i] = list.getDocument(arr[rand_number_of_doc]);
            doc[i].conclusion();
            doc[i].norm_concl();



        }
        System.out.println("***************************");

    }



}
