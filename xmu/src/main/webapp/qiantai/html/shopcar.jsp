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
	$.post("/xmu/shopcar/add.sw",{proId:GetQueryString("proId")},function(){
		
	});
	//获取单个url路径的参数
	function GetQueryString(name){
	     var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
	     var r = window.location.search.substr(1).match(reg);
	     if(r!=null)return  unescape(r[2]); return null;
	}
</script>
<body>
	<h1>shopcar</h1>
	<table id="list"></table>
</body>
</html>