<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<form method="post" action="/demo/bookSaveServlet">
			<table width="60%" height="60%"  align="center" bgcolor="#ffffff">
				<tr>
					<td colspan="2">新增图书信息 <font color='red'></font></td>
				</tr>
				<tr>
					<td>图书名称</td>
					<td><input name="book_name"></td>
				</tr>
				<tr>
					<td>图书作者</td>
					<td><input name="book_author"></td>
				</tr>
				<tr>
					<td>图书分类</td>
					<td><input name="book_sort"></td>
				</tr>
				<tr>
					<td>图书价格</td>
					<td><input name="book_price"></td>
				</tr>
				<tr>
					<td colspan='2'><input type="submit"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>