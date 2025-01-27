package pkg01_mail;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class Main {
    public static void main(String[] args) {
        // Load configuration from config.properties
        Properties config = new Properties();
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            config.load(fis);
        } catch (IOException e) {
            System.err.println("Error loading config.properties file.");
            e.printStackTrace();
            return;
        }
        // Email credentials and configuration
        String host = "smtp.gmail.com"; // SMTP server (e.g., Gmail)
        String username = config.getProperty("email"); // Email from config
        String password = config.getProperty("password"); // Password from config
        String to = "recipient-email@example.com"; // Recipient's email address

        // Set up mail server properties
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true"); // Enable authentication
        props.put("mail.smtp.starttls.enable", "true"); // Enable TLS encryption
        props.put("mail.smtp.host", host); // SMTP server
        props.put("mail.smtp.port", "587"); // SMTP port for TLS

        // Create a session with authentication
        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Create a default MimeMessage object
            Message message = new MimeMessage(session);

            // Set From: header field
            message.setFrom(new InternetAddress(username));

            // Set To: header field
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));

            // Set Subject: header field
            message.setSubject("Hello from JavaMail API");

            // Set the actual message
            message.setText("Hello, this is a test email from JavaMail API.");

            // Send the message
            Transport.send(message);

            System.out.println("Email sent successfully!");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}