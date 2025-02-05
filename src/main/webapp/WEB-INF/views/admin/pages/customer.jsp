<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<base href="${pageContext.servletContext.contextPath }/">
<title>Manager Customer</title>

<!-- Custom fonts for this template -->

<link href="resources/admin/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="resources/admin/css/style.css" rel="stylesheet">
<link href="resources/admin/css/styleversion.css" rel="stylesheet">

<!-- Custom styles for this page -->
<link
	href="resources/admin/vendor/datatables/dataTables.bootstrap4.min.css"
	rel="stylesheet">

</head>

<body id="page-top">

	<!-- Page Wrapper -->
	<div id="wrapper">

		<!-- Sidebar -->
		<ul
			class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
			id="accordionSidebar">

			<!-- Sidebar - Brand -->
			<a
				class="sidebar-brand d-flex align-items-center justify-content-center"
				href="index.html">
				<div class="sidebar-brand-icon rotate-n-15">
					<i class="fas fa-laugh-wink"></i>
				</div> <!-- <div class="sidebar-brand-text mx-3">SB Admin <sup>2</sup></div> -->
				<div class="sidebar-brand-text mx-3">Spa Care</div>
			</a>


			<!-- Heading -->
			<div class="sidebar-heading">Information</div>


			<!-- Nav Item - Tables -->
			<li class="nav-item"><a class="nav-link"
				href="admin/appointment"> <i class="fas fa-fw fa-table"></i> <span>Appointment</span>
			</a></li>

			<li class="nav-item active"><a class="nav-link"
				href="admin/customer"> <i class="fas fa-user-tag"></i><span>Manager
						Customer</span></a></li>

			<li class="nav-item"><a class="nav-link" href="admin/service">
					<i class="fas fa-book"></i> <span>Manager Service</span>
			</a></li>
			<li class="nav-item"><a class="nav-link" href="admin/employee">
					<i class="fas fa-user"></i> <span>Manager Employee</span>
			</a></li>

			<!-- Divider -->
			<hr class="sidebar-divider d-none d-md-block">

			<!-- Sidebar Toggler (Sidebar) -->
			<div class="text-center d-none d-md-inline">
				<button class="rounded-circle border-0" id="sidebarToggle"></button>
			</div>

		</ul>
		<!-- End of Sidebar -->

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">

				<!-- Topbar -->
				<nav
					class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

					<!-- Sidebar Toggle (Topbar) -->
					<button id="sidebarToggleTop"
						class="btn btn-link d-md-none rounded-circle mr-3">
						<i class="fa fa-bars"></i>
					</button>

					<!-- Topbar Search -->
					<form
						class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
						<div class="input-group">
							<input type="text" class="form-control bg-light border-0 small"
								placeholder="Search for..." aria-label="Search"
								aria-describedby="basic-addon2">
							<div class="input-group-append">
								<button class="btn btn-primary" type="button">
									<i class="fas fa-search fa-sm"></i>
								</button>
							</div>
						</div>
					</form>

					<!-- Topbar Navbar -->
					<ul class="navbar-nav ml-auto">

						<!-- Nav Item - Search Dropdown (Visible Only XS) -->
						<li class="nav-item dropdown no-arrow d-sm-none"><a
							class="nav-link dropdown-toggle" href="#" id="searchDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <i class="fas fa-search fa-fw"></i>
						</a> <!-- Dropdown - Messages -->
							<div
								class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in"
								aria-labelledby="searchDropdown">
								<form class="form-inline mr-auto w-100 navbar-search">
									<div class="input-group">
										<input type="text"
											class="form-control bg-light border-0 small"
											placeholder="Search for..." aria-label="Search"
											aria-describedby="basic-addon2">
										<div class="input-group-append">
											<button class="btn btn-primary" type="button">
												<i class="fas fa-search fa-sm"></i>
											</button>
										</div>
									</div>
								</form>
							</div></li>

						<!-- Nav Item - Alerts -->
						<li class="nav-item dropdown no-arrow mx-1"><a
							class="nav-link dropdown-toggle" href="#" id="alertsDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <i class="fas fa-bell fa-fw"></i> <!-- Counter - Alerts -->
								<span class="badge badge-danger badge-counter">3+</span>
						</a> <!-- Dropdown - Alerts -->
							<div
								class="dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in"
								aria-labelledby="alertsDropdown">
								<h6 class="dropdown-header">Alerts Center</h6>
								<a class="dropdown-item d-flex align-items-center" href="#">
									<div class="mr-3">
										<div class="icon-circle bg-primary">
											<i class="fas fa-file-alt text-white"></i>
										</div>
									</div>
									<div>
										<div class="small text-gray-500">December 12, 2019</div>
										<span class="font-weight-bold">A new monthly report is
											ready to download!</span>
									</div>
								</a> <a class="dropdown-item d-flex align-items-center" href="#">
									<div class="mr-3">
										<div class="icon-circle bg-success">
											<i class="fas fa-donate text-white"></i>
										</div>
									</div>
									<div>
										<div class="small text-gray-500">December 7, 2019</div>
										$290.29 has been deposited into your account!
									</div>
								</a> <a class="dropdown-item d-flex align-items-center" href="#">
									<div class="mr-3">
										<div class="icon-circle bg-warning">
											<i class="fas fa-exclamation-triangle text-white"></i>
										</div>
									</div>
									<div>
										<div class="small text-gray-500">December 2, 2019</div>
										Spending Alert: We've noticed unusually high spending for your
										account.
									</div>
								</a> <a class="dropdown-item text-center small text-gray-500"
									href="#">Show All Alerts</a>
							</div></li>

						<!-- Nav Item - Messages -->
						<li class="nav-item dropdown no-arrow mx-1"><a
							class="nav-link dropdown-toggle" href="#" id="messagesDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <i class="fas fa-envelope fa-fw"></i>
								<!-- Counter - Messages --> <span
								class="badge badge-danger badge-counter">7</span>
						</a> <!-- Dropdown - Messages -->
							<div
								class="dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in"
								aria-labelledby="messagesDropdown">
								<h6 class="dropdown-header">Message Center</h6>
								<a class="dropdown-item d-flex align-items-center" href="#">
									<div class="dropdown-list-image mr-3">
										<img class="rounded-circle"
											src="https://source.unsplash.com/fn_BT9fwg_E/60x60" alt="">
										<div class="status-indicator bg-success"></div>
									</div>
									<div class="font-weight-bold">
										<div class="text-truncate">Hi there! I am wondering if
											you can help me with a problem I've been having.</div>
										<div class="small text-gray-500">Emily Fowler · 58m</div>
									</div>
								</a> <a class="dropdown-item d-flex align-items-center" href="#">
									<div class="dropdown-list-image mr-3">
										<img class="rounded-circle"
											src="https://source.unsplash.com/AU4VPcFN4LE/60x60" alt="">
										<div class="status-indicator"></div>
									</div>
									<div>
										<div class="text-truncate">I have the photos that you
											ordered last month, how would you like them sent to you?</div>
										<div class="small text-gray-500">Jae Chun · 1d</div>
									</div>
								</a> <a class="dropdown-item d-flex align-items-center" href="#">
									<div class="dropdown-list-image mr-3">
										<img class="rounded-circle"
											src="https://source.unsplash.com/CS2uCrpNzJY/60x60" alt="">
										<div class="status-indicator bg-warning"></div>
									</div>
									<div>
										<div class="text-truncate">Last month's report looks
											great, I am very happy with the progress so far, keep up the
											good work!</div>
										<div class="small text-gray-500">Morgan Alvarez · 2d</div>
									</div>
								</a> <a class="dropdown-item d-flex align-items-center" href="#">
									<div class="dropdown-list-image mr-3">
										<img class="rounded-circle"
											src="https://source.unsplash.com/Mv9hjnEUHR4/60x60" alt="">
										<div class="status-indicator bg-success"></div>
									</div>
									<div>
										<div class="text-truncate">Am I a good boy? The reason I
											ask is because someone told me that people say this to all
											dogs, even if they aren't good...</div>
										<div class="small text-gray-500">Chicken the Dog · 2w</div>
									</div>
								</a> <a class="dropdown-item text-center small text-gray-500"
									href="#">Read More Messages</a>
							</div></li>

						<div class="topbar-divider d-none d-sm-block"></div>

						<!-- Nav Item - User Information -->
						<li class="nav-item dropdown no-arrow"><a
							class="nav-link dropdown-toggle" href="#" id="userDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <span
								class="mr-2 d-none d-lg-inline text-gray-600 small">Trung</span>
								<img class="img-profile rounded-circle"
								src="https://source.unsplash.com/QAB-WJcbgJk/60x60">
						</a> <!-- Dropdown - User Information -->
							<div
								class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
								aria-labelledby="userDropdown">
								<a class="dropdown-item" href="admin/login"> <i
									class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
									Logout
								</a>
							</div></li>

					</ul>

				</nav>
				<!-- End of Topbar -->

				<!-- Begin Page Content -->
				<div class="container-fluid">

					<!-- Page Heading -->
					<h1 class="h3 mb-2 text-gray-800">Customer</h1>

					<!-- DataTales Example -->
					<div class="card shadow mb-4">
						<div class="card-header py-3">
							<div class="customer-title">
								<h6>Information customer</h6>
								<button data-toggle="modal" data-target="#addCus">+</button>
							</div>
							<div class="card-body">
								<div class="table-responsive">
									<table class="table table-bordered" id="dataTable" width="100%"
										cellspacing="0">
										<thead>
											<tr>
												<th>#</th>
												<th>Username</th>
												<th>Password</th>
												<th>Email</th>
												<th>Telephone</th>
												<th>Action</th>
											</tr>
										</thead>

										<tbody>
											<c:forEach var="c" varStatus="index" items="${listCus}">
												<c:url var="updateLink"
													value="/admin/customer/update/${c.id }">
													<c:param name="customerId" value="${c.id}" />
												</c:url>
												<c:url var="deleteLink" value="/admin/customer/delete">
													<c:param name="customerId" value="${c.id}" />
												</c:url>

												<tr>
													<td>${index.count}</td>
													<td>${c.username}</td>
													<td>${c.password}</td>
													<td>${c.email}</td>
													<td>${c.telephone}</td>
													<td><a data-toggle="modal" data-target="#editCus"
														onclick="updateCustomer(${c.id})">Update</a> <a
														href="${deleteLink}">Delete</a></td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
						</div>

					</div>
					<!-- /.container-fluid -->

				</div>
				<!-- End of Main Content -->

				<!-- Footer -->
				<footer class="sticky-footer bg-white">
					<div class="container my-auto">
						<div class="copyright text-center my-auto">
							<span>Copyright &copy; Your Website 2019</span>
						</div>
					</div>
				</footer>
				<!-- End of Footer -->

			</div>
			<!-- End of Content Wrapper -->

		</div>
		<!-- End of Page Wrapper -->

		<!-- Scroll to Top Button-->
		<a class="scroll-to-top rounded" href="#page-top"> <i
			class="fas fa-angle-up"></i>
		</a>

		<!-- Logout Modal-->
		<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
			aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="exampleModalLabel">Ready to
							Leave?</h5>
						<button class="close" type="button" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">×</span>
						</button>
					</div>
					<div class="modal-body">Select "Logout" below if you are
						ready to end your current session.</div>
					<div class="modal-footer">
						<button class="btn btn-secondary" type="button"
							data-dismiss="modal">Cancel</button>
						<a class="btn btn-primary" href="login.html">Logout</a>
					</div>
				</div>
			</div>
		</div>

		<div class="modal fade" id="addCus">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header title_header">
						<h4 class="modal-title">Customer</h4>
						<button type="button" class="close" data-dismiss="modal" x
							id="btnAddClose">&times;</button>
					</div>

					<!-- Modal body -->
					<div class="modal-body">
						<form:form
							action="${pageContext.request.contextPath}/admin/customer"
							method="POST" modelAttribute="customer">
							<div class="form-group">
								<label class="stylelabel">User name: </label>
								<form:input id="inputUsername" type="text" path="username"
									class="styleinput" />
								<form:errors path="username" cssClass="error" />
							</div>
							<div class="form-group">
								<label class="stylelabel">Password: </label>
								<form:input class="styleinput" path="password" type="text" />
								<form:errors path="password" cssClass="error" />
							</div>
							<div class="form-group">
								<label class="stylelabel">Email: </label>
								<form:input class="styleinput" path="email" type="text" />
								<form:errors path="email" cssClass="error" />
							</div>
							<div class="form-group">
								<label class="stylelabel">Telephone: </label>
								<form:input class="styleinput" path="telephone" type="text" />
								<form:errors path="telephone" cssClass="error" />
							</div>
							<div class="row m-auto">
								<button class="btn btn-primary" type="submit"
									id="btnAddCustomer">SUBMIT</button>
							</div>
						</form:form>
					</div>
				</div>
			</div>
		</div>

		<!-- Edit Customer -->
		<div class="modal fade" id="editCus">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header title_header">
						<h4 class="modal-title">Customer</h4>
						<button type="button" class="close" data-dismiss="modal" x
							id="btnAddClose">&times;</button>
					</div>

					<!-- Modal body -->
					<div class="modal-body">
						<form:form
							action="${pageContext.request.contextPath}/admin/customer/update"
							method="POST" modelAttribute="customer">

							<div class="form-group">
								<label class="stylelabel">User name: </label>
								<form:input id="inputUsernameEdit" type="text"
									placeholder="Username..." path="username" value=""
									class="styleinput" />
							</div>
							<div class="form-group">
								<label class="stylelabel">Password: </label>
								<form:input id="inputPasswordEdit" class="styleinput"
									path="password" value="" type="text" />
							</div>
							<div class="form-group">
								<label class="stylelabel">Email: </label>
								<form:input id="inputEmailEdit" class="styleinput" path="email"
									type="text" value="" />
							</div>
							<div class="form-group">
								<label class="stylelabel">Telephone: </label>
								<form:input id="inputTelephoneEdit" class="styleinput"
									path="telephone" type="text" value="" />
							</div>

							<form:input id="idUser" type="hidden" path="id" value="" />

							<!--
							<form:input id="inputTokenEdit" type="hidden" path="token"
								value="" />
							<form:input id="inputCreateByEdit" type="hidden" path="createdBy" value="" />
							<form:input id="inputModifiedByEdit" type="hidden" path="modifiedBy" value="" />
							<form:input id="inputBookingEdit" type="hidden" path="booking" value="" />
							<form:input id="inputCreatedDateEdit" type="hidden"
								path="createdDate" value="" />
							<form:input id="inputModifiedDateEdit" type="hidden"
								path="modifieddate" value="" />
							<form:input id="inputCreatedDateEdit" type="hidden" path="createdDate" value="" />
							<form:input id="inputModifiedDateEdit" type="hidden" path="modifieddate" value="" />
							<form:input id="inputCreateByEdit" type="hidden" path="createdBy" value="" />
							<form:input id="inputModifiedByEdit" type="hidden" path="modifiedBy" value="" />
							<form:input id="inputBookingEdit" type="hidden" path="booking" value="" /> -->
							<div class="row m-auto">
								<button class="btn btn-primary" type="submit" id="btnUpdate">SAVE
									CHANGES</button>
								<button class="btn btn-success" type="submit"
									id="btnAddCustomer">CANCEL</button>
							</div>
						</form:form>
					</div>
				</div>
			</div>
		</div>


		<!-- Bootstrap core JavaScript-->
		<script src="resources/admin/vendor/jquery/jquery.min.js"></script>

		<!-- 
			xử lý ajax
		 -->

		<script type="text/javascript">
		
			function updateCustomer(id){
				var urlHandle="http://localhost:8080/spa-project/customer/customers/"+id;
				var data={};
				$.ajax({
					url:urlHandle,
					type:'GET',
					success:function(data){
						this.data=data;
						showEditHandle(this.data);
						console.log(this.data);
					},
					error:function(){
						console.log("Thất bại");
					}
				})
				
				function showEditHandle(data){
					$('#inputUsernameEdit').val(data.username);
					$('#inputPasswordEdit').val(data.password);
					$('#inputEmailEdit').val(data.email);
					$('#inputTelephoneEdit').val(data.telephone);
					$('#idUser').val(data.id);
					//$('#inputModifiedDateEdit').val(data.modifieddate);
					//$('#inputTokenEdit').val(data.token);
					//$('#inputCreateByEdit').val(data.createdBy);
					//$('#inputModifiedByEdit').val(data.modifiedBy);
					//$('#inputBookingEdit').val(data.booking);
				}
			}
		</script>

		<c:if test="${modelOpen == 'yes'}">
			<script>
  		$(window).on('load',function(){
	        $('#addCus').modal('show');
	    });
  	</script>
		</c:if>

		<script
			src="resources/admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

		<!-- Core plugin JavaScript-->
		<script
			src="resources/admin/vendor/jquery-easing/jquery.easing.min.js"></script>

		<!-- Custom scripts for all pages-->
		<script src="resources/admin/js/sb-admin-2.min.js"></script>

		<!-- Page level plugins -->
		<script
			src="resources/admin/vendor/datatables/jquery.dataTables.min.js"></script>
		<script
			src="resources/admin/vendor/datatables/dataTables.bootstrap4.min.js"></script>

		<!-- Page level custom scripts -->
		<script src="resources/admin/js/demo/datatables-demo.js"></script>
</body>

</html>
