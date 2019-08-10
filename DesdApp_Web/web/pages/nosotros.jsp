<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="../css/nosotros.css" type="text/css">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
    <title>Document</title>
</head>

<body class="bg">
    <!--Barra de navegacion-->
    <div id="cont" class="container-fluid color primary bannerHeigth">
        <div class="row">
            <div class="col-sm-3 col-md-3 col-lg-3 col-xl-3"><img src="../img/let.PNG" width="120px" height="120px" class="rounded float-left"
                    alt="...">
            </div>

            <div class="col-sm-9 col-md-9 col-lg-9 col-xl-9"  style="display: flex; justify-content: flex-start; align-items: center"  height="120px">
                    <nav class="primary navbar navbar-expand-lg navbar-light">
                            <a class="navbar-brand text-light" href="#">Barra Navegacion</a>
                            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                              <span class="navbar-toggler-icon"></span>
                            </button>
                            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                              <div class="navbar-nav">
                                <a class="nav-item nav-link active text-light" href="../pages/inicio.jsp">Inicio <span class="sr-only">(current)</span></a>
                                
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
                            
                                <a class="nav-item nav-link text-light" href="#">Contactenos</a>
                                <a class="nav-item nav-link text-light" href="../index.html">Iniciar Secion/Registrarse</a>
                              </div>
                            </div>
                          </nav>

            </div>
        </div>
    </div>

    <div class="container">
    <!--Informacion-->
    <div class="row" >
        <div>
        <h3>Quienes somos</h3>
            <p class="col-8">
                Somos una empresa Inmobiliaria enfocada en el Asesoramiento de nuestros clientes, con el objetivo de brindarles el mejor servicio.
                Para ello hemos seleleccionado los mejores estandateres, brindando asi asesoramiento efectivo, rapido y seguro.
                Tenemos un recorrido en esta area de mas de 8 anos con el cual hemos podido recaudar experiencia en el campo y lograr asi un Equipo
                de trabajo conformado por personas de exelencia. 
            </p>
       </div>
    </div>
    </div>
</body>

</html>