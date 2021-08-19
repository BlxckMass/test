package ru.model.document;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Incoming extends Document {

    private String sender;
    private String addressee;
    private Long outgoingNumber;
    private Date outgoingDateOfRegistration;

    public Incoming() {
    }

    public Incoming(String sender, String addressee, Long outgoingNumber, Date outgoingDateOfRegistration) {
        this.sender = sender;
        this.addressee = addressee;
        this.outgoingNumber = outgoingNumber;
        this.outgoingDateOfRegistration = outgoingDateOfRegistration;
    }

    public Incoming(Long id, String name, String text, Long registrationNumber, Date dateOfRegistration, String author, String sender, String addressee, Long outgoingNumber, Date outgoingDateOfRegistration) {
        super(id, name, text, registrationNumber, dateOfRegistration, author);
        this.sender = sender;
        this.addressee = addressee;
        this.outgoingNumber = outgoingNumber;
        this.outgoingDateOfRegistration = outgoingDateOfRegistration;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    public Long getOutgoingNumber() {
        return outgoingNumber;
    }

    public void setOutgoingNumber(Long outgoingNumber) {
        this.outgoingNumber = outgoingNumber;
    }

    public Date getOutgoingDateOfRegistration() {
        return outgoingDateOfRegistration;
    }

    public void setOutgoingDateOfRegistration(Date outgoingDateOfRegistration) {
        this.outgoingDateOfRegistration = outgoingDateOfRegistration;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return "Входящий №" + getRegistrationNumber() +
                " от " + dateFormat.format(getDateOfRegistration()) +
                ". " + getName();
    }

    @Override
    public int compareTo(Document document) {
        return getName().compareTo(document.getName());
    }

}
