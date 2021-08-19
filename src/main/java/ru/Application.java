package ru;

import ru.factory.DocumentFactoryInterface;
import ru.factory.IncomingFactory;
import ru.factory.OutgoingFactory;
import ru.factory.TaskFactory;
import ru.model.data.Storage;
import ru.model.document.Document;

import javax.xml.bind.JAXBException;
import java.util.Map;
import java.util.TreeSet;

public class Application {

    public static void main(String[] args) throws JAXBException {
        DocumentFactoryInterface documentFactory = new IncomingFactory();
        Generator.generateDocument(documentFactory, 10);
        documentFactory = new OutgoingFactory();
        Generator.generateDocument(documentFactory, 10);
        documentFactory = new TaskFactory();
        Generator.generateDocument(documentFactory, 10);

        for (Map.Entry<String, TreeSet<Document>> entry : Storage.getStorage().getData().entrySet()) {
            System.out.println(entry.getKey());
            entry.getValue().forEach(d -> System.out.println("     " + d.toString()));
        }

//        Organization organization = new Organization(1L, "name", "short",
//                new Person(1L, "last", "first", "patr", "pos", new Date(), "phone"), "phoneNumb");
//        StringWriter writer = new StringWriter();
//        JAXBContext context = JAXBContext.newInstance(Organization.class);
//        Marshaller marshaller = context.createMarshaller();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//        marshaller.marshal(organization, writer);
//
//        System.out.println(writer.toString());
    }

}
