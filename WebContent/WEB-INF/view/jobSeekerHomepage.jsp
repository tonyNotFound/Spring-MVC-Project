<!DOCTYPE html>
<html>
	<head>
		<title>Profile</title>
		<link rel="stylesheet" type="text/css" 
		href="${pageContext.request.contextPath}/resources/css/jobSeekerHomepage.css"/>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
	   
        <script defer src="${pageContext.request.contextPath}/resources/js/jobSeeker.js"></script>
	</head>
	<body>
       <div id="container">
			<jsp:include page="/WEB-INF/view/jobSeekerHeader.jsp"/>
		
            <div id="wholeContent">
                <div id="experience">
                        <div class="headerTitles">
                            <h4 class="title">Exeperience</h4>
                            <button id="btn-add" class="open-Popup collapsible-btn" name="add">Add</button>
                        </div>

                        
                        <div id="expList">
                             <ul id="addExperience">
                                <li>
                                    <div class="positionHeader">
                                        <h4 class="titleExp">Software Developer</h4>
                                        <button id="btn-edit" class="btn" name="edit">Edit</button>
                                        <button id="btn-show" class="collapsible-btn" name="show">Show</button>
                                        <textarea class="textEx" type="textarea" name="experience" readonly></textarea>

                                    </div>

                                </li>
                             </ul>

                        </div>

                    

                    </div>








            </div>
            <jsp:include page="/WEB-INF/view/footer.jsp"/>
        </div>


	</body>



</html>