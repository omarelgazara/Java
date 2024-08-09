package omar.java.model;

import omar.java.model.models.User;


public class Main {
    public static void main(String[] args) {


        User user;

        System.out.println("social".matches("user|social"));
        System.out.println("user".matches("user|social"));
        System.out.println("dd".matches("user|social"));
    }
}