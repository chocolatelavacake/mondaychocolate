<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<body>
	<h3>
		Staff Leave History
	</h3>
	<c:if test="${fn:length(c=lhistory) gt 0}">
		<table style="cellspacing: 2; cellpadding: 2; border: 1;">
			<tr class="listHeading">
				<th><spring:message code="fieldLabel." /></th>
				<th><spring:message code="fieldLabel.name" /></th>
				<th><spring:message code="fieldLabel.courseName" /></th>
				<th><spring:message code="fieldLabel.startDate" /></th>
				<th><spring:message code="fieldLabel.endDate" /></th>
				<th><spring:message code="fieldLabel.fees" /></th>
				<th><spring:message code="fieldLabel.status" /></th>
				<th><spring:message code="fieldLabel.update" /></th>
				<th><spring:message code="fieldLabel.withdraw" /></th>
			</tr>
			<c:forEach var="leaverecord" items="${lhistory}">
				<tr class="listRecord">
					<td>${leaverecord.idLrd}</td>
					<td>${leaverecord.uidLrd}</td>
					<td>${leaverecord.fromdateLrd}</td>
					<td>${leaverecord.todateLrd}</td>
					<td>${leaverecord.leavecategoryLrd}</td>
					<td>${leaverecord.numdaysLrd}</td>
					<td>${leaverecord.timeofdayLrd}</td>
					<td>${leaverecord.descLrd}</td>
					<td>${leaverecord.workdsmLrd}</td>
					<td>${leaverecord.overseasLrd}</td>
					<td>${leaverecord.contactdetailsLrd}</td>
					<td>${leaverecord.leavestatusLrd}</td>
					<td>${leaverecord.approveridLrd}</td>
					<td>${leaverecord.approvercommentLrd}</td>
					<c:if
						test="${leaverecord.leavestatusLrd eq 'SUBMITTED' || leaverecord.leavestatusLrd eq 'UPDATED' }">
						<td><a
							href="${pageContext.request.contextPath}/staff/leave/edit/${leaverecord.idLrd}.html"><spring:message
									code="fieldLabel.update" /></a></td>
						<td><a
							href="${pageContext.request.contextPath}/staff/leave/withdraw/${leaverecord.idLrd}.html"><spring:message
									code="fieldLabel.withdraw" /></a></td>
					</c:if>
					<c:if
						test="${leaverecord.leavestatusLrd eq 'WITHDRAWN' || leaverecord.leavestatusLrd eq 'APPROVED' || leaverecord.leavestuatsLrd eq 'REJECTED' }">
						<td></td>
						<td></td>
					</c:if>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>

