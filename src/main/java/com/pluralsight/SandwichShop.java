package com.pluralsight;

import java.util.*;

public class SandwichShop {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("1: Regular: base price $5.45 \n2: Large: base price $8.95 \nPlease select your sandwich size (1/2): ");
        int size_option = scanner.nextInt();
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Would you like your sandwich Loaded (yes/no)? ");
        String loaded = scanner.nextLine();

        if(loaded.equals("yes")) {
            System.out.printf("The cost of your sandwich is: %.2f", loaded_sandwich_price(size_option, age));
        }else{
            System.out.printf("The cost of your sandwich is: %.2f", normal_sandwich_price(size_option, age));
        }

    }

    public static float loaded_sandwich_price(int size, int age){
        float price;
            if (size == 1) {
                if (age <= 17) {
                    return price = (5.45f + 1) * .90f;
                } else if (age > 17 && age < 65) {
                    return price = 5.45f + 1;
                } else {
                    return price = (5.45f + 1) * .80f;
                }
            } else {
                if (age <= 17) {
                    return price = (8.95f + 1.75f) * .90f;
                } else if (age > 17 && age < 65) {
                    return price = 8.95f + 1.75f;
                } else {
                    return price = (8.95f + 1.75f) * .80f;
                }
            }
        }


    public static float normal_sandwich_price(int size, int age){
        float price;
        if (size == 1) {
            if (age <= 17) {
                return price = 5.45f * .90f;
            } else if (age > 17 && age < 65) {
                return price = 5.45f;
            } else {
                return price = 5.45f * .80f;
            }
        } else {
            if (age <= 17) {
                return price = 8.95f * .90f;
            } else if (age > 17 && age < 65) {
                return price = 8.95f;
            } else {
                return price = 8.95f * .80f;
            }
        }
    }
}
