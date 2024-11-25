package Solved.DIP;

public class SMS implements NotificationChannel {

    @Override
    public void send(String message) {
        System.out.println("Sending as SMS: " + message);
    }
}
