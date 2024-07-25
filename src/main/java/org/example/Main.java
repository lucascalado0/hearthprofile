package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.print("What's your first name? ");
        String firstName = scanner.nextLine();

        System.out.print("What's your first name? ");
        String lastName = scanner.nextLine();

        System.out.print("What's your gender(Male or Female)? ");
        String gender = scanner.nextLine();

        System.out.print("What's your birth year? ");
        int birthYear = scanner.nextInt();

        System.out.print("What's your birth month(1-12)? ");
        int birthMonth = scanner.nextInt();

        System.out.print("What's your birth day(1-31)? ");
        int birthDay = scanner.nextInt();

        System.out.print("What's your height? ");
        double height = scanner.nextDouble();

        System.out.print("What's your weight? ");
        double weight = scanner.nextDouble();

        HealthProfile person2 = new HealthProfile(firstName, lastName, gender, birthDay, birthMonth, birthYear, height, weight);


        System.out.println("Your information: ");
        System.out.println("\n-Name: " + person2.getFirstName() + " " + person2.getLastName());
        System.out.println("\n-Gender: " + person2.getGender());
        System.out.println("\n-Birthday: " + person2.getBirthMonth() + "/" + person2.getBirthDay() + "/" + person2.getBirthYear());
        System.out.println("\n-Age: " + person2.getAge());
        System.out.println("\n-Height: " + person2.getHeight());
        System.out.println("\n-Weight: " + person2.getWeight());
        System.out.println("\n-Max Heart Rate: " + person2.getMaxHeartRate());
        System.out.println("\n-Target Heart Rate: " + person2.getTargetHeartRate());
        System.out.println("\n-IMC: " + person2.getIMC());
    }
}