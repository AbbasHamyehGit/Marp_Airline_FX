// File Name SendEmail.java

// import java.util.*;
// import javax.mail.*;
// import javax.mail.internet.*;
// import javax.activation.*;

// public class email {

//     public static void main(String[] args) {
//         // Recipient's email ID needs to be mentioned.
//         String to = "abcd@gmail.com";

//         // Sender's email ID needs to be mentioned
//         String from = "roy.gebrayel10@gmail.com";

//         // Assuming you are sending email from localhost
//         String host = "localhost";

//         // Get system properties
//         Properties properties = System.getProperties();

    
//         // Setup mail server
//         properties.setProperty("mail.smtp.host", host);

//         // Get the default Session object.
//         Session session = Session.getDefaultInstance(properties);

//         try {
//             // Create a default MimeMessage object.
//             MimeMessage message = new MimeMessage(session);

//             // Set From: header field of the header.
//             message.setFrom(new InternetAddress(from));

//             // Set To: header field of the header.
//             message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

//             // Set Subject: header field
//             message.setSubject("This is the Subject Line!");

//             // Now set the actual message
//             message.setText("This is actual message");

//             // Send message
//             Transport.send(message);
//             System.out.println("Sent message successfully....");
//         } catch (MessagingException mex) {
//             mex.printStackTrace();
//         }
//     }
// }

import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

public class email {
    final String senderEmail = "@gmail.com"; // change email address
    final String senderPassword = "*****"; // change password
    final String emailSMTPserver = "smtp.gmail.com";
    final String emailServerPort = "465";
    String receiverEmail = null;
    static String emailSubject;
    static String emailBody;

    public void SendEmail(String receiverEmail, String subject, String body) {
        // receiver email
        this.receiverEmail = receiverEmail;
        // subject
        this.emailSubject = subject;
        // body
        this.emailBody = body;

        Properties props = new Properties();
        props.put("mail.smtp.user", senderEmail);
        props.put("mail.smtp.host", emailSMTPserver);
        props.put("mail.smtp.port", emailServerPort);
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.socketFactory.port", emailServerPort);
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "false");
        SecurityManager security = System.getSecurityManager();

        try {
            Authenticator auth = new SMTPAuthenticator();
            Session session = Session.getInstance(props, auth);
            MimeMessage msg = new MimeMessage(session);
            msg.setText(emailBody);
            // System.out.println(emailBody);
            msg.setSubject(emailSubject);
            msg.setFrom(new InternetAddress(senderEmail));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(receiverEmail));
            Transport.send(msg);
            System.out.println("Message sent successfully");
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
  


    
    public static void main(String[] args) {
        SendEmail send = new SendEmail("@gmail.com", "subject", "body"); // change receiver email
    }

