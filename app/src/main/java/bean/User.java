package bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by dylanfoster on 15/12/17.
 */

public class User implements Parcelable {
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

    public User() {
    };

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

    public User(Parcel in){
        String[] data = new String[4];
        in.readStringArray(data);
        // the order needs to be the same as in writeToParcel() method
        this.name = data[0];
        this.firstname = data[1];
        this.email = data[2];
        this.birth = new Date(data[3]);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeStringArray(new String[] {this.name,
                this.firstname,
                this.email, this.birth.toString()});
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

}
