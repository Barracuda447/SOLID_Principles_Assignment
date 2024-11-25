package Violated.DIP;


public class Notification {

    private Email emailService = new Email();
    private SMS smsService = new SMS();

    public void sendEmail(String message) {
        emailService.sendEmail(message);
    }

    public void sendSMS(String message) {
        smsService.sendSMS(message);
    }
}

