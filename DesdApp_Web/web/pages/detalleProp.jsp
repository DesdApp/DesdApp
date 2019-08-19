<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
        <meta name="viewport" content="width=\, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="../css/detalleProp.css" type="text/css">
        <title>Document</title>
</head>
<body>
     <!--Barra de navegacion-->

     <div class="row primary mx-auto" style="justify-content: center; text-align: center; display: flex">
        <div class="col-sm-3 col-md-1"><img src="../img/let.PNG" width="120px">

        </div>


        <nav class="navbar navbar-expand-md primary navbar-dark col-sm-9 col-md-11">

            <!-- Toggler/collapsibe Button -->
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
                <span class="navbar-toggler-icon"></span>
            </button>

            <!-- Navbar links -->
            <div class="collapse navbar-collapse" id="collapsibleNavbar">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="../index.jsp">Inicio</a>
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
                        <a class="nav-link" href="../pages/login.jsp">Iniciar Sesión</a>
                    </li> 
                </ul>
            </div> 
        </nav>
    </div>
    <a class="col-md-12 mx-auto">Propiedad en Venta</a>
    <div class="container row">
    <div class=" col-md-12 mx-auto mt-5">
        <div class="card mb-3" style="max-width: 700px;">
            <div class="row no-gutters">
              <div class="col-md-4">
                <img src="../img/c1.jpg" class="card-img" alt="...">
              </div>
              <div class="col-md-8">
                <div class="card-body">
                  <h5 class="card-title">Card title</h5>
                  <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                  <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
                </div>
              </div>
            </div>
          </div>
    </div>
</div>
</body>
</html>