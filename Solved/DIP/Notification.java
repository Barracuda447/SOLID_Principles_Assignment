package Solved.DIP;

public class Notification {
    private NotificationChannel notificationChannel;

    // Constructor injection of the notification channel
    public Notification(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    // Send notification via the given channel (email, sms, etc.)
    public void sendNotification(String message) {
        notificationChannel.send(message);
    }
}
