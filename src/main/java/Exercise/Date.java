package Exercise;

import java.util.InputMismatchException;

public class Date implements Comparable<Date> {

    private static final String[] nameOfMonth = {"January", "February", "March", "April",
            "May", "June", "July", "August", "September", "Octobre", "November", "December"};

    private final int day;
    private final int month;
    private final int year;

    public Date(int day, int month, int year) throws Exception {

        if (!isMonthValid(month) && !isDayValid(day, month)) {
            throw new InputMismatchException();
        }

        if (!isDateValid(day, month, year)) {
            throw new Exception("Invalid Java_Repetition.Date");
        }

        this.day = day;
        this.month = month;
        this.year = year;

    }

    public boolean isDateValid(int day, int month, int year) {

        if (year > 1582) {
            return true;
        } else if (year == 1582 && month >= 10 && day >= 15) {
            return true;
        }
        return false;
    }

    public boolean isMonthValid(int month) {
        return month <= 12 && month >= 1;
    }

    public boolean isDayValid(int day, int month) {

        if (day > 31 || day < 1) {
            return false;
        }

        if (month == 2 && day > 28) {
            return false;
        }

        if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            return false;
        }

        return true;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {

        if (o instanceof Date date) {
            return day == date.day && month == date.month && year == date.year;
        }

        return false;
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %d", day, nameOfMonth[month], year);
    }

    @Override
    public int compareTo(Date date) {

        int years = year - date.year;
        int months = month - date.month;

        if (years != 0) {
            return years;
        }

        if (months != 0) {
            return months;
        }

        return day - date.day;

    }
}