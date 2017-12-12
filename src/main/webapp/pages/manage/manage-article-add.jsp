<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Home</title>
    <link rel="stylesheet" href="/css/semantic.min.css">
    <script type="text/javascript" src="/js/jquery.min.js"></script>
    <script type="text/javascript" src="/js/semantic.min.js"></script>
</head>
<body>

<div style="width: 500px;height:700px;position: absolute;left: 50%;top: 50%;margin-left: -250px;margin-top: -350px">
    <div class="ui attached message">
        <div class="header">Welcome to Edit!</div>
        <p>填写下面的表单来添加新的账户</p>
    </div>
    <form class="ui form attached fluid segment celled">
        <div class="two fields">
            <div class="field">
                <label>Username</label>
                <input placeholder="Username" type="text">
            </div>
            <div class="field">
                <label>Password</label>
                <input placeholder="Password" type="password">
            </div>
        </div>
        <div class="field">
            <label>Motto</label>
            <input placeholder="Motto" type="text">
        </div>
        <div class="field">
            <label>Text</label>
            <textarea></textarea>
        </div>
        <div class="field">
            <label>Short Text</label>
            <textarea rows="2"></textarea>
        </div>
        <div class="field ui blue submit button fluid">Submit</div>
    </form>
</div>


</body>
</html>
