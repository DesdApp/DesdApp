<%-- 
    Document   : inicio
    Created on : Aug 2, 2019, 8:31:22 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="../css/inicio.css" type="text/css">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
    <title>Inicio</title>
</head>

<body class="bg">

    <!--Barra de navegacion-->
    <div id="cont" class="container-fluid color primary bannerHeigth">
        <div class="row">
            <div class="col-sm-3 col-md-3 col-lg-3 col-xl-3"><img src="../img/let.PNG" width="120px" height="120px"
                    class="rounded float-left" alt="...">
            </div>

            <div class="col-sm-9 col-md-9 col-lg-9 col-xl-9"
                style="display: flex; justify-content: flex-start; align-items: center" height="120px">
                <nav class="primary navbar navbar-expand-lg navbar-light">
                    <a class="navbar-brand text-light" href="#">Barra Navegacion</a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse"
                        data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false"
                        aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                        <div class="navbar-nav">
                            <a class="nav-item nav-link active text-light" href="../pages/inicio.jsp">Inicio <span
                                    class="sr-only">(current)</span></a>

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
    <!--Banner-->
    <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img class="d-block w-100" src="../img/b6.jpg" alt="First slide">
            </div>
            <div class="carousel-item">
                <img class="d-block w-100" src="../img/d4.png" alt="Second slide">
            </div>
            <div class="carousel-item">
                <img class="d-block w-100" src="../img/d3.png" alt="Third slide">
            </div>
        </div>
        <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
    <!--Destacados-->
    <div class="container">
        <div class="row ">
            <div class="col-12"
                style="margin-top: 6px ; height: 170px; display: flex; justify-content: center; align-items: center">
                <h3>GTM Bines Raices-Magnates en Inmobiliaria</h3>
            </div>
        </div>
    </div>
    <!--Card1-->
    <div class="container col-12" id="verdoso">
        <div class="container">
            <div class="row">
                <div class="col-4">
                    <div class="espacioCard card mt-3 mb-3" style="width: 18rem;">
                        <img src="../img/c1.jpg" width="350" height="220" class="card-img-top" alt="...">
                        <div class="card-body">
                            <h5 class="card-title">Casa Venta</h5>
                            <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                PRECIO $525,000 Negociable</p>
                            <a href="#" class="btn botonCard btn-primary">Detalles</a>
                        </div>
                        <div class="card" style="width: 18rem;">
                            <div class="card-header">
                                Lic. Angela Vega
                            </div>
                        </div>
                    </div>
                </div>

                <!--Card2-->
                <div class="col-4 float-left">
                    <div class="espacioCard card mt-3 mb-3" style="width: 18rem;">
                        <img src="../img/c3.jpg" height="220" width="350" class="card-img-top" alt="...">
                        <div class="card-body">
                            <h5 class="card-title">Casa Renta</h5>
                            <p class="card-text">RENTO CASA EN CONDOMINIO SANTA ANITA
                                PRECIO Q.5,500.00 incluye Mantenimiento.</p>
                            <a href="#" class="btn botonCard btn-primary">Detalles</a>
                        </div>
                        <div class="card" style="width: 18rem;">
                            <div class="card-header">
                                Lic. Luis Porto
                            </div>
                        </div>
                    </div>
                </div>
                <!--Card3-->
                <div class="col-4 float-left">
                    <div class="espacioCard card mt-3 mb-3" style="width: 18rem;">
                        <img src="../img/c2.jpg" width="350" height="220" class="card-img-top" alt="...">
                        <div class="card-body">
                            <h5 class="card-title">Casa en Venta</h5>
                            <p class="card-text">Casa - Condominio Santa Anita Guatemala
                                Precio: $128,000 Negociable poco</p>
                            <a href="#" class="btn botonCard btn-primary">Detalles</a>
                        </div>
                        <div class="card" style="width: 18rem;">
                            <div class="card-header">
                                Lic. Angela Vega
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--Fin Card-->
    <div class="primary">
        <div class="container">
            <div class="row">
                <div class="col-sm-4 col-md-4 col-lg-4 col-xl-4 float-left" style="height: 250px">
                    <h4 class="text-light mt-5">Bienes Raices Guatemala</h4>
                    <p class="text-light">
                        Empresa lider en ventar,renta, compra venta,
                        alquiler.
                        Contamos con la mejor asesoramiento inmobiliario
                    </p>
                </div>

                <div class="col-sm-4 col-md-4 col-lg-4 col-xl-4 float-left" style="height: 250px">
                    <h4 class="text-light mt-5">Contactenos</h4>
                    <p class="text-light">
                        Zona 10 48-95 interiores de nook
                        BienesRaices@gmail.comm
                        502+ 22334455

                    </p>
                </div>

                <div class="col-sm-4 col-md-4 col-lg-4 col-xl-4 float-left" style="height: 250px;">
                    <h4 class="text-light mt-5">Suscribete a nuestro Blog</h4>
                    
                    <form>
                        <div class="form-row align-items-center">
                          <div class="col-auto">
                            <label class="sr-only" for="inlineFormInput">Name</label>
                            <input type="text" class="form-control mb-2" id="inlineFormInput" placeholder="Jane Doe">
                          </div>
                          <div class="col-2">
                            <label class="sr-only" for="inlineFormInputGroup">Email</label>
                            <div class="input-group mb-2">
                              <div class="input-group-prepend">
                                <div class="input-group-text">@</div>
                              </div>
                              <input type="text" class="form-control" id="inlineFormInputGroup" placeholder="Username">
                            </div>
                          </div>
                          <div class="col-auto">
                            <button type="submit" class="btn btn-primary mb-2">Suscribirme</button>
                          </div>
                        </div>
                      </form>

                </div>
            </div>
        </div>
    </div>
</body>

</html>