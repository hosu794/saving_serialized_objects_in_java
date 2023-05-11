import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        User user = new User("adam", "password");
        User user2 = new User("adam", "password2");

        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);

        ArrayList<User> readArray = null;

        try {

            FileOutputStream f = new FileOutputStream("users.txt");
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(users);

            o.close();
            f.close();

            FileInputStream fi = new FileInputStream("users.txt");
            ObjectInputStream oi = new ObjectInputStream(fi);

            readArray = (ArrayList<User>) oi.readObject();

            System.out.println(readArray);

            oi.close();
            fi.close();

            } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }


    }
}