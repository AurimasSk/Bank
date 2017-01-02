<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html>
<html>
<head>
	<title><tiles:insertAttribute name="title" defaultValue="Dev stuff" /></title>
	<meta http-equiv="content-type" content="text/html;charset=utf-8" />
	<link href="<c:url value="/resources/page.css" />" rel="stylesheet">
	<link href="<c:url value="/resources/form.css" />" rel="stylesheet">
	<link href="<c:url value="/resources/mine.css" />" rel="stylesheet">
</head>
<body>
  	<div id="header">
		<tiles:insertAttribute name="header" />
	</div>
	<div id="content-container">
		<div id="content">
			<tiles:insertAttribute name="body" />
		</div>
		<div id="footer">
			<tiles:insertAttribute name="footer" />
		</div>
	</div>
</body>
</html>