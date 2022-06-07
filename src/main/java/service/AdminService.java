package service;

import template.Book;
import template.User;

import java.util.List;

public interface AdminService {
    boolean addBook();
    boolean removeBook(String id);
    Book showBook(String id);
    void showAllBook();
    Book createBook();

    boolean addUser();
    boolean removeUser(String id);
    User showUser(String id);
    void showAllUsers();
    User createUser();
}
