<%-- 
    Document   : jsptemplate
    Created on : 
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<title>Landing Page</title>
<%@include file="Style/Header.jsp" %>

<main>
    
    <h1>Landing Page</h1>
    
    
    <a href="frontpage?page=index">Test Link</a><br>
    <a href="frontpage?page=report">Report</a><br>
    <a href="frontpage?page=addbuilding">Add building</a><br>
    <a href="frontpage?page=addcustomer">Add customer</a><br>
    
    
    
    
</main>


<%@include file="Style/Footer.jsp" %>