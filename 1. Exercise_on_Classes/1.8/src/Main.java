import data.Time;


public class Main {
    public static void main(String[] args) {
        Time testCaseTime01 = new Time(11, 50, 00); // =))) slot 5 FPTU
        System.out.println(testCaseTime01);
        //test getter and setter
        System.out.println("The hour now is: " + testCaseTime01.getHour());
        System.out.println("The minute now is: " + testCaseTime01.getMinute());
        //test set time

        testCaseTime01.setTime(9, 53, 00); //=)))))))
        System.out.println(testCaseTime01);
        //test next second
        System.out.println("Next 1 second, the time now is " + testCaseTime01.nextSecond());
        //test previous second
        testCaseTime01.setTime(6, 50, 00); //:))))))
//        System.out.println("Previous 1 second, the time now is " + testCaseTime01.previousSecond());
        System.out.println("Previous 3 second, the time now is " + testCaseTime01.previousSecond().previousSecond().previousSecond());

    }
}