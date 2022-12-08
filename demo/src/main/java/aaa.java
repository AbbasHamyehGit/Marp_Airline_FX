
 // import org.json.simple.JSONArray;
 // import org.json.simple.JSONObject;
 // import org.json.simple.parser.JSONParser;



// import java.net.HttpURLConnection;
// import java.net.URL;
// import java.util.Scanner;
// public class aaa {

    
//     public static void main(String[] args) {

//         try {
//             // Public API:
//             // https://www.metaweather.com/api/location/search/?query=<CITY>
//             // https://www.metaweather.com/api/location/44418/

//             URL url = new URL("https://www.metaweather.com/api/location/search/?query=London");

//             HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//             conn.setRequestMethod("GET");
//             conn.connect();

//             // Check if connect is made
//             int responseCode = conn.getResponseCode();

//             // 200 OK
//             if (responseCode != 200) {
//                 throw new RuntimeException("HttpResponseCode: " + responseCode);
//             } else {

//                 StringBuilder informationString = new StringBuilder();
//                 Scanner scanner = new Scanner(url.openStream());

//                 while (scanner.hasNext()) {
//                     informationString.append(scanner.nextLine());
//                 }
//                 // Close the scanner
//                 scanner.close();

//                 System.out.println(informationString);

//                 // JSON simple library Setup with Maven is used to convert strings to JSON
//                 JSONParser parse = new JSONParser();
//                 JSONArray dataObject = (JSONArray) parse.parse(String.valueOf(informationString));

//                 // Get the first JSON object in the JSON array
//                 System.out.println(dataObject.get(0));

//                 JavaFileObject countryData = (JSONObject) dataObject.get(0);

//                 System.out.println(countryData.get("woeid"));

//             }
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }

// }

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class aaa {

    public static void main(String[] args) {

        // Recipient's email ID needs to be mentioned.
        String to = "fromaddress@gmail.com";

        // Sender's email ID needs to be mentioned
        String from = "roy.gebrayel10@gmail.com";

        // Assuming you are sending email from through gmails smtp
        String host = "smtp.gmail.com";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        // Get the Session object.// and pass username and password
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication("fromaddress@gmail.com", "*******");

            }

        });

        // Used to debug SMTP issues
        session.setDebug(true);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("This is the Subject Line!");

            // Now set the actual message
            message.setText("This is actual message");

            System.out.println("sending...");
            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }

    }

}