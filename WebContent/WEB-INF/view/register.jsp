<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<title>Register</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/register.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
	<div id="wholeContainer">
		<div id="container">
			<h2 id="header">Registration</h2>
			<!--<form action="profile/profilePage" method="GET"> -->
			<form:form action="profile/profilePage" modelAttribute="*">
			
				<div id="form">
					<label for="firstname">First name:</label> 
					<form:input class="textfield" id="firstname" path="firstname"/><br/>
				    <label for="lastname">Last name:</label> 
					<form:input class="textfield" id="lastname" path="lastname"/><br/>
					<label for="email">Email:</label>
					<form:input class="textfield" id="email" path="email"/><br/>
					<label for="password">Password:</label>
					<form:password class="textfield" id="password" path="password"/><br/>	
					<div id="countryDropdown">
						<label for="country">Country:</label> 
						<form:select id="country" path="country">
							<form:option value="USA" label="USA"/>
							<form:option value="Canada" label="Canada"/>
							<form:option value="India" label="India"/>
							<form:option value="Germany" label="Germany"/>
							<form:option value="Ireland" label="Ireland"/>
						    <form:option value="Russia" label="Russia"/>
						</form:select>
						<!--  -
						<select id="country" name="country">
							<option value="USA">USA</option>
							<option value="Canada">Canada</option>
							<option value="Germany">Germany</option>
							<option value="Ireland">Ireland</option>
							<option value="India">India</option>
							<option value="Russia">Russia</option>
						</select>
						-->
					</div>
					<div id="typeAccountRadio">
						<label for="typeOfAccount">Type of Account:</label>
						<ul id="account">
							<li>
								<ul class="para-radio">
									<li>
								 		<form:radiobutton id="typeOfAccount" path="userType" value="jobSeeker"/>
						    		</li>
									<li class="para"><p>Job Seeker</p></li>
									</ul>
							</li>
							<li>
								<ul class="para-radio">
									<li>
										<form:radiobutton path="userType" value="recruiter"/>
									</li>
									<li class="para"><p>Recruiter</p></li>
								</ul>
							</li>
						</ul>
					</div>
					<div id="terms">
						<ul id="termsCheckbox">
							<li>
								<form:checkbox path="terms" value="checked"/>
							</li>
							<li>
								<p>I agree to the terms and condition</p>
							</li>
						</ul>
					</div>
					<input class="btn-submit" type="submit" name="submit" />
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>