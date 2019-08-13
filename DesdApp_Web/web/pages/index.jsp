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
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
                integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
                integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
                integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" href="../css/inicio.css" type="text/css">

        <title>Inicio</title>
    </head>

    <body class="bg">

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
        
                <div class="col-12 alineacion container-fluid" style="margin-top: 6px ; height: 170px;">
                    <h4>GTM Bines Raices-Magnates en Inmobiliaria</h4>
                </div>
            
    

                <div class="col-12 verdoso">
                            
                            <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                                    <ol class="carousel-indicators">
                                      <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                                      <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                                      <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                                    </ol>
                                    <div class="carousel-inner">
                                      <div class="carousel-item active carousel-item container-fluid" style="margin-top: 35px; margin-bottom:45px">

                                        <!--Cards-->
                                        <div class="row mx-auto">
                                        <!--1-->
                                        <div class="card espacioCard col-3">
                                            <img src="../img/c1.jpg" class="card-img-top card-img-fluid" style="width: 100%" alt="...">
                                            <div class="card-body">
                                                <h5 class="card-title">Casa-Venta</h5>
                                                <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                                        PRECIO $525,000.</p>
                                                <a href="#" class="btn btn-primary">Detalles</a>
                                            </div>
                                        </div>
                                        <!--2-->
                                        <div class="card espacioCard" style="width: 18rem;float: left;">
                                            <img src="../img/c1.jpg" class="card-img-top" alt="...">
                                            <div class="card-body">
                                                <h5 class="card-title">Casa-Venta</h5>
                                                <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                                        PRECIO $525,000.</p>
                                                <a href="#" class="btn btn-primary">Detalles</a>
                                            </div>
                                        </div>
                                        <!--3-->
                                        <div class="card espacioCard" style="width: 18rem;float: left;">
                                            <img src="../img/c1.jpg" class="card-img-top" alt="...">
                                            <div class="card-body">
                                                <h5 class="card-title">Casa-Venta</h5>
                                                <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                                        PRECIO $525,000.</p>
                                                <a href="#" class="btn btn-primary">Detalles</a>
                                            </div>
                                        </div>
                                        <!--4-->
                                        <div class="card espacioCard" style="width: 18rem;float: left;">
                                                <img src="../img/c1.jpg" class="card-img-top" alt="...">
                                                <div class="card-body">
                                                    <h5 class="card-title">Casa-Venta</h5>
                                                    <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                                            PRECIO $525,000.</p>
                                                    <a href="#" class="btn btn-primary">Detalles</a>
                                                </div>
                                            </div>
    
                                        </div>
                                    </div>
                                      <div class="carousel-item" style="margin-top: 35px; margin-bottom:45px">
                                        
                                         <!--5-->
                                         <div class="card espacioCard" style="width: 18rem;float: left;">
                                            <img src="../img/c1.jpg" class="card-img-top" alt="...">
                                            <div class="card-body">
                                                <h5 class="card-title">Casa-Venta</h5>
                                                <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                                        PRECIO $525,000.</p>
                                                <a href="#" class="btn btn-primary">Detalles</a>
                                            </div>
                                        </div>
                                        <!--6-->
                                        <div class="card espacioCard" style="width: 18rem;float: left;">
                                            <img src="../img/c1.jpg" class="card-img-top" alt="...">
                                            <div class="card-body">
                                                <h5 class="card-title">Casa-Venta</h5>
                                                <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                                        PRECIO $525,000.</p>
                                                <a href="#" class="btn btn-primary">Detalles</a>
                                            </div>
                                        </div>
                                        <!--7-->
                                        <div class="card espacioCard" style="width: 18rem;float: left;">
                                            <img src="../img/c1.jpg" class="card-img-top" alt="...">
                                            <div class="card-body">
                                                <h5 class="card-title">Casa-Venta</h5>
                                                <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                                        PRECIO $525,000.</p>
                                                <a href="#" class="btn btn-primary">Detalles</a>
                                            </div>
                                        </div>
                                        <!--8-->  
                                        <div class="card espacioCard" style="width: 18rem;float: left;">
                                            <img src="../img/c1.jpg" class="card-img-top" alt="...">
                                            <div class="card-body">
                                                <h5 class="card-title">Casa-Venta</h5>
                                                <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                                        PRECIO $525,000.</p>
                                                <a href="#" class="btn btn-primary">Detalles</a>
                                            </div>
                                        </div>

                                      </div>
                                      <div class="carousel-item" style="margin-top: 35px; margin-bottom:45px">

                                        <!--9-->
                                        <div class="card espacioCard" style="width: 18rem;float: left;">
                                                <img src="../img/c1.jpg" class="card-img-top" alt="...">
                                                <div class="card-body">
                                                    <h5 class="card-title">Casa-Venta</h5>
                                                    <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                                            PRECIO $525,000.</p>
                                                    <a href="#" class="btn btn-primary">Detalles</a>
                                                </div>
                                            </div>
                                            <!--10-->
                                            <div class="card espacioCard" style="width: 18rem;float: left;">
                                                <img src="../img/c1.jpg" class="card-img-top" alt="...">
                                                <div class="card-body">
                                                    <h5 class="card-title">Casa-Venta</h5>
                                                    <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                                            PRECIO $525,000.</p>
                                                    <a href="#" class="btn btn-primary">Detalles</a>
                                                </div>
                                            </div>
                                            <!--11-->
                                            <div class="card espacioCard" style="width: 18rem;float: left;">
                                                <img src="../img/c1.jpg" class="card-img-top" alt="...">
                                                <div class="card-body">
                                                    <h5 class="card-title">Casa-Venta</h5>
                                                    <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                                            PRECIO $525,000.</p>
                                                    <a href="#" class="btn btn-primary">Detalles</a>
                                                </div>
                                            </div>
                                            <!--12-->
                                            <div class="card espacioCard" style="width: 18rem;float: left;">
                                                <img src="../img/c1.jpg" class="card-img-top" alt="...">
                                                <div class="card-body">
                                                    <h5 class="card-title">Casa-Venta</h5>
                                                    <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                                                            PRECIO $525,000.</p>
                                                    <a href="#" class="btn btn-primary">Detalles</a>
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
       <div class="row primary">
          <div class="col-xl-4 primaryfloat-left">
              <h4 class="text-light mt-5">Bienes Raices Guatemala</h4>
              <p class="text-light">
                  Empresa lider en ventar,renta, compra venta,
                  alquiler.
                  Contamos con la mejor asesoramiento inmobiliario
              </p>
          </div>

          <div class="col-xl-4 primary float-left">
              <h4 class="text-light mt-5">Contactenos</h4>
              <p class="text-light">
                  Zona 10 48-95 interiores de nook
                  BienesRaices@gmail.com
                  502+ 22334455

              </p>
          </div>
          
          <div class="col-xl-4 primary float-left">
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
                      <button type="submit" class="btn colorBt btn-primary mb-2">Suscribirme</button>
                    </div>
                  </div>
                </form>

          </div>
  </div>

    
    </body>

</html>