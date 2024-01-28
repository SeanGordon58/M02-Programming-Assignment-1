public class Main {
    public static void main(String[] args) {
        // Create MyDate objects using different constructors
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);

        // Display information about the first date
        System.out.println("Date 1: Year - " + date1.getYear() + ", Month - " + date1.getMonth() + ", Day - " + date1.getDay());

        // Display information about the second date
        System.out.println("Date 2: Year - " + date2.getYear() + ", Month - " + date2.getMonth() + ", Day - " + date2.getDay());
    }
}