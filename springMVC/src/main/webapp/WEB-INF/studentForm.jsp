<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Add New Employee</h1>
<form:form method="post" action="save">
	<table>
		<tr>
			<td>Register Number :</td>
			<td><form:input path="registerNo" /></td>
		</tr>
		<tr>
			<td>Student Name :</td>
			<td><form:input path="studentName" /></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Save" /></td>
		</tr>
	</table>
</form:form>