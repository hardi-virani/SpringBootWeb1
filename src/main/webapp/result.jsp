<%@page language="java" %>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

<%--jsp way--%>
<h2>Result is : <%= session.getAttribute("Answer")%> </h2>

<%--jsp stl way--%>
<h2> Result is: ${Answer}  </h2>

</body>
</html>

