<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:pageTemplate pageTitle="Login">

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
               
        <%--    REMEMBER TO MAKE CSS FILE FOR STYLE     --%>  
        <style> 
            body {
                text-align: center;
                align-items: center;
                
                padding-bottom: 40px;
                background-color: #f5f5f5;
            }
            .form-control {
                position: relative;
                box-sizing: border-box;
                height: auto;
                padding: 10px;
                font-size: 16px;
            }
        </style>
    </head>
    <body>
        
        <form>
            <h1 style="padding-top: 40px; padding-bottom: 40px;">Please sign in</h1>
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
    </body>
</html>
</t:pageTemplate>