<!DOCTYPE html>
<html>
<head>
<title>Demo Homepage</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/register.css">
</head>
<body>
	<div id="wholeContainer">
		<div id="container">
			<h2 id="header">Registration</h2>
			<form action="profile/profilePage" method="GET">
				<div id="form">
					<label for="firstname">First name:</label> 
					<input class="textfield" id="firstname" type="text" name="firstname" /><br /> 
					<label for="lastname">Last name:</label> 
						<input class="textfield"
						id="lastname" type="text" name="lastname" /><br /> 
						<label
						for="email">Email:</label> <input class="textfield" id="email"
						type="email" name="email" /><br /> <label for="password">Password:</label>
					<input class="textfield" id="password" type="password"
						name="password" /><br />
					<div id="countryDropdown">
						<label for="country">Country:</label> <select id="country"
							name="country">
							<option value="USA">USA</option>
							<option value="Canada">Canada</option>
							<option value="Germany">Germany</option>
							<option value="Ireland">Ireland</option>
							<option value="India">India</option>
							<option value="Russia">Russia</option>
						</select>
					</div>
					<div id="typeAccountRadio">
						<label for="typeOfAccount">Type of Account:</label>
						<ui id="account">
						<li><ui class="para-radio">
							<li><input id="typeOfAccount" type="radio" name="userType"
								value="jobSeeker" /></li>
							<li class="para"><p>Job Seeker</p></li>

							</ui></li>
						<li><ui class="para-radio">
							<li><input type="radio" name="userType" value="recruiter" /></li>
							<li class="para"><p>Recruiter</p></li>
							</ui></li>
						</ui>
					</div>
					<div id="terms">
						<ui id="termsCheckbox">
						<li><input type="checkbox" name="terms" value="checked"
							required /></li>
						<li>
							<p>I agree to the terms and condition</p>
						</li>
						</ui>
					</div>
					<input class="btn-submit" type="submit" name="submit" />
				</div>
			</form>


		</div>
	</div>
</body>
</html>