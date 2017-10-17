    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <html>
        <head>
            <%@include file="header.jsp" %>
            <title>Add Service Line</title>
        </head>
        <body>
            <form id="updateService" action="/PartnerServices/service/serviceUpdate" method="GET">
                <table align="center">
                    <tr>
                        
                        <td>
                            <input type="hidden" name="service_id" id="service_id" value="${id}" class="form-control"/>
                        </td>  
                    </tr>
                    <tr>
                        <td>
                            Service Name
                        </td>
                        <td>
                            <input type="text" name="service_name" id="service_name" value="${service_name}" class="form-control"/>
                        </td>  
                    </tr>
                    <tr>
                        <td>
                            Service Description
                        </td>
                        <td>
                            <input type="text" name="service_desc" id="service_desc" value="${service_desc}" class="form-control" />
                        </td>  
                    </tr>
                    
                    <tr>
                    
                        <td></td>
                        <td>
                            <button id="updateService" name="updateService" class="btn btn-block btn-primary btn-lg">updateService</button>
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
        
        </html>
        
        
        <%@include file="footer.jsp" %>