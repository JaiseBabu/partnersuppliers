    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <html>
        <head>
            <%@include file="header.jsp" %>
            <title>Add Service Line</title>
        </head>
        <body>
            <form id="removeService" action="serviceRemove" method="post">
                <table align="center">
                    <tr>
                        <td>
                            Service Id
                        </td>
                        <td>
                            <input type="text" name="service_id" id="service_id" class="form-control"/>
                        </td>  
                    </tr>
                    
                    <tr>
                    
                        <td></td>
                        <td>
                            <button id="removeService" name="removeService" class="btn btn-block btn-danger btn-lg"">removeService</button>
                        </td>
                    </tr>
                    
                    
                   <!--  <tr>
                        <td>
                            <form:label path="name">name</form:label>
                        </td>
                        <td>
                            <form:input path="name" name="name" id="name" />
                        </td>
                    </tr>
                    
                        <td></td>
                        <td>
                            <form:button id="addService" name="addService">addService</form:button>
                        </td>
                    </tr>
                    <tr></tr>
                    <tr>
                        <td></td>
                        <td><a href="home.jsp">Home</a>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><a href="home.jsp">Home</a>
                        </td>
                    </tr> -->
                </table>
            </form>
        </body>
        <%@include file="footer.jsp" %>
        </html>