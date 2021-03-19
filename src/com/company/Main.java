package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int array[];                              //объявил массив


        Scanner scanner = new Scanner(System.in); //добавил сканер
        System.out.println("enterArrayLength: "); //добавил подпись для сканера

        int arrayLength = scanner.nextInt();      //присваивание знач. сканера к переменной
        System.out.println("Length = " + arrayLength); // вывел длинну массива в консоль
        array = new int[arrayLength];                  // присваивание переменной длинне массива

        for (int i = 0; i < arrayLength; i++) {         // цикл для перебора по длине массива
            array[i] = scanner.nextInt();               // с помощью сканера присваиваем значение
        }

        System.out.println("your array: ");             //ваш массив
        for (int i = 0; i < arrayLength; i++){          //цикл
            System.out.print("[" + array[i] + "] ");
        }
        System.out.println("\nGood job!\nElements multiples of 3 ");
                //arrayLength количество элементов массива
                //array[i] заполненнные элементы массива

        for (int i = 0; i < arrayLength; i++){
            if (array[i] % 3 == 0){
                System.out.print("[" + array[i] + "] ");
            }
        }
    }
}
