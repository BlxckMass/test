package ru.model.data;

import ru.exception.DocumentExistsException;
import ru.model.document.Document;

public interface Storable {

    void save(Document document, String author) throws DocumentExistsException;

}
