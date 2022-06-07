package base;

import controller.AdminController;
import controller.UserController;
import database.DataBase;
import template.User;
import template.role.Role;

public class Main {
    static DataBase dataBase = DataBase.getDataBase();
    static AdminController adminController = AdminController.getAdminController();
    static UserController userController = UserController.getUserController();
    public static void main(String[] args) {

        dataBase.load();



        String logIn = "\t0. Exit\n" +
                "\t1. Sign in";

        Integer select;
        do {

            select = dataBase.readNum(logIn);

            switch (select){
                case 1 -> signIn();
            }

        }while (select!=0);
    }


    private static void signIn() {

        String name = dataBase.readText("Enter your name: ");
        String password = dataBase.readText("Enter your password: ");

        for (User user : dataBase.users) {
            if (user.getName().equals(name) && user.getPassword().equals(password)){
                dataBase.currentUser = user.getId();
                if (user.getRole().equals(Role.ADMIN)){
                    adminController.controller();
                } else {
                    userController.controller();
                }
            }
        }
    }
}
