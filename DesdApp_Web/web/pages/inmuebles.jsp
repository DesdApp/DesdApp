<%@page import="modelo.BienesInmuebles"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <title>Inmuebles</title>
        <meta charset="utf-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="css/inmueblesStyle.css" type="text/css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
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
                            <a class="nav-link dropdown-toggle text-light" data-toggle="dropdown" href="#" role="button"
                               aria-haspopup="true" aria-expanded="false">Quienes somos</a>
                            <div class="dropdown-menu transparente">
                                <a class="dropdown-item" href="pages/nosotros.jsp">Nuestro Equipo</a>
                                <a class="dropdown-item" href="Controlador?accion=oficina">Oficinas</a>
                            </div>
                        </li>
                        <!--B2-->
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle text-light" data-toggle="dropdown" href="#" role="button"
                               aria-haspopup="true" aria-expanded="false">Inmuebles</a>
                            <div class="dropdown-menu transparente">
                                <a class="dropdown-item" href="Inmueble?accion=bien">Apartamentos</a>
                                <a class="dropdown-item" href="Controlador?accion=apartos">Apartamentos</a>
                                <a class="dropdown-item" href="Controlador?accion=bodegas">Bodegas</a>
                                <a class="dropdown-item" href="Controlador?accion=casas">Casas</a>
                                <a class="dropdown-item" href="Controlador?accion=edificios">Edificios</a>
                                <a class="dropdown-item" href="Controlador?accion=fincas">Fincas</a>
                                <a class="dropdown-item" href="Controlador?accion=locales">Locales</a>
                                <a class="dropdown-item" href="Controlador?accion=ofisinas">Oficinas</a>
                                <a class="dropdown-item" href="Controlador?accion=proyectos">Proyectos</a>
                                <a class="dropdown-item" href="Controlador?accion=terreno">Terrenos</a>
                            </div>
                        </li>

                        <li class="nav-item">
                            <a class="nav-link" href="">Contáctenos</a>
                        </li>
                        </nav>

                        <li class="nav-item">
                            <a class="nav-link" href="Controlador?accion=registrar">Iniciar Sesión/Registrarse</a>
                        </li>
                        <li>
                    </ul>
                </div>

        </form>
        <div class="row mt-5">

             <%
                ArrayList<BienesInmuebles> list = (ArrayList) request.getAttribute("listaInmuebles");
                int filas = 0;
                for (BienesInmuebles in : list) {


                %>
            <!--Card-->
            <div class=" col-sm-6 col-md-3 mx-auto">
               
                <div class="card mx-auto mb-4">
                    <img src="img/c1.jpg" class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title"><%= in.getTipoPropiedadId()+"  " + in.getEstadoId() %></h5>
                        <p class="card-text"><%= in.getDireccion()+in.getZonaId() %></p>
                        <p class="card-text"><%= in.getPrecioSugerido() %></p>
                        <a href="#" class="btn colorBt text-light "></a>
                        <p class="card-text mt-2"><small class="text-muted">Last updated 3 mins ago</small></p>
                    </div>
                </div>
            </div>
            <%
                    }
            %>




            <div class="col-md-4 col-sm-12 mx-auto" >

                <aside>
                    <!-- Filtros -->
                    <div class="bg-white d-flex justify-content-between p-3 mb-5">
                        <form class="col-md-12">
                            <h5>Filtros de busqueda</h5>
                            <div class="form-group row">
                                <input class="form-control" type="text" placeholder="Ingrese zona, sector, ciudad o cod. de inmueble">
                            </div>

                            <div class="form-group row d-flex justify-content-between">
                                <select class="form-control col-6">
                                    <option selected>Habitaciones</option>
                                    <option>1</option>
                                    <option>2</option>
                                    <option>3</option>s
                                    <option>4</option>
                                    <option>5</option>
                                    <option>6</option>
                                    <option>7</option>
                                    <option>8</option>
                                    <option>9</option>
                                    <option>10</option>
                                    <option>Cualquiera</option>
                                </select>
                                <select class="form-control col-6">
                                    <option selected>Baños</option>
                                    <option>1</option>
                                    <option>2</option>
                                    <option>3</option>
                                    <option>4</option>
                                    <option>5</option>
                                    <option>6</option>
                                    <option>7</option>
                                    <option>8</option>
                                    <option>9</option>
                                    <option>10</option>
                                    <option>Cualquiera</option>
                                </select>
                            </div>

                            <div class="form-group row d-flex justify-content-between">
                                <select class="form-control">
                                    <option selected>Tipo inmueble</option>
                                    <option>1</option>
                                    <option>2</option>
                                    <option>3</option>
                                    <option>4</option>
                                    <option>5</option>
                                    <option>6</option>
                                    <option>7</option>
                                    <option>8</option>
                                    <option>9</option>
                                    <option>10</option>
                                    <option>Cualquiera</option>
                                </select>
                            </div>

                            <div class="form-group row d-flex justify-content-between">
                                <select class="form-control">
                                    <option selected>Tipo operación</option>
                                    <option>Venta</option>
                                    <option>Renta</option>
                                </select>
                            </div>

                            <button class="btn btn-block colorBt text-light">Buscar</button>
                        </form>
                    </div>

                    <div class="row bg-white d-flex justify-content-between p-3">
                        <div class="col-12 mb-3">
                            <h5>Filtros por tipo de operacion</h5>
                        </div>
                        <div class="col-12 mb-3">
                            <a href="">Renta</a>
                        </div>
                        <div class="col-12 mb-3">
                            <a href="">Venta</a>
                        </div>
                    </div>

                </aside>
            </div>
        </div >
        <!--Footer-->
        <div class="mx-auto row col-xl-12 mt-5 primary">
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