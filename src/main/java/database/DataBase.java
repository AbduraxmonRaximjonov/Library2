package database;

import template.Book;
import template.User;
import template.role.Role;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataBase {

    public static DataBase dataBase = new DataBase();
    public static DataBase getDataBase(){
        return dataBase;
    }

    public String readText(String data){
        System.out.println(data);
        return new Scanner(System.in).nextLine();
    }
    public Integer readNum(String data){
        System.out.println(data);
        return new Scanner(System.in).nextInt();
    }

    public String currentUser = "";
    public List<Book> books = new ArrayList<>();
    public List<User> users = new ArrayList<>();

    public void load(){
        //admin 1
        User admin1 = new User();
        admin1.setAddress("Novza");
        admin1.setPassword("123");
        admin1.setRole(Role.ADMIN);
        admin1.setUsername("@Abdurahmon_Raximjonov");
        admin1.setName("Abdurahmon");
        users.add(admin1);

        //admin 2
        User admin2 = new User();
        admin2.setAddress("Chilonzor");
        admin2.setPassword("123");
        admin2.setRole(Role.ADMIN);
        admin2.setUsername("@Nodiroff");
        admin2.setName("Akmal");
        users.add(admin2);



        //user 1
        User user = new User();
        user.setAddress("Chilonzor");
        user.setPassword("123");
        user.setRole(Role.USER);
        user.setUsername("@Nodiroff");
        user.setName("Nodir");
        users.add(user);
    }

}
