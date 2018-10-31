<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<title>Login</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/login.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
	<div id="wholeContainer">
		<div id="container">
		<div id="header">
			<h2 id="headerTitle">Login
				<a id="registerURL" href="${pageContext.request.contextPath}/register">Register?</a>
			
			</h2>
			
		 </div>
		 
	 	<!--<form action="profile/profilePage" method="GET"> -->
			<form:form action="processLoginForm" modelAttribute="loginDetails" method="POST">		
				<div id="entireForm">
					<div id="formElements">
						<label class="textLabel" for="email">Email:</label>
						<form:input class="textfield" id="email" path="email"/><br/>
						<form:errors path="email" cssClass="error"/>
						<label class="textLabel" for="password">Password:</label>
						<form:password class="textfield" id="password" path="password"/><br/>
						<form:errors path="password" cssClass="error"/>
					
					</div>
				</div>
					<div class="btn-container">
					<input class="btn-submit" type="submit" name="submit" />
					</div>
			</form:form> 
		</div> 
 	</div>
 </body>
 </html>