<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>ftl-test</title>
</head>
<body>
<#list cls as cl>
<p>班级：${cl_index}  名字：${cl.name}</p>
    <#list cl.studentList as stu>
    <p>学生：${stu_index} 名字：${stu.name}  年龄：${stu.age}</p>
    </#list>
</#list>
</body>
</html>