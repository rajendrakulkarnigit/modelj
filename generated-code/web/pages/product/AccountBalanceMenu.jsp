<%@include file="/pages/includes/header.jsp" %>
<%@include file="/pages/includes/taglib.jsp"%>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td>
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td>
					<bean:message bundle="product" key="PRODUCT.accountBalanceMenu.PageTitle"/>
					</td>
				</tr>
			</table>
		</td>
	</tr>
</table>

<DIV class=mattblackmenu id=ddtopmenubar>
<UL>
  <LI><A href="index.jsp"><bean:message bundle="product" key="PRODUCT.accountBalanceMenu.HomeLink"/></A> 
  <LI><A href="<%=request.getContextPath()%>/dashboardAccountBalance.do?webaction=dashboard"><bean:message bundle="product" key="PRODUCT.accountBalanceMenu.DashBoardLink"/></A>
  <LI><A href="<%=request.getContextPath()%>/listAccountBalance.do?webaction=list"><bean:message bundle="product" key="PRODUCT.accountBalanceMenu.SearchLink"/></A> 
  <LI><A href="<%=request.getContextPath()%>/reportAccountBalance.do?webaction=reports"  rel=ddsubmenu1><bean:message bundle="product" key="PRODUCT.accountBalanceMenu.ReportLink"/></A>
  <LI><A href="#"><bean:message bundle="product" key="PRODUCT.accountBalanceMenu.HelpLink"/></A>  
</LI>
</UL>
</DIV>
<UL class=ddsubmenustyle id=ddsubmenu1>
  <LI><A href="#"><bean:message bundle="product" key="PRODUCT.accountBalanceMenu.ReportLink1"/></A> 
  <LI><A href="#"><bean:message bundle="product" key="PRODUCT.accountBalanceMenu.ReportLink2"/></A> 
  <LI><A href="#"><bean:message bundle="product" key="PRODUCT.accountBalanceMenu.ReportLink3"/></A>
  <LI><A href="#"><bean:message bundle="product" key="PRODUCT.accountBalanceMenu.ReportLink4"/></A> </LI>
  <LI><A href="#"><bean:message bundle="product" key="PRODUCT.accountBalanceMenu.ReportLink5"/></A> 
  <UL>
    <LI><A href="#"><bean:message bundle="product" key="PRODUCT.accountBalanceMenu.ReportLink5.1"/></A> 
    <LI><A href="#"><bean:message bundle="product" key="PRODUCT.accountBalanceMenu.ReportLink5.2"/></A> 
	<LI><A href="#"><bean:message bundle="product" key="PRODUCT.accountBalanceMenu.ReportLink5.3"/></A>    
    </LI>
    </UL>
</UL>
