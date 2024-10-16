package ibm_internship;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String uemail = request.getParameter("username");
        String upwd = request.getParameter("password");
        HttpSession session = request.getSession();
        Connection con = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish the connection to the database
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wildlifeconservationdb?useSSL=false", "root", "Mohapatra@123");

            boolean isUser = false;
            boolean isAdmin = false;

            // Prepare the SQL statement to check the user table
            PreparedStatement pstUser = con.prepareStatement("SELECT * FROM user WHERE uemail= ? AND upwd = ?");
            pstUser.setString(1, uemail);
            pstUser.setString(2, upwd);
            ResultSet rsUser = pstUser.executeQuery();

            if (rsUser.next()) {
                // If user exists, set user session attributes
                session.setAttribute("name", rsUser.getString("uname"));
                session.setAttribute("role", "user");
                isUser = true;  // Mark as user found
            }

            // Prepare the SQL statement to check the admin table
            PreparedStatement pstAdmin = con.prepareStatement("SELECT * FROM admin WHERE email= ? AND password = ?");
            pstAdmin.setString(1, uemail);
            pstAdmin.setString(2, upwd);
            ResultSet rsAdmin = pstAdmin.executeQuery();

            if (rsAdmin.next()) {
                // If admin exists, set admin session attributes
                session.setAttribute("adminId", rsAdmin.getInt("id"));
                session.setAttribute("adminName", rsAdmin.getString("name"));
                session.setAttribute("adminEmail", rsAdmin.getString("email"));
                session.setAttribute("role", "admin");
                isAdmin = true;  // Mark as admin found
            }

            // Redirect based on the role
            if (isUser && isAdmin) {
                // If the user is both admin and user, give access to both dashboards / index pages
                session.setAttribute("role", "both");  
                response.sendRedirect("index.jsp");  
            } else if (isUser) {
                // If only a user, redirect to user dashboard
                response.sendRedirect("index.jsp");
            } else if (isAdmin) {
                // If only an admin, redirect to admin dashboard
                response.sendRedirect("Admin/index.jsp");
            } else {
                // Authentication failed, forward back to login with error
                request.setAttribute("status", "failed");
                RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
                dispatcher.forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the database connection if it was opened
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }
}
