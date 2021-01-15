<%-- 
    Document   : addJob
    Created on : Jan 14, 2021, 7:12:47 PM
    Author     : COMPAQ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:pageTemplate pageTitle="Add Job Post">
    <t:formTemplate >
        <t:jobPostForm action="${pageContext.request.contextPath}/JobPost/Create">
            <h3 class="register-heading">Post a Job Offer</h3>
        </t:jobPostForm>
    </t:formTemplate>
    <t:formValidate/>
</t:pageTemplate>