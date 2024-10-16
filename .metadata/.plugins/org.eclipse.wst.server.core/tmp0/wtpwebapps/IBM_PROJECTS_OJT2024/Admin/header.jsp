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

<nav class="navbar default-layout-navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row">
    <div class="navbar-brand-wrapper d-flex align-items-center">
        <a class="navbar-brand brand-logo" href="dashboard.jsp">
            <strong style="color: white;">WildHaven</strong>
        </a>
        <a class="navbar-brand brand-logo-mini" href="dashboard.jsp"><img src="images/logo-mini.svg" alt="logo" /></a>
    </div>

    <div class="navbar-menu-wrapper d-flex align-items-center flex-grow-1">
        <h5 class="mb-0 font-weight-medium d-none d-lg-flex text-capitalize">
            <%
                String adminName = (String) session.getAttribute("adminName");
            %>
            <%= adminName != null ? adminName : "" %> 
            Welcome to the dashboard!
        </h5>
        <ul class="navbar-nav navbar-nav-right ml-auto">
            <li class="nav-item dropdown d-none d-xl-inline-flex user-dropdown">
                <a class="nav-link dropdown-toggle" id="UserDropdown" href="#" data-toggle="dropdown" aria-expanded="false">
                    <img class="img-xs rounded-circle ml-2" src="images/faces/face8.jpg" alt="Profile image"> 
                    <span class="font-weight-normal text-capitalize">
                        <%= adminName != null ? adminName : "" %>
                    </span>
                </a>
                <div class="dropdown-menu dropdown-menu-right navbar-dropdown" aria-labelledby="UserDropdown">
                    <div class="dropdown-header text-center">
                        <img class="img-md rounded-circle" src="images/faces/face8.jpg" alt="Profile image">
                        <p class="mb-1 mt-3 text-capitalize">
                            <%= adminName != null ? adminName : "" %>
                        </p>
                        <%
                            String adminEmail = (String) session.getAttribute("adminEmail");
                        %>
                        <p class="font-weight-light text-muted mb-0">
                            <%= adminEmail != null ? adminEmail : "" %>
                        </p>
                    </div>
                    <a class="dropdown-item" href="#"><i class="dropdown-item-icon icon-user text-primary"></i> My Profile</a>
                    
                    <a class="dropdown-item" href="/IBM_PROJECTS_OJT2024/LogoutServlet"><i class="dropdown-item-icon icon-user text-primary"></i>Logout</a>
                   
                    
                </div>
            </li>
        </ul>
        <button class="navbar-toggler navbar-toggler-right d-lg-none align-self-center" type="button" data-toggle="offcanvas">
            <span class="icon-menu"></span>
        </button>
    </div>
</nav>
