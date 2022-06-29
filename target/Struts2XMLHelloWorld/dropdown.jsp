<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Welcome Page</title>
</head>
<body>
<h3> dropdown </h3>

<s:form action="login" namespace="/">
<s:hidden name="pageName" value="dropdownResult" />
<h2>
	<s:select label="What's your favor search engine"
		headerKey="-1" headerValue="Select Search Engines"
		list="searchEngine"
		name="yourSearchEngine"
		value="'yahoo.com'" />
</h2>

<h2>
	<s:select label="Select a month"
		headerKey="-1" headerValue="Select Month"
		list="#{'1':'Jan', '2':'Feb', '3':'Mar', '4':'Apr'}"
		name="yourMonth"
		value="4" />
</h2>

<s:submit value="submit" name="submit" />

</s:form>

</body>
</html>