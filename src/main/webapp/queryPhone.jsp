<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctxPath" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<h2 align="center">查询电话归属地</h2>
<form action="${ctxPath}/Query/phone" method="post">
电话:<input type="text" name="phone"/><br>
<input type="submit" value="查询电话归属地"/><br>
</form>