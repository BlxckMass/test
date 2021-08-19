package ru.factory;

import ru.exception.DocumentExistsException;
import ru.model.document.Document;
import ru.model.data.Storage;
import ru.model.document.Task;

import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class TaskFactory implements DocumentFactoryInterface {

    private final Random random = new Random();;

    @Override
    public Document createDocument() {
        Task document = new Task();
        Date date = new Date(ThreadLocalRandom.current().nextLong(0L, 1629284699L * 1000));

        document.setId(Math.abs(random.nextLong()));
        document.setAuthor(Document.defaultValues.get(authors).get(random.nextInt(Document.defaultValues.get(authors).size())));
        document.setName(UUID.randomUUID().toString());
        document.setText("text " + UUID.randomUUID());
        document.setRegistrationNumber(Math.abs(random.nextLong()));
        document.setDateOfRegistration(date);

        document.setExecutor(Document.defaultValues.get(executors).get(random.nextInt(Document.defaultValues.get(executors).size())));
        document.setController("controller");
        document.setControlSign("sign");
        document.setDateOfIssue(date);
        document.setPeriodOfExecution("1 days");
        Storage storage = Storage.getStorage();
        try {
            storage.save(document, document.getAuthor());
            return document;
        } catch (DocumentExistsException e) {
            e.printStackTrace();
            return null;
        }
    }

}
