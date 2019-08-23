<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>

    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <link href="../css/styleLogin.css" rel="stylesheet" type="text/css"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>

    <body class="bg">
        <!-- Nombre de la compañia -->
        <div class="row d-flex justify-content-center mt-5">
            <div id="company" class="col-3 text-center primary text-light rounded-top">
                <b>GTM Bienes Raices</b>
            </div>
        </div>


        <!-- Formulario de inicio de sesion -->
        <div class="row d-flex justify-content-center mb-5">
            <div id="div-login" class="col-3 p-5">

                <h2>Inicio de sesión</h2>

                <% String error = (String) request.getParameter("error");
                %>

                <form action="../ControladorLogin" method="POST">
                    <div class="form-group">
                        <input type="text" name="txtUser" class="form-control mt-4"
                               placeholder="Usuario">
                    </div>


                    <div class="form-group">
                        <input type="password" name="txtPass" class="form-control mt-4" placeholder="Contraseña">
                    </div>


                    <div class="form-group form-check my-4">
                        <input type="checkbox" name="txtRecordar" class="form-check-input" id="exampleCheck1">
                        <label class="form-check-label" for="exampleCheck1">Recordarme</label>
                    </div>


                    
                    <input class="btn primary btn-lg btn-block text-light" type="submit" name="accion"
                           value="Ingresar">
                    

                </form>

                
            <div class="mt-4" style="height:80px">
                <%
                   if (error != null) {

                %>
                
                <div class="alert alert-warning alert-dismissible fade show" role="alert">
                    <strong>Error!</strong> Usuario o Contrasenia incorrectos.
                    <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                
                <% }%>
            </div>
               
                <!-- Final de formulario de inicio -->
            </div>
        </div>

        <div class="row d-flex justify-content-center">
            <h5>¿No tienes una cuenta?
                <a href="Controlador?accion=add">Registrarme</a>
            </h5>
        </div>


    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
            integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
    crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
            integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
    crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
            integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
    crossorigin="anonymous"></script>

</html>