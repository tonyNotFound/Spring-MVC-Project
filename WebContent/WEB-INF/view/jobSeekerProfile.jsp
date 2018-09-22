<!DOCTYPE html>
<html>
	<head>
		<title>Profile</title>
		<link rel="stylesheet" type="text/css" 
		href="${pageContext.request.contextPath}/resources/css/jobSeekerProfile.css"/>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
	   
	</head>
	<body>
	     <div id="container">
			<jsp:include page="/WEB-INF/view/jobSeekerHeader.jsp"/>
			<h3>${jobSe }</h3>
			<jsp:include page="/WEB-INF/view/footer.jsp"/>
		</div>
	</body>
	</html>