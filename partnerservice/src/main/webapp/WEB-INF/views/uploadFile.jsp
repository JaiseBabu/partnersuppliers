<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="header.jsp" %>
<title>Insert title here</title>
</head>
<body>
    <div align="center">
        <h1>Upload your file here</h1>
        <form method="post" action="doUpload" enctype="multipart/form-data">
            <table>
                <tr>
                    <td>Select file:</td>
                    <td><input type="file" name="fileUpload" size="50" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Upload" name="submit"/></td>
                </tr>
            </table>
        </form>
    </div>
</body>
<%@include file="footer.jsp" %>
</html>