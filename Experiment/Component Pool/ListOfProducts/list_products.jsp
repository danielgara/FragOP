<%@ include file="header.jsp" %>

<div class="main">
<div class="container">
        <h1>List of Products</h1>
</div>
</div>

<div class="container">

<c:forEach items="${products}" var="pro">
<div class="col-md-3">
<div class="box_slide">

	<div class="box_image">
	<img src="${pro.getImage()}" class="gall-img-responsive">
	</div>

	<div class="caption">
	${pro.getTitle()}
	<p>$${pro.getPrice()}</p>
	</div>
										
</div>
</div>
</c:forEach>

</div>

<%@ include file="footer.jsp" %>