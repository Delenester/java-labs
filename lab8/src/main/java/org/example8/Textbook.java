package org.example8;

public class Textbook extends Book {
    private String subject;

    public Textbook(String title, String author, int pages, String subject) {
        super(title, author, pages);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String getGenre() {
        return "Учебник";
    }

    public String getChapterList() {
        return "Список глав по предмету " + subject + ": 1. Введение, 2. Основные теоремы, 3. Практика.";
    }
}