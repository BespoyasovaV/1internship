import ru.documents.process.ProcessingDocuments;
import ru.generate.ProgramCollections;
import ru.generate.GenerateRandomFactory;
import ru.documents.entity.Document;
import ru.documents.exceptions.DocumentExistException;
import ru.documents.factory.DocumentCreate;
import ru.generate.RandomValue;

/**
 * Класс для запуска приложения, в консоль выводится список документов
 *
 * @author BespoyasovaV
 */
public class MainClass {
    public static void main(String[] args) throws DocumentExistException {
        int randomValueForDocList = RandomValue.generateRandomNumber(14);
        for (int i = 0; i < randomValueForDocList; i++) {
            DocumentCreate documentCreate = GenerateRandomFactory.generateRandomFactory();
            Document doc = documentCreate.generateRandomPropertiesForDocument(documentCreate.create());
            ProgramCollections.Documents.add(doc);
        }
        ProcessingDocuments.populate();
        ProcessingDocuments.conclusion();
    }
}
