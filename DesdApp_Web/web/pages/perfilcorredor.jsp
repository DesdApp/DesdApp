<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <title>Casa venta</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="../css/perfilprop.css" type="text/css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>

<body class="bg">

    <div class="container-fluid">
        <div class="row primary">
            <div class="col-sm-3 col-md-1"><img src="../img/let.PNG" width="120px">

            </div>
            <nav class="navbar navbar-expand-md primary navbar-dark col-sm-9 col-md-11">
                <!--Empieza barra de navegacion-->
                <a class="navbar-brand" href="#">Navbar Principal</a>

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
            <!--Fin de la barra de navegacion-->
        </div>

    <!-- Informacion de contacto -->
    <div class="row d-flex justify-content-center style=width:200px;">
        <!-- Imagen e informacion de contacto -->
        <div class="col-12 mt-9">
            <div class="card mb-3">
                <div class="row p-3">
                    <div class="col-md-3 d-flex justify-content-center p-2">
                        <img src="../img/p1.jpg" class="img-fluid" alt="...">
                    </div>
                    <div class="col-md-9">
                        <div class="card-body">
                            <h2 class="card-title">Nombre del corredor</h2>
                            <p class="text-medium card-text">Codigo</p>
                            <p class="text-medium card-text">Nombre completo</p>
                            <p class="text-medium card-text">Telefono</p>
                            <p class="text-medium card-text">Correo</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>





    </div>
    <div class="row d-flex- justify-content-center">
        <!-- Card numero 1 -->
        <div class="card mb-3 col-5 p-2">
            <div class="row no-gutters">
                <div class="col-md-4 pt-4">
                    <img src="../img/one.jpeg" class="card-img img-fluid" alt="...">
                </div>
                <div class="col-md-8">
                    <div class="card-body">
                        <h5 class="card-title">Card title</h5>
                        <p class="card-text">This is a wider card with supporting text below as a natural lead-in to
                            additional content. This content is a little bit longer.</p>
                        <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
                    </div>
                </div>
            </div>
        </div>

        <!-- Card numero 2 -->
        <div class="card mb-3 col-5 p-2"  style="margin-left: 20px"  >
            <div class="row no-gutters">
                <div class="col-md-4 pt-4">
                    <img src="../img/one.jpeg" class="card-img img-fluid" alt="...">
                </div>
                <div class="col-md-8">
                    <div class="card-body">
                        <h5 class="card-title">Card title</h5>
                        <p class="card-text">This is a wider card with supporting text below as a natural lead-in to
                            additional content. This content is a little bit longer.</p>
                        <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Fila numero 2 -->
    <div class="row d-flex- justify-content-center">
        <!-- Card numero 1 -->
        <div class="card mb-3 col-5 p-2">
            <div class="row no-gutters">
                <div class="col-md-4 pt-4">
                    <img src="../img/one.jpeg" class="card-img img-fluid" alt="...">
                </div>
                <div class="col-md-8">
                    <div class="card-body">
                        <h5 class="card-title">Card title</h5>
                        <p class="card-text">This is a wider card with supporting text below as a natural lead-in to
                            additional content. This content is a little bit longer.</p>
                        <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
                    </div>
                </div>
            </div>
        </div>
        <div class="card mb-3 col-5 p-2" style="margin-left: 20px">
            <div class="row no-gutters">
                <div class="col-md-4 pt-4">
                    <img src="../img/one.jpeg" class="card-img img-fluid" alt="...">
                </div>
                <div class="col-md-8">
                    <div class="card-body">
                        <h5 class="card-title">Card title</h5>
                        <p class="card-text">This is a wider card with supporting text below as a natural lead-in to
                            additional content. This content is a little bit longer.</p>
                        <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
                    </div>
                </div>
            </div>
        </div>

    </div>

    <!-- Footer -->
    <div class="primary">
        <div class="container">
            <div class="row">
                <div class="col-sm-4 col-md-4 col-lg-4 col-xl-4 float-left" style="height: 250px">
                    <h4 class="text-light mt-5">Bienes Raices Guatemala</h4>
                    <p class="text-light">
                        Empresa lider en venta, renta, compra venta, alquiler. Contamos con la mejor asesoramiento inmobiliario
                    </p>
                </div>

                <div class="col-sm-4 col-md-4 col-lg-4 col-xl-4 float-left" style="height: 250px">
                    <h4 class="text-light mt-5">Contactenos</h4>
                    <p class="text-light">
                        Zona 10 48-95 interiores de nook BienesRaices@gmail.comm 502+ 22334455

                    </p>
                </div>

                <div class="col-sm-4 col-md-4 col-lg-4 col-xl-4 float-left" style="height: 250px;">
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
                                <button type="submit" class="btn secondary text-light mb-2">Suscribirme</button>
                            </div>
                        </div>
                    </form>

                </div>
            </div>
        </div>
    </div>

</body>

</htm>