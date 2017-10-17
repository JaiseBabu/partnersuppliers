    <%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 
        <html>
        <head>
        	
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            
        </head>
       
        	<body>
        	
        	
        			 
        		<table border="1">
        			<tr>
        			    
        				<th>Product</th>
        				<th>Update/Remove</th>
        			</tr>
        		
        			<c:forEach var="user" items="${liste}">
        				<tr>
        					
        					<td>
        						<p>${user.product}</p> 
        					</td>
        			<!-- 		<td>
        						<form action="/PartnerServices/partner/update/${user.id}/${user.service_id}/${user.partner_name}/${user.partner_desc}"
        							method=GET>
        							<button name="Update">
        								Update
        							</button>
        						</form>
        						<form action="/PartnerServices/partner/remove/${user.id}"
        							method=GET>
        							<button name="Remove">
        								Remove
        							</button>
        						</form>
        					</td>
        					<td>
        						<form action="/PartnerServices/products/${user.id}"
        							method=GET>
        							<button name="Remove">
        								Services
        							</button>
        						</form>
        					</td>
        					-->
        				</tr> 
        			</c:forEach>
        		</table> 		
          </body>
          </html>		





