package com.company.Porterfield;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] temp;
        temp = new double[5];

        System.out.println("Enter the city ");
        String city = input.nextLine();

        System.out.println("Enter the zip code ");
        int zip = input.nextInt();

        double sum = 0;
        int counter = 0;
        System.out.println("Enter the temperatures: ");
        for(int i=0; i<5; i++) {
            System.out.print((i+1) + ": ");
            temp[i] = input.nextDouble();
            sum = sum + temp[i];
            counter = counter + 1;
        }

        double avgTemp = 0;
        avgTemp = sum / counter;

        System.out.println("City: " + city + " | " + "Zip Code: " + zip + " | " + "Temperatures: " + avgTemp);
    }
}
