# Spring-MVC-Project

Job Portal designed using Spring MVC. User can create two types of account : Job Seeker / Recruiter. (this project is not copied from any site / courses) 

Homepage displayed after registration is based on the type of account selected. 


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


6. Created `job-portal` Schema in Database, Setted up Database Connection, Added Hibernate Congiguration
    
    Configs Added in XML file - 
    Data Source / Connection Pool config
    Hibernate Session Factory config
    Hibernate Transaction manager

7. Added JPA annotations to model / entity class 
   
    Hibernate JPA annotations (@Entity, @Table, @Id, @GeneratedValue @Column)
   
8. DAO Design Pattern

    Implemented DAO design pattern (@Repository) to encapsulate all access to the data sources.
    Controller -> DAO -> Database

9. Service Layer / Service Facade Design Pattern    
    
    Implemented an additional Service layer (@Service) between the business logic (Controller) and DAO 
    Used to intergrate data from multiple sources / DAO. 
    
    @Transactional - Begin and end/commit transactions. 
    
    Controller -> Service Layer -> DAO -> Database
    
10. Login form, Request Param, HQL

     Passing request parameter (ID in the registration table based on email and password used for login) in the URL on click        of the submit button. HQL to query database to find user id based on email / password. 
     
     Homepage is displayed with details of user using @RequestParam(id). 
     Used HQL to find the accountType based on ID. Displaying different homepages (Recruiter / JobSeeker) based on user type        selected while registering.  
 
    
    




