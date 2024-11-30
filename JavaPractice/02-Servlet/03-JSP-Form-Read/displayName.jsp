<html>
	<head>
		<title>Display Name using JSP</title>
	</head>
	<body>
		<% 
			String username = request.getParameter("username");
		%>
		User Name: <%=username %>
	</body>
</html>