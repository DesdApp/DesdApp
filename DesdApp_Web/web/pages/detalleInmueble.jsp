<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <title>Casa venta</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="../css/inmuebleStyle.css" type="text/css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>

<body class="bg">

    <!-- Redes sociales -->
    <div class="container-fluid secondary d-flex justify-content-end align-items-center pr-5">
        <p class="text-light">Siguenos</p>

    </div>

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
            <input class="form-control mx-auto col-md-6 mr-sm-1" type="search" placeholder="Ingrese zona, sector, ciudad o codigo" aria-label="Search">
                        <button class="btn  mx-auto btn-outline-info  my-2 my-sm-0" type="submit">Search</button>


        </nav>


    </div>


    <div class="row d-flex justify-content-center">

        <!-- Breadcrumb -->
        <div class="col-8">
            <nav aria-label="breadcrumb">
                <ol class="breadcrumb bg">
                    <li class="breadcrumb-item"><a href="index.html">Inicio</a></li>
                    <li class="breadcrumb-item"><a href="inmuebles.jsp">Inmuebles</a></li>
                    <li class="breadcrumb-item active" aria-current="page">Venta</li>
                </ol>
            </nav>
        </div>

        <!-- Titulo -->
        <div class="col-8 mb-5">
            <div class="row  d-flex justify-content-center">
                <div class="col-10">
                    <h1>Casa venta</h1>
                </div>
            </div>
            <div class="row d-flex justify-content-center">
                <div class="col-9">
                    <p class="text-muted">Código: 1231-2fw23-q23</p>
                </div>
            </div>
        </div>



        <!-- Inmueble -->
        <div class="col-5 mr-6">
            <div class="row d-flex justify-content-between">

                <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                    <ol class="carousel-indicators">
                        <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                        <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                        <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                    </ol>
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <img src="../img/c1.jpg" class="d-block w-100" alt="...">
                        </div>
                        <div class="carousel-item">
                            <img src="../img/c2.jpg" class="d-block w-100" alt="...">
                        </div>
                        <div class="carousel-item">
                            <img src="../img/c3.jpg" class="d-block w-100" alt="...">
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



        </div>

        <!-- Aside derecho -->
        <div class="col-3">
            <aside>

                <div class="row d-flex justify-content-between p-3">

                    <!-- Informacion del corredor -->
                    <div class="mb-3" style="max-width: 540px;">
                        <div class="row no-gutters">
                            <div class="col-md-4 p-3 d-flex align-items-center">
                                <img src="../img/persona.png" class="card-img" alt="...">
                            </div>
                            <div class="col-md-8">
                                <div class="card-body">
                                    <p class="text-small">Paula Estrada</p>
                                    <p class="text-small">1234-5678</p>
                                    <p class="text-small">(502)1234-5678</p>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- Formulario para contactar al cliente -->
                    <form class="col-12">
                        <div class="form-group">
                            <input class="form-control" type="text" placeholder="Nombre">
                        </div>
                        <div class="form-group">
                            <input class="form-control" type="text" placeholder="Telefono incluyendo el codigo de su pais">
                        </div>
                        <div class="form-group">
                            <input class="form-control" type="email" placeholder="Correo electronico">
                        </div>
                        <div class="form-group">
                            <textarea class="form-control" name="message" rows="1" placeholder="Descripción" style="width: 100%; height: 60px; max-height: 200px; min-height: 40px;" maxlength="140"></textarea>
                        </div>
                        <div class="form-group">
                            <button class="btn btn-block secondary text-light">Solicitar informacion</button>
                        </div>
                    </form>


                </div>

            </aside>
        </div>

        <!-- Informacion de la propiedad -->
        <div class="col-8 m-6">
            <div class="row white p-5">
                <h4 class="col-12 mb-5">Resumen de la propiedad</h4>
                <div class="col-4">
                    <!-- Codigo -->
                    <div class="row">
                        <p><b>Codigo: </b></p>
                    </div>
                    <!-- Dormitorios -->
                    <div class="row">
                        <p><b>Dormitorios: </b></p>
                    </div>
                    <!-- Tipo propiedad -->
                    <div class="row">
                        <p><b>Tipo:</b></p>
                    </div>
                </div>
                <div class="col-4">
                    <!-- Baños -->
                    <div class="row">
                        <p><b>Baños: </b></p>
                    </div>
                    <!-- Medios baños -->
                    <div class="row">
                        <p><b>Medio baños: </b></p>
                    </div>
                    <!-- Tipo operacion -->
                    <div class="row">
                        <p><b>Operacion: </b></p>
                    </div>
                </div>
                <div class="col-4">
                    <!-- Tamaño -->
                    <div class="row">
                        <p><b>Contruccion: </b></p>
                    </div>
                    <!-- Otros -->
                    <div class="row">
                        <p><b> </b></p>
                    </div>
                    <!-- Precio -->
                    <div class="row">
                        <p><b>Q2,800.00</b></p>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <br>
    <!-- Footer -->
    <div class="primary">
        <div class="container">
            <div class="row">
                <div class="col-sm-4 col-md-4 col-lg-4 col-xl-4 float-left" style="height: 250px">
                    <h4 class="text-light mt-5">Bienes Raices Guatemala</h4>
                    <p class="text-light">
                        Empresa lider en ventar, renta, compra venta, alquiler. Contamos con la mejor asesoramiento inmobiliario
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