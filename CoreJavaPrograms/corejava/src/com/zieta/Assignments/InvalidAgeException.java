package com.zieta.Assignments;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

 class VoterAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        try {
            if (age < 18) {
                throw new InvalidAgeException("You are not eligible to vote!");
            } else {
                System.out.println("Welcome Voter!");
            }
        } catch (InvalidAgeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
