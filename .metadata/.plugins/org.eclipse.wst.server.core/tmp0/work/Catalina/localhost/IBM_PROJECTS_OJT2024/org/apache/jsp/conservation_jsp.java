/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.24
 * Generated at: 2024-09-21 15:33:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class conservation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "userheader.jsp", out, false);
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Conservation Areas India</title>\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("     <!-- Font Awesome CDN -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css\">\r\n");
      out.write("    <!-- jQuery library -->\r\n");
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
      out.write("    <style>\r\n");
      out.write("        /* Custom CSS */\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\r\n");
      out.write("            background-color: #f4f4f9;\r\n");
      out.write("            color: #333;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .custom-hero {\r\n");
      out.write("            position: relative;\r\n");
      out.write("            height: 730px; \r\n");
      out.write("            background-color: #000;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("            overflow: hidden;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .custom-video {\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            top: 0;\r\n");
      out.write("            left: 0;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            object-fit: fill;\r\n");
      out.write("            z-index: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .custom-overlay {\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            top: 0;\r\n");
      out.write("            left: 0;\r\n");
      out.write("            right: 0;\r\n");
      out.write("            bottom: 0;\r\n");
      out.write("            z-index: 1;\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .custom-wrap{\r\n");
      out.write("            background: rgba(103, 98, 98, 0.2);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .custom-heading,\r\n");
      out.write("        .custom-subtext {\r\n");
      out.write("            position: relative;\r\n");
      out.write("            z-index: 2;\r\n");
      out.write("            color:orange;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            animation: fadeInUp 1s ease-in-out;\r\n");
      out.write("            will-change: transform;\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .custom-heading {\r\n");
      out.write("            font-size: 3rem;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            animation: bounceIn 3s ease-in-out;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .custom-subtext {\r\n");
      out.write("            font-size: 1.5rem;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("            animation: fadeIn 2s ease-in-out;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        @keyframes fadeInUp {\r\n");
      out.write("            0% {\r\n");
      out.write("                opacity: 0;\r\n");
      out.write("                transform: translateY(20px);\r\n");
      out.write("            }\r\n");
      out.write("            100% {\r\n");
      out.write("                opacity: 1;\r\n");
      out.write("                transform: translateY(0);\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        @keyframes bounceIn {\r\n");
      out.write("            0%, 20%, 40%, 60%, 80%, 100% {\r\n");
      out.write("                -webkit-animation-timing-function: ease-in-out;\r\n");
      out.write("                animation-timing-function: ease-in-out;\r\n");
      out.write("            }\r\n");
      out.write("            0% {\r\n");
      out.write("                opacity: 0;\r\n");
      out.write("                transform: scale3d(.3, .3, .3);\r\n");
      out.write("            }\r\n");
      out.write("            20% {\r\n");
      out.write("                transform: scale3d(1.1, 1.1, 1.1);\r\n");
      out.write("            }\r\n");
      out.write("            40% {\r\n");
      out.write("                transform: scale3d(.9, .9, .9);\r\n");
      out.write("            }\r\n");
      out.write("            60% {\r\n");
      out.write("                opacity: 1;\r\n");
      out.write("                transform: scale3d(1.03, 1.03, 1.03);\r\n");
      out.write("            }\r\n");
      out.write("            80% {\r\n");
      out.write("                transform: scale3d(.97, .97, .97);\r\n");
      out.write("            }\r\n");
      out.write("            100% {\r\n");
      out.write("                opacity: 1;\r\n");
      out.write("                transform: scale3d(1, 1, 1);\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .banner-quote {\r\n");
      out.write("            padding: 30px; /* Increased padding for a bigger banner */\r\n");
      out.write("            background-color: #004d40;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            font-size: 2rem;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("            position: relative;\r\n");
      out.write("            overflow: hidden;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .banner-quote:hover {\r\n");
      out.write("            background-color: #00796b;\r\n");
      out.write("            transition: background-color 0.5s ease;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .banner-quote:after {\r\n");
      out.write("            content: '';\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            top: 0;\r\n");
      out.write("            left: -100%;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            background: rgba(255, 255, 255, 0.2);\r\n");
      out.write("            transform: skewX(-20deg);\r\n");
      out.write("            transition: left 0.5s ease;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .banner-quote:hover:after {\r\n");
      out.write("            left: 100%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .media-entry-custom {\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            overflow: hidden;\r\n");
      out.write("            transition: transform 0.3s, box-shadow 0.3s;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            flex-direction: column;\r\n");
      out.write("            background: #fff;\r\n");
      out.write("            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.1);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .media-entry-custom:hover {\r\n");
      out.write("            transform: translateY(-5px);\r\n");
      out.write("            box-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .media-image img {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 300px;\r\n");
      out.write("            object-fit: cover;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .media-body-custom {\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            flex-grow: 1;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .media-body-custom h3 {\r\n");
      out.write("            font-size: 1.5rem;\r\n");
      out.write("            margin-top: 10px;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            color: #27ae60;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .media-body-custom p {\r\n");
      out.write("            font-size: 1rem;\r\n");
      out.write("            color: #777;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .read-more-link {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            color: #27ae60;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            transition: color 0.3s;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .read-more-link:hover {\r\n");
      out.write("            color: #2ecc71;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .read-more-icon {\r\n");
      out.write("            margin-left: 5px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .banner {\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            transition: transform 0.3s ease-in-out;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .banner:hover {\r\n");
      out.write("            transform: scale(1.05);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn-custom {\r\n");
      out.write("            background-color: #27ae60;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            border-radius: 50px;\r\n");
      out.write("            padding: 10px 20px;\r\n");
      out.write("            transition: background-color 0.3s;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn-custom:hover {\r\n");
      out.write("            background-color: #2ecc71;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #parksTable th {\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            background-color: #27ae60;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #parksTable th:hover {\r\n");
      out.write("            background-color: #2ecc71;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #searchInput {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            margin-bottom: 15px;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            border-radius: 50px;\r\n");
      out.write("            border: 1px solid #27ae60;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        @media (max-width: 768px) {\r\n");
      out.write("            .custom-heading {\r\n");
      out.write("                font-size: 3rem;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .custom-subtext {\r\n");
      out.write("                font-size: 1.2rem;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- Hero Section -->\r\n");
      out.write("    <div class=\"custom-hero\">\r\n");
      out.write("        <video autoplay loop muted class=\"custom-video\">\r\n");
      out.write("            <source src=\"img/animal.mp4\" type=\"video/mp4\">\r\n");
      out.write("            Your browser does not support the video tag.\r\n");
      out.write("        </video>\r\n");
      out.write("        <!-- <div class=\"custom-overlay\"></div> -->\r\n");
      out.write("        <div class=\" custom-wrap text-center\">\r\n");
      out.write("            <h1 class=\"custom-heading\" data-aos=\"zoom-in\">Conservation Areas India</h1>\r\n");
      out.write("            <p class=\"custom-subtext\" data-aos=\"fade-up\">Explore the major conservation areas of India.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Banner with Quote -->\r\n");
      out.write("    <div class=\"banner-quote\" data-aos=\"flip-left\">\r\n");
      out.write("        \"Conserving India's Biodiversity.\"\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Banners and Cards Section -->\r\n");
      out.write("    <section class=\"container my-5\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-6 mb-4\">\r\n");
      out.write("                <div class=\"banner card text-white bg-success\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <h5 class=\"card-title\">India's Iconic Conservation Areas</h5>\r\n");
      out.write("                        <p class=\"card-text\">Discover some of India's most renowned parks, sanctuaries, and reserves. These protected areas are crucial for preserving our country's diverse ecosystems, each harboring unique species and natural beauty.</p>\r\n");
      out.write("                        <a href=\"#\" class=\"btn btn-light btn-custom\">Learn More</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-6 mb-4\">\r\n");
      out.write("                <div class=\"banner card text-white bg-primary\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <h5 class=\"card-title\">Top National Parks in India</h5>\r\n");
      out.write("                        <p class=\"card-text\">Journey through India's famous wildlife sanctuaries, home to endangered species and vibrant biodiversity. These parks are essential for conservation and offer a glimpse into the wild heart of India.</p>\r\n");
      out.write("                        <a href=\"Wildlife/index.html\" class=\"btn btn-light btn-custom\">Explore</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <!-- Interactive Table Section -->\r\n");
      out.write("    <section class=\"container my-5\">\r\n");
      out.write("        <h2 class=\"mb-4\">Conservation Areas of India</h2>\r\n");
      out.write("        <input class=\"form-control mb-3\" id=\"searchInput\" type=\"text\" placeholder=\"Search for parks or animals...\">\r\n");
      out.write("        <table class=\"table table-hover table-responsive\" id=\"parksTable\">\r\n");
      out.write("            <thead class=\"table-dark\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th onclick=\"sortTable(0)\">Name</th>\r\n");
      out.write("                    <th onclick=\"sortTable(1)\">Type</th>\r\n");
      out.write("                    <th onclick=\"sortTable(2)\">Area (sq km)</th>\r\n");
      out.write("                    <th onclick=\"sortTable(3)\">Established</th>\r\n");
      out.write("                    <th onclick=\"sortTable(4)\">Endangered Animals</th>\r\n");
      out.write("                    <th onclick=\"sortTable(5)\">Famous Animals</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Jim Corbett National Park</td>\r\n");
      out.write("                    <td>National Park</td>\r\n");
      out.write("                    <td>520</td>\r\n");
      out.write("                    <td>1936</td>\r\n");
      out.write("                    <td>Bengal Tiger</td>\r\n");
      out.write("                    <td>Leopard, Elephant</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Kaziranga National Park</td>\r\n");
      out.write("                    <td>National Park</td>\r\n");
      out.write("                    <td>1,070</td>\r\n");
      out.write("                    <td>1974</td>\r\n");
      out.write("                    <td>One-horned Rhinoceros</td>\r\n");
      out.write("                    <td>Elephant, Wild Buffalo</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Sundarbans National Park</td>\r\n");
      out.write("                    <td>National Park</td>\r\n");
      out.write("                    <td>1,330</td>\r\n");
      out.write("                    <td>1984</td>\r\n");
      out.write("                    <td>Bengal Tiger</td>\r\n");
      out.write("                    <td>Crocodile, Fishing Cat</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Ranthambore National Park</td>\r\n");
      out.write("                    <td>National Park</td>\r\n");
      out.write("                    <td>1,334</td>\r\n");
      out.write("                    <td>1955</td>\r\n");
      out.write("                    <td>Bengal Tiger</td>\r\n");
      out.write("                    <td>Leopard, Nilgai</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Gir National Park</td>\r\n");
      out.write("                    <td>National Park</td>\r\n");
      out.write("                    <td>1,412</td>\r\n");
      out.write("                    <td>1965</td>\r\n");
      out.write("                    <td>Asiatic Lion</td>\r\n");
      out.write("                    <td>Leopard, Sambar Deer</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Bandhavgarh National Park</td>\r\n");
      out.write("                    <td>National Park</td>\r\n");
      out.write("                    <td>448</td>\r\n");
      out.write("                    <td>1968</td>\r\n");
      out.write("                    <td>Bengal Tiger</td>\r\n");
      out.write("                    <td>Leopard, Deer</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Pench National Park</td>\r\n");
      out.write("                    <td>National Park</td>\r\n");
      out.write("                    <td>758</td>\r\n");
      out.write("                    <td>1977</td>\r\n");
      out.write("                    <td>Bengal Tiger</td>\r\n");
      out.write("                    <td>Leopard, Wild Dog</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Periyar National Park</td>\r\n");
      out.write("                    <td>National Park</td>\r\n");
      out.write("                    <td>925</td>\r\n");
      out.write("                    <td>1982</td>\r\n");
      out.write("                    <td>Elephant</td>\r\n");
      out.write("                    <td>Tiger, Nilgiri Tahr</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Hemis National Park</td>\r\n");
      out.write("                    <td>National Park</td>\r\n");
      out.write("                    <td>4,400</td>\r\n");
      out.write("                    <td>1981</td>\r\n");
      out.write("                    <td>Snow Leopard</td>\r\n");
      out.write("                    <td>Tibetan Wolf, Eurasian Brown Bear</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Nanda Devi National Park</td>\r\n");
      out.write("                    <td>National Park</td>\r\n");
      out.write("                    <td>630</td>\r\n");
      out.write("                    <td>1982</td>\r\n");
      out.write("                    <td>Snow Leopard</td>\r\n");
      out.write("                    <td>Himalayan Black Bear, Blue Sheep</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Bharatpur Bird Sanctuary (Keoladeo National Park)</td>\r\n");
      out.write("                    <td>Sanctuary</td>\r\n");
      out.write("                    <td>29</td>\r\n");
      out.write("                    <td>1971</td>\r\n");
      out.write("                    <td>Siberian Crane (Migratory)</td>\r\n");
      out.write("                    <td>Painted Stork, Pelican</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Periyar Wildlife Sanctuary</td>\r\n");
      out.write("                    <td>Sanctuary</td>\r\n");
      out.write("                    <td>925</td>\r\n");
      out.write("                    <td>1950</td>\r\n");
      out.write("                    <td>Elephant</td>\r\n");
      out.write("                    <td>Tiger, Nilgiri Tahr</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Bhadra Wildlife Sanctuary</td>\r\n");
      out.write("                    <td>Sanctuary</td>\r\n");
      out.write("                    <td>492</td>\r\n");
      out.write("                    <td>1951</td>\r\n");
      out.write("                    <td>Tiger</td>\r\n");
      out.write("                    <td>Leopard, Sloth Bear</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Nagarhole Wildlife Sanctuary</td>\r\n");
      out.write("                    <td>Sanctuary</td>\r\n");
      out.write("                    <td>643</td>\r\n");
      out.write("                    <td>1955</td>\r\n");
      out.write("                    <td>Elephant</td>\r\n");
      out.write("                    <td>Bengal Tiger, Indian Bison</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Manas Wildlife Sanctuary</td>\r\n");
      out.write("                    <td>Sanctuary</td>\r\n");
      out.write("                    <td>950</td>\r\n");
      out.write("                    <td>1928</td>\r\n");
      out.write("                    <td>Assam Roofed Turtle, Hispid Hare</td>\r\n");
      out.write("                    <td>Indian Rhinoceros, Bengal Tiger</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Sariska Tiger Reserve</td>\r\n");
      out.write("                    <td>Tiger Reserve</td>\r\n");
      out.write("                    <td>866</td>\r\n");
      out.write("                    <td>1955</td>\r\n");
      out.write("                    <td>Bengal Tiger</td>\r\n");
      out.write("                    <td>Leopard, Hyena</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Bandipur Tiger Reserve</td>\r\n");
      out.write("                    <td>Tiger Reserve</td>\r\n");
      out.write("                    <td>874</td>\r\n");
      out.write("                    <td>1973</td>\r\n");
      out.write("                    <td>Bengal Tiger</td>\r\n");
      out.write("                    <td>Elephant, Leopard</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Kanha Tiger Reserve</td>\r\n");
      out.write("                    <td>Tiger Reserve</td>\r\n");
      out.write("                    <td>940</td>\r\n");
      out.write("                    <td>1955</td>\r\n");
      out.write("                    <td>Bengal Tiger</td>\r\n");
      out.write("                    <td>Barasingha, Leopard</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Panna Tiger Reserve</td>\r\n");
      out.write("                    <td>Tiger Reserve</td>\r\n");
      out.write("                    <td>543</td>\r\n");
      out.write("                    <td>1994</td>\r\n");
      out.write("                    <td>Bengal Tiger</td>\r\n");
      out.write("                    <td>Leopard, Sloth Bear</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Sundarbans Tiger Reserve</td>\r\n");
      out.write("                    <td>Tiger Reserve</td>\r\n");
      out.write("                    <td>2,585</td>\r\n");
      out.write("                    <td>1973</td>\r\n");
      out.write("                    <td>Bengal Tiger</td>\r\n");
      out.write("                    <td>Fishing Cat, Estuarine Crocodile</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <!-- Scripts -->\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/aos@2.3.1/dist/aos.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        AOS.init();\r\n");
      out.write("\r\n");
      out.write("        // Sort table columns\r\n");
      out.write("        function sortTable(columnIndex) {\r\n");
      out.write("            var table = document.getElementById(\"parksTable\");\r\n");
      out.write("            var rows = Array.from(table.rows).slice(1);\r\n");
      out.write("            var ascending = true;\r\n");
      out.write("            var sortedRows;\r\n");
      out.write("\r\n");
      out.write("            if (table.getAttribute(\"data-sorted-column\") == columnIndex) {\r\n");
      out.write("                ascending = table.getAttribute(\"data-sort-order\") == \"asc\" ? false : true;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            sortedRows = rows.sort((a, b) => {\r\n");
      out.write("                var aText = a.cells[columnIndex].textContent.trim();\r\n");
      out.write("                var bText = b.cells[columnIndex].textContent.trim();\r\n");
      out.write("\r\n");
      out.write("                if (columnIndex == 2 || columnIndex == 3) { // For numeric values\r\n");
      out.write("                    return ascending ? aText - bText : bText - aText;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                return ascending ? aText.localeCompare(bText) : bText.localeCompare(aText);\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            table.tBodies[0].append(...sortedRows);\r\n");
      out.write("\r\n");
      out.write("            table.setAttribute(\"data-sorted-column\", columnIndex);\r\n");
      out.write("            table.setAttribute(\"data-sort-order\", ascending ? \"asc\" : \"desc\");\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        // Search in the table\r\n");
      out.write("        document.getElementById(\"searchInput\").addEventListener(\"input\", function () {\r\n");
      out.write("            var input = this.value.toLowerCase();\r\n");
      out.write("            var rows = document.querySelectorAll(\"#parksTable tbody tr\");\r\n");
      out.write("\r\n");
      out.write("            rows.forEach(row => {\r\n");
      out.write("                var cells = row.querySelectorAll(\"td\");\r\n");
      out.write("                var match = Array.from(cells).some(cell => cell.textContent.toLowerCase().includes(input));\r\n");
      out.write("                row.style.display = match ? \"\" : \"none\";\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "userfooter.jsp", out, false);
      out.write("\r\n");
      out.write("  <script>\r\n");
      out.write("  window.watsonAssistantChatOptions = {\r\n");
      out.write("    integrationID: \"40f6535b-f4fd-4da5-9334-91599b86c0b0\", // The ID of this integration.\r\n");
      out.write("    region: \"au-syd\", // The region your integration is hosted in.\r\n");
      out.write("    serviceInstanceID: \"eab37542-ac5e-4718-8d4f-787f12a29357\", // The ID of your service instance.\r\n");
      out.write("    onLoad: async (instance) => { await instance.render(); }\r\n");
      out.write("  };\r\n");
      out.write("  setTimeout(function(){\r\n");
      out.write("    const t=document.createElement('script');\r\n");
      out.write("    t.src=\"https://web-chat.global.assistant.watson.appdomain.cloud/versions/\" + (window.watsonAssistantChatOptions.clientVersion || 'latest') + \"/WatsonAssistantChatEntry.js\";\r\n");
      out.write("    document.head.appendChild(t);\r\n");
      out.write("  });\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
