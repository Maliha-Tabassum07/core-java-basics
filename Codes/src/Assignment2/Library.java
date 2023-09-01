package Assignment2;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> libraryCatalog=new ArrayList<>();
    public void addBook(Book book){
        libraryCatalog.add(book);
    }
    public ArrayList getBooks(BookPredicate predicate){


        return libraryCatalog;
    }

    public void removeBooks(BookPredicate predicate){

    }
}
