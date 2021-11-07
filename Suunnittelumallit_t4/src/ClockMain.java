
public class ClockMain {

    public static void main(String args[]) {
        ClockTimer clockTimer = new ClockTimer();
        DigitalClock digitalClock = new DigitalClock(clockTimer);

        new Thread(clockTimer).start();
    }
}
