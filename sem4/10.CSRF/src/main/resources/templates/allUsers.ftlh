<!doctype html>
<html>
<head>
    <title>All users</title>
</head>
<body>
<h1>All users</h1>
<form action="/submitForm" method="post">
    <input type="hidden" name="${csrf.parameterName}" value="${_csrf.token}"/>
</form>

<table>
    <thead>
    <tr>
        <th>Email</th>
        <th>Имя</th>
        <th>Фамилия</th>
        <th>Статус</th>
        <th>Роль</th>
    </tr>
    </thead>
    <tbody>
    <#list users as user>
        <tr>
            <td>${user.email}</td>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
            <td>${user.state}</td>
            <td>${user.role}</td>
        </tr>
    </#list>
    </tbody>
</table>
</body>
</html>