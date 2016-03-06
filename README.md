## Imageright Adapter Service

This is a REST wrapper service over ImageRight v 3.5.0.1869 RPC/encoded SOAP service. 

## Prerequisites

* Java 7
* Maven 3.2

## Dependencies

* Spring Boot
* Netflix Hystrix
* Apache Axis 1.4

## How to run

you can run from your favorite IDE from the main method : `ImagerightAdapterApplication.java`

or 

you can run from maven spring boot plugin : `mvn spring-boot:run`

By default application will run on port : `8080`. but you can chage the port by changeing the property `server.port` in `application.properties` file.
## Resources

|Rosource|Location|Method|
|---|---|---|
|Get Version|/imageright/version|GET|

### Links

https://ahus1.github.io/hystrix-examples/manual.html
http://cloud.spring.io/spring-cloud-netflix/spring-cloud-netflix.html
https://www.somethingsimilar.com/2013/01/14/notes-on-distributed-systems-for-young-bloods/

