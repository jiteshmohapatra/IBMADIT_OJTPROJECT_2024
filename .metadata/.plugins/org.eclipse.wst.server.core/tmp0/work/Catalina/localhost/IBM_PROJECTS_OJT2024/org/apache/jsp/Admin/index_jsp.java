/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.24
 * Generated at: 2024-10-03 11:44:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Admin;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

 
    // Retrieve the role from the session
    String role = (String) session.getAttribute("role");

    // If user is not logged in or has no access, redirect to login
    if (role == null) {
        response.sendRedirect("../login.jsp");
    } else if (!"admin".equals(role) && !"both".equals(role)) {
        
        response.sendRedirect("../index.jsp");
    }

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <title>WildHaven | Dashboard</title>\r\n");
      out.write("    <!-- plugins:css -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendors/simple-line-icons/css/simple-line-icons.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendors/flag-icon-css/css/flag-icon.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendors/css/vendor.bundle.base.css\">\r\n");
      out.write("    <!-- endinject -->\r\n");
      out.write("    <!-- Plugin css for this page -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendors/daterangepicker/daterangepicker.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendors/chartist/chartist.min.css\">\r\n");
      out.write("    <!-- End plugin css for this page -->\r\n");
      out.write("    <!-- inject:css -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("    <!-- End layout styles -->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container-scroller\">\r\n");
      out.write("        <!-- partial:partials/_navbar.html -->\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("        <!-- partial -->\r\n");
      out.write("        <div class=\"container-fluid page-body-wrapper\">\r\n");
      out.write("            <!-- partial:partials/_sidebar.html -->\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\r\n");
      out.write("            <!-- partial -->\r\n");
      out.write("            <div class=\"main-panel\">\r\n");
      out.write("                <div class=\"content-wrapper\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-12 grid-margin\">\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <div class=\"row\">\r\n");
      out.write("                                        <div class=\"col-md-12\">\r\n");
      out.write("                                            <div class=\"d-sm-flex align-items-baseline report-summary-header\">\r\n");
      out.write("                                                <h5 class=\"font-weight-semibold\">Report Summary</h5>\r\n");
      out.write("                                                <span class=\"ml-auto\">Updated Report</span>\r\n");
      out.write("                                                <button class=\"btn btn-icons border-0 p-2\"><i class=\"icon-refresh\"></i></button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"row report-inner-cards-wrapper\">\r\n");
      out.write("                                        ");

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
                                        
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"col-md-6 col-xl report-inner-card\">\r\n");
      out.write("                                            <div class=\"inner-card-text\">\r\n");
      out.write("                                                <span class=\"report-title\">Total Users</span>\r\n");
      out.write("                                                <h4>");
      out.print( totalUsers );
      out.write("</h4>\r\n");
      out.write("                                                <a href=\"user-manage.jsp\"><span class=\"report-count\"> View Users</span></a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"inner-card-icon bg-primary\">\r\n");
      out.write("                                                <i class=\"icon-people\"></i>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"col-md-6 col-xl report-inner-card\">\r\n");
      out.write("                                            <div class=\"inner-card-text\">\r\n");
      out.write("                                                <span class=\"report-title\">Total Volunteers</span>\r\n");
      out.write("                                                <h4>");
      out.print( totalVolunteers );
      out.write("</h4>\r\n");
      out.write("                                                <a href=\"volunteer-manage.jsp\"><span class=\"report-count\"> View Volunteers</span></a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"inner-card-icon bg-info\">\r\n");
      out.write("                                                <i class=\"icon-user\"></i>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                         <div class=\"col-md-6 col-xl report-inner-card\">\r\n");
      out.write("                                            <div class=\"inner-card-text\">\r\n");
      out.write("                                                <span class=\"report-title\">Total Species</span>\r\n");
      out.write("                                                <h4>");
      out.print( totalspecies );
      out.write("</h4>\r\n");
      out.write("                                                <a href=\"view-species.jsp\"><span class=\"report-count\"> View Species</span></a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"inner-card-icon bg-danger\">\r\n");
      out.write("                                                <i class=\"icon-layers menu-icon\"></i>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        \r\n");
      out.write("                                        \r\n");
      out.write("                                         <div class=\"col-md-6 col-xl report-inner-card\">\r\n");
      out.write("                                            <div class=\"inner-card-text\">\r\n");
      out.write("                                                <span class=\"report-title\">Total Contacts</span>\r\n");
      out.write("                                                <h4>");
      out.print( totalcontacts );
      out.write("</h4>\r\n");
      out.write("                                                <a href=\"contact-manage.jsp\"><span class=\"report-count\"> View Contacts</span></a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"inner-card-icon bg-success\">\r\n");
      out.write("                                                <i class=\"icon-phone menu-icon\"></i>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- content-wrapper ends -->\r\n");
      out.write("                <!-- partial:partials/_footer.html -->\r\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("                <!-- partial -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- main-panel ends -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- page-body-wrapper ends -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- container-scroller -->\r\n");
      out.write("    <!-- plugins:js -->\r\n");
      out.write("    <script src=\"vendors/js/vendor.bundle.base.js\"></script>\r\n");
      out.write("    <!-- endinject -->\r\n");
      out.write("    <!-- Plugin js for this page -->\r\n");
      out.write("    <script src=\"vendors/chart.js/Chart.min.js\"></script>\r\n");
      out.write("    <script src=\"vendors/moment/moment.min.js\"></script>\r\n");
      out.write("    <script src=\"vendors/daterangepicker/daterangepicker.js\"></script>\r\n");
      out.write("    <script src=\"vendors/chartist/chartist.min.js\"></script>\r\n");
      out.write("    <!-- End plugin js for this page -->\r\n");
      out.write("    <!-- inject:js -->\r\n");
      out.write("    <script src=\"js/off-canvas.js\"></script>\r\n");
      out.write("    <script src=\"js/misc.js\"></script>\r\n");
      out.write("    <!-- endinject -->\r\n");
      out.write("    <!-- Custom js for this page -->\r\n");
      out.write("    <script src=\"js/dashboard.js\"></script>\r\n");
      out.write("    <!-- End custom js for this page -->\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
