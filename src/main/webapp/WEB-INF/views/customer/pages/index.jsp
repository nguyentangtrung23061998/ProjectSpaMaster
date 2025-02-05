<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Spa Care a Beauty and Spa Category Flat bootstrap
	Responsive website Template | Home :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Spa Care Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
	Smart phone Compatible web template, free web designs for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />

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
	<div id="home" class="w3banner">
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
								<li><a href="home" class="link-kumya active scroll"><span
										data-letters="Home">Home</span></a></li>
								<li><a href="about" class="link-kumya"><span
										data-letters="About">About</span></a></li>
								<li><a href="portfolio" class="link-kumya"><span
										data-letters="Portfolio">Portfolio</span></a></li>
								<li><a href="blog" class="link-kumya"><span
										data-letters="Blog">Blog</span></a></li>
								<li><a href="contact" class="link-kumya"><span
										data-letters="Contact">Contact</span></a></li>
								<li><a href="login" class="link-kumya"><span
										data-letters="Make Beauty">Make Beauty</span></a></li>
							</ul>
							<div class="clearfix"></div>
						</div>
					</div>
				</nav>
			</div>
			<!-- //navigation -->
			<div class="banner-text">
				<!-- banner Slider starts Here -->
				<script
					src="${pageContext.request.contextPath}/resources/template/js/responsiveslides.min.js"></script>
				<script>
					// You can also use "$(window).load(function() {"
					$(function() {
						// Slideshow 3
						$("#slider3")
								.responsiveSlides(
										{
											auto : true,
											pager : true,
											nav : false,
											speed : 500,
											namespace : "callbacks",
											before : function() {
												$('.events')
														.append(
																"<li>before event fired.</li>");
											},
											after : function() {
												$('.events')
														.append(
																"<li>after event fired.</li>");
											}
										});

					});
				</script>
				<!-- //End-slider-script -->
				<div id="top" class="callbacks_container">
					<ul class="rslides" id="slider3">
						<li>
							<div class="bnr-agileinfo">
								<h2>You wanna get a new look from us</h2>
								<h3>Lorem Ipsum was popularised In sit amet sapien eros
									Integer dolore magna aliqua Temporibus autem quibusdam</h3>
								<div class="w3lsmore">
									<a href="single.html" class="button-pipaluk button--inverted">
										Read More</a>
								</div>
							</div>
						</li>
						<li>
							<div class="bnr-agileinfo">
								<h4>Quisque ornare feugiat erat sapien</h4>
								<h3>In sit amet sapien eros Integer dolore magna aliqua
									Temporibus lorem lpsum was popularised autem quibusdam</h3>
								<div class="w3lsmore">
									<a href="single" class="button-pipaluk button--inverted">
										Read More</a>
								</div>
							</div>
						</li>
						<li>
							<div class="bnr-agileinfo">
								<h4>Fusce porttitor massa turpisgrada</h4>
								<h3>Temporibus autem quibusdam Lorem Ipsum was popularised
									In sit amet sapien eros Integer dolore magna aliqua</h3>
								<div class="w3lsmore">
									<a href="single.html" class="button-pipaluk button--inverted">
										Read More</a>
								</div>
							</div>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<!-- //banner -->
	<!-- welcome -->
	<div class="welcome w3">
		<div class="container">
			<div class="col-md-5 welcome-agileleft">
				<img
					src="${pageContext.request.contextPath}/resources/template/images/img2.jpg"
					alt="" />
			</div>
			<div class="col-md-7 welcome-right">
				<h3 class="wthree-title">Welcome!</h3>
				<p>At vero eos et accusamus et iusto odio dignissimos ducimus
					qui blanditiis praesentium voluptatum</p>
				<div class="welcome-info">
					<div class="col-md-2 welcome-text w3-agiletext-left">
						<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
					</div>
					<div class="col-md-10 welcome-text w3-agiletext-right">
						<h4>Ipsum</h4>
						<p>At vero eos et accusamus et iusto odio dignissimos ducimus
							qui blanditiis praesentium voluptatum</p>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="welcome-info">
					<div class="col-md-2 welcome-text w3-agiletext-left">
						<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
					</div>
					<div class="col-md-10 welcome-text w3-agiletext-right">
						<h4>Ipsum</h4>
						<p>At vero eos et accusamus et iusto odio dignissimos ducimus
							qui blanditiis praesentium voluptatum</p>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	<!-- //welcome -->
	<!-- tabs -->
	<div class="agileits-tabs">
		<div class="container">
			<h3 class="wthree-title">Spa & Skin Care</h3>
			<div class="tabs-row">
				<div class="col-sm-3 col-md-2 tab-grid-left">
					<!-- required for floating -->
					<!-- Nav tabs -->
					<ul class="nav nav-tabs w3-agileits-tabs">
						<li class="active"><a href="#Tab1" data-toggle="tab">Facial
								Care</a></li>
						<li><a href="#Tab2" data-toggle="tab">Massage Therapy</a></li>
						<li><a href="#Tab3" data-toggle="tab">Hair Services</a></li>
					</ul>
				</div>
				<div class="col-sm-9 col-md-10 tab-grid-right">
					<!-- Tab panes -->
					<div class="tab-content">
						<div class="tab-pane active" id="Tab1">
							<div class="agileits-text">
								<div class="col-md-6 care-w3limg">
									<img
										src="${pageContext.request.contextPath}/resources/template/images/g1.jpg"
										alt="" />
								</div>
								<div class="col-md-6 care-w3text">
									<h4>Lifting Brightening Effect</h4>
									<p>Sed quia non numquam eius modi tempora incidunt ut at
										vero eos et accusamus et iusto odio dignissimos ducimus qui
										blanditiis velit, labore et dolore magnam aliquam quaerat.
										Lorem Ipsum was popularised In sit amet sapien eros Integer
										dolore magna aliqua Temporibus autem quibusdam</p>
									<div class="w3lsmore">
										<a href="single.html" class="button-pipaluk button--inverted">
											Read More</a>
									</div>
								</div>
								<div class="clearfix"></div>
							</div>
						</div>
						<div class="tab-pane" id="Tab2">
							<div class="agileits-text">
								<div class="col-md-6 care-w3limg">
									<img
										src="${pageContext.request.contextPath}/resources/template/images/g2.jpg"
										alt="" />
								</div>
								<div class="col-md-6 care-w3text">
									<h4>Aromatherapy Massage</h4>
									<p>At vero eos et accusamus et iusto odio dignissimos
										ducimus qui blanditiis velit, sed quia non numquam eius modi
										tempora incidunt ut labore et dolore magnam aliquam quaerat.
										Lorem Ipsum was popularised In sit amet sapien eros Integer
										dolore magna aliqua Temporibus autem quibusdam</p>
									<div class="w3lsmore">
										<a href="single.html" class="button-pipaluk button--inverted">
											Read More</a>
									</div>
								</div>
								<div class="clearfix"></div>
							</div>
						</div>
						<div class="tab-pane" id="Tab3">
							<div class="agileits-text">
								<div class="col-md-6 care-w3limg">
									<img
										src="${pageContext.request.contextPath}/resources/template/images/g3.jpg"
										alt="" />
								</div>
								<div class="col-md-6 care-w3text">
									<h4>Bridal & Special Hairstyles</h4>
									<p>Lorem Ipsum was popularised In sit amet sapien eros
										Integer dolore magna aliqua Temporibus autem quibusdam, At
										vero eos et accusamus et iusto odio dignissimos ducimus qui
										blanditiis velit, sed quia non numquam eius modi tempora
										incidunt ut labore et dolore magnam aliquam quaerat.</p>
									<div class="w3lsmore">
										<a href="single.html" class="button-pipaluk button--inverted">
											Read More</a>
									</div>
								</div>
								<div class="clearfix"></div>
							</div>
						</div>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!-- //tabs -->
	<!-- services -->
	<div class="services" id="services">
		<div class="container">
			<h3 class="wthree-title">Services</h3>
			<div class="servc-grids agileits-w3layouts">
				<div class="col-md-6 servc-grid">
					<div class="col-xs-3 servc-grid-left">
						<span class="glyphicon glyphicon-heart effect-1"
							aria-hidden="true"></span>
					</div>
					<div class="col-xs-9 servc-grid-right">
						<h4>Cum soluta nobis est eligendi</h4>
						<p>Itaque earum rerum hic tenetur a sapiente delectus
							reiciendis maiores alias consequatur aut</p>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="col-md-6 servc-grid">
					<div class="col-xs-3 servc-grid-left">
						<span class="glyphicon glyphicon-tree-deciduous effect-1"
							aria-hidden="true"></span>
					</div>
					<div class="col-xs-9 servc-grid-right">
						<h4>Soluta nobis est cum eligendi</h4>
						<p>Itaque earum rerum hic tenetur a sapiente delectus
							reiciendis maiores alias consequatur aut</p>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="servc-grids">
				<div class="col-md-6 servc-grid agileits-w3layouts">
					<div class="col-xs-3 servc-grid-left">
						<span class="glyphicon glyphicon-check effect-1"
							aria-hidden="true"></span>
					</div>
					<div class="col-xs-9 servc-grid-right">
						<h4>Eligendi cum soluta nobis est</h4>
						<p>Itaque earum rerum hic tenetur a sapiente delectus
							reiciendis maiores alias consequatur aut</p>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="col-md-6 servc-grid">
					<div class="col-xs-3 servc-grid-left">
						<span class="glyphicon glyphicon-info-sign effect-1"
							aria-hidden="true"></span>
					</div>
					<div class="col-xs-9 servc-grid-right">
						<h4>Nobis cum soluta est eligendi</h4>
						<p>Itaque earum rerum hic tenetur a sapiente delectus
							reiciendis maiores alias consequatur aut</p>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="servc-grids agileits-w3layouts">
				<div class="col-md-6 servc-grid">
					<div class="col-xs-3 servc-grid-left">
						<span class="glyphicon glyphicon-bed effect-1" aria-hidden="true"></span>
					</div>
					<div class="col-xs-9 servc-grid-right">
						<h4>Cum soluta nobis est eligendi</h4>
						<p>Itaque earum rerum hic tenetur a sapiente delectus
							reiciendis maiores alias consequatur aut</p>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="col-md-6 servc-grid">
					<div class="col-xs-3 servc-grid-left">
						<span class="glyphicon glyphicon-phone effect-1"
							aria-hidden="true"></span>
					</div>
					<div class="col-xs-9 servc-grid-right">
						<h4>Soluta nobis cum est eligendi</h4>
						<p>Itaque earum rerum hic tenetur a sapiente delectus
							reiciendis maiores alias consequatur aut</p>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!-- //services -->
	<!-- slid -->
	<div class="slid">
		<div class="container">
			<h3 class="wthree-title">Pricing</h3>
			<div class="slid-row w3-agileits">
				<div class="col-md-4 slid-grids">
					<h4>Massage Therapy</h4>
					<h3>$500</h3>
					<h5>4 SESSIONS</h5>
					<div class="w3lsmore">
						<a href="single.html" class="button-pipaluk button--inverted">
							Read More</a>
					</div>
				</div>
				<div class="col-md-4 slid-grids">
					<h4>Scrub & Waxing</h4>
					<h3>$800</h3>
					<h5>3 SESSIONS</h5>
					<div class="w3lsmore">
						<a href="single.html" class="button-pipaluk button--inverted">
							Read More</a>
					</div>
				</div>
				<div class="col-md-4 slid-grids">
					<h4>Facial care</h4>
					<h3>$200</h3>
					<h5>2 SESSIONS</h5>
					<div class="w3lsmore">
						<a href="single.html" class="button-pipaluk button--inverted">
							Read More</a>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!-- //slid -->
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