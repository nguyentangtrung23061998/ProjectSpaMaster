<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Spa Care a Beauty and Spa Category Flat bootstrap
	Responsive website Template | About :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Spa Care Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
	Smart phone Compatible web template, free web designs for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<!-- Custom Theme files -->
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/template/css/bootstrap.css"
	media="all" />

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/template/css/prettySticky.css"
	media="all" />

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/template/css/font-awesome.css"
	media="all" />

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/template/css/style.css"
	media="all" />
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
								<li><a href="about" class="link-kumya active"><span
										data-letters="About">About</span></a></li>
								<li><a href="portfolio" class="link-kumya "><span
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
			<div class="banner-text">
				<h2>You wanna get a new look from us</h2>
			</div>
		</div>
	</div>
	<!-- //banner -->
	<!-- about -->
	<div class="about">
		<div class="container">
			<h3 class="wthree-title">About Us</h3>
			<div class="about-agileinfo">
				<div class="col-md-7 about-grids">
					<div class="about-w3layoutsrow">
						<c:forEach var="service" items="${services}">
							<div class="col-md-3 about-wthreeimgs">
								<img src="${service.imagePath}" alt=""
									class="img-responsive zoom-img" />
							</div>
						</c:forEach>
						<!-- 
						<div class="col-md-4 about-wthreeimgs">
							<img src="${pageContext.request.contextPath}/resources/template/images/g2.jpg" alt=""  class="img-responsive zoom-img"/>
						</div>
						<div class="col-md-4 about-wthreeimgs">
							<img src="${pageContext.request.contextPath}/resources/template/images/g3.jpg" alt=""  class="img-responsive zoom-img"/>
						</div>
						<div class="clearfix"> </div>
						 -->
					</div>
					<h4>Blanditiis praesentium deleniti atque corrupti quos</h4>
					<p>Dignissimos at vero eos et accusamus et iusto odio ducimus
						qui blanditiis praesentium voluptatum deleniti atque corrupti quos
						dolores et quas molestias excepturi sint occaecat officia deserunt
						mollitia laborum et dolorum fuga. At vero eos et accusamus et
						iusto odio dignissimos ducimus qui blanditiis praesentium
						voluptatum deleniti atque corrupti quos dolores et quas molestias
						excepturi sint occaecat</p>
				</div>
				<div class="col-md-5 about-grids">
					<div class="pince w3-agileits">
						<div class="pince-left">
							<span class="glyphicon glyphicon-thumbs-up" aria-hidden="true"></span>
						</div>
						<div class="pince-right">
							<h4>Why Choosing Us?</h4>
							<p>Vero vulputate enim non justo posuere placerat. Phasellus
								eget mauris.</p>
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="pince">
						<div class="pince-left">
							<span class="glyphicon glyphicon-tasks" aria-hidden="true"></span>
						</div>
						<div class="pince-right">
							<h4>Our Tasks</h4>
							<p>Dero vulputate enim non justo posuere placerat. purus vel
								mauris.</p>
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="pince">
						<div class="pince-left">
							<span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>
						</div>
						<div class="pince-right">
							<h4>Our History</h4>
							<p>Justo posuere placerat. Vero vulputate enim non Phasellus
								eget mauris.</p>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!-- //about -->
	<!-- testimonials -->
	<div class="testimonials">
		<div class="container">
			<h3 class="wthree-title">Testimonials</h3>
			<section class="slider">
				<div class="flexslider">
					<ul class="slides">
						<li>
							<div class="testimonials-grid agileinfo">
								<img
									src="${pageContext.request.contextPath}/resources/template/images/quote.png"
									alt=" " class="img-responsive" />
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit,
									sed do eiusmod tempor incididunt ut labore et dolore magna
									aliqua. Ut enim ad minim veniam sed do eiusmod.</p>
								<h5>
									John Doe,<span> Tempor</span>
								</h5>
							</div>
						</li>
						<li>
							<div class="testimonials-grid">
								<img
									src="${pageContext.request.contextPath}/resources/template/images/quote.png"
									alt=" " class="img-responsive" />
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit,
									sed do eiusmod tempor incididunt ut labore et dolore magna
									aliqua. Ut enim ad minim veniam sed do eiusmod.</p>
								<h5>
									Elit semper,<span> Veniam</span>
								</h5>
							</div>
						</li>
						<li>
							<div class="testimonials-grid">
								<img
									src="${pageContext.request.contextPath}/resources/template/images/quote.png"
									alt=" " class="img-responsive" />
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit,
									sed do eiusmod tempor incididunt ut labore et dolore magna
									aliqua. Ut enim ad minim veniam sed do eiusmod.</p>
								<h5>
									Daniel Nyari,<span> Enim </span>
								</h5>
							</div>
						</li>
					</ul>
				</div>
			</section>
			<!-- FlexSlider -->
			<script defer
				src="${pageContext.request.contextPath}/resources/template/js/jquery.flexslider.js"></script>
			<script type="text/javascript">
				$(window).load(function() {
					$('.flexslider').flexslider({
						animation : "slide",
						start : function(slider) {
							$('body').removeClass('loading');
						}
					});
				});
			</script>
			<!-- End-slider-script -->
		</div>
	</div>
	<!-- //testimonials -->
	<!-- team -->
	<div class="team">
		<div class="container">
			<h3 class="wthree-title">Meet Our Team</h3>
			<div class="team-grids">
				<section class="main">
					<ul class="ch-grid">
						<c:forEach var="employee" items="${employees}"  varStatus="myIndex">
							<li>
								<div class="ch-item ch-img-${myIndex.index +1}">
									<div class="ch-info">
										<h3>${employee.major}</h3>
										<p>${employee.fullName}</p>
										<div class="footer-bottom">
											<a href="#"></a> <a href="#"></a> <a href="#"></a>
										</div>
									</div>
								</div>
							</li>
						</c:forEach>
						<!-- 
						<li>
							<div class="ch-item ch-img-2">
								<div class="ch-info">
									<h3>Stylist</h3>
									<p>by Johnathen</p>
									<div class="footer-bottom">
										<a href="#"></a>
										<a href="#"></a>
										<a href="#"></a>
									</div>
								</div>
							</div>
						</li>
						<li>
							<div class="ch-item ch-img-3">
								<div class="ch-info">
									<h3>Manicurist</h3>
									<p>by Fedrick Paul</p>
									<div class="footer-bottom">
										<a href="#"></a>
										<a href="#"></a>
										<a href="#"></a>
									</div>
								</div>
							</div>
						</li>
						<li>
							<div class="ch-item ch-img-4">
								<div class="ch-info">
									<h3>Specialist</h3>
									<p>by Stellawil vari</p>
									<div class="footer-bottom">
										<a href="#"></a>
										<a href="#"></a>
										<a href="#"></a>
									</div>
								</div>
							</div>
						</li>
						 -->
					</ul>
				</section>
			</div>
		</div>
	</div>
	<!-- //team -->
	<!-- footer -->
	<div class="footer">
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
				47/24/14A Bui Dinh Tuy<br> <span>Office: 0337230123</span>
				</p>
				<div class="footer-bottom">
					<a href="https://www.facebook.com/profile.php?id=100004483834854"><span>Facebook</span></a> <a href="#"><span>Pinterest</span></a>
					<a href="#"><span>LinkedIn </span></a> <a href="#"><span>Behance</span></a>
				</div>
			</div>
			<div class="col-md-4 ftr-wthree-grids">
				<h3>Review</h3>
				<p>Spa always makes beautiful for you forever !</p>
			</div>
			<div class="clearfix"></div>
			<div class="footer-copy">
				<p>
					© 2017 Spa Care. All rights reserved | Design by <a href="#">Nguyen
						Tang Trung</a>
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