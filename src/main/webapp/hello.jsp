<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.Date" %>
<jsp:useBean id="currentDate" class="java.util.Date"/>

<html>
<head>
<title>Hello World</title>
</head>
<body>
  <p> Running a JSP on Spring Boot - I am under webapp.</p>
  <p>Current Date and Time:</p>
  <p>
    <jsp:getProperty name="currentDate" property="time"/>
  </p>
  <p> Format me please!</p>
</body>
</html>





