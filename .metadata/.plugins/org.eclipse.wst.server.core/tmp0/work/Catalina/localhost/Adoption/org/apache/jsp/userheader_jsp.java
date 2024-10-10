/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.24
 * Generated at: 2024-09-25 10:40:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class userheader_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\" />\r\n");
      out.write("  <title>WildHaven | Wildlife Conservation & Protection System</title>\r\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\" />\r\n");
      out.write("  <meta content=\"\" name=\"keywords\" />\r\n");
      out.write("  <meta content=\"\" name=\"description\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled and minified CSS -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery library -->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled JavaScript -->\r\n");
      out.write("\r\n");
      out.write("  <!-- Favicon -->\r\n");
      out.write("  <link href=\"img/favicon.ico\" rel=\"icon\" />\r\n");
      out.write("\r\n");
      out.write("  <!-- Google Web Fonts -->\r\n");
      out.write("  <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\" />\r\n");
      out.write("  <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\"  />\r\n");
      out.write("  <link\r\n");
      out.write("    href=\"https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;500&family=Quicksand:wght@600;700&display=swap\"\r\n");
      out.write("    rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("  <!-- Icon Font Stylesheet -->\r\n");
      out.write("  <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("  <!-- Libraries Stylesheet -->\r\n");
      out.write("  <link href=\"lib/animate/animate.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("  <link href=\"lib/lightbox/css/lightbox.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("  <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("  <!-- Customized Bootstrap Stylesheet -->\r\n");
      out.write("  <link href=\"css1/bootstrap.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("  <!-- Template Stylesheet -->\r\n");
      out.write("  <link href=\"css1/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <!-- Spinner Start -->\r\n");
      out.write("  <div id=\"spinner\"\r\n");
      out.write("    class=\"show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center\">\r\n");
      out.write("    <div class=\"spinner-border text-primary\" style=\"width: 3rem; height: 3rem\" role=\"status\">\r\n");
      out.write("      <span class=\"sr-only\"></span>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- Spinner End -->\r\n");
      out.write("\r\n");
      out.write("<!-- Topbar Start -->\r\n");
      out.write("<div class=\"container-fluid bg-light p-0 wow fadeIn\" data-wow-delay=\"0.1s\">\r\n");
      out.write("    <div class=\"row gx-0 d-none d-lg-flex align-items-center\">\r\n");
      out.write("        <!-- Left side: Google Translate -->\r\n");
      out.write("        <div class=\"col-lg-7 px-5 text-start\">\r\n");
      out.write("            <div class=\"h-100 d-inline-flex align-items-center py-3\">\r\n");
      out.write("                <div id=\"google_translate_element\"></div>\r\n");
      out.write("                \r\n");
      out.write("                <script type=\"text/javascript\">\r\n");
      out.write("                function googleTranslateElementInit() {\r\n");
      out.write("                    new google.translate.TranslateElement({pageLanguage: 'en'}, 'google_translate_element');\r\n");
      out.write("                }\r\n");
      out.write("                </script>\r\n");
      out.write("\r\n");
      out.write("                <script type=\"text/javascript\" src=\"//translate.google.com/translate_a/element.js?cb=googleTranslateElementInit\"></script>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Right side: User Info and Social Media Links -->\r\n");
      out.write("        <div class=\"col-lg-5 px-5 text-end\">\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            <div class=\"h-100 d-inline-flex align-items-center\">\r\n");
      out.write("                <a class=\"btn btn-sm-square bg-white text-primary me-1\" href=\"https://www.facebook.com/profile.php?id=61566268673655&mibextid=ZbWKwL\"><i class=\"fab fa-facebook-f\"></i></a>\r\n");
      out.write("                <a class=\"btn btn-sm-square bg-white text-primary me-1\" href=\"https://x.com/wildhaven_bbsr\"><i class=\"fab fa-twitter\"></i></a>\r\n");
      out.write("                <a class=\"btn btn-sm-square bg-white text-primary me-1\" href=\"https://www.linkedin.com/in/wild-haven/\"><i class=\"fab fa-linkedin-in\"></i></a>\r\n");
      out.write("                <a class=\"btn btn-sm-square bg-white text-primary\" href=\"https://www.instagram.com/wildhaven_bbsr?igsh=c2RldjVpZ3U0eXFw\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<!-- Add the following script at the bottom of the page to initialize the tooltip -->\r\n");
      out.write("<script>\r\n");
      out.write("    // Initialize Bootstrap tooltips\r\n");
      out.write("    var tooltipTriggerList = [].slice.call(document.querySelectorAll('[data-bs-toggle=\"tooltip\"]'))\r\n");
      out.write("    var tooltipList = tooltipTriggerList.map(function (tooltipTriggerEl) {\r\n");
      out.write("        return new bootstrap.Tooltip(tooltipTriggerEl)\r\n");
      out.write("    })\r\n");
      out.write("</script>\r\n");
      out.write(" \r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("  <!-- Navbar Start -->\r\n");
      out.write("  \r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg bg-white navbar-light sticky-top py-lg-0 px-4 px-lg-5 wow fadeIn\"\r\n");
      out.write("    data-wow-delay=\"0.1s\">\r\n");
      out.write("    <a href=\"index.html\" class=\"navbar-brand p-0\">\r\n");
      out.write("      <img class=\"img-fluid me-3\" src=\"img/icon/icon-10.png\" alt=\"Icon\" />\r\n");
      out.write("      <h1 class=\"m-0 text-primary\">WildHaven</h1>\r\n");
      out.write("    </a>\r\n");
      out.write("    <button type=\"button\" class=\"navbar-toggler\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\">\r\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("     \r\n");
      out.write("\r\n");
      out.write("    <div class=\"collapse navbar-collapse py-4 py-lg-0\" id=\"navbarCollapse\">\r\n");
      out.write("      <div class=\"navbar-nav ms-auto\">\r\n");
      out.write("        <form action=\"https://www.google.com/search\" method=\"GET\" class=\"hm-searchbox\">\r\n");
      out.write("          <input type=\"search\" id=\"search\" name=\"q\" placeholder=\"Search Google or type URL\" />\r\n");
      out.write("          <button className=\"icon\" type=\"submit\"><i className=\"small material-icons\">search</i></button>\r\n");
      out.write("        </form>\r\n");
      out.write("        <div class=\"nav-item nav-link\">\r\n");
      out.write("          \r\n");
      out.write("      \r\n");
      out.write("        </div>\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("        <a href=\"/IBM_PROJECTS_OJT2024/index.jsp\" class=\"nav-item nav-link active\">Home</a>\r\n");
      out.write("        <a href=\"/IBM_PROJECTS_OJT2024/about.jsp\" class=\"nav-item nav-link\">About</a>\r\n");
      out.write("  \r\n");
      out.write("        <div class=\"nav-item dropdown\">\r\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">Services</a>\r\n");
      out.write("          <div class=\"dropdown-menu rounded-0 rounded-bottom m-0\">\r\n");
      out.write("            <a href=\"/CrudOperation\" class=\"dropdown-item\">Species Management</a>\r\n");
      out.write("            <a href=\"conservation.jsp\" class=\"dropdown-item\">Conservation Areas</a>\r\n");
      out.write("               <a href=\"/IBM_PROJECTS_OJT2024/report.jsp\" class=\"dropdown-item\">Wildlife Reports</a>\r\n");
      out.write("            <a href=\"/IBM_PROJECTS_OJT2024/volunteer.jsp\" class=\"dropdown-item\">Volunteer</a>\r\n");
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"nav-item dropdown\">\r\n");
      out.write("          <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">Media</a>\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"dropdown-menu rounded-0 rounded-bottom m-0\">\r\n");
      out.write("            <a href=\"/IBM_PROJECTS_OJT2024/Wildlife/index.html\" class=\"dropdown-item\">Blogs</a>\r\n");
      out.write("            <a href=\"/IBM_PROJECTS_OJT2024/Event/index.html\" class=\"dropdown-item\">Events</a>\r\n");
      out.write("          \r\n");
      out.write("            <a href=\"/IBM_PROJECTS_OJT2024/wildlife gallery/index.html\" class=\"dropdown-item\">Photo Gallery</a>\r\n");
      out.write("            <a href=\"/IBM_PROJECTS_OJT2024/Wildlife video/index.html\" class=\"dropdown-item\">Video Gallery</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- <a href=\"#\" class=\"nav-item nav-link\"><i class=\"fa fa-search ms-3\" id=\"search-icon\"></i></a> -->\r\n");
      out.write("\r\n");
      out.write("          \r\n");
      out.write("           \r\n");
      out.write("      </div>\r\n");
      out.write("      ");

      String userName = (String) session.getAttribute("name");
      if (userName != null && !userName.isEmpty()) {
    
      out.write("\r\n");
      out.write("      <div class=\"nav-item dropdown username\">\r\n");
      out.write("        <a href=\"#\" class=\"nav-link dropdown-toggle \" data-bs-toggle=\"dropdown\">\r\n");
      out.write("         <span class=\"text-success\">");
      out.print( userName );
      out.write("</span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <div class=\"dropdown-menu rounded-0 rounded-bottom m-0\">\r\n");
      out.write("         \r\n");
      out.write("          <a href=\"logout\" class=\"dropdown-item\">Logout</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    ");

      } else {
    
      out.write("\r\n");
      out.write("      <!-- Show the \"Join\" button if the user is not logged in -->\r\n");
      out.write("      <a href=\"registration.jsp\" class=\"btn btn-primary ms-3\">Join<i class=\"fa fa-arrow-right ms-3\"></i></a>\r\n");
      out.write("    ");

      }
    
      out.write("\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write(" \r\n");
      out.write("  </nav>\r\n");
      out.write("  <!-- Navbar End -->\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("  </html>");
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
