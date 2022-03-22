package com.company;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Create new person");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your firstname: ");
        String firstName = scanner.nextLine();
        System.out.println("Input your lastname: ");
        String lastName = scanner.nextLine();

        Person Ivan = new Person(firstName,lastName);
        System.out.println(Ivan.getFirstName());



    }
}
enum TypeSex{MALE, FEMALE, UNDERFINED};

class Person{
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public TypeSex getSex() {
        return sex;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    private String firstName;
    private String lastName;
    private TypeSex sex;
    private Date dateBirth;

    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

    }

}