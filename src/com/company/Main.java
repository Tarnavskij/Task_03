package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of an array: ");
        int arrayLength = Integer.valueOf(scanner.nextLine());
        int array[] = new int[arrayLength];


        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.valueOf(scanner.nextLine());
        }

        System.out.println("Your array: ");
        for (int i = 0; i < array.length; i++){
            System.out.print("[" + array[i] + "] ");
        }

        System.out.println("\nGood job!\nElements multiples of 3 ");


        for (int i = 0; i < array.length; i++){
            if (array[i] % 3 == 0){
                System.out.print("[" + array[i] + "] ");
            }
        }
    }
}

