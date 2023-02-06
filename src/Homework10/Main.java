package Homework10;

public class Main {


    public static void main(String[] args) {
        Author griboedovAS = new Author("Александр Сергеевич", "Грибоедов");
        Author tolstoyLN = new Author("Лев Николаевич", "Толстой");
        Book book1 = new Book("Горе от ума", 1970, "Грибоедов АС");
        Book book2 = new Book("Война и мир", 2073, "Толстой ЛН");
        System.out.println("book1.title = " + book1.getTitle());
        System.out.println("book1.author = " + book1.getAuthor());
        System.out.println("book2.title = " + book2.getTitle());
        System.out.println("book2.author = " + book2.getAuthor());
        System.out.println("book2.year = " + book2.getYear());
        book2.setYear(1989);
        System.out.println("book2.year = " + book2.getYear());
    }
}