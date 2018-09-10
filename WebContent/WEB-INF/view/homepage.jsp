<!DOCTYPE html>
<html>
	<head>
		<title>Demo Homepage</title>
 		<link rel="stylesheet" type="text/css"           
     	href="${pageContext.request.contextPath}/resources/css/homepage.css">	
    </head>
	<body>
	 <div id="wholeContainer">
	  <div id="container">
			<h2 id="header">Registration Details</h2>
		<div id="form">
			<form action="*" method="GET">
				<label for="firstname">First name:</label>
				<input class="textfield" id="firstname" type="text" name="firstname"/><br/>
				<label for="lastname">Last name:</label>
				<input class="textfield" id="lastname" type="text" name="lastname"/><br/>
				<label for="email">Email:</label>
				<input class="textfield" id="email" type="email" name="email"/><br/>
				<label for="password">Enter password:</label>
				<input class="textfield" id ="password" type="password" name="password"/><br/>
				<div id="countryDropdown">
					<label for="country">Select Country:</label>
					<select id="country" name="country">
						<option value="USA">USA</option>
						<option value="Canada">Canada</option>
						<option value="Germany">Germany</option>
						<option value="Ireland">Ireland</option>
						<option value="India">India</option>
						<option value="Russia">Russia</option>	
					</select>
				</div>
				<div id="typeAccountRadio">
					<label for="typeOfAccount">Select Type of Account:</label>
					<input id="typeOfAccount" type="radio" name="userType" value="jobSeeker"> Job Seeker
					<input type="radio" name="userType" value="recruiter"> Recruiter
				</div>
				<input class="btn-submit" type="submit" name="submit"/>

			</form>
	      
		</div>
		</div>
	</div>
	</body>
</html>