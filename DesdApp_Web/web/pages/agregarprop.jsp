<%-- 
    Document   : agregarprop
    Created on : 22/08/2019, 11:04:03 AM
    Author     : emersonR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="../css/agregarprop.css">

    <!-- Titulo -->
    <title>Agregar propiedad</title>
</head>
    <body class="bg">

    <!--Barra de navegacion-->
    <form class="row primary mx-auto" style="justify-content: center; text-align: center; display: flex">
        <div class="col-sm-3 col-md-1"><img src="../img/let.PNG" width="120px">
        </div>

        <nav class="navbar navbar-expand-md mx-auto primary navbar-dark col-sm-9 col-md-11">
            <!-- Toggler/collapsibe Button -->
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
                <span class="navbar-toggler-icon"></span>
            </button>

            <!-- Navbar links -->
            <div class="collapse navbar-collapse" id="collapsibleNavbar">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="Controlador?accion=index">Inicio</a>
                    </li>

                    <!--B1-->
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle text-light" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Quienes somos</a>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="Controlador?accion=equipo">Nuestro Equipo</a>
                            <a class="dropdown-item" href="Controlador?accion=oficina">Oficinas</a>
                        </div>
                    </li>
                    <!--B2-->
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle text-light" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Inmuebles</a>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="">Apartamentos</a>
                            <a class="dropdown-item" href="#">Bodegas</a>
                            <a class="dropdown-item" href="#">Casas</a>
                            <a class="dropdown-item" href="#">Edificios</a>
                            <a class="dropdown-item" href="#">Fincas</a>
                            <a class="dropdown-item" href="#">Locales</a>
                            <a class="dropdown-item" href="#">Oficinas</a>
                            <a class="dropdown-item" href="#">Proyectos</a>
                            <a class="dropdown-item" href="#">Terrenos</a>
                        </div>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="">ContÃ¡ctenos</a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="Controlador?accion=registrar">Iniciar SesiÃ³n/Registrarse</a>
                    </li>
                </ul>
            </div>
        </nav>
    </form>
    <!-- Final barra de navegacion -->

    <!-- Formulario para agregar propiedades -->
    <div class="container-fluid p-5">
        <div class="col border border-dark white p-3">
            <form>
                <div class="row form-group">
                    <select class="form-control">
                        <option value="Apartamentos">Apartamentos</option>
                        <option value="Bodegas">Bodegas</option>
                        <option value="Casas">Casas</option>
                        <option value="Edificios">Edificios</option>
                        <option value="Fincas">Fincas</option>
                        <option value="Locales Comerciales">Locales Comerciales</option>
                        <option value="Oficinas">Oficinas</option>
                        <option value="Terrenos">Terrenos</option>
                        <option value="Proyectos de Residenciales">Proyectos de Residenciales</option>
                        <option value="Proyectos de Apartamentos">Proyectos de Apartamentos</option>
                    </select>
                </div>
                <div class="row">
                    <select class="form-control">
                        <option value="Venta">Venta</option>
                        <option value="Renta">Renta</option>
                    </select>
                </div>
                <div class="row">
                    <input type="text" class="form-control">
                </div>
                <div class="row"></div>
                <div class="row"></div>
                <div class="row"></div>
                <div class="row"></div>
                <div class="row"></div>
            </form>
        </div>
        <div class="col border border-black white">
            <form>
                <div class="row"></div>
                <div class="row"></div>
                <div class="row"></div>
                <div class="row"></div>
                <div class="row"></div>
                <div class="row"></div>
                <div class="row">
                    <input type="number" name="" id="" class="form-control">
                </div>
            </form>
        </div>
    </div>
    <!-- Fin del fomulario para agregar propiedades -->




    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
