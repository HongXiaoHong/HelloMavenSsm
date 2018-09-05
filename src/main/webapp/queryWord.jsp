<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctxPath" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<h2 align="center">查询单词</h2>
<form action="${ctxPath}/Query/word" method="post">
单词:<input type="text" name="word"/><br>
<input type="submit" value="查询单词"/><br>
</form>