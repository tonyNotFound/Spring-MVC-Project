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
		<div id="header">
			<h2 id="headerTitle">Registration</h2>
		</div>
			<!--<form action="profile/profilePage" method="GET"> -->
			<form:form action="processRegisterForm" modelAttribute="registerDetails" method="POST">		
				<div id="entireForm">
					<div id="formElements">
				
					<label class="textLabel" for="firstname">First name:</label> 
					<!-- path -> MVC calls registerDetails.setFirstName -->
					<form:input class="textfield" id="firstname" path="firstName"/><br/>
				    <label class="textLabel" for="lastname">Last name:</label> 
					<form:input class="textfield" id="lastname" path="lastName"/><br/>
					<label class="textLabel" for="email">Email:</label>
					<form:input class="textfield" id="email" path="email"/><br/>
					<form:errors path="email" cssClass="error"/>
					<label class="textLabel" for="password">Password:</label>
					<form:errors path="password" cssClass="error"/>
					<form:password class="textfield" id="password" path="password"/><br/>
						
					<div id="countryDropdown">
						<label class="textLabel" for="country">Country:</label> 
						<form:select id="country" path="country">
							<form:option value="USA" label="USA"/>
							<form:option value="Canada" label="Canada"/>
							<form:option value="India" label="India"/>
							<form:option value="Germany" label="Germany"/>
							<form:option value="Ireland" label="Ireland"/>
						    <form:option value="Russia" label="Russia"/>
						</form:select>
					</div>
					<div id="typeAccountRadio">
						<label class="textLabel" id="accountType" for="typeOfAccount">Type of Account:</label>
						<ul id="account">
							<li>
								<label>
								<ul class="para-radio">
									<li>
								 		<form:radiobutton id="typeOfAccount" path="userType" value="jobSeeker"/>
						    		</li>
									<li class="para"><p>Job Seeker</p></li>
								</ul>
								</label>
								
							</li>
							<li>
								<label>
								<ul class="para-radio">
									<li>
										<form:radiobutton path="userType" value="recruiter"/>
									</li>
									<li class="para"><p>Recruiter</p></li>
								</ul>
								</label>
							</li>
						</ul>
					</div>
					<div id="terms">
					<label>
						<ul id="termsCheckbox">
							<li>
								<form:checkbox path="terms" value="checked"/>
							</li>
							<li>
								<p>I agree to the terms and condition</p>
							</li>
						</ul>
					</label>
					</div>
					</div>
					<div class="btn-container">
					<input class="btn-submit" type="submit" name="submit" />
					</div>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>