<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="edit" method="post">
		<input type="text" value="${modelObj.getDemoId() }" name="newuserid" readonly /><br/>
		<input type="text" value="${modelObj.getDemoName() }" name="newusername"/><br/>
		<input type="text" value="${modelObj.getDemoAddr() }" name="newuseraddr"/><br/>
		<input type="text" value="${modelObj.getDemoMail() }" name="newusermail"/><br/>
		<input type="submit" value="Register"/>
		<input type="reset" value="Cancel"/>
	</form>
</body>
</html>