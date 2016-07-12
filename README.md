# springmvc
Spring MVC Stub (Legacy Project)

Files to be changed when importing:
1. POM.xml (artifactId and name; 7th and 8th lines)
2. web.xml (display-name; 6th line)
3. root-context.xml (Spring ApplicationConfig) (connection profile)
4. Delete dummy object and test file
5. Fix the readme.md file to your own version

Runtime environment:
1. Java SE 8
2. Servlet 3.0
3. JSTL 1.2
4. Apache Tomcat v8.0
5. Spring Web MVC 4.2.6
6. Mybatis 3.4.0
7. Mybatis-spring 1.3.0
8. Mysql (driver included)
9. Oracle (driver included)

Test environment:
1. Junit 4.12
2. Spring Test 4.2.6

Directoy structure:
1. Spring ApplicationConfig - classpath:META-INF/spring/root-context.xml
2. Spring DispatcherServlet - /WEB-INF/spring/servlet-context.xml (i.e. from 'webapp')
3. Mybatis Global Config - classpath:META-INF/mybatis/mybatis-config.xml
4. Mybatis Mappers - classpath:META-INF/mybatis/mappers/**/*Mapper.xml (sth 'mapper')
5. log4j - classpath:log4j.xml
6. web.xml - /WEB-INF/web.xml
7. pom.xml - (project root)
8. source files - classpath (src/main/java and src/test/java)
