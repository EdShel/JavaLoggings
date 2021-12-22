<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h2>Calculator</h2>
	<hr />

	<%
	String operation = (String) request.getAttribute("op");
	String addSelected = "add".equals(operation) ? "selected" : "";
	String subSelected = "sub".equals(operation) ? "selected" : "";
	String divSelected = "div".equals(operation) ? "selected" : "";
	String mulSelected = "mul".equals(operation) ? "selected" : "";
	%>

	<form action="calc" method="GET" autocomplete="off">
		<label>x:</label> <input name="x" value="${ x }" /> <select name="op">
			<option value="add" <%=addSelected%>>+</option>
			<option value="sub" <%=subSelected%>>-</option>
			<option value="div" <%=divSelected%>>/</option>
			<option value="mul" <%=mulSelected%>>*</option>
		</select> <label>y:</label> <input name="y" value="${ y }" /> =
		<c:if test="${ not empty result }">${ result }</c:if>
		<c:if test="${ empty result }">???</c:if>

		<c:if test="${ not empty error }">
			<span style="color: red">${ error }</span>
		</c:if>

		<br /> <input type="submit" value="Calculate result" />

	</form>

</body>
</html>
