<%@ page language="java" contentType="text/html; charset=windows-1255"
    pageEncoding="windows-1255"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1255">
<title>Insert title here</title>
</head>
<body>
	<form action="MyServlet" method="GET">
		First name: <input type="text" name="first_name">
		<br>
		Last name: <input type="text" name="last_name">
		<br>
		<input type="submit" value="Submit">
	</form>
	<%
	String lastName = "";
	String firstName = "";
	Cookie[] requestCookies = request.getCookies();
	for (Cookie cookie : requestCookies) {
		if (cookie.getName().equals("firstName")) {
			firstName = cookie.getValue();
		}
		if (cookie.getName().equals("lastName")) {
			lastName = cookie.getValue();
		}
	}
	%>
	<table>
		<tr>
			<td>my first name: <%= firstName %></td>
		</tr>
		<tr>
			<td>my last name: <%= lastName %></td>
		</tr>
	</table>
</body>
</html>