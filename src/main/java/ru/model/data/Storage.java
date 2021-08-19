package ru.model.data;

import ru.exception.DocumentExistsException;
import ru.model.document.Document;

import java.util.*;

public final class Storage implements Storable {

    private static Storage storage;
    private Map<String, TreeSet<Document>> data = new TreeMap<>();

    @Override
    public void save(Document document, String author) throws DocumentExistsException {
        try {
            if (!data.isEmpty()) {
                for (Map.Entry<String, TreeSet<Document>> entry : data.entrySet()) {
                    if (checkDuplicateAuthorDocument(entry, document, author)) {
                        break;
                    }
                }
            } else {
                data.get(author).add(document);
            }

        } catch (NullPointerException e) {
            TreeSet<Document> documents = new TreeSet<>(Arrays.asList(document));
            data.put(author, documents);
        }
    }

    public boolean checkDuplicateAuthorDocument(Map.Entry<String, TreeSet<Document>> entry, Document document, String author) throws DocumentExistsException {
        Optional<Long> collect = entry.getValue().stream()
                .map(d -> d.getRegistrationNumber())
                .filter(s -> s.equals(document.getRegistrationNumber()))
                .findFirst();
        if (!collect.isPresent()) {
            data.get(author).add(document);
            return true;
        } else {
            throw new DocumentExistsException("Document is exist");
        }
    }

    public static Storage getStorage() {
        if (storage == null) {
            storage = new Storage();
        }
        return storage;
    }

    public Map<String, TreeSet<Document>> getData() {
        return data;
    }
}
