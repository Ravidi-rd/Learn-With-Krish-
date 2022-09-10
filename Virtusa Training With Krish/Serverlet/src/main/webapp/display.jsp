
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
String answer=request.getAttribute("Answer is").toString();

%>

<html>
<head>
    <title>Calclulator</title>
</head>
<body>
<h>Answer is : <%= answer  %></h>
<br/><br/><br/><br/>

<form method="get" action="index.jsp">
    <input type="submit" value="Go to index">

</form>

</body>
</html>
