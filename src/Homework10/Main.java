package Homework10;

public class Main {


    public static void main(String[] args) {
        Author GriboedovAS = new Author("Fktrcfylh CСергеевич", "Грибоедов");
        Book book1 = new Book("Горе от ума", 1970, GriboedovAS);
        System.out.println("book1.title = " + book1.title);
        System.out.println("book1.author = " + book1.author);
    }
}