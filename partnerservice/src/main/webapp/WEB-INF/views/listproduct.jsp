    <%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 
        <html>
        <head>
        	<%@include file="header.jsp" %>
            
        </head>
       
        	<body>
        	
        	
        			 
        		<table border="1">
        			<tr>
        			    
        				<th>Services Offered</th>
        				<th>Update/Remove</th>
        			</tr>
        		
        			<c:forEach var="user" items="${liste}">
        				<tr>
        					
        					<td>
        						<p>${user.product}</p> 
        					</td>
        					<td>
        						<form action="/PartnerServices/product/update/${user.id}/${user.partner_id}/${user.product}"
        							method=GET>
        							<button name="Update" class="btn btn-primary btn-block btn-flat">
        								Update
        							</button>
        						</form>
        						<form action="/PartnerServices/product/remove/${user.id}"
        							method=GET>
        							<button name="Remove" class="btn btn-block btn-danger btn-flat">
        								Remove
        							</button>
        						</form>
        					</td>
        				</tr>
        			</c:forEach>
        		</table> 		
          </body>
          <%@include file="footer.jsp" %>
          </html>		





