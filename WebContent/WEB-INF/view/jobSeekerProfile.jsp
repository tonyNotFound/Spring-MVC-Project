<!DOCTYPE html>
<html>
	<head>
		<title>Profile</title>
		<link rel="stylesheet" type="text/css" 
		href="${pageContext.request.contextPath}/resources/css/jobSeeker.css"/>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
	   
        <script defer src="${pageContext.request.contextPath}/resources/js/jobSeeker.js"></script>
	</head>
	<body>
       <div id="container">
			<div id="header">
					<div id="displayName">
						<h3 id="profileName">Job Seeker</h3>
					</div>
			</div>
			<!--<div id="tp">
				<h2> Hi Job Seeker</h2>
            </div>
        -->
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
        </div>


	</body>



</html>