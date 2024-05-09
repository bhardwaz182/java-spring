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