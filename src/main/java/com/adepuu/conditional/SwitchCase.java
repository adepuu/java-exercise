package com.adepuu.conditional;

public class SwitchCase {
    static enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY; }

    public static void main(String[] args) {
        // Classic Switch-case
        // In this example, the switch statement evaluates the day variable and
        // assigns the number of letters in the day's name to numLetters based on the day of the week
        int numLetters = 0;
        Day day = Day.WEDNESDAY;
        switch (day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                numLetters = 6;
                break;
            case TUESDAY:
                numLetters = 7;
                break;
            case THURSDAY:
            case SATURDAY:
                numLetters = 8;
                break;
            case WEDNESDAY:
                numLetters = 9;
                break;
            default:
                throw new IllegalStateException("Invalid day: " + day);
        }
        System.out.println(numLetters); // Output: 9

        // This switch expression evaluates the variable number and assigns a corresponding string message
        // to the variable result based on the value of number.
        // The yield keyword is used to return a value from each case,
        // making the code more readable and eliminating the need for break statements.
        int number = 10;
        String result = switch (number) {
            case 1 -> "Number is 1";
            case 2 -> "Number is 2";
            case 3 -> "Number is 3";
            default -> {
                if (number < 0) yield "Negative Number";
                else if (number > 0) yield "Positive number, but more than 3";
                yield "Thats 0";
            }
        };
        System.out.println(result); // Output: Positive number, but more than 3

        // code below demonstrates the use of a switch expression in Java to determine whether today is a weekday or a weekend
        // based on the value of the today variable, which is an instance of an enum Day.
        // The switch expression evaluates today and assigns a boolean value to the variable isWeekday indicating
        // whether it's a weekday (true) or a weekend (false). This is achieved without using the yield keyword,
        // which is a feature introduced in Java 14 to simplify switch expressions by allowing them to return values directly.
        Day today = Day.MONDAY;
        var isWeekday = switch (today) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> true;
            case SATURDAY, SUNDAY -> false;
        };
        System.out.println("Should we work today? : " + isWeekday); //Output: true
    }
}
