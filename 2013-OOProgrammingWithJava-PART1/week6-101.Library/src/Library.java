/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wg
 */
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        books.add(newBook);
    }

    public void printBooks() {
        for (Book bk : this.books) {
            System.out.println(bk);
        }
    }

    public ArrayList<Book> searchByTitle(String searchTitle) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book bk : this.books) {
            if (StringUtils.included(bk.title(), searchTitle)) {
                found.add(bk);
            }
        }

        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book bk : this.books) {
            if (StringUtils.included(bk.publisher(), publisher)) {
                found.add(bk);
            }
        }

        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book bk : this.books) {
            if (bk.year() == year) {
                found.add(bk);
            }
        }

        return found;
    }

}
