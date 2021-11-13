# traditional
#  Sample Appointment Web application used for creating and viewing appointments of doctors.
This is a Java Spring boot based application . The executable jar (traditional-0.0.1-SNAPSHOT.jar) is located in the binay folder. Users can download this jar and run this in a windows machine by invoking 
<code> java -jar traditional-0.0.1-SNAPSHOT.jar </code> 
 This application comes with embedded mongodb database which can store the data. The data will be lost when the application is restarted.The application uses the following technologies
 <ul>
  <li> Spring Boot as the application runtime server with Spring MVC framwework</li>
   <li> Embedded mongo db to store the data</li>
  <li> Spring Data as the ORM to store the entity objects into the database </li>
  <li> Spring Security to configure authentication and authorization </li>
  <li> Thymeleaf temlates for passing data from HTML UI to the backend controller and vice versa </li>
  </ul>
  
  # Functionality
  This application has a default user <code> tenant_admin </code> with password <code> password </code> . You can login to this application as an administrator and then create Doctor users and appointment for a doctor with a patient for a specific date time. You can also view the current day appointments of each doctor . You can also login as the Doctor User that has been created but these users can create appointments only and cannot create other users in the system.
  
  
  # Monitoring
  For monitoring both spring boot actuator and micrometer is enabled in pom.xml and also the listDoctors contain @Timed annotation
