package org.example8;

public class Main {
    public static void main(String[] args) {

        Novel novel = new Novel("Война и мир", "Л.Н. Толстой", 1300, "Исторический роман");
        novel.displayInfo();
        System.out.println(novel.getPlotSummary());


        Textbook textbook = new Textbook("Алгебра и начала анализа", "К.Э.Конон", 384, "Математика");
        textbook.displayInfo();
        System.out.println(textbook.getChapterList());
    }
}