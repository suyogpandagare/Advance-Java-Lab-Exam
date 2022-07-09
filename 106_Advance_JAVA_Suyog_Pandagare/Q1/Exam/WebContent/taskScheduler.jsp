<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<table border="2">
			<h1>Schedule Task</h1>
			<form action="add" method="GET">
			<br />Enter Date : <input type="date" name="date" />
			<br /><br />Enter task : <input type="text" name="task" />
			<br /><br /><input type="submit" name="Add schedule" />
			</form>
		</table>
	</center>
</body>
</html>