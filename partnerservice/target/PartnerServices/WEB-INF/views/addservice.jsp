    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <html>
        <head>
            <%@include file="header.jsp" %>
            <title>Add Service Line</title>
        </head>
        <body>
            <form id="addService" action="/PartnerServices/service/serviceAdd" method="GET">
                <table align="center">
                    
                    <tr>
                        <td>
                            Service Name
                        </td>
                        <td>
                            <input type="text" name="service_name" id="service_name" class="form-control"  />
                        </td>  
                    </tr>
                    <tr>
                        <td>
                            Service Description
                        </td>
                        <td>
                            <input type="text" name="service_desc" id="service_desc" class="form-control"   />
                        </td>  
                    </tr>
                    <tr>
                    
                        <td></td>
                        <td>
                            <button id="addService" name="addService" class="btn btn-block btn-primary btn-lg" >addService</button>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><a href="/PartnerServices/homepage">Home</a>
                        </td>
                    </tr>
                    
                   
                </table>
            </form>
            
            
        </body>
        <%@include file="footer.jsp" %>
        </html>