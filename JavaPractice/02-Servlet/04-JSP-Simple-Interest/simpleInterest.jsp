<html>
<head>
	<title>Simple Interest using JSP</title>
</head>
<body>
	<%
		String principle = request.getParameter("principle");
		String time = request.getParameter("time");
		String rate = request.getParameter("rate");

		double p = Double.parseDouble(principle);
		double t = Double.parseDouble(time);
		double r = Double.parseDouble(rate);

		double result = (p*t*r)/100;
	%>
	Principle: <%= p %>
	Time: <%= t %>
	Rate: <%= r %>
	Simple Interest: <%= result %>
</body>
</html>