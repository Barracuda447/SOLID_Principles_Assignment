package Violated.DIP;

public class Main {
    public static void main(String[] args) {
        Notification notification = new Notification();

        // Send a notification via email
        notification.sendEmail("Hello, this is an email notification!");

        // Send a notification via SMS
        notification.sendSMS("Hello, this is an SMS notification!");
    }
}
