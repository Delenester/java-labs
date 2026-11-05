package org.example8;

public class Book {
     String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public String getGenre() {
        return "Не указан";
    }

    public void displayInfo() {
        System.out.println("Название: " + title + ", Автор: " + author + ", Страниц: " + pages + ", Жанр: " + getGenre());
    }
}