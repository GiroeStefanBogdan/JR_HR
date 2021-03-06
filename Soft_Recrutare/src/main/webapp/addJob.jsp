<%-- 
    Document   : addJob
    Created on : Dec 17, 2020, 12:23:31 PM
    Author     : COMPAQ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:pageTemplate pageTitle="Add Job">
    <h1>Add Car</h1>
    <form class="needs-validation" method="post" action="${pageContext.request.contextPath}/Jobs/Create">
        <div class="row">
            <div class="col-md-6">
                <label for="jobName">Job name</label>
                <input type="text" class="form-control" id="jobName" name="jobName" placeholder="" value="" required>
                <div class="invalid-feedback">
                    Job Name is required.
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <label for="jobDescription">Description</label>
                <input type="text" class="form-control" id="jobDescription" name="jobDescription" placeholder="" value="" required>
                <div class="invalid-feedback">
                    Description  is required.
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