# SpringBoot-Swagger-Open-Api
application.properties/yml properties
-------------------------------------
# customize the swagger-ui url :  springdoc.swagger-ui.path=/swagger-ui-contact.html
# check the api url : springdoc.paths-to-match=/contact/**
# packagesToScan for apis : springdoc.packages-to-scan=com.example.demo
 
 
# default swagger-ui url : http://localhost:8080/swagger-ui.html
 
# default swagger url(json/postman) : http://localhost:8080/v3/api-docs
 

open-api dependency
-------------------- 
<dependency>
    <groupId>org.springdoc</groupId>
	<artifactId>springdoc-openapi-ui</artifactId>
	<version>1.6.4</version>
</dependency>

sample data
------------
 
{
    "id" : "john",
    "name" : "john doe",
    "phone" : "7894561338"
}

{
    "id" : "foo",
    "name" : "foo bar",
    "phone" : "7894561458"
}

{
    "id" : "abc",
    "name" : "abc def",
    "phone" : "7894561400"
}
