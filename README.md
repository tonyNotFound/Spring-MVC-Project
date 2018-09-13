# Spring-MVC-Project

Job Portal designed using Spring MVC. User can create two types of account : Job Seeker / Recruiter.
Profile displayed after registration is based on the type of account selected. 



1. Configured and Set the Spring MVC Dispatcher Servlet in web.mxl to handle URL mappings. 

    Dispatcher Servlet will send the request to the specific Spring MVC controller mapped with the URL pattern. 


2. Added View Resolver, Annotation Support, Component Scanning Support, Resources Support

    View Resolver ->  When a view name is provided, View Resolver will prepend the prefix (WEB-INF/view) and append the 
    suffix (.jsp) provided, to render view. 

    Resources -> Base Directory to look for CSS and JavaScript Files. 


3. Created and Validated forms using Spring MVC tags and annotations

    Implement view using Spring MVC form taglib and form tags (input, radiobutton, checkbox, select, password) 
    to render HTML tags with specified type and bound value.

    Implement validation using Spring MVC - Hibernate Validators (@NotNull, @Size, @Min) and form tag 'errors.


4. Created Controller Classes and RequestMapping classes / methods

    @RequestMapping is used to map web request onto handler classes (creating relative paths) / methods and returns 
    specific views for the request. 


5. Added @ModelAttribute and @RedirectAttribute

    ModelAttribute is populated with data from the form submitted to the url endpoint (specified in @RequestMapping)  

    RedirectAttribute is used for redirecting attributes between controllers and uses a flashmap to store attributes.







