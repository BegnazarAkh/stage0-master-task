package com.epam.langSyntax;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        if (number < 1000 || number > 9999) {
            System.out.println("Please provide a valid four-digit number.");
            return;
        }
        int sum = 0;
        while(number > 0){
            sum += number % 10;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
