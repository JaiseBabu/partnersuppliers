    <%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 
        <html>
        <head>
        	<%@include file="header.jsp" %>
          
            <title>Welcome</title>
        </head>
       
        	<body>
        		<p align=justify>Service Lines</p>	 
        		<table border="1" align="left">
        			<tr>
        				<th>Service_Name</th>
        				<th>Service_Description</th>
        				<th>Select any Action</th>
        				<th>Partners</th>
        			</tr>
        		
        			<c:forEach var="user" items="${listw}">
        				<tr>
        					<td>
        						<p>${user.service_name}</p> 
        					</td>
        					<td>
        						<p>${user.service_desc}</p> 
        					</td>
        					<td>
        						<form action="/PartnerServices/service/update/${user.id}/${user.service_name}/${user.service_desc}"
        							method=GET>
        							<button name="Update" class="btn btn-primary btn-block btn-flat">
        								Update
        							</button>
        						</form>
        						<form action="/PartnerServices/service/remove/${user.id}"
        							method=GET>
        							<button name="Remove" class="btn btn-block btn-danger btn-flat">
        								Remove
        							</button>
        						</form>
        					</td>	
        					<td>
        						<form action="/PartnerServices/partners/${user.id}"
        							method=POST>
        							<button name="Partners" class="btn btn-default btn-block btn-flat">
        								Partners for Service_line
			        							</button>
			        			</form>
			        						<form action="/PartnerServices/partner/add/${user.id}"
			        				method=GET>
			        				<button name="addPartner" class="btn btn-default btn-block btn-flat">Add Partner for ${user.service_name}</button>
        						</form>
        					</td>
        				</tr>
        			</c:forEach>
					
        		</table>
        		<div>
        			<form action="/PartnerServices/service/add"
        				method=GET><div class="container">
        				<button name="addService" class="btn btn-default btn-block btn-flat">Add Service</button></div>
        			</form>
        		</div>
        		
        		
			    
			    
			   
				 
				 <%@include file="footer.jsp" %>
        		
          </body>
          </html>		





