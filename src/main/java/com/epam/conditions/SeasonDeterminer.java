package com.epam.conditions;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        if (monthNumber >= 1 && monthNumber <= 12) {
            String season;
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    season = "Winter";
                    break;
                case 3:
                case 4:
                case 5:
                    season = "Spring";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "Summer";
                    break;
                default:
                    season = "Fall";
                    break;
            }
            System.out.println(season);
        } else {
            System.out.println("Wrong month number");
        }
    }
}
