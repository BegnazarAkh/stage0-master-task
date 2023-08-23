package com.epam.conditions;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("Invalid date");
            return;
        }

        int daysInMonth = getDaysInMonth(year, month);
        System.out.println("Number of days in month " + month + " of year " + year + ": " + daysInMonth);
    }

    private int getDaysInMonth(int year, int month) {
        switch (month) {
            case 2: // February
                return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                return 30;
            default:
                return 31;
        }
    }
}

