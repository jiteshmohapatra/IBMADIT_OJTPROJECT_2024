<% 
    // Retrieve the role from the session
    String role = (String) session.getAttribute("role");

    // If user is not logged in or has no access, redirect to login
    if (role == null) {
        response.sendRedirect("../login.jsp");
    } else if (!"admin".equals(role) && !"both".equals(role)) {
        
        response.sendRedirect("../index.jsp");
    }
%>


<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <title>WildHaven | Dashboard</title>
    <!-- plugins:css -->
    <link rel="stylesheet" href="vendors/simple-line-icons/css/simple-line-icons.css">
    <link rel="stylesheet" href="vendors/flag-icon-css/css/flag-icon.min.css">
    <link rel="stylesheet" href="vendors/css/vendor.bundle.base.css">
    <!-- endinject -->
    <!-- Plugin css for this page -->
    <link rel="stylesheet" href="vendors/daterangepicker/daterangepicker.css">
    <link rel="stylesheet" href="vendors/chartist/chartist.min.css">
    <!-- End plugin css for this page -->
    <!-- inject:css -->
    <link rel="stylesheet" href="css/style.css">
    <!-- End layout styles -->
</head>

<body>
    <div class="container-scroller">
        <!-- partial:partials/_navbar.html -->
        <jsp:include page="header.jsp" />
        <!-- partial -->
        <div class="container-fluid page-body-wrapper">
            <!-- partial:partials/_sidebar.html -->
            <jsp:include page="sidebar.jsp" />
            <!-- partial -->
            <div class="main-panel">
                <div class="content-wrapper">
                    <div class="row">
                        <div class="col-md-12 grid-margin">
                            <div class="card">
                                <div class="card-body">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <div class="d-sm-flex align-items-baseline report-summary-header">
                                                <h5 class="font-weight-semibold">Report Summary</h5>
                                                <span class="ml-auto">Updated Report</span>
                                                <button class="btn btn-icons border-0 p-2"><i class="icon-refresh"></i></button>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row report-inner-cards-wrapper">
                                        <%
                                            int totalUsers = 0;
                                            int totalVolunteers = 0;
                                            int totalspecies=0;
                                           int totalcontacts= 0;

                                            try {
                                                // Assuming you have set up a DataSource or are using a DriverManager to get the connection
                                                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wildlifeconservationdb?useSSL=false", "root", "Mohapatra@123");
                                                Statement stmt = conn.createStatement();

                                                // Query to count total users
                                                ResultSet rsUsers = stmt.executeQuery("SELECT COUNT(*) AS totalUsers FROM user");
                                                if (rsUsers.next()) {
                                                    totalUsers = rsUsers.getInt("totalUsers");
                                                }

                                                // Query to count total volunteers
                                                ResultSet rsVolunteers = stmt.executeQuery("SELECT COUNT(*) AS totalVolunteers FROM volunteer");
                                                if (rsVolunteers.next()) {
                                                    totalVolunteers = rsVolunteers.getInt("totalVolunteers");
                                                }
                                                
                                                // Query to count total species
                                                ResultSet rsspecies = stmt.executeQuery("SELECT COUNT(*) AS totalVolunteers FROM species_data");
                                                if (rsspecies.next()) {
                                                    totalspecies = rsspecies.getInt("totalVolunteers");
                                                }
                                                
                                             // Query to count total species
                                                ResultSet rscontact = stmt.executeQuery("SELECT COUNT(*) AS totalContacts FROM contact_us");
                                                if (rscontact.next()) {
                                                    totalcontacts = rscontact.getInt("totalContacts");
                                                }

                                                conn.close();
                                            } catch (SQLException e) {
                                                e.printStackTrace();
                                            }
                                        %>

                                        <div class="col-md-6 col-xl report-inner-card">
                                            <div class="inner-card-text">
                                                <span class="report-title">Total Users</span>
                                                <h4><%= totalUsers %></h4>
                                                <a href="user-manage.jsp"><span class="report-count"> View Users</span></a>
                                            </div>
                                            <div class="inner-card-icon bg-primary">
                                                <i class="icon-people"></i>
                                            </div>
                                        </div>

                                        <div class="col-md-6 col-xl report-inner-card">
                                            <div class="inner-card-text">
                                                <span class="report-title">Total Volunteers</span>
                                                <h4><%= totalVolunteers %></h4>
                                                <a href="volunteer-manage.jsp"><span class="report-count"> View Volunteers</span></a>
                                            </div>
                                            <div class="inner-card-icon bg-info">
                                                <i class="icon-user"></i>
                                            </div>
                                        </div>

                                         <div class="col-md-6 col-xl report-inner-card">
                                            <div class="inner-card-text">
                                                <span class="report-title">Total Species</span>
                                                <h4><%= totalspecies %></h4>
                                                <a href="view-species.jsp"><span class="report-count"> View Species</span></a>
                                            </div>
                                            <div class="inner-card-icon bg-danger">
                                                <i class="icon-layers menu-icon"></i>
                                            </div>
                                        </div>
                                        
                                        
                                         <div class="col-md-6 col-xl report-inner-card">
                                            <div class="inner-card-text">
                                                <span class="report-title">Total Contacts</span>
                                                <h4><%= totalcontacts %></h4>
                                                <a href="contact-manage.jsp"><span class="report-count"> View Contacts</span></a>
                                            </div>
                                            <div class="inner-card-icon bg-success">
                                                <i class="icon-phone menu-icon"></i>
                                            </div>
                                        </div>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- content-wrapper ends -->
                <!-- partial:partials/_footer.html -->
                <jsp:include page="footer.jsp"/>
                <!-- partial -->
            </div>
            <!-- main-panel ends -->
        </div>
        <!-- page-body-wrapper ends -->
    </div>
    <!-- container-scroller -->
    <!-- plugins:js -->
    <script src="vendors/js/vendor.bundle.base.js"></script>
    <!-- endinject -->
    <!-- Plugin js for this page -->
    <script src="vendors/chart.js/Chart.min.js"></script>
    <script src="vendors/moment/moment.min.js"></script>
    <script src="vendors/daterangepicker/daterangepicker.js"></script>
    <script src="vendors/chartist/chartist.min.js"></script>
    <!-- End plugin js for this page -->
    <!-- inject:js -->
    <script src="js/off-canvas.js"></script>
    <script src="js/misc.js"></script>
    <!-- endinject -->
    <!-- Custom js for this page -->
    <script src="js/dashboard.js"></script>
    <!-- End custom js for this page -->
</body>

</html>
