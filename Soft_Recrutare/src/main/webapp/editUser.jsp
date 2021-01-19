<%-- 
    Document   : editUser
    Created on : Dec 17, 2020, 12:27:37 PM
    Author     : COMPAQ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:pageTemplate pageTitle="Edit User">
    <h1>Edit User</h1>
    <form class="needs-validation" method="POST" action="${pageContext.request.contextPath}/Users/Update">
        <div class="row">
            <div class="col-md-6">
                <label for="nume">Nume</label>
                <input type="text" class="form-control" id="nume" name="nume" placeholder="" value="${user.nume}" required>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <label for="prenume">Prenume</label>
                <input type="text" class="form-control" id="prenume" name="prenume" placeholder="" value="${user.prenume}" required>
            </div>
        </div>
                <div class="row">
            <div class="col-md-6">
                <label for="phone">Telefon</label>
                <select style="float: left; width: 25%;" name="country" id="country" class="form-control">
                    <option value="+0">Romania</option>
                    <option value="+49">Germania</option>
                </select> 
                <input style="float: right; width: 75%;" type="tel" class="form-control" id="phone" name="phone" placeholder="0123456789" pattern="[0-9]" value="${user.phone}" required>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <label for="username">Username</label>
                <input type="text" class="form-control" id="username" name="username" placeholder="" value="${user.username}" required>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <label for="email">Email</label>
                <input type="email" class="form-control" id="email" name="email" placeholder="" value="${user.email}" required>
            </div>
        </div><!-- comment -->
        <div class="row">
            <div class="col-md-6">
                <label for="password">Password</label>
                <input type="password" class="form-control" id="password" name="password" placeholder="" value="${user.password}" required>
            </div>
        </div>
        <hr class="mb-4">
        <div class="row">
            <div class="col-md-6">
                <button class="btn btn-primary btn-lg btn-block" type="submit">Save</button>
            </div>
        </div>
    </form>
    <script>
        (function () {
            'use strict'

            window.addEventListener('load', function () {
                // Fetch all the forms we want to apply custom Bootstrap validation styles to
                var forms = document.getElementsByClassName('needs-validation')

                // Loop over them and prevent submission
                Array.prototype.filter.call(forms, function (form) {
                    form.addEventListener('submit', function (event) {
                        if (form.checkValidity() === false) {
                            event.preventDefault()
                            event.stopPropagation()
                        }

                        form.classList.add('was-validated')
                    }, false)
                })
            }, false)
        })()
    </script>
</t:pageTemplate>
