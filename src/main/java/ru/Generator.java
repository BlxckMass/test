package ru;

import ru.factory.DocumentFactoryInterface;

public class Generator {

    public static void generateDocument(DocumentFactoryInterface documentFactory, int count) {
        for (int i = 0; i < count; i++) {
            documentFactory.createDocument();
        }
    }

}
