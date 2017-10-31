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
	$(function(){
		$.post("/xmu/product/list.sw",{},function(data){
			$(data).each(function(){
				var s=$("<tr></tr>");
				$("<td>"+this.proId+"</td><td>"+this.proName+"</td><td>"+this.image+"</td><td>"+this.price+"</td><td><a href='dangelist.jsp?proId="+this.proId+"'>查看</a></td").appendTo(s);
				s.appendTo("#list");
			});
		});
	});
</script>
<body>
	<h1>列表页面</h1>
	<table id="list" border="1px">
		<tr><td>Id</td><td>商品名称</td><td>商品图片</td><td>商品价格</td></tr>
	</table>
</body>
</html>