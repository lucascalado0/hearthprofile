package org.example;
import java.time.LocalDate;
import java.time.Period;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private int birthMonth;
    private int birthDay;
    private int birthYear;
    private double height;
    private double weight;

    public HealthProfile(String firstName,String lastName, String gender,
                         int birthMonth, int birthDay, int birthYear, double height, double weight){

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }


    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }


    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge(){
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay );
        LocalDate currentDate = LocalDate.now();

        return Period.between(birthDate, currentDate).getYears();
    }

    public int getMaxHeartRate(){
        return 220 - getAge();
    }

    public String getTargetHeartRate() {
        int maxHeartRate = getMaxHeartRate();
        int lowerBound = (int) (maxHeartRate * 0.50);
        int upperBound = (int) (maxHeartRate * 0.85);

        return "lowerBound: " + lowerBound + " / " + "upperBound: " + upperBound;
    }

    public String getIMC(){
        double height = getHeight();
        double weight = getWeight();
        double imc = weight / height * height;

        return imc + " kg";
    }

}
