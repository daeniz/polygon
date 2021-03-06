
package Control;

import java.util.Properties;
import javax.ejb.Stateless;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * The purpose of this class, is to send mail, when a order request is made by
 * a customer.
 * 
 * (Note from Dennis. TODO: Move class to domain layer!) 
 * @author Cherry
 */
@Stateless
public class MailSenderBean {

    /**
     * The purpose of this method, is to send a mail.
     * @param fromEmail The no-reply mail that is the official sender
     * @param username username to the mailhost
     * @param password password for the mailhost
     * @param toEmail the inbox at polygon. 
     * @param subject 
     * @param message
     */
    public void sendEmail(String fromEmail, String username, String password, String toEmail, String subject, String message) {
        
        Properties props = System.getProperties();
        //properties set up
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com"); //gmail host
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "587"); //gmail port

        props.put("mail.smtp.user", username);
        props.put("mail.smtp.password", password);
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.port", "587");
        props.put("mail.smtp.socketFactory.fallback", "false");

        Session mailSession = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override // username and password authentication
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        Message mailMessage = new MimeMessage(mailSession);
        //will try to send the message to the recipient once authentication was success
        try {
            mailMessage.setFrom(new InternetAddress(fromEmail));
            mailMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            mailMessage.setText(message);
            mailMessage.setSubject(subject);

            Transport.send(mailMessage);
        } catch (MessagingException me) {
            me.getMessage();
        }

    }
}