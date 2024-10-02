<%-- 
    Document   : index
    Created on : Oct 2, 2024, 6:58:13 AM
    Author     : Nagarjuna  13
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!--<h1>Hello World!</h1>-->
        <form method="post" action="CalculateServlet">
            <input type="text" name="txtNum1">
            <input type="text" name="txtNum2">
            <button type="submit" name="sum">Add</button>
        </form>
    </body>
</html>
