package org.example8;

public class Novel extends Book {
    private String genre;

    public Novel(String title, String author, int pages, String genre) {
        super(title, author, pages);
        this.genre = genre;
    }

    @Override
    public String getGenre() {
        return "Роман";
    }

    public String getNovelGenre() {
        return genre;
    }

    public String getPlotSummary() {
        return "Сюжет романа в жанре " + genre;
    }

    @Override public void displayInfo(){
        super.displayInfo();
        System.out.println(super.title);
        System.out.println(genre);
    }
}