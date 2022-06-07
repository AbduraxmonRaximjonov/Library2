package service;

import template.Book;

public interface UserService {
    boolean getBook(String id);
    Book showBook(String id);
    boolean addBook();
    void showOwnBooks();
    boolean returnBook(String id);
    void showAllBooks();

}
