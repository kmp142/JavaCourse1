<!doctype html>
<html>
<head>
    <title>BannedUsers</title>
</head>
<body>

<h1>All users banned except admins</h1>
<form id="myForm" method="post" action="/banAll">
    <input type="hidden" name="${csrf.parameterName}" value="${csrf.token}"/>
    <button type="submit">Забанить всех юзеров</button>
</form>
</body>
</html>