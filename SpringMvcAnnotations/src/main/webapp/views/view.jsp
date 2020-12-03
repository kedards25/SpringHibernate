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
<!-- JSTL allows us to write java code in form of tags
with the help of Expression Language i.e. EL -->
<!-- EL is ignored by default in jsp so we need to enable it
by writing  isELIgnored="false" in @Page directive-->
<c:if test="${modelObj!=null}">
		<c:out value="${modelObj.getDemoId() }"/>
		<c:out value="${modelObj.getDemoName() }"/>
</c:if>
</body>
</html>