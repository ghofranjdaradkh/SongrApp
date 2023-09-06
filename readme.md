
# lab 11 :
 ## classes :
 Album class : contain the attributes and constructor and getter and setter.

album controller : manage the request to show three albums
to run this route use this url
http://localhost:8080/albums

Capitalize :  manage the request to capitalize any word that enter by user as @path variable
http://localhost:8080/capitalize/hello
you can change hello word to any word you want.


controller class :that have two routes :
1. hello word : http://localhost:8080/hello
2. splash page :http://localhost:8080/

 ------------------------------------------------------------------------
# LAB 12 :


. create class with entity annotation that have all properties and constructor and setter and getter method

2. create Repository interface that extending from JPA repository

3.Configure Data Source and JPA Properties:
<pre>

spring.datasource.url=jdbc:postgresql://localhost:5434/albums
spring.datasource.username=postgres
spring.datasource.password= your-password
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=create
</pre>

4. Create  controller class  where you will use the repository to perform CRUD operations. like save delete and so on , USE annotation @Autowired


5.Create Templates for Browser Display 


 