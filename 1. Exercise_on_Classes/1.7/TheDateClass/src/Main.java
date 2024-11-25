import data.Date;

public class Main {
    public static void main(String[] args) {
        Date d1 = new Date(01, 01, 2024);
        System.out.println(d1);

        System.out.println("This day is " + d1.getDay());
        System.out.println("This month is " + d1.getMonth());
        System.out.println("This year is " + d1.getYear());

        d1.setDay(29);
        d1.setMonth(10);
        d1.setYear(2006);
        System.out.println("The date after changing is: " + d1);
//*****Not input validation needed
    }
}