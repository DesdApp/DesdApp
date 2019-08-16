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
            <div id="div-login" class="col-3 p-5">
                <h2>Inicio de sesión</h2>

                <form>
                    <div class="form-group">
                        <input type="email" class="form-control mt-4" aria-describedby="emailHelp" placeholder="Correo eléctronico / Usuario">
                    </div>


                    <div class="form-group">
                        <input type="password" class="form-control mt-4" placeholder="Contraseña">
                    </div>


                    <div class="form-group form-check my-4">
                        <input type="checkbox" class="form-check-input" id="exampleCheck1">
                        <label class="form-check-label" for="exampleCheck1">Recordarme</label>
                    </div>
                    <button type="submit" class="btn primary btn-lg btn-block text-light">Entrar</button>
                    <hr>
                    <button type="submit" class="btn red btn-lg btn-block text-light">G+ Iniciar sesión con Google</button>

                </form>
                <!-- Final de formulario de inicio -->
            </div>
        </div>

        <div class="row d-flex justify-content-center">
            <h5>¿No tienes una cuenta?
                <a href="registrarse.jsp">Registrarme</a>
            </h5>
        </div>

    </body>

</html>