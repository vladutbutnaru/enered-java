<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<%
boolean ok =false;
Cookie[] cookies = request.getCookies();
if(cookies !=null){
for(Cookie cookie : cookies){
    if(cookie.getName().equals("jsid")){
    	response.sendRedirect("home.jsp");  
    	ok = true;	
    }
}
}

%>



<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="WebAuthServlet" method="post">
<input type="text" name="u"/><br>
<input type="password" name="p"/><br>
<input type="Submit" value="Login"/>

</form>
</body>
</html>