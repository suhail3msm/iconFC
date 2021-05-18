<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Supplier Registration</title>
<script src="https://kit.fontawesome.com/10b1433d55.js"
	crossorigin="anonymous"></script>
<style>
* {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
	font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
}

table {
	margin-left: 70px;
}

body {
	align-items: center;
	background: #f6f5f7;
	color: rgba(0, 0, 0, 0.8);
	display: grid;
	font-family: "Montserrat", sans-serif;
	font-size: 14px;
	font-weight: 400;
	height: 100vh;
	justify-items: center;
	font-weight: 100vw;
}

.signup-container {
	display: grid;
	border-radius: 10px;
	grid-template-areas: "left right";
	max-width: 1000px;
	box-shadow: 0 14px 28px rgba(0, 0, 0, 0.25), 0 10px 10px
		rgba(0, 0, 0, 0.22);
}

.left-container {
	background-image: linear-gradient(to right, rgb(124, 45, 189),
		rgb(145, 49, 224));
	overflow: hidden;
	padding: 40px 0 0 0;
	position: relative;
	text-align: center;
	width: 300px;
	border-bottom-left-radius: 10px;
	border-top-left-radius: 10px;
}

.left-container h1 {
	color: rgba(0, 0, 0, 0.8);
	display: inline-block;
	font-size: 24px;
}

.left-container .user {
	text-align: center;
	color: white;
}

.left-container .user button {
	margin-top: 30px;
	border-radius: 20px;
	border: 1px solid white;
	background-color: transparent;
	color: white;
	font-size: 12px;
	font-weight: bold;
	padding: 12px 45px;
	letter-spacing: 1px;
	text-transform: uppercase;
	transition: transform 80ms ease-in;
}

.left-container .user button:hover {
	background-color: rgba(0, 0, 0, 0.767);
	cursor: pointer;
}

.left-container i {
	font-size: 90px;
	margin-top: 100px;
	color: white;
}

.right-container {
	background: white;
	display: grid;
	grid-template-areas: "." ".";
	width: 700px;
	border-bottom-right-radius: 10px;
	border-top-right-radius: 10px;
}

.right-container h1:nth-of-type(1) {
	color: rgba(0, 0, 0, 0.8);
	font-size: 28px;
	font-weight: 600;
}

.right-container .set {
	display: flex;
	justify-content: space-between;
	margin: 5px 0;
}

.right-container input, .right-container select {
	border: 1px solid rgba(0, 0, 0, 0.1);
	border-radius: 4px;
	height: 38px;
	line-height: 38px;
	padding-left: 5px;
	background-color: #eee;
}

.right-container input {
	color: rgba(0, 0, 0, 0.8);
}

.right-container select, .right-container input {
	width: 250px;
}

.right-container footer {
	align-items: center;
	display: grid;
	padding: 5px 90px;
}

.right-container footer button {
	border: 1px solid rgba(0, 0, 0, 0.2);
	height: 38px;
	line-height: 38px;
	width: 150px;
	border-radius: 19px;
	font-family: "Montserrat", sans-serif;
}

.right-container footer #cancel {
	background: #fff;
	transition: 0.2s all ease-in-out;
}

.right-container footer #cancel:hover {
	background: #171A2B;
	color: white;
}

.right-container footer #submit {
	background-image: linear-gradient(to right, rgb(124, 45, 189),
		rgb(145, 49, 224));
	border: 1px solid transparent;
	color: #fff;
}

.right-container footer #submit:hover {
	background: #171A2B;
}

.heading_cmny h1 span {
	font-size: 40px;
	background-color: black;
	color: white;
	padding: 10px 10px 0px 10px;
	border-top-right-radius: 20px;
	border-top-left-radius: 20px;
}

a {
	text-decoration: none;
	color: white;
}

