<%-- 
    Document   : orderPizza
    Created on : Feb 10, 2021, 8:10:27 PM
    Author     : Leyteris
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order</title>
    </head>
    <body>
        <h1>Choose your Pizza</h1>
        <form:form modelAttribute="order" method="POST" action="${pageContext.request.contextPath}/create">
            <div>
                <h3>Choose size:</h3>
                <%--<form:radiobuttons items="${sizes}" itemValue="id" itemLabel="sname" path="${order.pizzaId.id}" />--%>
                <c:forEach items="${sizes}" var="size">
                    <input type="radio" checked name="pizzaId.sizeId.id" id="size-${size.id}" value="${size.id}" />
                    <label for="size-${size.id}">${size.sname}</label>
                    <br/>                    
                </c:forEach>  
            </div>

            <div>
                <h3>Choose ingredients:</h3>      
                <%--<form:checkboxes path="pizzaId.ingredientList"--%> 
                                 <!--items="${ingredients}"--> 
                <!--itemLabel="iname"-->
                <!--itemValue="id"/>-->
                <c:forEach items="${ingredients}" var="ingredient">
                    <input type="checkbox" name="pizzaId.ingredientList" value="${ingredient.id}" id="ingr-${ingredient.id}" />
                    <label for="ingr-${ingredient.id}">${ingredient.iname}</label>
                    <br/>                         
                </c:forEach>
            </div>

            <div>
                <h3>Choose payment method:</h3>
                <select name="paymentId.id">
                    <c:forEach items="${payments}" var="payment">
                        <option value="${payment.id}">${payment.pname}</option>                  
                    </c:forEach>
                </select>
            </div>

            <div>
                <h3>Your details:</h3>
                Name:<input type="text" name="customerId.cname"/>
                <br/>
                Age:<input type="number" name="customerId.cage"/>
                <br/>                
                Order Date:<input type="date" name="orderDate"/>               
            </div>

            <input type="submit" value="Order">
        </form:form>

    </body>
</html>
