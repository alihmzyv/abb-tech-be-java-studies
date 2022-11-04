<html>
<head>
    <title>${title}</title>
    <style>
        table,
        th,
        td {
            border: 1px solid black;
            border-collapse: collapse;
        }
    </style>
    <#assign developer = "Google">
    <#assign colours = ["red", "green", "blue", "yellow"]>
    <#assign items = {"pens": 3, "cups": 2, "tables": 1}>
</head>
<body>
<h1>${title}</h1>
<table>
    <tr>
        <th>Name</th>
        <th>Developer</th>
    </tr>
    <#list systems as system>
        <tr>
            <td>${system.name}</td>
            <td>
                <#if system.developer == developer>
                    ${system.developer}
                <#else>
                    ${developer}
                </#if>
            </td>
        </tr>
    </#list>
</table>
<table>
    <tr>
        <th>Color</th>
    </tr>
    <#list colours as color>
        <tr>
            <td>${color}</td>
        </tr>
    </#list>
</table>
<table>
    <tr>
    <#list items?values as v>
            <td>${v}</td>
    </#list>
    </tr>
    <tr>
    <#list items?keys as k>
            <td>${k}</td>
    </#list>
    </tr>
</table>
</body>
</html>