package ru.model.document;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Outgoing extends Document {

    String addressee;
    String deliveryMethod;

    public Outgoing() {
    }

    public Outgoing(String addressee, String deliveryMethod) {
        this.addressee = addressee;
        this.deliveryMethod = deliveryMethod;
    }

    public Outgoing(Long id, String name, String text, Long registrationNumber, Date dateOfRegistration, String author, String addressee, String deliveryMethod) {
        super(id, name, text, registrationNumber, dateOfRegistration, author);
        this.addressee = addressee;
        this.deliveryMethod = deliveryMethod;
    }

    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return "Исходящий №" + getRegistrationNumber() +
                " от " + dateFormat.format(getDateOfRegistration()) +
                ". " + getName();
    }

    @Override
    public int compareTo(Document document) {
        return getDateOfRegistration().compareTo(document.getDateOfRegistration());
    }

}
