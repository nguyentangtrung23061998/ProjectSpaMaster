<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Customer</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.css"
	media="all" />
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/customer/css/login.css"
	media="all" />


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
								<h3 class="display-4">WelCome</h3>
								<p class="text-muted mb-4">Spa alway makes beauty for you!</p>
								<form action="${pageContext.request.contextPath}/customer/login"
									method="POST">
									<div class="form-group mb-3">
										<input id="inputUsername" type="text" placeholder="Username"
											name="username"
											class="form-control rounded-pill border-0 shadow-sm px-4">
									</div>
									<div class="form-group mb-3">
										<input id="inputPassword" type="password"
											placeholder="Password" name="password"
											class="form-control rounded-pill border-0 shadow-sm px-4 text-primary">
									</div>
									<div class="custom-control custom-checkbox mb-3">
										<input id="customCheck1" type="checkbox" checked
											class="custom-control-input"> <label
											for="customCheck1" class="custom-control-label">Remember
											password</label>
									</div>
									<button type="submit"
										class="btn btn-primary btn-block text-uppercase mb-2 rounded-pill shadow-sm"
										>Sign in</button>
									<div class="text-center d-flex justify-content-between mt-4">
										<p>
											Resigter <a
												href="${pageContext.request.contextPath}/customer/sign-up"
												class="font-italic text-muted"> <u>customer</u></a>
										</p>
									</div>
								</form>
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