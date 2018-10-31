<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
	<link rel="stylesheet" type="text/css" 
		href="${pageContext.request.contextPath}/resources/css/jobSeekerHeader.css"/>
	</head>
	<body>
	 	<div id="header">
					<div id="displayName">
						<c:set var="jobSeeker" value="${jobSeekerDetails}"></c:set>
						<c:set var = "jobSeekerName" value="${jobSeeker.firstName}"/>
						<h3 id="profileName">${jobSeekerName}</h3>
					</div>
					 <div id="links" class="header-link">
					 <c:url var = "homeLink" value="/homepage/jobSeeker">
					 	<c:param name="jobSeekerId" value="${jobSeeker.id}"/>
					 </c:url>
					  <c:url var ="profileLink" value="/profile/jobSeekerProfile">
					 	<c:param name="jobSeekerId" value="${jobSeeker.id}"/>
					 </c:url> 
					 <c:url var ="jobLink" value="/jobs/displayJobs">
					 	<c:param name="jobSeekerId" value="${jobSeeker.id}"/>
					 </c:url>
					 <a class="alink" href="${homeLink}">Home</a>
					 <a class="alink" href="${profileLink}">Profile</a>
					 <a class="alink" href="${jobLink}">Jobs</a>
                     <%--    <a class="alink" href="${pageContext.request.contextPath}/homepage/jobSeeker">Home</a>
                        <a class="alink" href="${pageContext.request.contextPath}/homepage/jobSeekerProfile">Profile</a>
                        <a class="alink" href="${pageContext.request.contextPath}/homepage/jobs">Jobs</a> --%>
                    </div>
		</div>
	</body>
</html>
