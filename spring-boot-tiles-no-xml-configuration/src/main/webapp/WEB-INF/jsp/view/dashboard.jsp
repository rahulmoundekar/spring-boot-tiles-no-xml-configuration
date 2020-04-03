<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>




<div class="container-fluid">
	<h2>EMPLOYEE INFORMATION SYSTEM</h2>

	<table class="table table-bordered">
		<thead>
			<tr class="info">
				<th>NAME</th>
				<th>EMAIL</th>
				<th>ADDRESS</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="user" items="${users}">
				<tr>
					<td>${user.name}</td>
					<td>${user.email}</td>
					<td>${user.address}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>