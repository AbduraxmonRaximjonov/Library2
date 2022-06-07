package controller;

import database.DataBase;
import service.AdminImpl;

public class AdminController {

    public static AdminController adminController = new AdminController();
    static AdminImpl admin = AdminImpl.getAdmin();
    public static AdminController getAdminController(){
        return adminController;
    }

    static DataBase dataBase = DataBase.getDataBase();
    public void controller(){
        String adminMenu = "\t0. Exit\n" +
                "\t1. Add book\n" +
                "\t2. Remove book\n" +
                "\t3. Show book\n" +
                "\t4. Show all books\n" +
                "\t/*/*/*/*/*/*/*/*/*/*/\n" +
                "\t5. Create user/admin\n" +
                "\t6. Remove user\n" +
                "\t7. Show user\n" +
                "\t8. Show all users\n";

        Integer select;
        do {
            select = dataBase.readNum(adminMenu);

            switch (select){
                case 1 -> admin.addBook();
                case 2 -> admin.removeBook(dataBase.readText("Enter id: "));
                case 3 -> admin.showBook(dataBase.readText("Enter id: "));
                case 4 -> admin.showAllBook();
                case 5 -> admin.addUser();
                case 6 -> admin.removeUser(dataBase.readText("Enter id: "));
                case 7 -> admin.showUser(dataBase.readText("Enter id: "));
                case 8 -> admin.showAllUsers();
            }

        }while (select!=0);
    }
}
