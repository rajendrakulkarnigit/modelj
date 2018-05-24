<%@include file="/pages/includes/taglib.jsp"%>

<head>
	<%@include file="/pages/includes/scriptsAndCss.jsp"%>
	<script type="text/javascript">
	function submitForm()
	{
		
		<%if(request.getAttribute("addUpdateFlag").equals("add")){ %>
			document.forms[0].action = "<%=request.getContextPath()%>/saveAddAccountBalance.do?webaction=saveAdd";
			alert("add"); 
		<%}
		else if(request.getAttribute("addUpdateFlag").equals("update"))
		{%>
			document.forms[0].action="<%=request.getContextPath()%>/saveUpdateAccountBalance.do?webaction=saveUpdate"
				alert("update");
		<%} %>
		document.forms[0].submit();
	}
	</script>

</head>


<h2> 'product' update page</h2>
<body>

<%@include file="/pages/product/AccountBalanceMenu.jsp" %>

<h2><bean:message bundle="product" key="PRODUCT.updateaccountBalance.PageTitle"/></h2>

<html:form action="/saveAddAccountBalance.do?webaction=saveAdd">

<table class="grid" align="center">
			
		<tr>
			<td>
			<bean:message bundle="product" key="PRODUCT.accountBalanceForm.accountBalanceId"/>
		</td>
		<td>
			<html:text property="accountBalanceId" styleClass="textbox1"></html:text>
		</td>
		</tr>
		
					
	<tr>
		<td nowrap align="center" colspan="3">
			<input onclick="submitForm();" type="button" class="btngrey" value='<bean:message bundle="product" key="PRODUCT.showAddaccountBalance.addButton"/>' />
		</td>		
		<td nowrap align="center" colspan="3">		
			<input type="button" class="btngrey" value='<bean:message bundle="product" key="PRODUCT.updateaccountBalance.CancelButton"/>' />
		</td>
	</tr>
</table>

</html:form>

</body>