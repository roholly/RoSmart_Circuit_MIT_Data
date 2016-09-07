<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>House ${house.id}</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" type="text/css"/>
</head>
<body>
<h2 class="text-center">Overview for House ${house.id}</h2>

<div class="col-xs-6">
<h2 class="sub-header">Identified Smart Meter Circuits</h2>
  <div class="table-responsive">
      <table class="layout">
      <thead>
        <tr>
        <th class="col-md-1"><u>Circuit Type</u></th>
        <th class="col-md-2"><u>#</u></th>
        </tr>
       </thead>
       <tbody>
			<c:set var="object" value="${house}" />
			<c:if test="${not empty object['class'].declaredFields}">
    			<c:forEach var="field" items="${object['class'].declaredFields}">
       				<c:if test="${field.name ne 'id' && object[field.name] gt 0}">
          			<tr><td class="col-md-1">${field.name}</td><td class="col-md-2">${object[field.name]}</td></tr>
	   				</c:if>
    			</c:forEach>
 			</c:if>
		</tbody>
        </table>
   </div>
</div>
  <div class="col-xs-6">
          <h2 class="sub-header">Daily Electricity Consumption Averages</h2>
          <div class="table-responsive">
            <table class="layout">
              <thead>
                <tr>
  				<th class="col-md-1"><u>Circuit Type</u></th>
  				<th class="col-md-2"><u>Overall Daily Average</u></th>
				<th class="col-md-3"><u>Minimum Daily Average</u></th>
				<th class="col-md-4"><u>Minimum Daily Average Date</u></th>
				<th class="col-md-5"><u>Maximum Daily Average</u></th>
				<th class="col-md-6"><u>Minimum Daily Average Date</u></th>             
                </tr>
              </thead>
              <tbody>    
              
              	<c:set var="object" value="${houseAvgs}" />
			<c:if test="${not empty object['class'].declaredFields}">
    			<tr>
    			<c:forEach var="field" items="${object['class'].declaredFields}">
       				
       				<c:if test="${field.name eq 'circuit'}">
          			<td class="col-md-1">${object[field.name]}</td>
	   				</c:if>
	   				<c:if test="${field.name eq 'overallAvg'}">
          			<td class="col-md-2">${object[field.name]}</td>
	   				</c:if>
	   				<c:if test="${field.name eq 'minAvg'}">
          			<td class="col-md-3">${object[field.name]}</td>
	   				</c:if>
	   				<c:if test="${field.name eq 'minDate'}">
          			<td class="col-md-4">${object[field.name]}</td>
	   				</c:if>
	   				<c:if test="${field.name eq 'maxAvg'}">
          			<td class="col-md-5">${object[field.name]}</td>
	   				</c:if>
	   				<c:if test="${field.name eq 'maxDate'}">
          			<td class="col-md-6">${object[field.name]}</td>
	   				</c:if>
    			
    			</c:forEach>
    			</tr>
 			</c:if>
 			   </tbody>
            </table>
          </div>
   </div>
</body>
</html>