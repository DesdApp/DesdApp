<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="../css/index.css" type="text/css">
    <title>Document</title>
</head>
<body>
    <!--Barra de navegacion-->
    <div class="row primary">
            <div class="col-sm-3 col-md-1"><img src="../img/let.PNG" width="120px">

            </div>


            <nav class="navbar navbar-expand-md primary navbar-dark col-sm-9 col-md-11">
                <!-- Brand -->
                <a class="navbar-brand" href="#">Navbar</a>

                <!-- Toggler/collapsibe Button -->
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <!-- Navbar links -->
                <div class="collapse navbar-collapse" id="collapsibleNavbar">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link" href="../pages/index.jsp">Inicio</a>
                        </li>

                         <!--B1-->       
                         <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle text-light" data-toggle="dropdown" href="#" role="button"
                                aria-haspopup="true" aria-expanded="false">Quienes somos</a>
                            <div class="dropdown-menu">
                                <a class="dropdown-item" href="../pages/nosotros.jsp">Nuestro Equipo</a>
                                <a class="dropdown-item" href="../pages/oficinas.jsp">Oficinas</a>
                            </div>
                        </li>
                        <!--B2-->
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle text-light" data-toggle="dropdown" href="#" role="button"
                                aria-haspopup="true" aria-expanded="false">Inmuebles</a>
                            <div class="dropdown-menu">
                                <a class="dropdown-item" href="#">Apartamentos</a>
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
                            <a class="nav-link" href="">Contáctenos</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Iniciar Sesión</a>
                        </li> 
                    </ul>
                </div> 
            </nav>


        </div>

        <div>
            
        </div>

</body>
</html>