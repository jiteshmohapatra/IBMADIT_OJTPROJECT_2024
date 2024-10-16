package ibm_internship;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

@WebServlet("/register")
public class RegisrationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public RegisrationServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname = request.getParameter("name");
        String uemail = request.getParameter("email");
        String upwd = request.getParameter("pass");
        String umobile = request.getParameter("contact");

        RequestDispatcher dispatcher = null;
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wildlifeconservationdb", "root", "Mohapatra@123");

            // Insert user into the database
            PreparedStatement pst = con.prepareStatement("insert into user(uname, upwd, uemail, umobile, role) values(?, ?, ?, ?, 'user')");
            pst.setString(1, uname);
            pst.setString(2, upwd);
            pst.setString(3, uemail);
            pst.setString(4, umobile);

            int rowCount = pst.executeUpdate();
            dispatcher = request.getRequestDispatcher("registration.jsp");

            if (rowCount > 0) {
                request.setAttribute("status", "success");
                // Send email with the user's details
                sendEmail(uemail, uname, upwd);
            } else {
                request.setAttribute("status", "failed");
            }
            dispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void sendEmail(String toEmail, String userName, String userPassword) {
        // SMTP server information
        String host = "smtp.gmail.com";
        final String fromEmail = "team.wildhaven@gmail.com"; 
        final String emailPassword = "spvl dynb jlxm bmgn"; 

        Properties props = new Properties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        // Create a session with authenticator
        Session session = Session.getInstance(props, new jakarta.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, emailPassword);
            }
        });

        try {
            // Create a MimeMessage object
            Message message = new MimeMessage(session);

            // Set From email
            message.setFrom(new InternetAddress(fromEmail));

            // Set To email
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));

            // Set email subject
            message.setSubject("Welcome to Wildlife Conservation Portal");

            // Set email content
            String emailContent = "Hii " + userName + ",\n\n" +
                    "Welcome to Wild Haven!\r\n"
                    + "\r\n"
                    + "Thank you for joining our community of wildlife enthusiasts and conservationists.\n We're excited to have you on board as we work together to protect and preserve nature's most beautiful creatures. \n Below are your login details:\n" +
                    "Email: " + toEmail + "\n" +
                    "Password: " + userPassword + "\n\n" +
                    "Here’s what you can do next:\r\n"
                    + "\r\n"
                    + "Explore wildlife events and updates\r\n"
                    + "Get involved in upcoming conservation projects\r\n"
                    + "Connect with fellow members and share your experiences\r\n"
                    + "If you have any questions or need assistance, feel free to reach out to us at "+ fromEmail +"\n\n" +
                    "Together, we can make a difference!\n\n Best regards,\nThe Wild Haven Team.";

            message.setText(emailContent);

            // Send the email
            Transport.send(message);
            System.out.println("Email sent successfully to: " + toEmail);

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
