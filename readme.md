# Spring Boot
## Build Faster with Spring Boot DevTools

• Increase developer productivity

• Why do you need to restart the server manually for every code change?

• Remember: For pom.xml dependency changes, you will need to restart server manually

Managing App. Configuration using Profiles

• Applications have different environments: Dev, QA,

Stage, Prod, ...

• Different environments need different configuration:
	Different Databases
	Different Web Services

• How can you provide different configuration for different environments? 

	Profiles: Environment specific configuration

Simplify Deployment with Spring Boot Embedded Serve

• How do you deploy your application?

■ Step 1: Install Java

■ Step 2: Install Web/Application Server

• Tomcat/WebSphere/WebLogic etc

■ Step 3: Deploy the application WAR (Web ARchive)

• This is the OLD WAR Approach

• Complex to setup!

Embedded Server - Simpler alternative

■ Step 1: Install Java

■ Step 2: Run JAR file

■ Make JAR not WAR (Credit: Josh Long!)

■ Embedded Server Examples: • spring-boot-starter-tomcat

• spring-boot-starter-jetty

• spring-boot-starter-undertow

Monitor Applications using Spring Boot Actuator

• Monitor and manage your application in your production

• Provides a number of endpoints:

■ beans - Complete list of Spring beans in your app

■ health - Application health information

■ metrics - Application metrics

■ mappings - Details around Request Mappings



### Understanding Spring Boot vs Spring MVC vs Spring

• Spring Boot vs Spring MVC vs Spring: What's in it?

■ Spring Framework: Dependency Injection

• @Component, @Autowired, Component Scan etc..

• Just Dependency Injection is NOT sufficient (You need other frameworks to build apps) • Spring Modules and Spring Projects: Extend Spring Eco System , JUnit & Mockito for Unit Testing)

• Provide good integration with other frameworks (Hibernate/JPA ■ Spring MVC (Spring Module): Simplify building web apps and REST API

• Building web applications with Struts was very complex

• @Controller, @RestController, @RequestMapping("/courses")

■ Spring Boot (Spring Project): Build PRODUCTION-READY apps QUICKLY • Starter Projects - Make it easy to build variety of applications

• Auto configuration - Eliminate configuration to setup Spring, Spring MVC and other frameworks!

• Enable non functional requirements (NFRs): • Actuator: Enables Advanced Monitoring of applications

• Embedded Server: No need for separate application servers!

• Logging and Error Handling

• Profiles and Configuration Properties



We require model to pass anything from controller to JSP

Understanding Logging

logging.level.some.path=debug logging.level.some.other.path=error logging.file.name=logfile.log

private Logger logger = LoggerFactory.getLogger(this.getClass()); logger.info("postConstruct");

• Knowing what to log is an essential skill to be a great programmer

• Spring Boot makes logging easy

■ spring-boot-starter-logging

• Default: Logback with SLF4j