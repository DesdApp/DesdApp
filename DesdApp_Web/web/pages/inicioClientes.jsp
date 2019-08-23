<%-- 
    Document   : inicio
    Created on : Aug 2, 2019, 8:31:22 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Bootstrap 4</title>

    <!-- Bootstrap Stylesheet -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="../css/inicioClientes.css">
    <!-- Bootstrap Stylesheet -->

</head>

<body class="negro">

    <!-- Responsive Navigation Bar -->
    <nav class="navbar navbar-expand-lg navbar-expand-md mx-auto primary navbar-dark fixed-top">
        <div class="col-sm-3 col-md-1"><img src="../img/let.PNG" width="120px">

        </div>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="../Controlador?accion=index">Inicio
                        <span class="sr-only">(current)</span>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Favoritos</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                        data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Inmuebles
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="../Controlador?accion=apartos">Apartamentos</a>
                        <a class="dropdown-item" href="../Controlador?accion=bodegas">Bodegas</a>
                        <a class="dropdown-item" href="../Controlador?accion=casas">Casas</a>
                        <a class="dropdown-item" href="../Controlador?accion=edificios">Edificios</a>
                        <a class="dropdown-item" href="../Controlador?accion=fincas">Fincas</a>
                        <a class="dropdown-item" href="../Controlador?accion=locales">Locales</a>
                        <a class="dropdown-item" href="../Controlador?accion=ofisinas">Oficinas</a>
                        <a class="dropdown-item" href="../Controlador?accion=proyectos">Proyectos</a>
                        <a class="dropdown-item" href="../Controlador?accion=terreno">Terrenos</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Something else here</a>
                    </div>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link">Contàctenos</a>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link">Mis Propiedades</a>
                </li>
                <li>
                    <form class="form-inline my-2 my-lg-0">
                        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-danger my-2 my-sm-0" type="submit">Submit</button>
                    </form>
                </li>
            </ul>
            <li class="nav-item dropdown ">
                    <a class="nav-link dropdown-toggle text-light" href="#" id="navbarDropdown" role="button"
                        data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" >
                        Cerrar Sesion
                    </a>
                    <div class="dropdown-menu text-center" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="#"><img src="../img/persona.png" height="80" width="80"></a>
                        <a class="dropdown-item" href="#">Usuario</a>
                        <a class="dropdown-item" href="#">Configuraciòn</a>
                        
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Salir</a>
                    </div>
                </li>
            
        </div>
    </nav>
    <!-- Responsive Navigation Bar -->

    <!-- Scroll Demo Text -->
    <div class="text-center">
        <h1 style="margin-top:10%;">Scroll</h1>
        <h1 style="margin-top:10%;">Scroll</h1>
        <h1 style="margin-top:10%;">Scroll</h1>
        <h1 style="margin-top:10%;">Scroll</h1>
        <h1 style="margin-top:10%;">Scroll</h1>
        <h1 style="margin-top:10%;">Scroll</h1>
        <h1 style="margin-top:10%;">Scroll</h1>
        <h1 style="margin-top:10%;">Scroll</h1>
    </div>
    <!-- Scroll Demo Text -->

    <!-- Bootstrap Js -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
    <!-- Bootstrap Js -->

</body>

</html>