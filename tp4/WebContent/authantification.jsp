<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Authentification</title>
</head>
<body>
<h1>Bienvenue à votre session</h1>
<jsp:useBean id="authentificationBean" type="modeles.authentificationBean" scope="session" />
<h2>Internaute de Login: </h2>
<jsp:getProperty name="authentificationBean" property=" login" />					
</body>
</html>