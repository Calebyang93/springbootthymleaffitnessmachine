# springbootthymleaffitnessmachine
This is a fitness products web application using springboot thymeleaf engine 
For running a spring boot thymeleaf java project, we follow all these different project schemes. 


Running java spring boot project with thymeleaf readme. 
This project runs on java scrping boot withy thymeleaf as the engine to run the program. 

When starting a Spring Boot + Thymeleaf project with Maven, the typical template looks like this:

1️⃣ pom.xml (basic template)
Here’s the minimum you need in your pom.xml:
https://baledung. 
https://www.thymeleaf.org/doc/tutorials/3.1/thymeleafspring.html#integrating-thymeleaf-with-spring


This is the drectory of the project:
The pom.xml is the basic template for this project. In this project we are using the pom.xml for the project. 
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="
          http://maven.apache.org/POM/4.0.0
          http://maven.apache.org/xsd/maven-4.0.0.xsd">

    <modelVersion>4.0.0</modelVersion>
    <groupId>com.example</groupId>
    <artifactId>springboot-thymeleaf-demo</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <packaging>jar</packaging>

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.2.0</version> <!-- or the latest -->
    </parent>

    <properties>
        <java.version>17</java.version>  <!-- match your JDK -->
    </properties>

    <dependencies>
        <!-- Spring Boot Web -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <!-- Thymeleaf -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-thymeleaf</artifactId>
        </dependency>

        <!-- Spring Boot Test (optional) -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <!-- Spring Boot Maven Plugin -->
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>


The project structure for this project is as follows 
springfitnesstrainingboot 
 └──
    ├── base 
        ├── src 
          ├── main
            ├── java 
                ├── com 
                 ├── artifact 
                   ├── fitness
                    ├── training 
                      ├── base 
                        ├── Baseapplication.java 
            ├── test 
                ├── java 
                  ├── com 
                    ├──  artifact 
                      ├── fitness 
                        ├── training 
                           ├──  base 
                               ├── BaseApplicationTests.java 
                               ├── TestBaseApplicationTests.java 
                               ├── TestcontainersConfiguration.java 
                               ├── template.jsp 
                            ├── target 
                              ├── classes 
                                ├── com 
                                 ├── artifact 
                                   ├── fitness 
                                     ├── training 
                                       ├── base 
                                         ├── BaseApplication.java 
                                         
    ├── .gitattributes 
    ├── .gitignore 
    ├── compose.yaml 
    ├── HELP.md 
    ├── mvnvw
    ├── mvnw.cmd 
    ├── pom.xml 
    

To check thymeleaf engine refer here: https://www.thymeleaf.org/doc
To check springboot refer here: https://docs.spring.io/spring-boot/index.html
To check maven documentation refer here: https://maven.apache.org/guides/index.html
    
 
