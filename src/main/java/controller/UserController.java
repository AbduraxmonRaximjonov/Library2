package controller;

import database.DataBase;
import service.UserImpl;

public class UserController {

    public static UserController userController = new UserController();
    static DataBase dataBase = DataBase.getDataBase();
    UserImpl user = UserImpl.getUser();
    public static UserController getUserController(){
        return userController;
    }

    public void controller(){
        String userMenu = "\t0. Exit\n" +
                "\t1. Get book\n" +
                "\t2. Show book\n" +
                "\t3. Add book\n" +
                "\t4. Show own books\n" +
                "\t5. Return book\n" +
                "\t6. See all book";

        Integer select;
        do {
            select = dataBase.readNum(userMenu);

            switch (select){
                case 1 -> user.getBook(dataBase.readText("Enter id: "));
                case 2 -> user.showBook(dataBase.readText("Enter id: "));
                case 3 -> user.addBook();
                case 4 -> user.showOwnBooks();
                case 5 -> user.returnBook(dataBase.readText("Enter id: "));
                case 6 -> user.showAllBooks();
            }

        }while (select!=0);
    }
}
