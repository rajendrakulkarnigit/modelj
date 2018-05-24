<%@include file="/pages/includes/taglib.jsp"%>

<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<html:html>

<head>
	<%@include file="/pages/includes/scriptsAndCss.jsp"%>

	<script type="text/javascript">
		<!--
		function submitForm(action)
		{
			if(action == 'search') {
				alert(action);
				document.forms[0].action = "<%=request.getContextPath()%>/searchAccountBalance.do?webaction=search";
			}
			else if(action == 'add') {
				alert(action);
				document.forms[0].action = "<%=request.getContextPath()%>/showAddAccountBalance.do?webaction=showAdd";
			}
			else if(action == 'delete') {
				alert(action);
				document.forms[0].action = "<%=request.getContextPath()%>/deleteAccountBalance.do?webaction=delete";
			}
		
			document.forms[0].submit();
		}
		//-->
</script>
</head>

<body>
<%@include file="/pages/product/AccountBalanceMenu.jsp" %>

<h2>product</h2>
	
<html:form action="/listAccountBalance.do?webaction=list">
						
	<table class="grid">
				<tr>
			<td width="30%">
				<bean:message bundle="product" key="PRODUCT.accountBalanceForm.accountBalanceId"/>	 
			</td>
			<td width="70%">
				<html:text property="accountBalanceId"></html:text>
			</td>
		</tr>
				
		<tr>
			<td>
				<input type="button" name="Search" value='<bean:message bundle="product" key="PRODUCT.accountBalanceForm.SearchButton"/>' onclick="submitForm('search');" />
			</td>
		</tr>
	</table>

	<table>
		<tr>
			<td>
				<input type="button"
					name="Delete"  
					value='<bean:message bundle="product" 
					key="PRODUCT.accountBalanceForm.DeleteButton"/>' 
					onclick="submitForm('delete');" value="" />
			</td>
			<td align="right">
				<input type="button"
					name="Add New"
					value='<bean:message bundle="product" 
					key="PRODUCT.accountBalanceForm.AddNewButton"/>' 
					onclick="submitForm('add');" value="" />
			</td>
		</tr>
	</table>

	<display:table name="accountBalanceForm.accountBalanceList" id="accountBalance" pagesize="10" requestURI="/listAccountBalance.do?webaction=list" style="width:100%; border:1; cellpadding:2; cellspacing:1; bgcolor:#FFFFFF">
		<display:column title="accountBalanceId" sortable="true">
			<a href="<%=request.getContextPath()%>/viewAccountBalance.do?webaction=view&accountBalanceId=<bean:write name="accountBalance" property="accountBalanceId"/>">
				<bean:write name="accountBalance" property="accountBalanceId"/>
			</a>
		</display:column>
	</display:table>

</html:form>

</body>

</html:html>