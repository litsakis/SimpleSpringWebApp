<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE>
<html>

<body>

<h2>Spring MVC Demo </h2>

<hr>
	<form:form action="processForm" modelAttribute="student">
	
	First name: <form:input path="firstName" />
	
	<br><br>
	Last name: <form:input path="lastName" />
	<br><br>

	Country:
	
	<form:select path="country">
		<form:option value="Brazil" label="Brazil" />
		<form:option value="Greece" label="Greece" />
		<form:option value="Italy" label="Italy" />
		<form:option value="Germany" label="Germany" />
		<form:option value="France" label="France" />
	
	</form:select>
	<input type="submit" value="Submit" />
	
	</form:form>
</body>

</html>