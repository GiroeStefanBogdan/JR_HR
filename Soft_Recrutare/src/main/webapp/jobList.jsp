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
    <form method="POST" action="${pageContext.request.contextPath}/JobList">
        <%--  <c:if test="${pageContext.request.isUserInRole('ClientRole')}"> --%>
        <a class="btn btn-primary btn-lg" href="${pageContext.request.contextPath}/Jobs/Apply" role="button">Apply</a>
        <%--  </c:if> --%>
        <%--  <c:if test="${pageContext.request.isUserInRole('RecruiterRole')}"> --%>
        <a class="btn btn-primary btn-lg" href="${pageContext.request.contextPath}/Jobs/Create" role="button">Add job</a>
        <a class="btn btn-primary btn-lg" href="${pageContext.request.contextPath}/Jobs/Update" role="button">Edit job</a>

        <br><br>
        <button class="btn btn-danger" type="submit">Stop taking applicants</button>
        <br>

        <%--  </c:if> --%>
        <p>In order to apply for any of these jobs, you must login or register.</p>

        <c:forEach var="job" items="${jobs}" varStatus="status">
            <div class="row">
                <div class="col-md-1">
                    <input type="checkbox" name="job_ids" value="${job.id}"/>
                </div>
                <div class="col-md-2">
                    ${job.jobName}
                </div>
                <div class="col-md-2">
                    ${job.jobDescription}
                </div>
                <div class="col-md-2">
                    <a class="btn btn-secondary" href="${pageContext.request.contextPath}/Jobs/Update?id=${job.id}" role="button">Edit Job</a>
                </div>
            </div>
        </c:forEach>
    </form>

</t:pageTemplate>

