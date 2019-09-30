<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="${pageContext.request.contextPath}/resources/template/css/bootstrap.css"
	type="text/css" rel="stylesheet" media="all">
<link
	href="${pageContext.request.contextPath}/resources/template/css/style.css"
	type="text/css" rel="stylesheet" media="all">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/template/css/prettySticky.css"
	type="text/css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/template/css/lightbox.css">
<link
	href="${pageContext.request.contextPath}/resources/template/css/font-awesome.css"
	rel="stylesheet">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/customer/css/styleversion.css">
<!-- js -->
<script
	src="${pageContext.request.contextPath}/resources/template/js/jquery-1.11.1.min.js"></script>
<!-- //js -->
</head>

<body>
	<!-- banner -->
	<div id="home" class="w3banner about-banner">
		<div class="banner-info">
			<!-- navigation -->
			<div class="top-nav">
				<nav>
					<div class="container">
						<div class="navbar-header logo">
							<button type="button" class="navbar-toggle collapsed"
								data-toggle="collapse"
								data-target="#bs-example-navbar-collapse-1">
								<span class="sr-only">Toggle navigation</span> <span
									class="icon-bar"></span> <span class="icon-bar"></span> <span
									class="icon-bar"></span>
							</button>
							<h1>
								<a href="make-spa">Spa Care</a>
							</h1>
						</div>
						<!-- Collect the nav links, forms, and other content for toggling -->
						<div class="collapse navbar-collapse"
							id="bs-example-navbar-collapse-1">
							<ul class="nav navbar-right">
								<li><a href="history" class="link-kumya"><span
										data-letters="History">History</span></a></li>
								<li><a href="profile" class="link-kumya"><span
										data-letters="Profile">Profile</span></a></li>
								<li><a href="${pageContext.request.contextPath }" class="link-kumya"><span
										data-letters="Sign Out">Sign Out</span></a></li>
							</ul>
							<div class="clearfix"></div>
						</div>
					</div>
				</nav>
			</div>
			<!-- //navigation -->
			<div class="banner-text w3-agile">
				<h2>You wanna get a new look from us</h2>
			</div>
		</div>
	</div>
	<!-- //banner -->
	<!-- make-spa -->
	<div id="make-spa">
		<div class="container">
			<div class="row" style="margin-bottom: 2%">
				<h3 class="wthree-title">History</h3>
			</div>
			  <div class="container emp-profile">
                <div class="container">
                    <table class="table table-hover">
                        <thead>
                            <tr class="table-danger">
                                <th>Month</th>
                                <th>Number of Sales</th>
                                <th>Amount</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr class="table-primary">
                                <th scope="row">Jan</th>
                                <td>105</td>
                                <td>$15,000.00</td>
                            </tr>
                            <tr class="table-secondary">
                                <th scope="row">Feb</th>
                                <td>95</td>
                                <td>$12,000.00</td>
                            </tr>
                            <tr class="table-success">
                                <th scope="row">Mar</th>
                                <td>150</td>
                                <td>$20,000.00</td>
                            </tr>
                            <tr class="table-warning">
                                <th scope="row">Apr</th>
                                <td>50</td>
                                <td>$30,000.00</td>
                            </tr>
                            <tr class="table-info">
                                <th scope="row">May</th>
                                <td>80</td>
                                <td>$15,000.00</td>
                            </tr>
                            <tr class="table-light">
                                <th scope="row">Jun</th>
                                <td>110</td>
                                <td>$22,000.00</td>
                            </tr>
                            <tr class="table-dark">
                                <th scope="row">Jun</th>
                                <td>110</td>
                                <td>$22,000.00</td>
                            </tr>
                            <tr class="table-danger">
                                <th colspan="2" scope="row">Grand Total</th>
                                <td>$114,000.00</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
		</div>
	</div>
	<!-- //gallery -->
	<!-- footer -->
	<div class="footer agileits-w3layouts">
		<div class="container">
			<div class="col-md-5 ftr-wthree-grids">
				<h3>Flickr</h3>
				<a class="footer-img" href="single.html"> <img
					src="${pageContext.request.contextPath}/resources/template/images/f2.jpg"
					alt="" /></a> <a class="footer-img" href="single.html"> <img
					src="${pageContext.request.contextPath}/resources/template/images/f1.jpg"
					alt="" /></a> <a class="footer-img" href="single.html"> <img
					src="${pageContext.request.contextPath}/resources/template/images/f3.jpg"
					alt="" /></a>
			</div>
			<div class="col-md-3 ftr-wthree-grids">
				<h3>Contact Me</h3>
				<p>
					123 NewYork City USA.<br> <span>Office: 908-0000</span>
				</p>
				<div class="footer-bottom">
					<a href="#"><span>Facebook</span></a> <a href="#"><span>Pinterest</span></a>
					<a href="#"><span>LinkedIn </span></a> <a href="#"><span>Behance</span></a>
				</div>
			</div>
			<div class="col-md-4 ftr-wthree-grids">
				<h3>Review</h3>
				<p>Sed ut turpis elit ullamcorper in auctor non, accumsan vel
					lacus nulla auctor cursus nunc. Maecenas ultricies dolor in urna
					tempus, id egestas erat finibus interdum lectus eget scelerisque.</p>
			</div>
			<div class="clearfix"></div>
			<div class="footer-copy">
				<p>
					© 2017 Spa Care. All rights reserved | Design by <a
						href="http://w3layouts.com">Nguyen Tang Trung</a>
				</p>
			</div>
		</div>
	</div>
	<!-- //footer -->
	<!-- script-for prettySticky -->
	<script
		src="${pageContext.request.contextPath}/resources/template/js/prettySticky.js"></script>
	<!-- //script-for prettySticky -->
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="${pageContext.request.contextPath}/resources/template/js/bootstrap.js"></script>
</body>
</html>