package Solved.DIP;

public class Main {

    public static void main(String[] args) {
        // Using constructor injection to pass the desired notification channel
        NotificationChannel email = new Email();
        Notification notificationEmail = new Notification(email);
        notificationEmail.sendNotification("Hello, this is an email notification!");
        
        //same thing but for sms
        NotificationChannel sms = new SMS();
        Notification notificationSMS = new Notification(sms);
        notificationSMS.sendNotification("Hello, this is an SMS notification!");
    }
}
