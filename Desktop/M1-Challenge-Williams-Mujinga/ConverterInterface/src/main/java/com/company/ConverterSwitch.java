package com.company;

import java.util.Set;

public class ConverterSwitch implements Converter{

    private int monthNumber;
    private String monthName;
    private String newMonthName;


    public int Month(int input) {

        if ((input == 0) || (input > 12)) {
            System.out.println("Month number must be between 1 and 12");
        } else if (input < 0) {
            System.out.println("Month number must be positive");
        } else {
            System.out.println(" your Month number is valid");
        }
        setMonthName(monthName);
        printMonth(input);
        monthNumber = input;
        return monthNumber;
    }

    private void setMonthName(String MonthName) {
        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;

            case 3:
                monthName = "March";
                break;

            case 4:
                monthName = "April";
                break;

            case 5:
                monthName = "May";
                break;

            case 6:
                monthName = "June";
                break;

            case 7:
                monthName = "July";
                break;

            case 8:
                monthName = "August";
                break;

            case 9:
                monthName = "September";
                break;

            case 10:
                monthName = "October";
                break;

            case 11:
                monthName = "November";
                break;

            case 12:
                monthName = "December";
                break;

            default:
                monthName = "Invalid month";
                break;

        }
    }

    private void printMonth(int input) {
        switch (input) {
            case 0:
                System.out.println(input + " is not a month");
                break;
            case 1:
                System.out.println(input + " is January");
                break;
            case 2:
                System.out.println(input + " is February");
                break;
            case 3:
                System.out.println(input + " is March");
                break;
            case 4:
                System.out.println(input + " is April");
                break;
            case 5:
                System.out.println(input + " is May");
                break;
            case 6:
                System.out.println(input + " is June");
                break;
            case 7:
                System.out.println(input + " is July");
                break;
            case 8:
                System.out.println(input + " is August");
                break;
            case 9:
                System.out.println(input + " is September");
                break;
            case 10:
                System.out.println(input + " is October");
                break;
            case 11:
                System.out.println(input + " is November");
                break;
            case 12:
                System.out.println(input + " is December");
                break;
            default:
                System.out.println(input + " is an invalid selection");
                break;
        }
    }
        public int getMonthNumber(){
            return monthNumber;
        }
public String getMonthName(){
        return monthName;
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
