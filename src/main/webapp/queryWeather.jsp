<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctxPath" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<h2 align="center">查询天气</h2>
<form action="${ctxPath}/Query/weather" method="post">
地名:<input type="text" name="place"/><br>
<input type="submit" value="查询天气"/><br>
</form>