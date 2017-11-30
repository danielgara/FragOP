Fragment Login-AlterHeader { 
   Action: add 
   FragmentationPoint: menu-options-modificator
   PointBracketsLan: html
   Destination: BasicViewsHtml-Header
   SourceCode: [ALTERCODE-FRAG]<c:choose>
    			<c:when test="${sessionScope.admin != '1'}">
            	<li><a href="<c:url value='Login'/>">Login</a></li>
				</c:when>    
    			<c:otherwise>
            	<li><a href="<c:url value='Login?logout=1'/>">Logout</a></li>
            	</c:otherwise>
			</c:choose>[/ALTERCODE-FRAG]
}