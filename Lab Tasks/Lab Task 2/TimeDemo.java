class Time {

    public int hour;
    public int minute;
    public int second;

    public void displayTime() {
        System.out.println(hour + ":" + minute + ":" + second);
    }
}

public class TimeDemo {

    public static void main(String[] args) {

        Time time1 = new Time();

        time1.hour = 10;
        time1.minute = 30;
        time1.second = 45;

        System.out.println("Time 1:");
        time1.displayTime();


        Time time2 = new Time();

        time2.hour = 5;
        time2.minute = 15;
        time2.second = 20;

        System.out.println("Time 2:");
        time2.displayTime();
    }
}
