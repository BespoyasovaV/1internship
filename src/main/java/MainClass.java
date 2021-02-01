import ru.documents.CollectionsForAllYourNeeds;
import ru.generate.GenerateRandomFactory;
import ru.documents.entity.Document;
import ru.documents.DocumentExistException;
import ru.documents.factory.DocumentCreate;
import ru.generate.RandomValue;

/**
 * Класс запуска приложения, в консоль выводится список документов
 *
 * @author BespoyasovaV
 */
public class MainClass {
    public static void main(String[] args) throws DocumentExistException {
        int randomValueForDocList = RandomValue.generateRandomNumber(9);
        for (int i = 0; i < randomValueForDocList; i++) {
            DocumentCreate documentCreate = GenerateRandomFactory.generateRandomFactory();
            Document doc = documentCreate.generateRandomPropertiesForDocument(documentCreate.create());
            CollectionsForAllYourNeeds.listDocument.add(doc);
        }
        CollectionsForAllYourNeeds.populate();
        System.out.println("Общее количество документов:" + " " + randomValueForDocList);
        CollectionsForAllYourNeeds.conclusion();
    }
}
