<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../../wendang/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="../../wendang/distpicker.data.js"></script>
<script type="text/javascript" src="../../wendang/distpicker.data.js"></script>
</head>
<script type="text/javascript">
	//通过用户信息获取用户地址
	function GetAdress(data){
		$.post("/xmu/post/list.sw",{userId:data},function(data){
			$(data).each(function(){
				var s=$("<input type='radio' value="+this.postId+"  name='postId'><span>"+this.postAdress+"</span><br/>");
				s.appendTo("#list")
			});
		});
	}
	//获取产品id
	$(function(){
		//alert(GetQueryString("proId"));
		$.post("/xmu/product/load.sw",{"proId":GetQueryString("proId")},function(data){
			$(data).each(function(){
				var s=$("<tr></tr>");
				$("<td><input type='checkbox' value='"+this.proId+"' name='proId'></td><td>"+this.proId+"</td><td>"+this.proName+"</td><td>"+this.image+"</td><td>"+this.price+"</td><td><a href='dangelist.jsp?proId="+this.proId+"'>查看</a></td").appendTo(s);
				s.appendTo("#plist");
			});
		});
	});
	//获取用户信息
	$(function(){
		$.post("/xmu/session.sw",{},function(data){
			alert("用户Id"+data);
			GetAdress(data);
		});
	});
	
	//获取单个url路径的参数
	function GetQueryString(name){
	     var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
	     var r = window.location.search.substr(1).match(reg);
	     if(r!=null)return  unescape(r[2]); return null;
	}
</script>
<body>
	<div id="adress">
		<h1>地址</h1>
		<div><a href="/xmu/qiantai/html/liandong.jsp">添加地址</a></a></div>
		<form action="/xmu/order/add.sw" method="post">
			<div id="list"></div>
			<h1>产品</h1>
			<div id="">
				<table id="plist">
				<tr><th>操作</th><th>产品Id</th><th>产品名称</th><th>产品图片</th><th>产品数量</th></tr>
				</table>
			</div>
			<div></div>
			<input type="submit" value="提交订单">
		</form>
	</div>
</body>
</html>