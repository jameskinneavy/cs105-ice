package edu.sbcc.cs105;

public class Program {
    public static void main(String[] args) {

        String title = "Effective Java";
        String author = "Joshua Bloch";

        // EX03-01: Class with public instance variables
        edu.sbcc.cs105.ex01.Book book1 = new edu.sbcc.cs105.ex01.Book();        
        book1.title = title;        
        book1.author = author;
        System.out.printf("Book: Title = %s, Author = %s%n", book1.title, book1.author);

        // EX03-02: Simple encapsulation with accessor / mutators
        edu.sbcc.cs105.ex02.Book book2 = new edu.sbcc.cs105.ex02.Book();
        book2.setAuthor("Joshual Bloch");
        book2.setTitle(title);
        System.out.printf("Book: Title = %s, Author = %s%n", book2.getTitle(), book2.getAuthor());


        // EX03-03: Use of constructors
        edu.sbcc.cs105.ex03.Book book3 = new edu.sbcc.cs105.ex03.Book(title, author);
        System.out.printf("Book: Title = %s, Author = %s%n", book2.getTitle(), book2.getAuthor());

    }
}
