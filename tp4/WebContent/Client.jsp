<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="c" class="modeles.ClientBean" scope="session"></jsp:useBean>
<jsp:getProperty property="nom" name="c"/>
<jsp:getProperty property="prenom" name="c"/>
<jsp:getProperty property="adresse" name="c"/>
<jsp:getProperty property="tel" name="c"/>
<jsp:getProperty property="email" name="c"/>
</body>
</html>