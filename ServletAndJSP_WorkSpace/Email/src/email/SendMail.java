package email;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
   
public class SendMail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String username="ajaykumar2789@gmail.com";
				final String password="Ajay1205862797Gmail";
		Properties props=new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		
		Session session=Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		
		try {
			Message msg=new MimeMessage(session);
			msg.setSubject("Test from java program");
			msg.setText("Hello Ajay, \n This is a message from my java program");
			msg.setFrom(new InternetAddress("ajaykumar2789@gmail.com","Ajay Kumar Chirumamilla"));
			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("ajaykumar2789@gmail.com"));
			Transport.send(msg);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Finished..");
	}

}
