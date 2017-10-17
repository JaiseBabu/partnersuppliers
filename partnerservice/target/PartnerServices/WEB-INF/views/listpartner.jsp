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
        			    
        				<th>Partner Name</th>
        				<th>Partner Desc</th>
        				<th>Update/Remove</th>
        				<th>Services Offered</th>
        			</tr>
        		
        			<c:forEach var="user" items="${listq}">
        				<tr>
        					
        					<td>
        						<p>${user.partner_name}</p> 
        					</td>
        					<td>
        						<p>${user.partner_desc}</p> 
        					</td>
        					<td>
        						<form action="/PartnerServices/partner/update/${user.id}/${user.service_id}/${user.partner_name}/${user.partner_desc}"
        							method=GET>
        							<button name="Update" class="btn btn-primary btn-block btn-flat" >
        								Update
        							</button>
        						</form>
        						<form action="/PartnerServices/partner/remove/${user.id}"
        							method=GET>
        							<button name="Remove" class="btn btn-block btn-danger btn-xs">
        								Remove
        							</button>
        						</form>
        					</td>
        					<td>
        						<form action="/PartnerServices/products/${user.id}"
        							method=POST>
        							<button name="Remove" class="btn btn-default btn-block btn-flat">
        								Services
        							</button>
        						</form>
        						</form>
			        						<form action="/PartnerServices/product/add/${user.id}"
			        				method=GET>
			        				<button name="addPartner" class="btn btn-default btn-block btn-flat">Add Service for ${user.partner_name}</button>
        						</form>
        					</td>
        					
        				</tr>
        			</c:forEach>
        		</table> 		
          </body>
          <%@include file="footer.jsp" %>
          </html>		





