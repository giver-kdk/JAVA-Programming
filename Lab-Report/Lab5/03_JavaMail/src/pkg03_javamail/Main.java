package pkg03_javamail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create a dummy session (no SMTP server needed)
        Session session = Session.getInstance(new Properties());

        // Create a test email
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress("test@example.com"));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress("recipient@example.com"));
        message.setSubject("Test Email");
        message.setText("This is a test email.");

        // Mock the Transport class
        Transport transport = new Transport(session, null) {
            @Override
            public void sendMessage(Message message, Address[] addresses) throws MessagingException {
                // Verify email properties
                System.out.println("Test Email Sent Successfully!");
                System.out.println("From: " + message.getFrom()[0]);
                System.out.println("To: " + message.getRecipients(Message.RecipientType.TO)[0]);
                System.out.println("Subject: " + message.getSubject());
                try {
                System.out.println("Content: " + message.getContent());
                } catch (IOException e) {
                    System.err.println("Error reading email content: " + e.getMessage());
                }
            }
        };

        // Send the email using the mock Transport
        transport.sendMessage(message, message.getAllRecipients());
    }
}