package service;

import database.DataBase;
import template.Book;
import template.User;
import template.role.Role;

import java.util.List;

public class AdminImpl implements AdminService {


    public static AdminImpl admin = new AdminImpl();
    public static AdminImpl getAdmin() {
        return admin;
    }
    static DataBase dataBase = DataBase.getDataBase();

    @Override
    public boolean addBook() {
        Book book = createBook();
        dataBase.books.add(book);
        System.out.println("Success");
        return true;
    }

    @Override
    public boolean removeBook(String id) {
        dataBase.books.removeIf(book -> book.getId().equals(id));
        return true;
    }

    @Override
    public Book showBook(String id) {
        for (Book book : dataBase.books) {
            if (book.getId().equals(id)){
                return book;
            }
        }
        System.out.println("fail");
        return null;
    }

    @Override
    public void showAllBook() {
        for (Book book : dataBase.books) {
            System.out.println(book);
        }
    }

    @Override
    public Book createBook() {
        Book book = new Book();
        book.setName(dataBase.readText("Enter book name"));
        book.setAuthor(dataBase.readText("Enter author"));
        return book;
    }

    @Override
    public boolean addUser() {
        User user = createUser();
        dataBase.users.add(user);
        System.out.println("success");
        return true;
    }

    @Override
    public boolean removeUser(String id) {
        dataBase.users.removeIf(user -> user.getId().equals(id));
        return true;
    }

    @Override
    public User showUser(String id) {
        for (User user : dataBase.users) {
            if (user.getId().equals(id)){
                return user;
            }
        }
        System.out.println("fail");
        return null;
    }

    @Override
    public void showAllUsers() {
        for (User user : dataBase.users) {
            System.out.println(user);
        }
    }

    @Override
    public User createUser() {
        User user = new User();
        user.setName(dataBase.readText("Enter name: "));
        user.setPassword(dataBase.readText("Password: "));
        user.setAddress(dataBase.readText("Address: "));
        String role = dataBase.readText("Enter role: ");
        if (role.equals(Role.ADMIN.toString())) {
            user.setRole(Role.ADMIN);
        } else if (role.equals(Role.USER.toString())) {
            user.setRole(Role.USER);
        }
        return user;
    }
}
