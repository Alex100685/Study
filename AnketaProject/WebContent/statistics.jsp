<%@page import="java.util.ArrayList"%>
<%@page import="com.web.anketaServlet.Respondent"%>
<%@page import="com.web.anketaServlet.StatisticEngine"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Statistic Results</title>
</head>
<body>


<%!Respondent resp = new Respondent();%>
<%resp.setFirstName(request.getParameter("firstName"));%>
<%resp.setLastName(request.getParameter("lastName"));%>
<%resp.setAge(request.getParameter("age"));%>
<%resp.setSex(request.getParameter("sexType"));%>
<%resp.setEducationLevel(request.getParameter("educationLevel"));%>
<%resp.setMusicPreferation(request.getParameter("musicPrefer"));%>

<%StatisticEngine.respList.add(resp);%>

<%StatisticEngine se = new StatisticEngine();%>

<%double pop = se.getPercent("pop");%>
<%double rock = se.getPercent("rock");%>
<%double dance = se.getPercent("dance");%>
<%double country = se.getPercent("country");%>
<%double rap = se.getPercent("rap");%>
<%double classic = se.getPercent("classic");%>
 <h3>Percent of respondents which are listening to POP : <%=pop%> %</h3><br>
 <h3>Percent of respondents which are listening to ROCK : <%=rock%> %</h3> <br>
<h3>Percent of respondents which are listening to DANCE : <%=dance%> %</h3><br>
 <h3>Percent of respondents which are listening to COUNTRY : <%=country%> %</h3><br>
 <h3>Percent of respondents which are listening to RAP :<%=rap%> %</h3><br>
 <h3>Percent of respondents which are listening to CLASSIC : <%=classic%> %</h3><br>
 
</body>
</html>