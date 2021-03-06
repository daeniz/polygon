<%-- 
    Document   : jsptemplate
    Created on : 
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<title>View reports</title>
<%@include file="Style/Header.jsp" %>

<main>

    <div class="w3-row-padding">
        <div class="w3-container w3-black">
            <h3>List of customers</h3></div>
    </div>
    <div class="w3-row-padding">


        <ul class="w3-ul w3-card-4 w3-hoverable">

            <c:forEach items="${sessionScope.customers}" var="customer">


                <li><div class="w3-row-padding"><a href="frontpage?page=viewcustomer&customerid=${customer.customerId}"><div class="w3-third">Company Name: ${customer.companyName}</div><div class="w3-third"> Adress: ${customer.street}</div></a> 
                </div></li>

            </c:forEach>
        </ul>

    </div>
</main>
<%@include file="Style/Footer.jsp" %>