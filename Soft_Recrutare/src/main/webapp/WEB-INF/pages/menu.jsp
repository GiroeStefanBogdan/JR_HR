<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<nav class="navbar navbar-expand-md navbar-dark bg-dark">
    <a class="navbar-brand" href="${pageContext.request.contextPath}">JR_HR</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item ${activePage eq '/JR_HR/About' ? ' active' : ''}">
                <a class="nav-link" href="${pageContext.request.contextPath}/about.jsp">About</a>
            </li>

            <li class="nav-item ${pageContext.request.requestURI eq 'JR_HR/users.jsp' ? ' active' : ''}">
                <a class="nav-link" href="${pageContext.request.contextPath}/users.jsp">Users</a>
            </li>
            <li class="nav-item ${pageContext.request.requestURI eq 'JR_HR/job>List.jsp' ? ' active' : ''}">
                <a class="nav-link" href="${pageContext.request.contextPath}/jobList.jsp">Jobs</a>
            </li>

        </ul>
        <ul class="navbar-nav ml-auto">
            <li class="nav-item ${pageContext.request.requestURI eq '/JR_HR/login.jsp' ? ' active' : ''}">
                <a class="nav-link" href="${pageContext.request.contextPath}/login.jsp">Login</a>
            </li>
            <li class="nav-item ${pageContext.request.requestURI eq '/JR_HR/register.jsp' ? ' active' : ''}">
                <a class="nav-link" href="${pageContext.request.contextPath}/register.jsp">Register</a>
            </li>
        </ul>
    </div>
</nav>

