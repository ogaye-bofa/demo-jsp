# demo-jsp

Tried multiple packing on different hello.jsp (same name different messages)

## Local testing
gradle clean build
java -jar build/libs/demo-jsp-0.0.1-SNAPSHOT.jar

http://localhost:8080/demo-jsp/restcontroller/hello
 test a vanilla rest endpoint first
http://localhost:8080/demo-jsp/hello.jsp
  a jsp will come up
http://localhost:8080/demo-jsp/controller/view
  a jsp will come up

## Local testing on container: docker
docker build -t demo-jsp .   
docker run -p8080:8080 --name demo-jsp  demo-jsp
http://localhost:8080/demo-jsp/restcontroller/hello
test first the vanilla rest endpoint on docker, still working
http://localhost:8080/demo-jsp/hello.jsp
 jsp not found, error
http://localhost:8080/demo-jsp/controller/view
 jsp not found, error

Known issue around jsp with embedded tomcat and archived as jar file. Issue with Jasper, Tomcat, and Docker?
No problem when using a war archive
Ref:
https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#web.servlet.embedded-container.jsp-limitations
https://huongdanjava.com/configure-jsp-views-in-internalresourceviewresolver-with-spring-boot-jar-file.html
https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#web.servlet.embedded-container.jsp-limitations

Also:
See the Servlet on Spring Boot and Struts on Spring Boot cookbooks

Omar

