    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <html>
        <head>
            <%@include file="header.jsp" %>
            <title>Add Service Line</title>
        </head>
        <body>
            <form id="updateProduct" action="/PartnerServices/product/productUpdate" method="POST">
                <table align="center">
                    <tr>
                       
                        <td>
                            <input type="hidden" name="product_id" id="product_id" value="${id}" class="form-control"  />
                        </td> 
                    </tr>
                    <tr> 
                        <td>
                            <input type="hidden" name="partner_id" id="partner_id" value="${partner_id}" class="form-control"  />
                        </td>  
                        
                    </tr>
                    <tr>
                        <td>
                            Service
                        </td>
                        <td>
                            <input type="text" name="product" id="product" value="${product}" class="form-control" />
                        </td>  
                    </tr>
                    
                    
                    <tr>
                    
                        <td></td>
                        <td>
                            <button id="updateProduct" name="updateProduct" class="btn btn-block btn-primary btn-lg">updateProduct</button>
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
        