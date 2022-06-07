package template;

import lombok.*;
import template.role.ABS;
import template.role.Role;

@Getter
@Setter
@NoArgsConstructor
public class User extends ABS {
    private Integer getBooks = 0;
    private String username;
    private String password;
    private String address;
    private Role role;

    public User(String name, Integer getBooks, String username, String password, String address, Role role) {
        super(name);
        this.getBooks = getBooks;
        this.username = username;
        this.password = password;
        this.address = address;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "\n\t\tid: " + getId() +
                "\tname: " + getName() +
                " \tgetBooks: " + getBooks +
                " \tusername: '" + username +
                " \tpassword: " + password +
                " \taddress: " + address +
                " \trole: " + role;
    }
}
