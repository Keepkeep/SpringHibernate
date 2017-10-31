<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../../wendang/jquery-1.8.0.min.js"></script>
</head>
<script type="text/javascript">
	$.post("/xmu/users/jiaoyan.sw",{},function(data){
		if(data=="true"){
			alert(data)
			window.location.href="/xmu/qiantai/html/list.jsp"
		}else{
			
			//window.location.href="/xmu/qiantai/html/login.jsp"
		}
	});
</script>
<body>
	<form action="/xmu/users/login.sw" method="post">
		帐号：<input type="text" name="userName"><br/>
		密码：<input type="password" name="userPwd"><br/>
		<input type="submit" value="提交">
	</form>
</body>
</html>