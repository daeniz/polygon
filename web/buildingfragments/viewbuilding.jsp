<%-- 
    Document   : Building added
    Created on : 30.03.2016
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    


    
    <h1></h1>
    
    <h2> Building Name: </h2> 
    ${sessionScope.building.buildingName} <br>
    
    <h2>Address </h2> 
    ${sessionScope.building.streetAddress} <br>
    
    <h2> Street Number:</h2> 
    ${sessionScope.building.streetNumber} <br>
    
    <h2> Zip Code:</h2> 
    ${sessionScope.building.zipCode} <br>
    
    <h2> Building Year:</h2> 
    ${sessionScope.building.buildingYear} <br>
    
    <h2> Building Size: </h2> 
    ${sessionScope.building.buildingSize} <br>
    
    <h2> Use of Building: </h2> 
    ${sessionScope.building.useOfBuilding} <br>
    
    
    <h2> Image of Building: </h2> 
    <img src="${pageContext.request.contextPath}/buildingPic/${sessionScope.building.buildingPic}"/>
    

    