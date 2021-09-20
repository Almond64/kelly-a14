/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Paul Kelly
 */

import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the order amount: ");
        double order = input.nextDouble();
        System.out.println("What is the state: ");
        String state = input.next();
        //If the state is WI, calculate total with 5.5% tax
        double tax = 0;
        double total = order + tax;
        if(state.equals("WI")) {
            tax = order * 0.055;
            //Output single print statement
            System.out.printf("The subtotal is $%.2f.\n The tax is $%.2f.\n", order, tax);
        }
        //If the state is not WI
        System.out.printf("The total is $%.2f.\n", total + tax);
    }
}
