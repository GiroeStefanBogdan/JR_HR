<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<t:pageTemplate pageTitle="Login">
    <c:if test = "${message!=null}">
        <div class="alert alert-warning" role="alert">
            ${message}
        </div>
    </c:if>
    <div class="row">
        <div class="col-md"></div>
        <div class="col-md">
        <form class="form-signin" method="post">
            <h1>Please sign in</h1>
            <label for="inputEmail" class="sr-only">Email address</label>
            <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus><br>
            <label for="inputPassword" class="sr-only">Password</label>
            <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
            <div class="checkbox mb-3">
                <label>
                    <input type="checkbox" value="remember-me"> Remember me
                </label>
            </div>
            <button type="submit">Sign in</button>
            <p>&copy;2020</p>
        </form>
            </div>
        <div class="col-md"></div>
    </div>
</t:pageTemplate>