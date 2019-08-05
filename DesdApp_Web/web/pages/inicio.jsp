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
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="../css/style.css" type="text/css">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <title>Inicio</title>
    </head>
    <body>
        
        <!--Barra de navegacion-->
        <div id="cont" class="container-fluid">
            <img src="../img/Logo.PNG" width="200px" height="200px" class="rounded float-left" alt="...">
        </div>
        <div class="fondo conetainer-fluid form-row col-lg-16 d-flex">
            <div class="header-mobile houzez-header-mobile btn btn-group btn-block">
                <button class="btn btn-block btn fondo ronder-top text-light" type="button" name="btnInicio">Inicio</button>
                <div class="btn-group btn-block">
                    <button class="btn fondo text-light dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                      Quienes somos
                    </button>
                    <div class="bt dropdown-menu">
                        <a class="bt dropdown-item" href="../pages/nosotros.jsp">Nuestro Equipo</a>
                        <a class="bt dropdown-item" href="">Oficinas</a>
                    </div>   
                </div>
          
                <div class="btn-group btn-block">
                    <button class="btn fondo text-light dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                      Inmuebles
                    </button>
                    <div class="bt dropdown-menu">
                      <a class="bt dropdown-item" href="#">Apartamentos</a>
                      <a class="bt dropdown-item" href="#">Bodegas</a>
                      <a class="bt dropdown-item" href="#">Casas</a>
                      <a class="bt dropdown-item" href="#">Edificios</a>
                      <a class="bt dropdown-item" href="#">Fincas</a>
                      <a class="bt dropdown-item" href="#">Locales</a>
                      <a class="bt dropdown-item" href="#">Oficinas</a>
                      <a class="bt dropdown-item" href="#">Proyectos</a>
                      <a class="bt dropdown-item" href="#">Terrenos</a>
                    </div>
                </div>
                
            <button class="btn btn-block btn fondo ronder-top text-light" type="button" name="btnContac">Contáctenos</button>
            <button class="btn btn-block btn fondo ronder-top text-light" type="button" name="btnSesion">Iniciar Sesion/Registrarse</button>
            </div>  
        </div>
        <!--Banner-->
        <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
            <div class="carousel-inner">
              <div class="carousel-item active">
                  <img class="d-block w-100" src="../img/d2.jpg" alt="First slide">
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
        <div class="container-fluid mb-8">
          <div class="row d-flex d-flex justify-content-center mt-5">
              <h3>GTM Bines Raices-Magnates en Inmobiliaria</h3>
          </div>
        </div>
          <div class="container-fluid col-9 bt mt-4 d-flex mg-auto">
              <!--Card1-->
              <div class="row col-offset-4 float-left">
              <div class="cd card mt-3" style="width: 18rem;">
                  <img src="../img/c1.jpg" width="350" height="220" class="card-img-top" alt="...">
                  <div class="card-body">
                    <h5 class="card-title">Casa Venta</h5>
                    <p class="card-text">CASA EN KM.13 RUTA AL SALVADOR
                      PRECIO $525,000 Negociable</p>
                    <a href="#" class="btn btn-primary">Detalles</a>
                  </div>
                  <div class="card" style="width: 18rem;">
                    <div class="card-header">
                      Lic. Angela Vega
                  </div>
                </div>
              </div>   
              </div>
            <!--Card2--> 
            <div class="row col-offset-4 float-left">
            <div class="cd card mt-3" style="width: 18rem;">
                <img src="../img/c3.jpg" height="220" width="350" class="card-img-top" alt="...">
                <div class="card-body">
                  <h5 class="card-title">Casa Renta</h5>
                  <p class="card-text">RENTO CASA EN CONDOMINIO SANTA ANITA
                      PRECIO Q.5,500.00 incluye Mantenimiento.</p>
                  <a href="#" class="btn btn-primary">Detalles</a>
                </div>
                <div class="card" style="width: 18rem;">
                  <div class="card-header">
                    Lic. Luis Porto
                  </div>
              </div>
            </div>  
            </div> 
            <!--Card3-->
            <div class="row col-offset-4 float-left">
            <div class="card mt-3" style="width: 18rem;">
                <img src="../img/c2.jpg" width="350" height="220" class="card-img-top" alt="...">
                <div class="card-body">
                  <h5 class="card-title">Casa en Venta</h5>
                  <p class="card-text">Casa - Condominio Santa Anita Guatemala 
                      Precio: $128,000 Negociable poco</p>
                  <a href="#" class="btn btn-primary">Detalles</a>
                </div>
                <div class="card" style="width: 18rem;">
                  <div class="card-header">
                   Lic. Angela Vega
                  </div>
              </div>   
            </div>
          </div>
          <!--Fin Card-->
      </div>
    </body>
</html>
