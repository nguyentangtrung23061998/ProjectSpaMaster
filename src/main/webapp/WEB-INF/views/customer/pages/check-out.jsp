<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Checkout</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.css" />
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/customer/css/checkout.css" />

</head>
<body>
	<div id="header">
		<nav
			class="navbar navbar-expand-md navbar-light bg-light border-bottom">
			<div class="container">
				<a href="#" class="navbar-brand" id="header-logo"> <img
					src="https://raw.githubusercontent.com/orbitthemes/Orbit-Themes/master/assets/logo.png"
					class="img-fluid" width="200" alt="Orbit Themes">
				</a>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarNav" aria-controls="navbarNav"
					aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarNav">
					<ul class="navbar-nav ml-auto text-center">
						<li class="nav-item active"><a class="nav-link text-dark"
							href="#">Home <span class="sr-only">(current)</span>
						</a></li>
						<li class="nav-item"><a class="nav-link text-dark" href="#">History</a>
						</li>

						<li class="nav-item"><a class="nav-link text-dark" href="#">Profile</a>
						</li>
					</ul>
				</div>
			</div>
		</nav>
	</div>

	<div id="banner">
		<div class="row">
			<div class="col-md-12 m-auto w-100 text-center">
				<p class="fa-2x text-light padding-noty margin-noty">
					<i class="fa fa-credit-card"></i>
				</p>
				<p class="fa-2x text-light padding-noty margin-noty">Checkout
					form</p>
				<p class="lead text-light padding-noty margin-noty">Spa alway
					smiles for you. We make beauty very wonderful!</p>
			</div>
		</div>
	</div>

	<div id="billing" class="w-100">
		<div class="container">
			<div class="row py-5">
				<div class="col-md-8">
					<div class="billing_addr">
						<h4 class="mb-3">Billing address</h4>
					</div>
					<div class="billing_form">
						<form class="form_bill" novalidate>
							<div class="row">
								<div class="col-md-6 mb-3">
									<label for="firstName">First name</label> <input type="text"
										class="form-control" id="firstName" required>
									<div class="invalid-feedback">Valid first name is
										required.</div>
								</div>
								<div class="col-md-6 mb-3">
									<label for="firstName">Last name</label> <input type="text"
										class="form-control" id="firstName" required>
									<div class="invalid-feedback">Valid first name is
										required.</div>
								</div>

							</div>
							<div class="mb-3">
								<label for="username">Username</label>
								<div class="input-group">
									<div class="input-group-prepend">
										<span class="input-group-text">@</span>
									</div>
									<input type="text" class="form-control" id="username"
										placeholder="Username" required>
									<div class="invalid-feedback" style="width: 100%;">Your
										username is required.</div>
								</div>
							</div>
							<div class="mb-3">
								<label for="email">Email <span class="text-muted">(Optional)</span>
								</label> <input type="text" class="form-control" id="email"
									placeholder="nguyentangtrung@gmail.com">
								<div class="invalid-feedback">Please enter a valid email
									address for shipping updates.</div>
							</div>
							<div class="mb-3">
								<label for="address">Address</label> <input type="text"
									class="form-control" id="address" placeholder="1234 Main St"
									required>
								<div class="invalid-feedback">Please enter your shipping
									address.</div>
							</div>
							<div class="mb-3">
								<label for="address2">Address 2 <span class="text-muted">(Optional)</span>
								</label> <input type="text" class="form-control" id="address2"
									placeholder="Apartment or suite">
							</div>
							<div class="row">
								<div class="col-md-5 mb-3">
									<label for="country">Country</label> <select
										class="custom-select d-block w-100" name="" id="country"
										required>
										<option value="">Choose...</option>
										<option value="">United Status</option>
									</select>
									<div class="invalid-feedback">Pleased select a valid
										country</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="status">status</label> <select
										class="custom-select d-block w-100" name="" id="state"
										required>
										<option value="">Choose..</option>
										<option value="">California</option>
									</select>
									<div class="invalid-feedback">Pleased select a valid
										state</div>
								</div>
								<div class="col-md-3 mb-3">
									<label for="zip">Zip</label> <input type="text"
										class="form-control" id="zip" required>
									<div class="invalid-feedback">Zip code required</div>
								</div>
							</div>
							<hr class="mb-4">
							<h4 class="mb-3">Payment</h4>

							<div class="d-block my-3">
								<div class="custom-control custom-radio">
									<input id="credit" name="paymentMethod" type="radio"
										class="custom-control-input" checked required> <label
										class="custom-control-label" for="credit">Credit card</label>
								</div>
								<div class="custom-control custom-radio">
									<input id="debit" name="paymentMethod" type="radio"
										class="custom-control-input" required> <label
										class="custom-control-label" for="debit">Debit card</label>
								</div>
								<div class="custom-control custom-radio">
									<input id="paypal" name="paymentMethod" type="radio"
										class="custom-control-input" required> <label
										class="custom-control-label" for="paypal">Paypal</label>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6 mb-3">
									<label for="cc-name">Name on card</label> <input type="text"
										class="form-control" id="cc-name" placeholder="" required>
									<small class="text-muted">Full name as displayed on
										card</small>
									<div class="invalid-feedback">Name on card is required</div>
								</div>
								<div class="col-md-6 mb-3">
									<label for="cc-number">Credit card number</label> <input
										type="text" class="form-control" id="cc-number" placeholder=""
										required>
									<div class="invalid-feedback">Credit card number is
										required</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-3 mb-3">
									<label for="cc-expiration">Expiration</label> <input
										type="text" class="form-control" id="cc-expiration"
										placeholder="" required>
									<div class="invalid-feedback">Expiration date required</div>
								</div>
								<div class="col-md-3 mb-3">
									<label for="cc-expiration">CVV</label> <input type="text"
										class="form-control" id="cc-cvv" placeholder="" required>
									<div class="invalid-feedback">Security code required</div>
								</div>
							</div>
							<hr class="mb-4">
							<button class="btn btn-primary btn-lg btn-block" type="submit">
								<i class="fa fa-credit-card"></i> Continue to checkout
							</button>

						</form>
					</div>
				</div>
				<div class="col-md-4">
					<h4 class="d-flex justify-content-between align-items-center mb-3">
						<span class="text-muted">Your cart</span> <span
							class="badge badge-secondary badge-pill">3</span>
					</h4>
					<ul class="list-group mb-3">
						<li
							class="list-group-item d-flex justify-content-between lh-condensed">
							<div>
								<h6 class="my-0">Product name</h6>
								<small class="text-muted">Brief description</small>
							</div> <span class="text-muted">$12</span>
						</li>
						<li
							class="list-group-item d-flex justify-content-between lh-condensed">
							<div>
								<h6 class="my-0">Second product</h6>
								<small class="text-muted">Brief description</small>
							</div> <span class="text-muted">$18</span>
						</li>
						<li
							class="list-group-item d-flex justify-content-between lh-condensed">
							<div>
								<h6 class="my-0">Third Item</h6>
								<small class="text-muted">Brief description</small>
							</div> <span class="text-muted">$18</span>
						</li>
						<li
							class="list-group-item d-flex justify-content-between bg-light">
							<div class="text-success">
								<h6 class="my-0">Promo code</h6>
								<small>EXAMPLECODE</small>
							</div> <span class="text-success">-$5</span>
						</li>
						<li class="list-group-item d-flex justify-content-between"><span>Total
								(USD)</span> <strong>$20</strong></li>
					</ul>
					<div class="payment-methods">
						<p class="pt-4 mb-2">Payment Options</p>
						<hr>
						<ul class="list-inline d-flex">
							<li class="mx-1 text-info"><i class="fa-2x fa fa-cc-visa"></i>
							</li>
							<li class="mx-1 text-info"><i class="fa-2x fa fa-cc-stripe"></i>
							</li>
							<li class="mx-1 text-info"><i class="fa-2x fa fa-cc-paypal"></i>
							</li>
							<li class="mx-1 text-info"><i class="fa-2x fa fa-cc-jcb"></i>
							</li>
							<li class="mx-1 text-info"><i
								class="fa-2x fa fa-cc-discover"></i></li>
							<li class="mx-1 text-info"><i class="fa-2x fa fa-cc-amex"></i>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div id="footer">
		<h3>
			Made with <i class="fa fa-heart"></i> By <a target="_blank"
				title="Orbit Themes" href="http://www.orbitthemes.com">Nguyễn
				Tăng Trung</a> &copy; <span id="currentYear"></span> All Rights
			Reserved.
		</h3>
		<div class="social">
			<a traget="_blank" href="https://facebook.com/orbitthemes"
				title="facebook"> <i class="fa fa-facebook"></i>
			</a> <a traget="_blank" href="https://twitter.com/orbitthemes"
				title="twitter"> <i class="fa fa-twitter"></i>
			</a> <a traget="_blank" href="https://plus.google.com/+orbitthemes"
				title="Google+" target="_blank"> <i class="fa fa-google-plus"></i>
			</a> <a traget="_blank" href="https://github.com/orbitthemes"
				title="github" target="_blank"> <i class="fa fa-github"></i>
			</a> <a traget="_blank" href="https://www.behance.net/orbitthemes"
				title="Behance" target="_blank"> <i class="fa fa-behance"></i>
			</a> <a traget="_blank" href="https://dribbble.com/orbitthemes"
				title="Dribbble" target="_blank"> <i class="fa fa-dribbble"></i>
			</a> <a traget="_blank" href="https://www.pinterest.com/orbitThemes/"
				title="Pinterest" target="_blank"> <i class="fa fa-pinterest"></i>
			</a> <a traget="_blank" href="https://www.reddit.com/user/orbitthemes"
				title="Reddit" target="_blank"> <i class="fa fa-reddit"></i>
			</a> <a traget="_blank" href="https://orbitthemes.com/blog/" title="RSS"
				target="_blank"> <i class="fa fa-rss"></i>
			</a>
		</div>
	</div>

	<script
		src="${pageContext.request.contextPath}/resources/bootstrap/js/jquery.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/bootstrap/js/popper.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>