<%@page import="modelo.Nosotros"%>
<%@page import="java.util.ArrayList"%>
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
        <link rel="stylesheet" href="css/nosotros.css" type="text/css">
        <title>Document</title>
    </head>

    <body class="bg">
        <!--Barra de navegacion-->

        <div class="row primary mx-auto" style="justify-content: center; text-align: center; display: flex">
            <div class="col-sm-3 col-md-1"><img src="img/let.PNG" width="120px">

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
                            <a class="nav-link" href="index.jsp">Inicio</a>
                        </li>

                        <!--B1-->       
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle text-light" data-toggle="dropdown" href="#" role="button"
                               aria-haspopup="true" aria-expanded="false">Quienes somos</a>
                            <div class="dropdown-menu">
                                <a class="dropdown-item" href="pages/nosotros.jsp">Nuestro Equipo</a>
                                <a class="dropdown-item" href="pages/oficinas.jsp">Oficinas</a>
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

        <!--Informacion y Card Corredores-->
        <div class="container col-md-11">
            <h3 class="mt-5" style="text-align: center">Quienes somos</h3>
            <p>
                Somos una empresa Inmobiliaria enfocada en el Asesoramiento de nuestros clientes, con el objetivo de brindarles el mejor servicio.
                Para ello hemos seleleccionado los mejores estandateres, brindando asi asesoramiento efectivo, rapido y seguro.
                Tenemos un recorrido en esta area de mas de 8 anos con el cual hemos podido recaudar experiencia en el campo y lograr asi un Equipo
                de trabajo conformado por personas de exelencia. 
            </p> 
        </div>

        <!--Grupo 1-->
        <div class="primary row">              
            <%
                ArrayList<Nosotros> lista = (ArrayList) request.getAttribute("listaNosotros");
                int filas = 0;
                for (Nosotros elem : lista) {
                int cod_empleado = elem.getCod_empleado() ;

            %>
            <div class="col-6">
                <div class="card mb-2 mt-2 mx-auto" style="max-width: 540px;">
                    <div class="row no-gutters">
                        <div class="col-md-4">
                            <img src="img/p8.jpg" class="card-img" alt="...">
                        </div>
                        <div class="col-md-8">
                            <div class="card-body">
                                <h4 class="card-title"><%= elem.getNombre()%></h4>
                                <h4 class="card-title"><%= elem.getApellido()%></h4>
                                <p class="text-medium card-text">Ejecutivo en ventas</p>
                                <p class="text-medium card-text"><%= elem.getCorreo() %></p>
                                <p class="text-medium card-text">Oficina: <%= elem.getCel()%></p>
                                <p class="text-medium card-text">Móvil: <%= elem.getTel() %></p>
                                <a href="ServletCorredor?accion=cards" class="btn btn-success">Detalles</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <%
                }
            %>

        </div>

        <!--Grupo 2-->
        





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
                            <button type="submit" class="btn colorBt mb-2">Suscribirme</button>
                        </div>
                    </div>
                </form>

            </div>
        </div>



    </body>

</html>