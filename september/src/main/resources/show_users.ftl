<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Show Students</title>
</head>
<body>
<#list data as item>
<tr>
    <td>${item.name}</td>
    <td>${item.surname}</td>
    <td>${item.age}</td>
</tr>
</#list>
</body>
</html>