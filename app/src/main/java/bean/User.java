package bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by dylanfoster on 15/12/17.
 */

public class User {
    private String name;
    private String firstname;
    private String email;
    private Date birth;

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void User(String n, String f, String e) {
        this.name = n;
        this.firstname= f;
        this.email= e;
    }

    @Override
    public String toString() {
        return "User : " + firstname + " " + name + " " + email;
    }

    public static List<User> generateRandomUsers(int usersNumber) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            final double randInt = Math.random() * 10000;
            User u = new User();
            u.setName("coucouName"+randInt);
            u.setFirstname("coucouFirstName"+randInt);
            u.setEmail("coucouEmail"+randInt);
            users.add(u);
        }
        return users;
    }
}
