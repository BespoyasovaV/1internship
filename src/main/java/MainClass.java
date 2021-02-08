import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.documents.factory.AbstractFactory;
import ru.documents.process.ProcessingDocuments;
import ru.generate.ProgramCollections;
import ru.generate.GenerateRandomFactory;
import ru.documents.entity.Document;
import ru.documents.exceptions.DocumentExistException;
import ru.documents.factory.DocumentCreate;

import java.util.Random;

/**
 * *Класс для запуска приложения, в консоль выводится список документов
 * * @author BespoyasovaV
 */
public class MainClass {
    private static final int NUMBER_OF_DOCUMENTS = 180;
    private static final Logger logger = LoggerFactory.getLogger(AbstractFactory.class);

    public static void main(String[] args) {
        int randomValueForDocList = new Random().nextInt(NUMBER_OF_DOCUMENTS);
        for (int i = 0; i < randomValueForDocList; i++) {
            try {
                DocumentCreate documentCreate = GenerateRandomFactory.generateRandomFactory();
                Document document = documentCreate.generateRandomPropertiesForDocument();
                ProgramCollections.documents.add(document);
            } catch (DocumentExistException e) {
                logger.error("Документ с генерируемым номером уже есть");
            }
        }
        ProcessingDocuments.populate();
        ProcessingDocuments.conclusion();
    }

}
