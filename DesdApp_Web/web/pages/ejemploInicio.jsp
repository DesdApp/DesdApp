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
    <link rel="stylesheet" href="../css/inicioClientes.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Document</title>
</head>

<body class="negro">
    <div class="container-fluid">
        <div class="row">
            <nav class="navbar navbar-fixed-top navbar-expand-md mx-auto primary navbar-dark col-sm col-md">
                    <div class="col-sm-3 col-md-1"><img src="../img/let.PNG" width="120px">
        
                    </div>
                 <!-- Toggler/collapsibe Button -->
                 <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
                        <span class="navbar-toggler-icon"></span>
                    </button>
    
                    <!-- Navbar links -->
                    <div class="collapse navbar-collapse" id="collapsibleNavbar">
                        <ul class="navbar-nav">
                            <li class="nav-item">
                                <a class="nav-link" href="../pages/ejemploInicio.jsp">Inicio</a>
                            </li>
    
                            <!--B1-->
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle text-light" data-toggle="dropdown" href="#" role="button"
                                    aria-haspopup="true" aria-expanded="false">Quienes somos</a>
                                <div class="dropdown-menu transparente">
                                    <a class="dropdown-item" href="../Controlador?accion=equipo">Nuestro Equipo</a>
                                    <a class="dropdown-item" href="../Controlador?accion=oficina">Oficinas</a>
                                </div>
                            </li>
                            <!--B2-->
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle text-light" data-toggle="dropdown" href="#" role="button"
                                    aria-haspopup="true" aria-expanded="false">Inmuebles</a>
                                <div class="dropdown-menu transparente">
                                    <a class="dropdown-item" href="../Controlador?accion=apartos">Apartamentos</a>
                                    <a class="dropdown-item" href="../Controlador?accion=bodegas">Bodegas</a>
                                    <a class="dropdown-item" href="../Controlador?accion=casas">Casas</a>
                                    <a class="dropdown-item" href="../Controlador?accion=edificios">Edificios</a>
                                    <a class="dropdown-item" href="../Controlador?accion=fincas">Fincas</a>
                                    <a class="dropdown-item" href="../Controlador?accion=locales">Locales</a>
                                    <a class="dropdown-item" href="../Controlador?accion=ofisinas">Oficinas</a>
                                    <a class="dropdown-item" href="../Controlador?accion=proyectos">Proyectos</a>
                                    <a class="dropdown-item" href="../Controlador?accion=terreno">Terrenos</a>
                                </div>
                            </li>
    
                            <li class="nav-item">
                                <a class="nav-link" href="">Contáctenos</a>
                            </li>
                            <!--
                                       <li class="nav-item">
                                        <a class="nav-link" href="../Controlador?accion=registrar">Iniciar Sesión/Registrarse</a>
                                    </li>
                                   -->
    
                        </ul>
    
                    </div>
                    <!-- Boton para cerrar seccion -->
                    <div class="btn-group">
                        <button type="button" class="btn  dropdown-toggle text-light" data-toggle="dropdown"
                            aria-expanded="false">
                            Cerrar Sesion
                        </button>
                        <div class="dropdown-menu text-center">
                            <a class="dropdown-item" href="#"><img src="../img/persona.png" height="80" width="80"></a>
                            <a class="dropdown-item" href="#">Usuario</a>
                            <a class="dropdown-item" href="#">Configuraciones</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="../index.jsp">Salir</a>
                        </div>
                    </div>
            </nav>
        </div>

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
                
                    <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
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
                        Empresa lider en ventar,renta, compra venta,
                        alquiler.
                        Contamos con la mejor asesoramiento inmobiliario
                    </p>
                </div>
        
                <div class="col-xl-4">
                    <h4 class="text-light mt-5">Contactenos</h4>
                    <p class="text-light">
                        Zona 10 48-95 interiores de nook
                        BienesRaices@gmail.com
                        502+ 22334455
        
                    </p>
                </div>
        
                <div class="col-xl-4">
                    <h4 class="text-light mt-5">Suscribete a nuestro Blog</h4>
        
                    <form>
                        <div class="form-row align-items-center mt-4">
                            <div class="col-6">
                                <h9 class="text-light">Nombre</h9>
                                <label class="sr-only text-light" for="inlineFormInput">Name</label>
                                <input type="text" class="form-control mb-2" id="inlineFormInput" placeholder="Username">
                            </div>
                            <div class="col-6">
                                <h9 class="text-light">Email</h9>
                                <label class="sr-only" for="inlineFormInputGroup">Email</label>
                                <div class="input-group mb-2">
                                    <div class="input-group-prepend">
                                        <div class="input-group-text">@</div>
                                    </div>
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