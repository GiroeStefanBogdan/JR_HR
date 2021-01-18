<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:pageTemplate pageTitle="Register">
            <form class="needs-validation" method="post" action="${pageContext.request.contextPath}/users.jsp/AddUser">
                <h1 style="padding-top: 40px; padding-bottom: 40px;">Registration Form</h1>
                
                <label for="nume" class="sr-only">Nume</label>
                <input type="text" id="nume" class="form-control" placeholder="Nume: " required><br>
                <label for="prenume" class="sr-only">Prenume</label>
                <input type="text" id="prenume" class="form-control" placeholder="Prenume: " required><br>
                <label for="phone" class="sr-only">Telefon</label>

                <select style="float: left; width: 25%;" name="country" id="country" class="form-control">
                    <option value="+0">Romania</option>
                    <option value="+49">Germania</option>
                </select> 
                <%-- functie pentru input tel - schimba pattern in functie de tara - urmeaza a fi facut --%>
                <input style="float: right; width: 75%;" type="tel" id="phone" name="phone" class="form-control" placeholder="0123456789" pattern="[0-9]" required><br>
                <br><br>
                <label for="username" class="sr-only">Username</label> <!-- trebuie functie care sa il creeze automat, nu input -->
                <input type="text" id="username" class="form-control" placeholder="username" required autofocus><br>
                <label for="email" class="sr-only">Email address</label>
                <input type="email" id="email" class="form-control" placeholder="Email address: " required autofocus><br>
                <label for="passw" class="sr-only">Password</label>
                <input type="password" id="passw" class="form-control" placeholder="Password: " required>

                <button type="submit">Sign in</button>
                <p>&copy;2020</p>
            </form>
        
</t:pageTemplate>