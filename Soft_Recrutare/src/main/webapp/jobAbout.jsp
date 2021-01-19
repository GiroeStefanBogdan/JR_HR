<%-- 
    Document   : jobAbout
    Created on : Jan 14, 2021, 7:12:32 PM
    Author     : COMPAQ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:pageTemplate pageTitle="${job.jobName}">
    <h1>${job.jobName}</h1>
    <p>${job.jobDescription}</p>
    
</t:pageTemplate>
