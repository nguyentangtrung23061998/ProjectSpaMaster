<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link type="text/css" rel="stylesheet"  href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.css" media="all" />
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/customer/css/login.css"  media="all" />

</head>
<body>
<div class="container-fluid">
		<div class="row no-gutter">
			<!-- The image half -->
			<div class="col-md-6 d-none d-md-flex bg-image"></div>


			<!-- The content half -->
			<div class="col-md-6 bg-light">
				<div class="login d-flex align-items-center py-5">

					<!-- Demo content-->
					<div class="container">
						<div class="row">
							<div class="col-lg-10 col-xl-7 mx-auto">
								<h3 class="display-4">Register</h3>
								<form:form action="${pageContext.request.contextPath}/customer/sign-up" method="POST" modelAttribute="customer">
									<div class="form-group mb-3">
										<form:input id="inputEmail" type="email"
											placeholder="Email..."  path="email"
											class="form-control rounded-pill border-0 shadow-sm px-4 text-primary" />
									</div>
									<div class="form-group mb-3">
										<form:input id="inputUsername" type="text"
											placeholder="Username..." path="username"
											class="form-control rounded-pill border-0 shadow-sm px-4" autocomplete="off" />
									</div>
									<div class="form-group mb-3">
										<form:input id="inputPassword" type="password"
											placeholder="Password..." path="password"
											class="form-control rounded-pill border-0 shadow-sm px-4 text-primary" />
									</div>
									<div class="form-group mb-3">
										<form:input id="inputPhone" type="phone"
											placeholder="Telephone number..." path="telephone"
											class="form-control rounded-pill border-0 shadow-sm px-4 text-primary" />
									</div>
									<button type="submit"
										class="btn btn-primary btn-block text-uppercase mb-2 rounded-pill shadow-sm">Sign
										in</button>
									<div class="text-center d-flex justify-content-between mt-4">
										<p>
											Login <a href="${pageContext.request.contextPath}/customer/login"
												class="font-italic text-muted"> <u>customer</u></a>
										</p>
									</div>
								</form:form>
							</div>
						</div>
					</div>
					<!-- End -->

				</div>
			</div>
			<!-- End -->

		</div>
	</div>
</body>
</html>