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
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
              crossorigin="anonymous">
        <link rel="stylesheet" href="css/style.css" type="text/css">
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
            <div id="div-login" class="col-6 p-5">
                <h2>Registrarme</h2>

                <form>
                    <div class="form-group">
                      <label>Id</label>
                      <input type="number" class="form-control" id="id">
                    </div>
                    <div class="form-group">
                      <label for="nombre">Nombre:</label>
                      <input type="text" class="form-control" id="nom">
                    </div>
                    <div class="form-group">
                      <label for="apellido">Apellido:</label>
                      <input type="text" class="form-control" id="apellido">
                    </div>
                    <div class="form-group">
                      <label for="Tpdocument">Tipo de documento:</label>
                      <input type="text" class="form-control" id="tpdocument">
                    </div>
                    <div class="form-group">
                      <label for="Nodocument">No. documento:</label>
                      <input type="number" class="form-control" id="nodocument">
                    </div>
                    <div class="form-group">
                      <label for="email">Email address:</label>
                      <input type="email" class="form-control" id="email">
                    </div>
                    <div class="form-group">
                      <label for="pwd">Password:</label>
                      <input type="password" class="form-control" id="pwd">
                    </div>
                    <div class="form-group">
                      <label for="nit">nit:</label>
                      <input type="number" class="form-control" id="nit">
                    </div>
                    <div class="form-group form-check">
                      <label class="form-check-label">
                        <input class="form-check-input" type="checkbox"> Remember me
                      </label>
                    </div>
                    <button type="submit" class="btn btn-primary">Submit</button>
                  </form>

                  
                <!-- Final de formulario de inicio -->
            </div>
        </div>

        <div class="row d-flex justify-content-center">
            <h5>¿No tienes una cuenta?

                <a href="">Registrarme</a>
            </h5>
        </div>

    </body>

</html>