<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>WildHaven | Admin Registration</title>
    <link rel="stylesheet" href="vendors/simple-line-icons/css/simple-line-icons.css">
    <link rel="stylesheet" href="vendors/flag-icon-css/css/flag-icon.min.css">
    <link rel="stylesheet" href="vendors/css/vendor.bundle.base.css">
    <link rel="stylesheet" href="vendors/daterangepicker/daterangepicker.css">
    <link rel="stylesheet" href="vendors/chartist/chartist.min.css">
    <link rel="stylesheet" href="./css/style.css">
</head>
<body>
    <div class="container-scroller">
        <jsp:include page="header.jsp" />
        <div class="container-fluid page-body-wrapper">
            <jsp:include page="sidebar.jsp" />
            <div class="main-panel">
                <div class="content-wrapper">
                    <div class="page-header">
                        <h3 class="page-title"> Add Admin </h3>
                        <nav aria-label="breadcrumb">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><a href="index.jsp">Dashboard</a></li>
                                <li class="breadcrumb-item active" aria-current="page">Add Admin</li>
                            </ol>
                        </nav>
                    </div>
                    
                    <%-- Backend logic for adding an admin --%>
                    <%
                        String message = "";
                        if (request.getParameter("submit") != null) {
                            String adminName = request.getParameter("adminName");
                            String email = request.getParameter("email");
                            String password = request.getParameter("password");

                            try {
                                // Database connection parameters
                                String dbURL = "jdbc:mysql://localhost:3306/wildlifeconservationdb?useSSL=false";
                                String dbUser = "root";
                                String dbPassword = "Mohapatra@123";
                                
                                // Load and register the driver
                                Class.forName("com.mysql.cj.jdbc.Driver");

                                // Establish a connection
                                Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);

                                // Insert query for admin data
                                String query = "INSERT INTO admin (name, email, password,role) VALUES (?, ?, ?,'admin')";
                                PreparedStatement ps = conn.prepareStatement(query);
                                ps.setString(1, adminName);
                                ps.setString(2, email);
                                ps.setString(3, password);

                                // Execute update and check if insertion was successful
                                int result = ps.executeUpdate();
                                if (result > 0) {
                                    message = "Admin added successfully!";
                                } else {
                                    message = "Error adding admin.";
                                }

                                // Close connection
                                conn.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                                message = "Database error: " + e.getMessage();
                            }
                        }
                    %>

                    <div class="row">
                        <div class="col-12 grid-margin stretch-card">
                            <div class="card">
                                <div class="card-body">
                                    <h4 class="card-title text-center">Add Admin</h4>
                                    
                                    <%-- Display success or error message --%>
                                    <% if (!message.isEmpty()) { %>
                                        <div class="alert <%= message.contains("successfully") ? "alert-success" : "alert-danger" %>">
                                            <%= message %>
                                        </div>
                                    <% } %>

                                    <form method="post" class="forms-sample">
                                        <div class="form-group">
                                            <label for="adminName">Admin Name</label>
                                            <input type="text" name="adminName" class="form-control" required="true">
                                        </div>
                                        <div class="form-group">
                                            <label for="email">Email</label>
                                            <input type="email" name="email" class="form-control" required="true">
                                        </div>
                                        <div class="form-group">
                                            <label for="password">Password</label>
                                            <input type="password" name="password" class="form-control" required="true">
                                        </div>
                                        <button type="submit" class="btn btn-primary mr-2" name="submit">Add Admin</button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <jsp:include page="footer.jsp" />
            </div>
        </div>
    </div>
    <!-- plugins:js -->
    <script src="vendors/js/vendor.bundle.base.js"></script>
    <script src="./vendors/chart.js/Chart.min.js"></script>
    <script src="./vendors/moment/moment.min.js"></script>
    <script src="./vendors/daterangepicker/daterangepicker.js"></script>
    <script src="./vendors/chartist/chartist.min.js"></script>
    <script src="js/off-canvas.js"></script>
    <script src="js/misc.js"></script>
    <script src="./js/dashboard.js"></script>
</body>
</html>
