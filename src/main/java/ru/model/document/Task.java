package ru.model.document;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task extends Document {

    public Task() {
    }

    public Task(Date dateOfIssue, String periodOfExecution, String executor, String controlSign, String controller) {
        this.dateOfIssue = dateOfIssue;
        this.periodOfExecution = periodOfExecution;
        this.executor = executor;
        this.controlSign = controlSign;
        this.controller = controller;
    }

    public Task(Long id, String name, String text, Long registrationNumber, Date dateOfRegistration, String author, Date dateOfIssue, String periodOfExecution, String executor, String controlSign, String controller) {
        super(id, name, text, registrationNumber, dateOfRegistration, author);
        this.dateOfIssue = dateOfIssue;
        this.periodOfExecution = periodOfExecution;
        this.executor = executor;
        this.controlSign = controlSign;
        this.controller = controller;
    }

    Date dateOfIssue;
    String periodOfExecution;
    String executor;
    String controlSign;
    String controller;

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getPeriodOfExecution() {
        return periodOfExecution;
    }

    public void setPeriodOfExecution(String periodOfExecution) {
        this.periodOfExecution = periodOfExecution;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public String getControlSign() {
        return controlSign;
    }

    public void setControlSign(String controlSign) {
        this.controlSign = controlSign;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return "Поручение №" + getRegistrationNumber() +
                " от " + dateFormat.format(getDateOfRegistration()) +
                ". " + getName();
    }

    @Override
    public int compareTo(Document document) {
        return getDateOfRegistration().compareTo(document.getDateOfRegistration());
    }

}
