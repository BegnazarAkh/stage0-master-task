package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int reverse = 0;
        while(number > 0){
           int last =  number % 10;
           reverse = reverse * 10 + last;
           number /= 10;
        }
        System.out.println(reverse);
    }

}
