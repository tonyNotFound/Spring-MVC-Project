<!DOCTYPE html>
<html>
	<head>
	<link rel="stylesheet" type="text/css" 
		href="${pageContext.request.contextPath}/resources/css/jobSeekerHeader.css"/>
	</head>
	<body>
	 	<div id="header">
					<div id="displayName">
						<h3 id="profileName">${jobSeekerDetails.firstName}</h3>
					</div>
					 <div id="links" class="header-link">
                        <a class="alink" href="${pageContext.request.contextPath}/homepage/jobSeeker">Home</a>
                        <a class="alink" href="${pageContext.request.contextPath}/homepage/jobSeekerProfile">Profile</a>
                        <a class="alink" href="${pageContext.request.contextPath}/homepage/jobs">Jobs</a>
                    </div>
		</div>
	</body>
</html>
