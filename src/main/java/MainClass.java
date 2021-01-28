import ru.documents.Document;
import ru.documents.factory.DocumentCreate;
import ru.generate.RandomValue;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * цикл для создания документов, в консоль выводится мапа
 */
public class MainClass {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Document>> personAndDocument = new HashMap<String, ArrayList<Document>>();
        RandomValue randomValue = new RandomValue();
        int randomValueForDocList = randomValue.generateRandomNumber();
        Document[] listDocument = new Document[randomValueForDocList];
        for (int i = 0; i < randomValueForDocList; i++) {
            DocumentCreate documentCreate = randomValue.generateRandomFactory();
            Document doc = documentCreate.generateRandomPropertiesForDocument(documentCreate.create());
            listDocument[i] = doc;
            ArrayList<Document> docList = personAndDocument.get(randomValue.listFio[i]);
            if (docList == null) {
                docList = new ArrayList<Document>();
            }
            for(int j=0;j<randomValue.listFio.length;j++) {
                if (doc.getAuthor() == randomValue.listFio[j]) {
                    docList.add(doc);
                    personAndDocument.put(randomValue.listFio[i], docList);
                }
            }
        }
        System.out.println(randomValueForDocList);
        System.out.println(personAndDocument);
        System.out.println(listDocument.length);
    }

}
