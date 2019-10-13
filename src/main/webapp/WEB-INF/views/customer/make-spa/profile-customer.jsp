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
								<li><a href="profile" class="link-kumya active"><span
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
	<!-- profile -customer -->
	<div id="profile-customer">
		<div class="container">
			<div class="row" style="margin-bottom: 2%">
				<h3 class="wthree-title">My profile</h3>
			</div>
			<div class="container emp-profile">
				<div class="container">
					<div class="row m-y-2">
						<!-- edit form column -->
						<div class="col-lg-4 pull-lg-8 text-xs-center">
							<img
								src="https://scontent.fsgn5-7.fna.fbcdn.net/v/t1.0-9/71228470_1347912108701571_4479324772861214720_n.jpg?_nc_cat=103&_nc_oc=AQkwk98f8awJigwvkA-3ftGMVF3jeW3ZiZg0IROJ_S9e2NbPmf_ckq-EsNTaS8hXl4c&_nc_ht=scontent.fsgn5-7.fna&oh=ff09c93078f428e78af4088805e03c11&oe=5E3D3C3D"
								class="m-x-auto img-fluid " alt="avatar" width="300px"
								height="300px" />
							<!-- <h6 class="m-t-2">Upload a different photo</h6>
							<label class="custom-file"> <input type="file" id="file"
								class="custom-file-input"> <span
								class="custom-file-control">Choose file</span>
							</label> -->
						</div>

						<div class="col-lg-8 push-lg-4 personal-info">
							<form:form role="form" action="${pageContext.request.contextPath}/customer/profile" modelAttribute="updateProfile" method="POST">
								<div class="form-group row">
									<label class="col-lg-3 col-form-label form-control-label" >Username</label>
									<div class="col-lg-9">
										<input class="form-control" path="username" readonly type="text" name="username" value="${customer.username}" style="cursor: no-drop;"  />
									</div>
								</div>
								<div class="form-group row">
									<label class="col-lg-3 col-form-label form-control-label">Password</label>
									<div class="col-lg-9">
										<form:input class="form-control" type="text" path="password" name="password" value="${customer.password }" />
									</div>
								</div>
								<div class="form-group row">
									<label class="col-lg-3 col-form-label form-control-label">Email</label>
									<div class="col-lg-9">
										<form:input class="form-control" type="email" path="email" name="email" value="${customer.email }"/>
									</div>
								</div>
								<div class="form-group row">
									<label class="col-lg-3 col-form-label form-control-label">Telephone</label>
									<div class="col-lg-9">
										<form:input class="form-control" type="phone" path="telephone" name="telephone" value="${customer.telephone }" />
									</div>
								</div>
								<div class="form-group row">
									<label class="col-lg-3 col-form-label form-control-label">Created
										Date</label>
									<div class="col-lg-9">
										<input class="form-control" type="text" name="createDate" readonly
											style="cursor: no-drop" value="${customer.createdDate }"/>
									</div>
								</div>
								<div class="form-group row">
									<label class="col-lg-3 col-form-label form-control-label">Created
										By</label>
									<div class="col-lg-9">
										<input class="form-control" type="text" readonly
											style="cursor: no-drop" value="${customer.createdBy }" />
									</div>
								</div>
								<div class="form-group row">
									<label class="col-lg-3 col-form-label form-control-label"></label>
									<div class="col-lg-9">
										<input type="reset" class="btn btn-secondary" value="Cancel" />
										<input type="submit" class="btn btn-primary"
											value="Save Changes" />
									</div>
								</div>
							</form:form>
						</div>

					</div>
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