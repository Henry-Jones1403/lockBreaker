package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
	int[] array = {random.nextInt(9), random.nextInt(9), random.nextInt(9), random.nextInt(9)};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    int[] userArray = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("What is your guess?");
            userArray[i] = input.nextInt();
        }
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if(userArray[i] == array[i]){
                counter++;
            }
        }if(counter==4){
            System.out.println("yay you got it");
        }else{
            System.out.println("Unlucky you only got" + counter+ " right");
        }
    }
}
