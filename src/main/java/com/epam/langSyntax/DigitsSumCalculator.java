package com.epam.langSyntax;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        if (number < 1000 || number > 9999) {
            System.out.println("Please provide a valid four-digit number.");
            return;
        }
        int summ = 0;
        while(number > 0){
            summ += number % 10;
            number = number / 10;
        }
        System.out.println(summ);
    }
}
