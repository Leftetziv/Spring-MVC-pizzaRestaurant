<%-- 
    Document   : pizzaResult
    Created on : Feb 10, 2021, 8:10:42 PM
    Author     : Leyteris
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result</title>
    </head>
    <body>
        <h1>Your ordered a nice pizza</h1>
        <div>
            <strong>Size: </strong> ${size.sname}
        </div>
        
        <div>
            <strong>Ingredients: </strong><br/>
            <ul>
                <c:forEach items="${ingredients}" var="ingredient">
                    <li>${ingredient}</li>
                </c:forEach>
            </ul>
        </div>
            
        <div>
            <strong>Payment Method: </strong> ${payment.pname}
        </div>
        
        <div>
            <strong>Name: </strong> ${order.customerId.cname}
        </div>
        
        <div>
            <strong>Age: </strong> ${order.customerId.cage}
        </div>
        
        <div>
            <strong>Order Date: </strong> ${order.orderDate}
        </div>

        <h2>Thank you</h2>
    </body>
</html>
