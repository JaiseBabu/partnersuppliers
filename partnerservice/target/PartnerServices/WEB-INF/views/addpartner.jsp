    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <html>
        <head>
           <%@include file="header.jsp" %>
            <title>Add Service Line</title>
        </head>
        <body>
            <form id="addPartner" action="/PartnerServices/partner/partnerAdd" method=GET>
                <table align="center">
                	  
                    <tr>
                        <td>
                            <input type="hidden" name="service_id" id="service_id" value="${service_id}"/>
                        </td>  
                    </tr>
                    <tr>
                        <td>
                            Partner Name
                        </td>
                        <td>
                            <input type="text" name="partner_name" id="partner_name" class="form-control" />
                        </td>  
                    </tr>
                    <tr>
                        <td>
                            Partner Description
                        </td>
                        <td>
                            <input type="text" name="partner_desc" id="partner_desc"class="form-control" />
                        </td>  
                    </tr>
                    <tr>
                    
                        <td></td>
                        <td>
                            <button id="addPartner" name="addPartner" class="btn btn-block btn-primary btn-lg" >addPartner</button>
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