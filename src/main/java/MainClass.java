import ru.generate.GenerateRandomFactory;
import ru.documents.entity.Document;
import ru.documents.DocumentExistException;
import ru.documents.factory.DocumentCreate;
import ru.generate.RandomValue;

import java.util.*;

/**
 * Цикл для запуска приложения, в консоль выводится список документов
 *
 * @author BespoyasovaV
 */
public class MainClass {
    public static void main(String[] args) throws DocumentExistException {
        int randomValueForDocList = RandomValue.generateRandomNumber(9);
        Map<String, ArrayList<Document>> personAndDocument = new TreeMap<String, ArrayList<Document>>();
        Document[] listDocument = new Document[randomValueForDocList];
        for (int i = 0; i < randomValueForDocList; i++) {
            DocumentCreate documentCreate = GenerateRandomFactory.generateRandomFactory();
            Document doc = documentCreate.generateRandomPropertiesForDocument(documentCreate.create());
            listDocument[i] = doc;
        }
        for (int i = 0; i < RandomValue.listFio.size(); i++) {
            ArrayList<Document> docList = personAndDocument.get(RandomValue.listFio.get(i));
            if (docList == null) {
                docList = new ArrayList<Document>();
            }
            for (int j = 0; j < randomValueForDocList; j++) {
                if (listDocument[j].getAuthor() == RandomValue.listFio.get(i)) {
                    docList.add(listDocument[j]);
                    personAndDocument.put(RandomValue.listFio.get(i), docList);
                }
            }
        }
        System.out.println("Общее количество докуентов:" + " " + randomValueForDocList);
        for (String key : personAndDocument.keySet()) {
            System.out.println(key);
            for (int i = 0; i < personAndDocument.get(key).size(); i++) {
                System.out.println("     " + personAndDocument.get(key).get(i).toString());
            }
        }
    }
}
