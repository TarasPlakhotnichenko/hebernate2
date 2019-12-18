package com.taras;
//mvn archetype:generate -DarchetypeArtifactId=maven-archetype-quickstart -DgroupId=com.taras -DartifactId=hibernate2 -Dversion=1.0.0
import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {
        Factory factory = Factory.getInstance();
        BookOperations bookOperations = factory.getBookOperations();

        /*Book book = new Book();
        book.setTitle("Java");
        book.setDescription("Tutorial");
        book.setIsbn(222);
        bookOperations.addBook(book);*/


        /*bookOperations.deleteBook(bookOperations.getBook(1));*/

        /*Book book =  bookOperations.getBook(1);
        System.out.println(book.getId() + " " +  book.getTitle() +  " " + book.getDescription());*/

 /*   List<Book> books = bookOperations.getBooks();
    System.out.println("Id Title Description Isbn");
    for (Book book: books) {

        System.out.println(book.getId() + " " +  book.getTitle() +  " " + book.getDescription() + " " + book.getIsbn());
    }*/


    }
 }

