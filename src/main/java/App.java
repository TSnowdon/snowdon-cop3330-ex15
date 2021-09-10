import java.util.HashMap;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Tyler Snowdon
 */
public class App {

    public static void main(String[] args) {
        String inputName;
        String inputPassword;

        HashMap<String, String> userInfo = new HashMap<>();
        userInfo.put("user", "password");
        userInfo.put("steve", "abc$123");

        Scanner reader = new Scanner(System.in);
        System.out.print("Insert Username: ");
        inputName = reader.nextLine();
        System.out.print("What is the password? ");
        inputPassword = reader.nextLine();

        String expectedPassword = userInfo.get(inputName);
        if (expectedPassword != null && expectedPassword.equals(inputPassword)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("I don't know you.");
        }
    }
}
