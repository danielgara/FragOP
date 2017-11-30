<%@ include file="header.jsp" %>

<div class="main">
<div class="container">
        <h1>Login</h1>
</div>
</div>

<div class="container">

<form action="<c:url value='Login'/>" method="post">
<div class="form-group">
    <label for="code">Enter the code:</label>
    <input type="text" name="code" class="form-control" id="code">
  </div>

  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>

<%@ include file="footer.jsp" %>