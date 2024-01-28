import java.util.*;

public class MyDate {
    private int year;
    private int month;
    private int day;

    // No-arg constructor for the current date
    public MyDate() {
        this(System.currentTimeMillis());
    }

    // Constructor with specified elapsed time
    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    // Constructor with specified year, month, and day
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Getter methods
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    // Method to set a new date using elapsed time
    public void setDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }
}