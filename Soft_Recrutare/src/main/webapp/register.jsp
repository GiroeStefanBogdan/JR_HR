<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:pageTemplate pageTitle="Register">

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
              
    </head>
    <body>
        
        <form>
            <h1 style="padding-top: 40px; padding-bottom: 40px;">Registration Form</h1>
            <label for="nume" class="sr-only">Nume</label>
            <input type="text" id="nume" class="form-control" placeholder="Nume: " required><br>
            <label for="prenume" class="sr-only">Prenume</label>
            <input type="text" id="prenume" class="form-control" placeholder="Prenume: " required><br>
            <label for="email" class="sr-only">Email address</label>
            <input type="email" id="email" class="form-control" placeholder="Email address: " required autofocus><br>
            <label for="passw" class="sr-only">Password</label>
            <input type="password" id="passw" class="form-control" placeholder="Password: " required>
            
            <button type="submit">Sign in</button>
            <p>&copy;2020</p>
        </form>
    </body>
</html>
</t:pageTemplate>