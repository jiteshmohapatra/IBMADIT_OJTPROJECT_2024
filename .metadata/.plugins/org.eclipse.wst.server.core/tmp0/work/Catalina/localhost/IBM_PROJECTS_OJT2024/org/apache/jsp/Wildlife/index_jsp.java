/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.24
 * Generated at: 2024-09-17 12:14:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Wildlife;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../userheader.jsp", out, false);
      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"styles.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<br>\r\n");
      out.write("	<center>\r\n");
      out.write("		<h2 style=\"color: #007b5e;\">Latest updates</h2>\r\n");
      out.write("	</center>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container my-5 card-container\">\r\n");
      out.write("		<div class=\"card mb-3\">\r\n");
      out.write("			<img src=\"1.jpg\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("			<div class=\"card-body\">\r\n");
      out.write("				<h5 class=\"card-title\">The Majestic Tigers</h5>\r\n");
      out.write("				<p class=\"card-text\">\r\n");
      out.write("					Tigers are the largest wild cats, known for their power and grace.\r\n");
      out.write("					These solitary hunters are facing threats from habitat loss and\r\n");
      out.write("					poaching. Conservation efforts are critical to ensure their\r\n");
      out.write("					survival. Tigers are a symbol of strength and play a vital role in\r\n");
      out.write("					maintaining the balance of the ecosystem. <span\r\n");
      out.write("						class=\"read-more-content\"> They are also admired for their\r\n");
      out.write("						striking appearance, with unique stripes that provide camouflage\r\n");
      out.write("						in their natural habitats.</span>\r\n");
      out.write("				</p>\r\n");
      out.write("				<span class=\"read-more-btn\">Read more</span>\r\n");
      out.write("				<div class=\"card-date\">Posted on August 8, 2024</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"card mb-3\">\r\n");
      out.write("			<img src=\"e.jpg\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("			<div class=\"card-body\">\r\n");
      out.write("				<h5 class=\"card-title\">Elephant Social Structure</h5>\r\n");
      out.write("				<p class=\"card-text\">\r\n");
      out.write("					Elephant social structure is matriarchal, with groups led by the\r\n");
      out.write("					oldest female. These tight-knit herds, composed of related females\r\n");
      out.write("					and their young, exhibit strong bonds and cooperative behavior.\r\n");
      out.write("					Males leave the herd upon maturity, living solitary or forming\r\n");
      out.write("					bachelor groups. <span class=\"read-more-content\">\r\n");
      out.write("						Communication through vocalizations and touch reinforces their\r\n");
      out.write("						social cohesion, vital for navigation, protection, and resource\r\n");
      out.write("						sharing. This complex structure underscores their intelligence and\r\n");
      out.write("						deep social connections.</span>\r\n");
      out.write("				</p>\r\n");
      out.write("				<span class=\"read-more-btn\">Read more</span>\r\n");
      out.write("				<div class=\"card-date\">Posted on August 6, 2024</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"card mb-3\">\r\n");
      out.write("			<img src=\"3.jpg\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("			<div class=\"card-body\">\r\n");
      out.write("				<h5 class=\"card-title\">Bird Migration Wonders</h5>\r\n");
      out.write("				<p class=\"card-text\">\r\n");
      out.write("					Bird migration is a remarkable phenomenon where millions of birds\r\n");
      out.write("					travel thousands of miles between breeding and wintering grounds.\r\n");
      out.write("					These journeys are perilous, with many species relying on conserved\r\n");
      out.write("					stopover habitats. <span class=\"read-more-content\">\r\n");
      out.write("						Understanding and protecting these migratory routes is vital for\r\n");
      out.write("						the survival of many bird species, ensuring that they can continue\r\n");
      out.write("						their incredible journeys.</span>\r\n");
      out.write("				</p>\r\n");
      out.write("				<span class=\"read-more-btn\">Read more</span>\r\n");
      out.write("				<div class=\"card-date\">Posted on August 4, 2024</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"card mb-3\">\r\n");
      out.write("			<img src=\"4.jpg\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("			<div class=\"card-body\">\r\n");
      out.write("				<h5 class=\"card-title\">Coral Reefs: Ocean's Rainforests</h5>\r\n");
      out.write("				<p class=\"card-text\">\r\n");
      out.write("					Coral reefs are vibrant underwater ecosystems teeming with life.\r\n");
      out.write("					They provide habitat for a myriad of marine species and protect\r\n");
      out.write("					coastlines from erosion. Climate change and pollution threaten\r\n");
      out.write("					these delicate structures. <span class=\"read-more-content\">\r\n");
      out.write("						Making conservation efforts imperative to preserve these natural\r\n");
      out.write("						wonders, which support diverse marine life and benefit humans by\r\n");
      out.write("						protecting shorelines.</span>\r\n");
      out.write("				</p>\r\n");
      out.write("				<span class=\"read-more-btn\">Read more</span>\r\n");
      out.write("				<div class=\"card-date\">Posted on August 2, 2024</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"card mb-3\">\r\n");
      out.write("			<img src=\"5.jpg\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("			<div class=\"card-body\">\r\n");
      out.write("				<h5 class=\"card-title\">The Mysterious Snow Leopard</h5>\r\n");
      out.write("				<p class=\"card-text\">\r\n");
      out.write("					Snow leopards, elusive and solitary, inhabit the mountainous\r\n");
      out.write("					regions of Central Asia. These \"ghosts of the mountains\" are\r\n");
      out.write("					threatened by habitat loss and poaching. <span\r\n");
      out.write("						class=\"read-more-content\"> Conservation programs aim to\r\n");
      out.write("						protect their habitats and reduce human-wildlife conflict,\r\n");
      out.write("						ensuring that these magnificent creatures continue to roam the\r\n");
      out.write("						wild.</span>\r\n");
      out.write("				</p>\r\n");
      out.write("				<span class=\"read-more-btn\">Read more</span>\r\n");
      out.write("				<div class=\"card-date\">Posted on July 31, 2024</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"card mb-3\">\r\n");
      out.write("			<img src=\"6.jpg\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("			<div class=\"card-body\">\r\n");
      out.write("				<h5 class=\"card-title\">Orangutans and Rainforests</h5>\r\n");
      out.write("				<p class=\"card-text\">\r\n");
      out.write("					Orangutans, native to the rainforests of Borneo and Sumatra, are\r\n");
      out.write("					critically endangered due to deforestation and illegal pet trade.\r\n");
      out.write("					These intelligent primates play a key role in forest regeneration\r\n");
      out.write("					by dispersing seeds. <span class=\"read-more-content\">\r\n");
      out.write("						Conservation efforts focus on habitat protection and anti-poaching\r\n");
      out.write("						measures to ensure the survival of these vital forest dwellers.</span>\r\n");
      out.write("				</p>\r\n");
      out.write("				<span class=\"read-more-btn\">Read more</span>\r\n");
      out.write("				<div class=\"card-date\">Posted on July 29, 2024</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<center>\r\n");
      out.write("		<h2 style=\"color: #007b5e;\">10 Wildlife National Parks in India</h2>\r\n");
      out.write("	</center>\r\n");
      out.write("	<br>\r\n");
      out.write("	<div class=\"container my-5\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-md-6 mb-3\">\r\n");
      out.write("				<div class=\"card\">\r\n");
      out.write("					<div class=\"row g-0\">\r\n");
      out.write("						<div class=\"col-md-4\">\r\n");
      out.write("							<img src=\"sundarban.jpg\" class=\"img-fluid rounded-start\"\r\n");
      out.write("								alt=\"Sundarbans National Park\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col-md-8\">\r\n");
      out.write("							<div class=\"card-body\">\r\n");
      out.write("								<h5 class=\"card-title\">\r\n");
      out.write("									<h5 class=\"card-title\">\r\n");
      out.write("										<a href=\"https://www.sunderbannationalpark.in/\"\r\n");
      out.write("											style=\"color: inherit; text-decoration: none;\">Sundarbans\r\n");
      out.write("											National Park (West Bengal)</a>\r\n");
      out.write("									</h5>\r\n");
      out.write("\r\n");
      out.write("									<p class=\"card-text\">Part of the Sundarbans delta, it's\r\n");
      out.write("										known for its unique mangrove forests and Royal Bengal tigers.</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-6 mb-3\">\r\n");
      out.write("				<div class=\"card\">\r\n");
      out.write("					<div class=\"row g-0\">\r\n");
      out.write("						<div class=\"col-md-4\">\r\n");
      out.write("							<img src=\"jim.jpg\" class=\"img-fluid rounded-start\"\r\n");
      out.write("								alt=\"Jim Corbett National Park\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col-md-8\">\r\n");
      out.write("							<div class=\"card-body\">\r\n");
      out.write("								<h5 class=\"card-title\">\r\n");
      out.write("									<a href=\"https://www.corbettnationalpark.in/\"\r\n");
      out.write("										style=\"color: inherit; text-decoration: none;\">Jim Corbett\r\n");
      out.write("										National Park (Uttarakhand)</a>\r\n");
      out.write("								</h5>\r\n");
      out.write("								<p class=\"card-text\">Established in 1936, it's the oldest\r\n");
      out.write("									national park in India, known for its Bengal tiger population.</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-6 mb-3\">\r\n");
      out.write("				<div class=\"card\">\r\n");
      out.write("					<div class=\"row g-0\">\r\n");
      out.write("						<div class=\"col-md-4\">\r\n");
      out.write("							<img src=\"kazi.jpg\" class=\"img-fluid rounded-start\"\r\n");
      out.write("								alt=\"Kaziranga National Park\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col-md-8\">\r\n");
      out.write("							<div class=\"card-body\">\r\n");
      out.write("								<h5 class=\"card-title\">\r\n");
      out.write("									<a href=\"https://www.kaziranga-national-park.com/\"\r\n");
      out.write("										style=\"color: inherit; text-decoration: none;\">Kaziranga\r\n");
      out.write("										National Park (Assam)</a>\r\n");
      out.write("								</h5>\r\n");
      out.write("								<p class=\"card-text\">Famous for hosting two-thirds of the\r\n");
      out.write("									world's great one-horned rhinoceroses, it is also a UNESCO\r\n");
      out.write("									World Heritage Site.</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-6 mb-3\">\r\n");
      out.write("				<div class=\"card\">\r\n");
      out.write("					<div class=\"row g-0\">\r\n");
      out.write("						<div class=\"col-md-4\">\r\n");
      out.write("							<img src=\"Ranthambhore.jpg\" class=\"img-fluid rounded-start\"\r\n");
      out.write("								alt=\"Ranthambore National Park\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col-md-8\">\r\n");
      out.write("							<div class=\"card-body\">\r\n");
      out.write("								<h5 class=\"card-title\">\r\n");
      out.write("									<a href=\"https://www.ranthamboreforest.in/\"\r\n");
      out.write("										style=\"color: inherit; text-decoration: none;\">Ranthambore\r\n");
      out.write("										National Park (Rajasthan)</a>\r\n");
      out.write("								</h5>\r\n");
      out.write("								<p class=\"card-text\">Known for its large population of\r\n");
      out.write("									Bengal tigers, it also has historical ruins within the park.</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-6 mb-3\">\r\n");
      out.write("				<div class=\"card\">\r\n");
      out.write("					<div class=\"row g-0\">\r\n");
      out.write("						<div class=\"col-md-4\">\r\n");
      out.write("							<img src=\"bandh.jpg\" class=\"img-fluid rounded-start\"\r\n");
      out.write("								alt=\"Bandhavgarh National Park\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col-md-8\">\r\n");
      out.write("							<div class=\"card-body\">\r\n");
      out.write("								<h5 class=\"card-title\">\r\n");
      out.write("									<a href=\"https://www.bandhavgarh-national-park.com/\"\r\n");
      out.write("										style=\"color: inherit; text-decoration: none;\">Bandhavgarh\r\n");
      out.write("										National Park (Madhya Pradesh)</a>\r\n");
      out.write("								</h5>\r\n");
      out.write("								<p class=\"card-text\">It has one of the highest densities of\r\n");
      out.write("									Bengal tigers in the world and a rich biodiversity.</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-6 mb-3\">\r\n");
      out.write("				<div class=\"card\">\r\n");
      out.write("					<div class=\"row g-0\">\r\n");
      out.write("						<div class=\"col-md-4\">\r\n");
      out.write("							<img src=\"Kanha-National-Park.png\"\r\n");
      out.write("								class=\"img-fluid rounded-start\" alt=\"Kanha National Park\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col-md-8\">\r\n");
      out.write("							<div class=\"card-body\">\r\n");
      out.write("								<h5 class=\"card-title\">\r\n");
      out.write("									<a href=\"https://www.kanha-national-park.com/\"\r\n");
      out.write("										style=\"color: inherit; text-decoration: none;\">Kanha\r\n");
      out.write("										National Park (Madhya Pradesh)</a>\r\n");
      out.write("								</h5>\r\n");
      out.write("								<p class=\"card-text\">The inspiration behind Rudyard\r\n");
      out.write("									Kipling's \"The Jungle Book,\" it's known for its tiger reserve\r\n");
      out.write("									and diverse wildlife.</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-6 mb-3\">\r\n");
      out.write("				<div class=\"card\">\r\n");
      out.write("					<div class=\"row g-0\">\r\n");
      out.write("						<div class=\"col-md-4\">\r\n");
      out.write("							<img src=\"gir.jpg\" class=\"img-fluid rounded-start\"\r\n");
      out.write("								alt=\"Gir National Park\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col-md-8\">\r\n");
      out.write("							<div class=\"card-body\">\r\n");
      out.write("								<h5 class=\"card-title\">\r\n");
      out.write("									<a href=\"https://www.girforest.in/\"\r\n");
      out.write("										style=\"color: inherit; text-decoration: none;\">Gir\r\n");
      out.write("										National Park (Gujarat)</a>\r\n");
      out.write("								</h5>\r\n");
      out.write("								<p class=\"card-text\">The only place in the world where\r\n");
      out.write("									Asiatic lions are found in the wild.</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-6 mb-3\">\r\n");
      out.write("				<div class=\"card\">\r\n");
      out.write("					<div class=\"row g-0\">\r\n");
      out.write("						<div class=\"col-md-4\">\r\n");
      out.write("							<img src=\"periyar.jpg\" class=\"img-fluid rounded-start\"\r\n");
      out.write("								alt=\"Periyar National Park\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col-md-8\">\r\n");
      out.write("							<div class=\"card-body\">\r\n");
      out.write("								<h5 class=\"card-title\">\r\n");
      out.write("									<a href=\"https://www.periyarnationalparkonline.in/\"\r\n");
      out.write("										style=\"color: inherit; text-decoration: none;\">Periyar\r\n");
      out.write("										National Park (Kerala)</a>\r\n");
      out.write("								</h5>\r\n");
      out.write("								<p class=\"card-text\">Known for its elephant and tiger\r\n");
      out.write("									reserve, it also features a picturesque lake formed by the\r\n");
      out.write("									Mullaperiyar Dam.</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-6 mb-3\">\r\n");
      out.write("				<div class=\"card\">\r\n");
      out.write("					<div class=\"row g-0\">\r\n");
      out.write("						<div class=\"col-md-4\">\r\n");
      out.write("							<img src=\"nagarhole.jpg\" class=\"img-fluid rounded-start\"\r\n");
      out.write("								alt=\"Nagarhole National Park\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col-md-8\">\r\n");
      out.write("							<div class=\"card-body\">\r\n");
      out.write("								<h5 class=\"card-title\">\r\n");
      out.write("									<a href=\"https://www.nagarahole.com/\"\r\n");
      out.write("										style=\"color: inherit; text-decoration: none;\">Nagarhole\r\n");
      out.write("										National Park (Karnataka)</a>\r\n");
      out.write("								</h5>\r\n");
      out.write("								<p class=\"card-text\">Part of the Nilgiri Biosphere Reserve,\r\n");
      out.write("									it boasts a rich variety of wildlife including tigers,\r\n");
      out.write("									leopards, and elephants.</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-6 mb-3\">\r\n");
      out.write("				<div class=\"card\">\r\n");
      out.write("					<div class=\"row g-0\">\r\n");
      out.write("						<div class=\"col-md-4\">\r\n");
      out.write("							<img src=\"sarishka-nationalpark.jpg\"\r\n");
      out.write("								class=\"img-fluid rounded-start\" alt=\"Sariska National Park\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col-md-8\">\r\n");
      out.write("							<div class=\"card-body\">\r\n");
      out.write("								<h5 class=\"card-title\">\r\n");
      out.write("									<a href=\"https://www.sariskanationalparkonline.in/\"\r\n");
      out.write("										style=\"color: inherit; text-decoration: none;\">Sariska\r\n");
      out.write("										National Park (Rajasthan)</a>\r\n");
      out.write("								</h5>\r\n");
      out.write("								<p class=\"card-text\">Known for its Bengal tiger population,\r\n");
      out.write("									it also houses several historical ruins including a fort and\r\n");
      out.write("									temples.</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<br>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"enquiry-section\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<center>\r\n");
      out.write("				<h2 style=\"color: #007b5e;\">Want to post your own blog? Feel\r\n");
      out.write("					free to contact us.</h2>\r\n");
      out.write("			</center>\r\n");
      out.write("			<form>\r\n");
      out.write("				<div class=\"mb-3\">\r\n");
      out.write("					<label for=\"name\" class=\"form-label\"><b>Name</b></label> <input\r\n");
      out.write("						type=\"text\" class=\"form-control is-valid\" id=\"name\"\r\n");
      out.write("						placeholder=\"Enter your name\" required>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"mb-3\">\r\n");
      out.write("					<label for=\"email\" class=\"form-label\"><b>Email</b></label> <input\r\n");
      out.write("						type=\"email\" class=\"form-control is-valid\" id=\"email\"\r\n");
      out.write("						placeholder=\"Enter your email\" required>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"mb-3\">\r\n");
      out.write("					<label for=\"subject\" class=\"form-label\"><b>Blog Subject</b></label>\r\n");
      out.write("					<input type=\"text\" class=\"form-control is-valid\" id=\"subject\"\r\n");
      out.write("						placeholder=\"Enter the subject\" required>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"mb-3\">\r\n");
      out.write("					<label for=\"message\" class=\"form-label\"><b>Message</b></label>\r\n");
      out.write("					<textarea class=\"form-control is-valid\" id=\"message\" rows=\"4\"\r\n");
      out.write("						placeholder=\"Enter your message\" required></textarea>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"d-flex\" style=margin-bottom:10px;>\r\n");
      out.write("					<button type=\"submit\" class=\"btn btn-success me-2 custom-btn\">Submit</button>\r\n");
      out.write("					<button type=\"reset\" class=\"btn btn-warning custom-btn\">Reset</button>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("			</form>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("<!-- Footer Start -->\r\n");
      out.write("  <div class=\"container-fluid footer bg-dark text-light footer mt-5 pt-5 wow fadeIn\" data-wow-delay=\"0.1s\">\r\n");
      out.write("    <div class=\"container py-5\">\r\n");
      out.write("      <div class=\"row g-5\">\r\n");
      out.write("        <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("          <h5 class=\"text-light mb-4\">Address</h5>\r\n");
      out.write("          <p class=\"mb-2\">\r\n");
      out.write("            <i class=\"fa fa-map-marker-alt me-3\"></i>123 Bhubaneswar, Odisha, India\r\n");
      out.write("          </p>\r\n");
      out.write("          <p class=\"mb-2\">\r\n");
      out.write("            <i class=\"fa fa-phone-alt me-3\"></i>+012 345 67890\r\n");
      out.write("          </p>\r\n");
      out.write("          <p class=\"mb-2\">\r\n");
      out.write("            <i class=\"fa fa-envelope me-3\"></i>team.wildhaven@gmail.com\r\n");
      out.write("          </p>\r\n");
      out.write("          <div class=\"d-flex pt-2\">\r\n");
      out.write("            <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-twitter\"></i></a>\r\n");
      out.write("            <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-facebook-f\"></i></a>\r\n");
      out.write("            <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-youtube\"></i></a>\r\n");
      out.write("            <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-linkedin-in\"></i></a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("          <h5 class=\"text-light mb-4\">Quick Links</h5>\r\n");
      out.write("          <a class=\"btn btn-link\" href=\"\">About Us</a>\r\n");
      out.write("          <a class=\"btn btn-link\" href=\"\">Contact Us</a>\r\n");
      out.write("          <a class=\"btn btn-link\" href=\"\">Our Services</a>\r\n");
      out.write("          <a class=\"btn btn-link\" href=\"\">Terms & Condition</a>\r\n");
      out.write("          <a class=\"btn btn-link\" href=\"\">Support</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("          <h5 class=\"text-light mb-4\">Popular Links</h5>\r\n");
      out.write("          <a class=\"btn btn-link\" href=\"\">About Us</a>\r\n");
      out.write("          <a class=\"btn btn-link\" href=\"\">Contact Us</a>\r\n");
      out.write("          <a class=\"btn btn-link\" href=\"\">Our Services</a>\r\n");
      out.write("          <a class=\"btn btn-link\" href=\"\">Terms & Condition</a>\r\n");
      out.write("          <a class=\"btn btn-link\" href=\"\">Support</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("          <h5 class=\"text-light mb-4\">Welcome to the WildHaven Newsletter</h5>\r\n");
      out.write("           <p>Join our newsletter to stay updated on our latest wildlife conservation efforts and success stories.</p>\r\n");
      out.write("          <div class=\"position-relative mx-auto\" style=\"max-width: 400px\">\r\n");
      out.write("            <input class=\"form-control border-0 w-100 py-3 ps-4 pe-5\" type=\"text\" placeholder=\"Your email\" />\r\n");
      out.write("            <button type=\"button\" class=\"btn btn-success py-2 position-absolute top-0 end-0 mt-2 me-2\">\r\n");
      out.write("              SignUp\r\n");
      out.write("            </button>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"copyright\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"col-md-6 text-center text-md-start mb-3 mb-md-0\">\r\n");
      out.write("            &copy; <a class=\"border-bottom\" href=\"#\">WildHaven</a>, All\r\n");
      out.write("            Right Reserved.\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-md-6 text-center text-md-end\" style=\"display: none !important;\">\r\n");
      out.write("            <!--/*** This template is free as long as you keep the footer author’s credit link/attribution link/backlink. If you'd like to use the template without the footer author’s credit link/attribution link/backlink, you can purchase the Credit Removal License from \"https://htmlcodex.com/credit-removal\". Thank you for your support. ***/-->\r\n");
      out.write("            Designed By\r\n");
      out.write("            <a class=\"border-bottom\" href=\"#\"></a>\r\n");
      out.write("            <br />Distributed By:\r\n");
      out.write("           \r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- Footer End -->\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        document.querySelectorAll('.read-more-btn').forEach(btn => {\r\n");
      out.write("            btn.addEventListener('click', function() {\r\n");
      out.write("                const cardText = this.previousElementSibling;\r\n");
      out.write("                cardText.classList.toggle('expanded');\r\n");
      out.write("                if (cardText.classList.contains('expanded')) {\r\n");
      out.write("                    this.textContent = 'Read less';\r\n");
      out.write("                } else {\r\n");
      out.write("                    this.textContent = 'Read more';\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write(" <script>\r\n");
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
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
