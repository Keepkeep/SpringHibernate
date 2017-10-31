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
	
	//加载页面
	$(function(){
		$.post("/xmu/product/dangelist.sw",{proId:GetQueryString("proId")},function(data){
				
		});
	});
	//跳转购买页面
	function ShopBuy(pro){
		window.location.href="/xmu/qiantai/html/order.jsp?proId="+pro;
	}
	//异步请求添加到购物车
	function addcar(pro){
		$.post("/xmu/shopcar/add.sw",{"proId":pro},function(data){
			alert(data);
		});
	}
	//获取单个url路径的参数
	function GetQueryString(name){
	     var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
	     var r = window.location.search.substr(1).match(reg);
	     if(r!=null)return  unescape(r[2]); return null;
	}

</script>
<body>
	<h1>单个商品页面</h1>
	<table id="list">
	</table>
</body>
</html>