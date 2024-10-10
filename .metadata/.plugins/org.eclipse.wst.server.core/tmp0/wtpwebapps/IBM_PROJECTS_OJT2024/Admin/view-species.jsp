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


        // Fetch volunteer data from the database
        String sqlSelect = "SELECT * FROM species_data";
        pst = conn.prepareStatement(sqlSelect);
        rs = pst.executeQuery();
    } catch (Exception e) {
        e.printStackTrace();
    }
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>WildHaven | View Species</title>
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
                        <h3 class="page-title">Manage Species</h3>
                        <nav aria-label="breadcrumb">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><a href="index.jsp">Dashboard</a></li>
                                <li class="breadcrumb-item active" aria-current="page">Manage Species</li>
                            </ol>
                        </nav>
                    </div>

                    <div class="row">
                        <div class="col-md-12 grid-margin stretch-card">
                            <div class="card">
                                <div class="card-body">
                                    <div class="d-sm-flex align-items-center mb-4">
                                        <h4 class="card-title mb-sm-0">All Species</h4>
                                    </div>

                                   <!-- Display Species Table -->
<div class="table-responsive border rounded p-1">
    <table class="table">
        <thead>
            <tr>
                <th class="font-weight-bold">S.No</th>
                <th class="font-weight-bold">Common Name</th>
                <th class="font-weight-bold">Scientific Name</th>
                <th class="font-weight-bold">Conservation Status</th>
                <th class="font-weight-bold">Habitat</th>
                <th class="font-weight-bold">Population Count</th>
                <th class="font-weight-bold">Region Found</th>
                <th class="font-weight-bold">Threats</th>
                <th class="font-weight-bold">Description</th>
                <th class="font-weight-bold">Image</th>
                <th class="font-weight-bold">Date Added</th>
                <th class="font-weight-bold">Actions</th>
            </tr>
        </thead>
        <tbody>
            <%
                int count = 1;
                while (rs.next()) {
            %>
            <tr>
                <td><%= count++ %></td>
                <td><%= rs.getString("CommonName") %></td>
                <td><%= rs.getString("ScientificName") %></td>
                <td><%= rs.getString("ConservationStatus") %></td>
                <td><%= rs.getString("Habitat") %></td>
                <td><%= rs.getInt("PopulationCount") %></td>
                <td><%= rs.getString("RegionFound") %></td>
                <td><%= rs.getString("Threats") %></td>
                <td><%= rs.getString("Description") %></td>
                <td><img src="<%= rs.getString("Image") %>" alt="Image" style="width: 100px; height: auto;"></td>
                <td><%= rs.getTimestamp("DateAdded") %></td>
              
            </tr>
            <%
                }
            %>
        </tbody>
    </table>
</div>

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
    if (rs != null) rs.close();
    if (pst != null) pst.close();
    if (conn != null) conn.close();
%>
