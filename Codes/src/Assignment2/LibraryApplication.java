package Assignment2;
import java.util.ArrayList;
import java.util.Scanner;
public class LibraryApplication {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Harry Potter and the prisoner of Azkaban", "J.K. Rowling", "Fantasy", 1999);
        Book book2 = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", "Fantasy", 1997);
        Book book3 = new Book("Martian", "Andy Weir", "Sci-fi", 2011);
        Book book4 = new Book("Gone Girl", "Gillian Flynn", "Thriller", 2012);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        ArrayList<String> bookList;
        Scanner sc = new Scanner(System.in);
        System.out.println("Based on what you want the list?");
        String input = sc.nextLine();
        if (input .equals("author") ) {
            System.out.println("Write the name of the author");
            String author = sc.nextLine();
            BookPredicate authorPred = (book) -> {
                if (book.getAuthor().equals(author)) {
                    return true;
                }
                return false;
            };
            bookList=library.getBooks(authorPred);
            System.out.println(bookList);
        }

        else if (input .equals("genre") ) {
                System.out.println("Which Genre?");
                String genre = sc.nextLine();
                BookPredicate genrePred = (book) -> {
                    if (book.getGenre().equals(genre)) {
                        return true;
                    }
                    return false;
                };
                library.getBooks(genrePred);
            }
        else if (input .equals("year") ) {
                System.out.println("Which year?");
                String year = sc.nextLine();
                BookPredicate genreYear = (book) -> {
                    if (book.getGenre().equals(year)) {
                        return true;
                    }
                    return false;
                };
                library.getBooks(genreYear);
            }


        }
    }

