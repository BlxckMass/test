package ru.model.document;

import java.util.*;

public abstract class Document implements Comparable<Document> {

    private Long id;
    private String name;
    private String text;
    private Long registrationNumber;
    private Date dateOfRegistration;
    private String author;

    protected Document() {
    }

    protected Document(Long id, String name, String text, Long registrationNumber, Date dateOfRegistration, String author) {
        this.id = id;
        this.name = name;
        this.text = text;
        this.registrationNumber = registrationNumber;
        this.dateOfRegistration = dateOfRegistration;
        this.author = author;
    }

    public static Map<String, List<String>> defaultValues = new HashMap<String, List<String>>() {{
        put("authors", Arrays.asList("Фролов Гордей Валерьевич",
                "Кулаков Владимир Платонович",
                "Фомин Юлиан Святославович",
                "Кабанов Вальтер Владиславович",
                "Ефимов Оскар Всеволодович",
                "Мухин Альберт Денисович",
                "Беляков Овидий Яковлевич",
                "Савельев Наум Анатольевич",
                "Никифоров Михаил Николаевич",
                "Лазарев Захар Богуславович"));

        put("executors", Arrays.asList("Васильев Руслан Дмитриевич",
                "Семенова Анастасия Владимировна",
                "Яковлева Василиса Артёмовна",
                "Рожкова Малика Марковна",
                "Астахов Степан Михайлович",
                "Попова Милана Константиновна",
                "Сомов Леонид Маркович",
                "Степанова Екатерина Егоровна",
                "Казакова Ариана Ярославовна",
                "Гаврилова Софья Артемьевна",
                "Сидоров Мечеслав Ильяович",
                "Селиверстов Максим Михаилович",
                "Рябов Елисей Игнатьевич",
                "Моисеев Станислав Артёмович",
                "Фомичёв Орест Евгеньевич",
                "Логинов Панкратий Геннадьевич",
                "Дорофеев Рубен Парфеньевич",
                "Кудряшов Витольд Олегович",
                "Дементьев Оскар Робертович",
                "Комаров Александр Евгеньевич"));

        put("addressees", Arrays.asList("Березина Полина Львовна",
                "Степанова Алиса Богдановна",
                "Щукин Николай Даниилович",
                "Бурова Дарья Денисовна",
                "Федоров Иван Максимович",
                "Александров Борис Владимирович",
                "Ильина Амина Данииловна",
                "Смирнова София Ильинична",
                "Данилов Даниил Никитич",
                "Воронова Алина Мироновна"));

        put("senders", Arrays.asList("Некрасова Милана Кирилловна",
                "Миронов Дмитрий Миронович",
                "Пантелеев Платон Даниилович",
                "Крылова Кристина Артёмовна",
                "Цветкова София Артёмовна",
                "Никулин Макар Даниилович",
                "Сазонов Александр Александрович",
                "Гончарова Елизавета Максимовна",
                "Чернова Дарья Семёновна",
                "Беляева Александра Романовна"));

    }};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(Long registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "ru.model.document.Document{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", text='" + text + '\'' +
                ", registrationNumber=" + registrationNumber +
                ", dateOfRegistration=" + dateOfRegistration +
                ", author='" + author + '\'' +
                '}';
    }
}
