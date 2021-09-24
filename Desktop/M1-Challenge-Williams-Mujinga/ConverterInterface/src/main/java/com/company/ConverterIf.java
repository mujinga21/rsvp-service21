package com.company;

import java.util.Scanner;

public class ConverterIf implements Converter {




    public int  dayNumber() {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weekday number :");
        int dayNumber = scanner.nextInt();
        if (dayNumber == 1) {
            System.out.println("Sunday");
        } else if (dayNumber == 2) {
            System.out.println("Monday");
        } else if (dayNumber== 3) {
            System.out.println("Tuesday");
        } else if (dayNumber == 4) {
            System.out.println("Wednesday");
        } else if (dayNumber == 5) {
            System.out.println("Thursday");
        } else if (dayNumber == 6) {
            System.out.println("Friday");
        } else if (dayNumber == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Please enter a number between 1 and 7");
        }

            return dayNumber;
        }


    @Override
    public String convertMonth(int monthNumber) {
        return null;
    }

    @Override
    public String convertDay(int dayNumber) {
        return null;
    }
}
