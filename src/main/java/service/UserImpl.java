package service;

import database.DataBase;
import template.Book;
import template.User;

public class UserImpl implements UserService{
    public static UserImpl user = new UserImpl();
    public static UserImpl getUser() {
        return user;
    }
    static DataBase dataBase = DataBase.getDataBase();
    static AdminImpl admin = AdminImpl.getAdmin();
    @Override
    public boolean getBook(String id) {
        for (Book book : dataBase.books) {
            if (book.getId().equals(id)){
                book.setUserId(dataBase.currentUser);
                System.out.println("success");
                return true;
            }
        }
        System.out.println("fail");
        return false;
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
    public boolean addBook() {
        admin.addBook();
        return true;
    }

    @Override
    public void showOwnBooks() {
        for (Book book : dataBase.books) {
            if (book.getUserId().equals(dataBase.currentUser)){
                System.out.println(book);
            }
        }
    }

    @Override
    public boolean returnBook(String id) {
        for (Book book : dataBase.books) {
            if (book.getId().equals(id)){
                book.setUserId("");
                System.out.println("success");
                return true;
            }
        }
        System.out.println("fail");
        return false;
    }

    @Override
    public void showAllBooks() {
        for (Book book : dataBase.books) {
            if (book.getUserId().equals("")){
                System.out.println(book);
            }
        }
    }
}
