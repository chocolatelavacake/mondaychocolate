<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<link rel="STYLESHEET" type="text/css"
	href="${pageContext.request.contextPath}/js/jquery-ui.theme.css" />

<%@ page session="false"%>
<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery-ui.js"></script>
<script>
	$(document).ready(function() {
		$("#datepicker1").datepicker({
			dateFormat : "dd/mm/yy"
		});
	});
	$(document).ready(function() {
		$("#datepicker2").datepicker({
			dateFormat : "dd/mm/yy"
		});
	});
/* 	$(document).ready(function(){
	    $('input[name="leavecategoryLrd"]').click(function() {
	       if($('input[name="leavecategoryLrd"]').is(':selected')) { 
	           var dBValue= $("input[name='4']:selected").val();
	            if(dbValue == "Compensation Leave"){
	               $( "Shift" ).prop( "disabled", false );
	               } else {
	                $("Shift"  ).prop( "disabled", true );
	            }
	       }
	    });
	    }); */
</script>
<h3>New Leave page</h3>
<form:form method="POST" commandName="leaverecord"
	action="${pageContext.request.contextPath}/staff/leave/create">
	<table>
		<tr>
			<td><spring:message code="fieldLabel.EmployeeID" /></td>
			<td colspan="3"><form:input size="40" path="uidLrd" /> <form:errors
					path="uidLrd" cssStyle="color: red;" /></td>
		</tr>
		<tr>
			<td><spring:message code="fieldLabel.LeaveType" /></td>
			<td colspan="3"><form:select path="leavecategoryLrd" name="leavecategoryLrd">
					<form:option value="2" name="2">Annual Leave</form:option>
					<form:option selected="selected" value="3" name="3">Medical Leave</form:option>
					<form:option selected="selected" value="4" name="4">Compensation Leave</form:option>
				</form:select> <form:errors path="leavecategoryLrd" cssStyle="color: red;" /></td>
		</tr>
<%-- 		<tr>
			<td><spring:message code="fieldLabel.Shift" /></td>
			<td colspan="3"><form:radiobutton path="Shift" value="am"label="am"  name="Shift"/>
			    <form:radiobutton path="Shift" value="pm"label="pm" />
			    <form:radiobutton path="Shift" value="full_day" label="full day" Default />
			     <form:errors path="Shift" cssStyle="color: red;" /></td>
		</tr> --%>
		
		<tr>
			<td><spring:message code="fieldLabel.startDate" /></td>
			<td><form:input size="16" path="fromdateLrd" id="datepicker1" />
				<form:errors path="fromdateLrd" cssStyle="color: red;" /></td>
			<td><spring:message code="fieldLabel.endDate" /></td>
			<td><form:input size="16" path="todateLrd" id="datepicker2" /> <form:errors
					path="todateLrd" cssStyle="color: red;" /></td>
		</tr>
		<tr>
			<td><spring:message code="fieldLabel.total days" /></td>
			<td colspan="3"><form:input size="40" path="numdaysLrd" /> <form:errors
					path="numdaysLrd" cssStyle="color: red;" /></td>
		</tr>
		<tr>
			<td><spring:message code="fieldLabel.Overseas Trip" /></td>
			<td colspan="3"><form:radiobutton path="overseasLrd" value="Yes" label="yes" /> 
			   <form:radiobutton path="overseasLrd" value="No" label="No" /> 
			    <form:errors path="overseasLrd" cssStyle="color: red;" /></td>
		</tr>
		<tr>
			<td><spring:message code="fieldLabel.Contact Details" /></td>
			<td colspan="3"><form:input size="40" path="contactdetailsLrd" />
				<form:errors path="contactdetailsLrd" cssStyle="color: red;" /></td>
		</tr>
		<tr>
			<td><spring:message code="fieldLabel.Reason" /></td>
			<td colspan="3"><form:textarea cols="64" rows="5" path="descLrd" /></td>
		</tr>
		<tr>
			<td><spring:message code="fieldLabel.status" /></td>
			<td colspan="3"><form:input disabled="true" size="20" path="leavestatusLrd" /></td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td colspan="2" align="left"><br></br> <form:button
					type="submit">
					<img
						src="${pageContext.request.contextPath}/image/button_submit.gif"
						alt="" align="middle">
				</form:button>&nbsp; <a href="javascript:history.back();"> <img
					src="${pageContext.request.contextPath}/image/button_cancel.gif"
					alt="" align="middle" border="0">
			</a></td>
		</tr>
	</table>
</form:form>

