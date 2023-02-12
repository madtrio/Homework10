package Homework10;

public class Main {


    public static void main(String[] args) {
        Author griboedovAS = new Author("Грибоедов Александр Сергеевич  ");
        Author tolstoyLN = new Author("Толстой Лев Николаевич  ");
        Author tolstoyAN = new Author("Толстой Лев Николаевич  ");
        System.out.println("griboedovAS.title = " + griboedovAS.getSurname());
        System.out.println("tolstoyLN.title = " + tolstoyLN.getSurname());
        Book book1 = new Book("Горе от ума", 1970, griboedovAS);
        Book book2 = new Book("Война и мир", 2073, tolstoyLN);
        Book book3 = new Book ("Война и мир", 1953, tolstoyAN);
        System.out.println("book1.author = " + book1.getAuthor().getSurname());
        System.out.println("book2.author = " + book2.getAuthor().getSurname());
        System.out.println("book1.title = " + book1.getTitle());
        System.out.println("book2.title = " + book2.getTitle());
        System.out.println("book2.year = " + book2.getYear());
        book2.setYear(1989);
        System.out.println("book2.year = " + book2.getYear());
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(tolstoyLN.equals(tolstoyAN));
        System.out.println(griboedovAS.equals(tolstoyAN));
        System.out.println(book1.equals(book2));
        System.out.println(book3.equals(book2));
    }
}