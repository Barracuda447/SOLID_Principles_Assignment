package Solved.DIP;

public class Email implements NotificationChannel {

    @Override
    public void send(String message) {
        System.out.println("Sending as email: " + message);
    }
}
