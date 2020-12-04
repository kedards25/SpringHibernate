<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- 	<form action="edit" method="post">
		<input type="text" value="${modelObj.getDemoId() }" name="newuserid" readonly /><br/>
		<input type="text" value="${modelObj.getDemoName() }" name="newusername"/><br/>
		<input type="text" value="${modelObj.getDemoAddr() }" name="newuseraddr"/><br/>
		<input type="text" value="${modelObj.getDemoMail() }" name="newusermail"/><br/>
		<input type="submit" value="Register"/>
		<input type="reset" value="Cancel"/>
	</form> --%>
	<form:form action="edit" method="post">
		<!-- form prefix from spring form taglib helps to map
		input fields with model properties directly in the controller 
		path attribute deals with properties of model class-->
		<form:input path="demoId" value="${model.getDemoId() }"/>
		<form:input path="demoName" value="${model.getDemoId() }"/>
		<form:input path="demoAddr" value="${model.getDemoId() }"/>
		<form:input path="demoMail" value="${model.getDemoId() }"/>
		<input type="submit" value="Register"/>
	</form:form>
</body>
</html>