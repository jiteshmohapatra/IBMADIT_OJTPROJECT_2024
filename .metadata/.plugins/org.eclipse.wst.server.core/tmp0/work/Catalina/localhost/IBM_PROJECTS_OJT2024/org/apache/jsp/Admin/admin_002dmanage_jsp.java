/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.24
 * Generated at: 2024-10-01 09:51:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Admin;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.sql.*;
import jakarta.servlet.http.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;

public final class admin_002dmanage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(3);
    _jspx_imports_classes.add("java.io.IOException");
    _jspx_imports_classes.add("jakarta.servlet.ServletException");
    _jspx_imports_classes.add("jakarta.servlet.annotation.WebServlet");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

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

        // Handle deletion
        if (request.getParameter("deleteId") != null) {
            int deleteId = Integer.parseInt(request.getParameter("deleteId"));
            String sqlDelete = "DELETE FROM admin WHERE id=?";
            pst = conn.prepareStatement(sqlDelete);
            pst.setInt(1, deleteId);
            pst.executeUpdate();
            out.println("<script>alert('Admin deleted successfully');</script>");
        }

        // Fetch user data from the database
        String sqlSelect = "SELECT * FROM admin";
        pst = conn.prepareStatement(sqlSelect);
        rs = pst.executeQuery();
    } catch (Exception e) {
        e.printStackTrace();
    }

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <title>WildHaven | Manage Users</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendors/simple-line-icons/css/simple-line-icons.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendors/flag-icon-css/css/flag-icon.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendors/css/vendor.bundle.base.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendors/daterangepicker/daterangepicker.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendors/chartist/chartist.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/style.css\">\r\n");
      out.write("</head>\r\n");
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
      out.write("                    <div class=\"page-header\">\r\n");
      out.write("                        <h3 class=\"page-title\">Manage Admin</h3>\r\n");
      out.write("                        <nav aria-label=\"breadcrumb\">\r\n");
      out.write("                            <ol class=\"breadcrumb\">\r\n");
      out.write("                                <li class=\"breadcrumb-item\"><a href=\"index.jsp\">Dashboard</a></li>\r\n");
      out.write("                                <li class=\"breadcrumb-item active\" aria-current=\"page\">Manage Admin</li>\r\n");
      out.write("                            </ol>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-12 grid-margin stretch-card\">\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <div class=\"d-sm-flex align-items-center mb-4\">\r\n");
      out.write("                                        <h4 class=\"card-title mb-sm-0\">All Admins</h4>\r\n");
      out.write("                                        <!-- <a href=\"#\" class=\"text-dark ml-auto mb-3 mb-sm-0\">View all Users</a> -->\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <!-- Display User Table -->\r\n");
      out.write("                                    <div class=\"table-responsive border rounded p-1\">\r\n");
      out.write("                                        <table class=\"table\">\r\n");
      out.write("                                            <thead>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <th class=\"font-weight-bold\">S.No</th>\r\n");
      out.write("                                                    <th class=\"font-weight-bold\">Username</th>\r\n");
      out.write("                                                    <th class=\"font-weight-bold\">Email</th>\r\n");
      out.write("                                                      <th class=\"font-weight-bold\">Role</th>\r\n");
      out.write("                                                        <th class=\"font-weight-bold\">Action</th>\r\n");
      out.write("                                                    \r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                            </thead>\r\n");
      out.write("                                            <tbody>\r\n");
      out.write("                                                ");

                                                    int count = 1;
                                                    while (rs.next()) {
                                                
      out.write("\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <td>");
      out.print( count++ );
      out.write("</td>\r\n");
      out.write("                                                    <td>");
      out.print( rs.getString("name") );
      out.write("</td>\r\n");
      out.write("                                                    <td>");
      out.print( rs.getString("email") );
      out.write("</td>\r\n");
      out.write("                                                    <td>");
      out.print( rs.getString("role") );
      out.write("</td>\r\n");
      out.write("                                                    \r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                 \r\n");
      out.write("                                                        <!-- Delete Button with the same page handling deletion -->\r\n");
      out.write("                                                        <a href=\"admin-manage.jsp?deleteId=");
      out.print( rs.getInt("id") );
      out.write("\" onclick=\"return confirm('Are you sure you want to delete this user?');\">\r\n");
      out.write("                                                            <i class=\"icon-trash\"></i> Delete\r\n");
      out.write("                                                        </a>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                ");

                                                    }
                                                
      out.write("\r\n");
      out.write("                                            </tbody>\r\n");
      out.write("                                        </table>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- content-wrapper ends -->\r\n");
      out.write("\r\n");
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
      out.write("    \r\n");
      out.write("    <!-- plugins:js -->\r\n");
      out.write("    <script src=\"vendors/js/vendor.bundle.base.js\"></script>\r\n");
      out.write("    <script src=\"./vendors/chart.js/Chart.min.js\"></script>\r\n");
      out.write("    <script src=\"./vendors/moment/moment.min.js\"></script>\r\n");
      out.write("    <script src=\"./vendors/daterangepicker/daterangepicker.js\"></script>\r\n");
      out.write("    <script src=\"./vendors/chartist/chartist.min.js\"></script>\r\n");
      out.write("    <script src=\"js/off-canvas.js\"></script>\r\n");
      out.write("    <script src=\"js/misc.js\"></script>\r\n");
      out.write("    <script src=\"./js/dashboard.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");

    // Close the database connection
    if (pst != null) pst.close();
    if (conn != null) conn.close();

      out.write('\r');
      out.write('\n');
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
