<%-- 
    Document   : jobs
    Created on : Jan 14, 2021, 7:10:55 PM
    Author     : COMPAQ
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:pageTemplate pageTitle="JobList">

    <h1 class="mb-4">All jobs in a list</h1>
    
    <div class="row row-cols-1 row-cols-md-2 g-4 mt-4">
        <c:forEach var="job" items="${jobs}">
            <div>
                title="${jobtitle}" 
                description="${job.description}" 
                link="${pageContext.request.contextPath}/Job?id=${job.id}"
            </div>  
            
        </c:forEach>
    </div>
</t:pageTemplate>

