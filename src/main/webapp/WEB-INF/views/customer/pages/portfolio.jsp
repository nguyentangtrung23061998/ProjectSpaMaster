<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Spa Care a Beauty and Spa Category Flat bootstrap
	Responsive website Template | Portfolio :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Spa Care Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
	Smart phone Compatible web template, free web designs for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<!-- Custom Theme files -->
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
<!-- //Custom Theme files -->
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
								<a href="home">Spa Care</a>
							</h1>
						</div>
						<!-- Collect the nav links, forms, and other content for toggling -->
						<div class="collapse navbar-collapse"
							id="bs-example-navbar-collapse-1">
							<ul class="nav navbar-right">
								<li><a href="home" class="link-kumya scroll"><span
										data-letters="Home">Home</span></a></li>
								<li><a href="about" class="link-kumya"><span
										data-letters="About">About</span></a></li>
								<li><a href="portfolio" class="link-kumya active"><span
										data-letters="Portfolio">Portfolio</span></a></li>
								<li><a href="blog" class="link-kumya"><span
										data-letters="Blog">Blog</span></a></li>
								<li><a href="contact" class="link-kumya"><span
										data-letters="Contact">Contact</span></a></li>
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
	<!-- gallery -->
	<div class="gallery wthree">
		<div class="container">
			<h3 class="wthree-title">Our Gallery</h3>
			<div class="gallery-agileinfo">
				<c:forEach var="gallery" items="${galleries}">
					<div class="col-md-4 port-grids view w3layouts-view">
						<a class="agile-w3link" href="${gallery.imagePath}"
							data-lightbox="example-set" data-title=""> <img
							src="${gallery.imagePath}" class="img-responsive" alt="" />
							<div class="maskw3ls w3-agile">
								<p>${gallery.content}</p>
							</div>
						</a>
					</div>
				</c:forEach>
				<!-- 
				<div class="col-md-4 port-grids view w3layouts-view">
					<a class="agile-w3link" href="${pageContext.request.contextPath}/resources/template/images/g2.jpg" data-lightbox="example-set" data-title="">
						<img src="${pageContext.request.contextPath}/resources/template/images/g2.jpg" class="img-responsive" alt=""/>
						<div class="maskw3ls w3-agile">
							<p>We can provide Spa & Beauty Care at the lowest price,with Best Quality</p>
						</div>
					</a>
				</div>
				<div class="col-md-4 port-grids view w3layouts-view">
					<a class="agile-w3link" href="${pageContext.request.contextPath}/resources/template/images/g3.jpg" data-lightbox="example-set" data-title="">
						<img src="${pageContext.request.contextPath}/resources/template/images/g3.jpg" class="img-responsive" alt=""/>
						<div class="maskw3ls">
							<p>We can provide Spa & Beauty Care at the lowest price,with Best Quality</p>
						</div>
					</a>
				</div>
				<div class="col-md-4 port-grids view w3layouts-view">
					<a class="agile-w3link" href="${pageContext.request.contextPath}/resources/template/images/g4.jpg" data-lightbox="example-set" data-title="">
						<img src="${pageContext.request.contextPath}/resources/template/images/g4.jpg" class="img-responsive" alt=""/>
						<div class="maskw3ls">
							<p>We can provide Spa & Beauty Care at the lowest price,with Best Quality</p>
						</div>
					</a>
				</div>
				<div class="col-md-4 port-grids view w3layouts-view">
					<a class="agile-w3link" href="${pageContext.request.contextPath}/resources/template/images/g5.jpg" data-lightbox="example-set" data-title="">
						<img src="${pageContext.request.contextPath}/resources/template/images/g5.jpg" class="img-responsive" alt=""/>
						<div class="maskw3ls">
							<p>We can provide Spa & Beauty Care at the lowest price,with Best Quality</p>
						</div>
					</a>
				</div>
				<div class="col-md-4 port-grids view w3layouts-view">
					<a class="agile-w3link" href="${pageContext.request.contextPath}/resources/template/images/g6.jpg" data-lightbox="example-set" data-title="">
						<img src="${pageContext.request.contextPath}/resources/template/images/g6.jpg" class="img-responsive" alt=""/>
						<div class="maskw3ls">
							<p>We can provide Spa & Beauty Care at the lowest price,with Best Quality</p>
						</div>
					</a>
				</div>
				<div class="col-md-4 port-grids view w3layouts-view">
					<a class="agile-w3link" href="${pageContext.request.contextPath}/resources/template/images/g7.jpg" data-lightbox="example-set" data-title="">
						<img src="${pageContext.request.contextPath}/resources/template/images/g7.jpg" class="img-responsive" alt=""/>
						<div class="maskw3ls">
							<p>We can provide Spa & Beauty Care at the lowest price,with Best Quality</p>
						</div>
					</a>
				</div>
				<div class="col-md-4 port-grids view w3layouts-view">
					<a class="agile-w3link" href="${pageContext.request.contextPath}/resources/template/images/g8.jpg" data-lightbox="example-set" data-title="">
						<img src="${pageContext.request.contextPath}/resources/template/images/g8.jpg" class="img-responsive" alt=""/>
						<div class="maskw3ls">
							<p>We can provide Spa & Beauty Care at the lowest price,with Best Quality</p>
						</div>
					</a>
				</div>
				<div class="col-md-4 port-grids view w3layouts-view">
					<a class="agile-w3link" href="${pageContext.request.contextPath}/resources/template/images/g9.jpg" data-lightbox="example-set" data-title="">
						<img src="${pageContext.request.contextPath}/resources/template/images/g9.jpg" class="img-responsive" alt=""/>
						<div class="maskw3ls">
							<p>We can provide Spa & Beauty Care at the lowest price,with Best Quality</p>
						</div>
					</a>
				</div>
				 -->
				<div class="clearfix"></div>
				<script
					src="${pageContext.request.contextPath}/resources/template/js/lightbox-plus-jquery.min.js">
					
				</script>
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
					© 2017 Spa Care. All rights reserved | Design by <a href="#">Nguyễn
						Tăng Trung</a>
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