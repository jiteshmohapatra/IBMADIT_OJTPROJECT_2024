<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, jakarta.servlet.http.*, jakarta.servlet.ServletException, jakarta.servlet.annotation.WebServlet, java.io.IOException"%>

<%
    // Database connection parameters
    String url = "jdbc:mysql://localhost:3306/wildlifeconservationdb?useSSL=false";
    String user = "root";
    String password = "Mohapatra@123";

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, password);

        // Handle deletion of contact message (if needed)
        if (request.getParameter("deleteId") != null) {
            int deleteId = Integer.parseInt(request.getParameter("deleteId"));
            String sqlDelete = "DELETE FROM contact_us WHERE id=?";
            pst = conn.prepareStatement(sqlDelete);
            pst.setInt(1, deleteId);
            pst.executeUpdate();
            out.println("<script>alert('Contact message deleted successfully');</script>");
        }

        // Fetch contact message data from the database
        String sqlSelect = "SELECT * FROM contact_us";
        pst = conn.prepareStatement(sqlSelect);
        rs = pst.executeQuery();
    } catch (Exception e) {
        e.printStackTrace();
    }
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>WildHaven | Manage Contacts</title>
    <link rel="stylesheet" href="vendors/simple-line-icons/css/simple-line-icons.css">
    <link rel="stylesheet" href="vendors/flag-icon-css/css/flag-icon.min.css">
    <link rel="stylesheet" href="vendors/css/vendor.bundle.base.css">
    <link rel="stylesheet" href="vendors/daterangepicker/daterangepicker.css">
    <link rel="stylesheet" href="vendors/chartist/chartist.min.css">
    <link rel="stylesheet" href="./css/style.css">
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
                    <div class="page-header">
                        <h3 class="page-title">Manage Contact Messages</h3>
                        <nav aria-label="breadcrumb">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><a href="index.jsp">Dashboard</a></li>
                                <li class="breadcrumb-item active" aria-current="page">Manage Contact Messages</li>
                            </ol>
                        </nav>
                    </div>

                    <div class="row">
                        <div class="col-md-12 grid-margin stretch-card">
                            <div class="card">
                                <div class="card-body">
                                    <div class="d-sm-flex align-items-center mb-4">
                                        <h4 class="card-title mb-sm-0">Contact Messages</h4>
                                    </div>

                                    <!-- Display Contact Messages Table -->
                                    <div class="table-responsive border rounded p-1">
                                        <table class="table">
                                            <thead>
                                                <tr>
                                                    <th class="font-weight-bold">S.No</th>
                                                    <th class="font-weight-bold">Name</th>
                                                    <th class="font-weight-bold">Email</th>
                                                    <th class="font-weight-bold">Subject</th>
                                                    <th class="font-weight-bold">Message</th>
                                                    <th class="font-weight-bold">Date</th>
                                                    <th class="font-weight-bold">Action</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <%
                                                    int count = 1;
                                                    while (rs.next()) {
                                                %>
                                                <tr>
                                                    <td><%= count++ %></td>
                                                    <td><%= rs.getString("name") %></td>
                                                    <td><%= rs.getString("email") %></td>
                                                    <td><%= rs.getString("subject") %></td>
                                                    <td><%= rs.getString("message") %></td>
                                                    <td><%= rs.getDate("contacted_date") %></td>
                                                    <td>
                                                        <!-- Option to delete message -->
                                                        <a href="contact-manage.jsp?deleteId=<%= rs.getInt("id") %>" onclick="return confirm('Are you sure you want to delete this contact message?');">
                                                            <i class="icon-trash"></i> Delete
                                                        </a>
                                                    </td>
                                                </tr>
                                                <%
                                                    }
                                                %>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- content-wrapper ends -->

                <!-- partial:partials/_footer.html -->
                <jsp:include page="footer.jsp" />
                <!-- partial -->
            </div>
            <!-- main-panel ends -->
        </div>
        <!-- page-body-wrapper ends -->
    </div>
    <!-- container-scroller -->
    
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

<%
    // Close the database connection
    if (pst != null) pst.close();
    if (conn != null) conn.close();
%>
