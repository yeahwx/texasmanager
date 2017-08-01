<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="manager/texas/updateUser" method="Post" id="updateUser">
		<table>
			<tr>
				<td>id:<input type="text" name="id"/></td>
				<td>姓名：<input type="text" name="name"/></td> 
				<td>底数：<input type="text" name="dS"/></td>
				<td>剩余筹码：<input type="text" name="leftCounter"/></td>
				<td>盈亏：<input type="text" name="pAndL"/></td>
				<td><input type="submit" name="提交"/></td>
			</tr>
		</table>
	</form>
</body>
</html>