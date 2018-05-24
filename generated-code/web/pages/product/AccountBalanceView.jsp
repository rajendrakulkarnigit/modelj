<%@include file="/pages/includes/taglib.jsp"%>

<head>
	<%@include file="/pages/includes/scriptsAndCss.jsp"%>

</head>

<body>
<%@include file="/pages/product/AccountBalanceMenu.jsp" %>

<h2><bean:message bundle="product" key="PRODUCT.viewaccountBalance.PageTitle"/></h2>

<html:form action="/showUpdateAccountBalance.do?webaction=showUpdate">

<table class="grid" align="center">
		
	<tr>
		<td width="30%" class="text">
			<bean:message bundle="product" key="PRODUCT.accountBalanceForm.accountBalanceId"/>
		</td>
		<td width="70%">
			<bean:write name="accountBalanceForm" property="accountBalanceId"/>
		</td>
	</tr>
				
	<tr>
		<td align="center" colspan="2">
			<html:submit><bean:message bundle="product" key="PRODUCT.viewaccountBalance.UpdateButton"/></html:submit>
		</td>		
		<td nowrap align="center" colspan="2">		
			<input type="button" class="btngrey" value='<bean:message bundle="product" key="PRODUCT.viewaccountBalance.CancelButton"/>' />
		</td>
	</tr>
</table>
</html:form>
</body>

