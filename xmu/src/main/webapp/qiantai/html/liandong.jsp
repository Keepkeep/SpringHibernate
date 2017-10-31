<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../../wendang/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="../../wendang/distpicker.data.js"></script>
<script type="text/javascript" src="../../wendang/distpicker.js"></script>
<script type="text/javascript">
	$(function(){
		console.log($("#province").val());
	});
	function add(){
		var address=$("#province").val()+$("#city").val()+$("#district").val();
		var postname=$("#postname").val();
		var postel=$("#postel").val();
		$.post("/xmu/post/add.sw",{'postAdress':address,'postname':postname,'postTel':postel},function(data){
			window.location.href="/xmu/qiantai/html/dangelist.jsp?proId="+data
		});
	}
</script>
<body>
	<form action="/xmu/post/add.sw" method="post">
		<div data-toggle="distpicker">
		<select data-province="浙江省" id="province" name="province"></select>
		<select data-city="杭州市" id="city" name="city"></select>
		<select data-district="西湖区" id="district" name="district"></select>
		<span>用户名字</span><input type="text" id="postname">
		<span>用户电话</span><input type="text" id="postel">
		<input type="submit" value="添加">
		<input type="button" onclick="javascript:add()" value="添加">
	</div>
	</form>
</body>
</html>