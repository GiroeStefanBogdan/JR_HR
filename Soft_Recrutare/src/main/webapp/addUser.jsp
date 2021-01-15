<%-- 
    Document   : addUser
    Created on : Jan 14, 2021, 6:16:11 PM
    Author     : COMPAQ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:pageTemplate pageTitle="AddUser">
    <h1>Add User</h1>
    <form class="needs-validation" method="post" action="${pageContext.request.contextPath}/Users/AddUser">
        <div class="row">
            <div class="col-md-6">
                <label for="username">Username</label>
                <input type="text" class="form-control" id="username" name="username" placeholder="" value="" required>
                <div class="invalid-feedback">
                    Username is required.
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <label for="email">Email</label>
                <input type="email" class="form-control" id="email" name="email" placeholder="" value="" required>
                <div class="invalid-feedback">
                    Email is required.
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <label for="password">Email</label>
                <input type="password" class="form-control" id="password" name="password" placeholder="" value="" required>
                <div class="invalid-feedback">
                    Password is required.
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <label for="position">Position</label>
                <select class="custom-select d-block w-100" id="position" name="position" required>
                    <option value=""> Choose...</option>
                    <option value="ADMINISTRATOR">Administrator</option>
                    <option value="CLIENT">Client</option>
                </select>
                <div class="invalid-feedback">
                    Please select a position.
                </div>
            </div>
        </div>
        <hr class="mb-4">
        <div class="row">
            <div class="col-md-6">
                <button class="btn btn-primary btn-lg btn-block" type="submit">Save</button>
            </div>
        </div>
    </form>