.heading h1 a span {
	margin-left: 570px;
	padding: 5px 15px 5px 15px;
	background-color: red;
	font-size: 14px;
}
</style>
</head>
<body>
	<div class="heading">
		<h1>
			Supplier Registration <a href="index.html"><span>X</span></a>
		</h1>
	</div>
	<center>
		<p id="error" style="color: red;"></p>
		
	</center>
	<% 
	 boolean hasError = request.getParameter("error") != null;
	boolean hasSucc = request.getParameter("succ") != null;
	  if(hasError) {
          out.println("<center><p style='color: red;'>Register Failed...</p></center>");
      } 
	  if(hasSucc){
    	  out.println("<center><p style='color: green;'>Successfully Registered</p></center>");
      }
	%>
	
	<div class='signup-container'>
		<div class='left-container'>
			<div class="heading_cmny">
				<h1>
					<span>i</span>CONS FINANCE
				</h1>
			</div>
			<div class='user'>
				<i class="fas fa-handshake"></i> <br>
				<br>
				<p>Supplier already registered. please login</p>
				<a href="login.jsp"><button>Login</button></a>
			</div>
		</div>
		<div class='right-container'>
			<form action="SupplierController" method="POST"
				onsubmit='return(validate());'>
				<table cellspacing="10px">
					<tr>
						<td colspan="2">Supplier Details</td>
					</tr>
					<tr>
						<td><select id="Client_Code" name="Client_Code">
								<option value="Select Client Code">Select Client Code</option>
								<option value="--">--</option>
						</select></td>
						<td><input type="text" id="name" name="name"
							placeholder="Name"></td>

					</tr>
					<tr>
						<td><select id="city" name="city">
								<option value="Select City">Select City</option>
								<option value="--">--</option>
						</select></td>
						<td><select id="state" name="state">
								<option value="Select State">Select State</option>
								<option value="--">--</option>
						</select></td>
					</tr>
					<tr>
						<td><select id="province" name="province">
								<option value="Select Province">Select Province</option>
								<option value="--">--</option>
						</select></td>
						<td><select id="country" name="country">
								<option value="Select Country">Select Country</option>
								<option value="--">--</option>
						</select></td>
					</tr>
					<tr>
						<td><input type="email" id="email" name="email"
							placeholder="Email ID"></td>
						<td><input type="number" id="mobile" name="mobile"
							placeholder="Mobile No"></td>
					</tr>
					<tr>
						<td colspan="2"><textarea placeholder="Address"
								name="address" id="address" cols="82" rows="2"></textarea></td>

					</tr>
					<tr>
						<td colspan="2">Account Details</td>
					</tr>
					<tr>
						<td><input type="text" id="credit" name="credit"
							placeholder="Credit Account Number"></td>
						<td><input type="text" id="bank_code" name="bank_code"
							placeholder="Bank Code"></td>
					</tr>

					<tr>
						<td><input type="text" id="supplier_lmt" name="supplier_lmt"
							placeholder="Supplier Limit"></td>
						<td><select id="invoice_payment" name="invoice_payment">
								<option value="Select Invoice Payment">Select Invoice
									Payment</option>
						</select></td>
					</tr>

				</table>
				<footer>
					<div class='set'>
						<button id='submit' name="Submit">Submit</button>
						<button id='cancel'>cancel</button>
					</div>
				</footer>
			</form>
		</div>
	</div>
	<script>
		function validate() {
			var Client_Code = document.getElementById('Client_Code').value;
			var name = document.getElementById('name').value;
			var address = document.getElementById('address').value;
			var city = document.getElementById('city').value;
			var state = document.getElementById('state').value;
			var province = document.getElementById('province').value;
			var country = document.getElementById('country').value;
			var email = document.getElementById('email').value;
			var mobile = document.getElementById('mobile').value;
			var credit = document.getElementById('credit').value;

			var supplier_lmt = document.getElementById('supplier_lmt').value;
			var invoice_payment = document.getElementById('invoice_payment').value;

			if (Client_Code == "Select Client Code") {
				document.getElementById('error').innerHTML = 'Please select the Client Code';
				return false;
			} else if (name.length < 3) {
				document.getElementById('error').innerHTML = 'Name is  minimum 3 characters ';
				return false;
			} else if (name.length > 30) {
				document.getElementById('error').innerHTML = 'Name is  max 30  characters ';
				return false;
			} else if (city == "Select City") {
				document.getElementById('error').innerHTML = 'Please select the city ';
				return false;
			} else if (state == "Select State") {
				document.getElementById('error').innerHTML = 'Please select the state';
				return false;
			} else if (province == "Select Province") {
				document.getElementById('error').innerHTML = 'Please select the province';
				return false;
			} else if (country == "Select Country") {
				document.getElementById('error').innerHTML = 'Please select the country';
				return false;
			} else if (email == "" || email == null) {
				document.getElementById('error').innerHTML = 'Please enter the email';
				return false;
			} else if (mobile.length != 10 || mobile == "") {
				document.getElementById('error').innerHTML = 'Please enter the valid mobile number';
				return false;
			} else if (address == "" || address == null) {
				document.getElementById('error').innerHTML = 'Please enter the Address';
				return false;
			} else if (credit == "" || credit == null) {
				document.getElementById('error').innerHTML = 'Please enter the Loan Account Number';
				return false;
			} else if (client_limit == "" || client_limit == null) {
				document.getElementById('error').innerHTML = 'Please enter the client limit';
				return false;
			} else if (invoice_payment == "invoice_payment") {
				document.getElementById('error').innerHTML = 'Please select the Invoice Payment';
				return false;
			}
		}
	</script>
</body>
</html>