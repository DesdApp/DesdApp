<%-- 
    Document   : inicio
    Created on : Aug 2, 2019, 8:31:22 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=\, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

        <link rel="stylesheet" href="css/index.css" type="text/css">

    <title>Inicio</title>
</head>

<body class="negro">

    <!--Barra de navegacion-->
    <form class="row primary mx-auto" style="justify-content: center; text-align: center; display: flex">
        <div class="col-sm-3 col-md-1"><img src="img/let.PNG" width="120px">

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
                        <a class="nav-link dropdown-toggle text-light" data-toggle="dropdown" href="#" role="button"
                            aria-haspopup="true" aria-expanded="false">Quienes somos</a>
                        <div class="dropdown-menu transparente">
                            <a class="dropdown-item" href="ServletNosotros?accion=nosotros">Nuestro Equipo</a>
                            <a class="dropdown-item" href="Controlador?accion=oficina">Oficinas</a>
                        </div>
                    </li>
                    <!--B2-->
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle text-light" data-toggle="dropdown" href="#" role="button"
                            aria-haspopup="true" aria-expanded="false">Inmuebles</a>
                        <div class="dropdown-menu transparente">
                            <a class="dropdown-item" href="ControladorInmueble?accion=Apartamentos">Apartamentos</a>             
                            <a class="dropdown-item" href="ControladorInmueble?accion=Bodegas">Bodegas</a>
                            <a class="dropdown-item" href="ControladorInmueble?accion=Casas">Casas</a>
                            <a class="dropdown-item" href="ControladorInmueble?accion=Apartamentos">Edificios</a>
                            <a class="dropdown-item" href="ControladorInmueble?accion=Apartamentos">Fincas</a>
                            <a class="dropdown-item" href="ControladorInmueble?accion=Apartamentos">Locales</a>
                            <a class="dropdown-item" href="ControladorInmueble?accion=Apartamentos">Oficinas</a>
                            <a class="dropdown-item" href="ControladorInmueble?accion=Apartamentos">Proyectos</a>
                            <a class="dropdown-item" href="ControladorInmueble?accion=Apartamentos">Terrenos</a>
                        </div>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="">Contáctenos</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Controlador?accion=registrar">Iniciar Sesión/Registrarse</a>
                    </li>
                    <li>
                </ul>
            </div>
        </nav>


    </form>

    <!--Banner-->
    <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img class="d-block w-100" src="img/b6.jpg" alt="First slide">
         
                        
                        <div class="form-group mx-auto col-md-8 bg rounded transparente encima form-inline my-3 my-lg-0" style="height: 60px">
                        <select class="custom-select col-md-2 mx-auto mr-sm-1" id="inputGroupSelect01">
                            <option selected>Venta/Renta</option>
                            <option value="1">Venta</option>
                            <option value="2">Renta</option>
                        </select>
                        <select class="custom-select col-md-2 mx-auto mr-sm-1" id="inputGroupSelect01">
                            <option selected>Cualquier Inmueble</option>
                            <option value="1">Apartamentos</option>
                            <option value="2">Bodegas</option>
                            <option value="3">Casas</option>
                            <option value="4">Edificios</option>
                            <option value="5">Fincas</option>
                            <option value="6">Locales</option>
                            <option value="7">Terrenos</option>
                            <option value="8">Oficinas</option>
                            <option value="9">Proyectos</option>
                        </select>
                        <input class="form-control mx-auto col-md-6 mr-sm-1" type="search" placeholder="Ingrese zona,sector,ciudad o cod" aria-label="Search">
                        <button class="btn  mx-auto btn-outline-info  my-2 my-sm-0" type="submit">Search</button>
                        </div>
        
            </div>
            <div class="carousel-item">
                <img class="d-block w-100" src="img/d4.png"alt="Second slide">

                 <div class="form-group mx-auto col-md-8 bg rounded transparente encima form-inline my-3 my-lg-0" style="height: 60px">
                        <select class="custom-select col-md-2 mx-auto mr-sm-1" id="inputGroupSelect01">
                            <option selected>Venta/Renta</option>
                            <option value="1">Venta</option>
                            <option value="2">Renta</option>
                        </select>
                        <select class="custom-select col-md-2 mx-auto mr-sm-1" id="inputGroupSelect01">
                            <option selected>Cualquier Inmueble</option>
                            <option value="1">Apartamentos</option>
                            <option value="2">Bodegas</option>
                            <option value="3">Casas</option>
                            <option value="4">Edificios</option>
                            <option value="5">Fincas</option>
                            <option value="6">Locales</option>
                            <option value="7">Terrenos</option>
                            <option value="8">Oficinas</option>
                            <option value="9">Proyectos</option>
                        </select>
                        <input class="form-control mx-auto col-md-6 mr-sm-1" type="search" placeholder="Ingrese zona,sector,ciudad o cod" aria-label="Search">
                        <button class="btn  mx-auto btn-outline-info  my-2 my-sm-0" type="submit">Search</button>
                        </div>
    
            </div>
            <div class="carousel-item">
                <img class="d-block w-100" src="img/d3.png" alt="Third slide">

                 <div class="form-group mx-auto col-md-8 bg rounded transparente encima form-inline my-3 my-lg-0" style="height: 60px">
                        <select class="custom-select col-md-2 mx-auto mr-sm-1" id="inputGroupSelect01">
                            <option selected>Venta/Renta</option>
                            <option value="1">Venta</option>
                            <option value="2">Renta</option>
                        </select>
                        <select class="custom-select col-md-2 mx-auto mr-sm-1" id="inputGroupSelect01">
                            <option selected>Cualquier Inmueble</option>
                            <option value="1">Apartamentos</option>
                            <option value="2">Bodegas</option>
                            <option value="3">Casas</option>
                            <option value="4">Edificios</option>
                            <option value="5">Fincas</option>
                            <option value="6">Locales</option>
                            <option value="7">Terrenos</option>
                            <option value="8">Oficinas</option>
                            <option value="9">Proyectos</option>
                        </select>
                        <input class="form-control mx-auto col-md-6 mr-sm-1" type="search" placeholder="Ingrese zona,sector,ciudad o cod" aria-label="Search">
                        <button class="btn  mx-auto btn-outline-info  my-2 my-sm-0" type="submit">Search</button>
                        </div>
    
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

    <div>
        <div class="col-sm-12 mx-auto mt-6 negro text-light alineacion" style="height: 80px;">
            <h4>GTM Bines Raices-Magnates en Inmobiliaria</h4>
        </div>
    </div>


    <div class="verdoso">

        <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner">
                <div class="carousel-item active carousel-item">

                    <h4 class="mt-5" style="text-align: center">Propiedades-Destacadas</h4>
                    <hr>
                    <!--Cards-->
                    <div class="row mb-5">
                        <!--1-->
                        <div class=" col-sm-6 col-md-3 mx-auto">
                            <div class="card mx-auto mb-4">
                                <img src="img/c1.jpg" class="card-img-top" alt="...">
                                <div class="card-body">
                                    <h5 class="card-title">Casa-Venta</h5>
                                    <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                        PRECIO $525,000.</p>
                                        <a href="#" class="btn colorBt text-light ">Detalles</a>
                                </div>
                            </div>
                        </div>
                        <!--2-->
                        <div class="col-sm-6 col-md-3 mx-auto">
                            <div class="card mx-auto mb-4">
                                <img src="img/c1.jpg" class="card-img-top" alt="...">
                                <div class="card-body">
                                    <h5 class="card-title">Casa-Venta</h5>
                                    <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                        PRECIO $525,000.</p>
                                    <a href="#" class="btn colorBt text-light ">Detalles</a>
                                </div>
                            </div>
                        </div>
                        <!--3-->
                        <div class="col-sm-6 col-md-3 mx-auto">
                            <div class="card mx-auto mb-4">
                                <img src="img/c1.jpg" class="card-img-top" alt="...">
                                <div class="card-body">
                                    <h5 class="card-title">Casa-Venta</h5>
                                    <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                        PRECIO $525,000.</p>
                                    <a href="#" class="btn colorBt text-light">Detalles</a>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>

                <div class="carousel-item">

                    <h4 class="mt-5" style="text-align: center">Propiedades-Destacadas</h4>
                    <hr>

                <div class="row mb-5">
                    <!--5-->
                    <div class="col-sm-6 col-md-3 mx-auto">
                        <div class="card mx-auto mb-4">
                            <img src="img/c1.jpg" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Casa-Venta</h5>
                                <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                    PRECIO $525,000.</p>
                                <a href="#" class="btn colorBt text-light">Detalles</a>
                            </div>
                        </div>
                    </div>
                    <!--6-->
                    <div class="col-sm-6 col-md-3 mx-auto">
                        <div class="card mx-auto mb-4">
                            <img src="img/c1.jpg" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Casa-Venta</h5>
                                <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                    PRECIO $525,000.</p>
                                <a href="#" class="btn colorBt text-light">Detalles</a>
                            </div>
                        </div>
                    </div>
                    <!--7-->
                    <div class="col-sm-6 col-md-3 mx-auto">
                        <div class="card mx-auto mb-4">
                            <img src="img/c1.jpg" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Casa-Venta</h5>
                                <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                    PRECIO $525,000.</p>
                                <a href="#" class="btn colorBt text-light">Detalles</a>
                            </div>
                        </div>
                    </div>
                </div>

                </div>

                <div class="carousel-item">

                    <h4 class="mt-5" style="text-align: center">Propiedades-Destacadas</h4>
                    <hr>

                    <div class="row mb-5">
                    <!--8-->
                    <div class="col-sm-6 col-md-3 mx-auto">
                        <div class="card mx-auto mb-4">
                            <img src="img/c1.jpg" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Casa-Venta</h5>
                                <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                    PRECIO $525,000.</p>
                                <a href="#" class="btn colorBt text-light">Detalles</a>
                            </div>
                        </div>
                    </div>
                    <!--9-->
                    <div class="col-sm-6 col-md-3 mx-auto">
                        <div class="card mx-auto mb-4">
                            <img src="img/c1.jpg" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Casa-Venta</h5>
                                <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                    PRECIO $525,000.</p>
                                <a href="#" class="btn colorBt text-light">Detalles</a>
                            </div>
                        </div>
                    </div>
                    <!--10-->
                    <div class="col-sm-6 col-md-3 mx-auto">
                        <div class="card mx-auto mb-4">
                            <img src="img/c1.jpg" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Casa-Venta</h5>
                                <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                    PRECIO $525,000.</p>
                                <a href="#" class="btn colorBt text-light">Detalles</a>
                            </div>
                        </div>
                    </div>
                </div>

                </div>
            </div>
            <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>

    </div>

    <!--Segundo Carruesel-->
    <div class="negro" style="height: 30px"></div>
    <div class="verdoso">
        
            <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel2">
                    <ol class="carousel-indicators">
                      <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                      <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                      <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                    </ol>
                    <div class="carousel-inner">
                      <div class="carousel-item active">
                        
                    <h4 class="mt-5" style="text-align: center">Propiedades-Destacadas</h4>
                    <hr>

                    <div class="row mb-5">
                    <!--8-->
                    <div class="col-sm-6 col-md-3 mx-auto">
                        <div class="card mx-auto mb-4">
                            <img src="img/c1.jpg" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Casa-Venta</h5>
                                <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                    PRECIO $525,000.</p>
                                <a href="#" class="btn colorBt text-light">Detalles</a>
                            </div>
                        </div>
                    </div>
                    <!--9-->
                    <div class="col-sm-6 col-md-3 mx-auto">
                        <div class="card mx-auto mb-4">
                            <img src="img/c1.jpg" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Casa-Venta</h5>
                                <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                    PRECIO $525,000.</p>
                                <a href="#" class="btn colorBt text-light">Detalles</a>
                            </div>
                        </div>
                    </div>
                    <!--10-->
                    <div class="col-sm-6 col-md-3 mx-auto">
                        <div class="card mx-auto mb-4">
                            <img src="img/c1.jpg" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Casa-Venta</h5>
                                <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                    PRECIO $525,000.</p>
                                <a href="#" class="btn colorBt text-light">Detalles</a>
                            </div>
                        </div>
                    </div>
                </div>
                      </div>
                      <div class="carousel-item">
                        
                    <h4 class="mt-5" style="text-align: center">Propiedades-Destacadas</h4>
                    <hr>

                    <div class="row mb-5">
                    <!--8-->
                    <div class="col-sm-6 col-md-3 mx-auto">
                        <div class="card mx-auto mb-4">
                            <img src="img/c1.jpg" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Casa-Venta</h5>
                                <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                    PRECIO $525,000.</p>
                                <a href="#" class="btn colorBt text-light">Detalles</a>
                            </div>
                        </div>
                    </div>
                    <!--9-->
                    <div class="col-sm-6 col-md-3 mx-auto">
                        <div class="card mx-auto mb-4">
                            <img src="img/c1.jpg" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Casa-Venta</h5>
                                <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                    PRECIO $525,000.</p>
                                <a href="#" class="btn colorBt text-light">Detalles</a>
                            </div>
                        </div>
                    </div>
                    <!--10-->
                    <div class="col-sm-6 col-md-3 mx-auto">
                        <div class="card mx-auto mb-4">
                            <img src="img/c1.jpg" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Casa-Venta</h5>
                                <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                    PRECIO $525,000.</p>
                                <a href="#" class="btn colorBt text-light">Detalles</a>
                            </div>
                        </div>
                    </div>
                </div>
                      </div>
                      <div class="carousel-item">
                        
                    <h4 class="mt-5" style="text-align: center">Propiedades-Destacadas</h4>
                    <hr>

                    <div class="row mb-5">
                    <!--8-->
                    <div class="col-sm-6 col-md-3 mx-auto">
                        <div class="card mx-auto mb-4">
                            <img src="img/c1.jpg" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Casa-Venta</h5>
                                <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                    PRECIO $525,000.</p>
                                <a href="#" class="btn colorBt text-light">Detalles</a>
                            </div>
                        </div>
                    </div>
                    <!--9-->
                    <div class="col-sm-6 col-md-3 mx-auto">
                        <div class="card mx-auto mb-4">
                            <img src="img/c1.jpg" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Casa-Venta</h5>
                                <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                    PRECIO $525,000.</p>
                                <a href="#" class="btn colorBt text-light">Detalles</a>
                            </div>
                        </div>
                    </div>
                    <!--10-->
                    <div class="col-sm-6 col-md-3 mx-auto">
                        <div class="card mx-auto mb-4">
                            <img src="img/c1.jpg" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Casa-Venta</h5>
                                <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                    PRECIO $525,000.</p>
                                <a href="#" class="btn colorBt text-light">Detalles</a>
                            </div>
                        </div>
                    </div>
                </div>
                      </div>
                    </div>
                    <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                      <span class="sr-only">Previous</span>
                    </a>
                    <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                      <span class="carousel-control-next-icon" aria-hidden="true"></span>
                      <span class="sr-only">Next</span>
                    </a>
                  </div>
           
    </div>

    <!--Footer-->
    <div class="mx-auto row col-xl-12 primary">
        <div class="col-xl-4">
            <h4 class="text-light mt-5">Bienes Raices Guatemala</h4>
            <p class="text-light">
                Empresa lider en venta,renta, compra venta,
                alquiler.
                Contamos con la mejor asesoria inmobiliaria.
            </p>
        </div>

        <div class="col-xl-4">
            <h4 class="text-light mt-5">Contactenos</h4>
            <p class="text-light">
                Zona 10 48-95 interiores de nook
                BienesRaices@gmail.com <br>
                (502)5057-0814 | (502)5176-4966

            </p>
        </div>

        <div class="col-xl-4">
            <h4 class="text-light mt-5">Suscribete a nuestro Blog</h4>

            <form>
                <div class="form-row align-items-center mt-4">
                    <div class="col-6">
                        <h9 class="text-light">Nombre</h9>
                        <label class="sr-only text-light" for="inlineFormInput">Name</label>
                        <input type="text" class="form-control mb-2" id="inlineFormInput" placeholder="Name">
                    </div>
                    <div class="col-6">
                        <h9 class="text-light">Email</h9>
                        <label class="sr-only" for="inlineFormInputGroup">Email</label>
                        <div class="input-group mb-2">
                            <input type="email" class="form-control" id="inlineFormInputGroup" placeholder="Email">
                        </div>
                    </div>
                    <div class="col-auto">
                        <button type="submit" class="btn colorBt text-light mb-2">Suscribirme</button>
                    </div>
                </div>
            </form>

        </div>
    </div>


</body>

</html>