<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <title>Apartamentos</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="../css/inmueblesStyle.css" type="text/css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>

<body class="bg">

    <!--Barra de navegacion-->
    <div class="container-fluid primary bannerHeigth">
        <div class="row">
            <div class="col-sm-3 col-md-3 col-lg-3 col-xl-3"><img src="../img/let.PNG" width="120px" height="120px" class="rounded float-left" alt="...">
            </div>

            <div class="col-sm-9 col-md-9 col-lg-9 col-xl-9" style="display: flex; justify-content: flex-start; align-items: center" height="120px">
                <nav class="primary navbar navbar-expand-lg navbar-light">
                    <a class="navbar-brand text-light" href="#">Navbar Principal</a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                        <div class="navbar-nav">
                            <a class="nav-item nav-link active text-light" href="../pages/inicio.jsp">Inicio<span class="sr-only">(current)</span></a>

                            <!--B1-->
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle text-light" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Quienes somos</a>
                                <div class="dropdown-menu">
                                    <a class="dropdown-item" href="../pages/nosotros.jsp">Nuestro Equipo</a>
                                    <a class="dropdown-item" href="../pages/oficinas.jsp">Oficinas</a>
                                </div>
                            </li>
                            <!--B2-->
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle text-light" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Inmuebles</a>
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

                            <a class="nav-item nav-link text-light" href="#">Contáctenos</a>
                            <a class="nav-item nav-link text-light" href="../index.html">Iniciar Sesión/Registrarse</a>
                        </div>
                    </div>
                </nav>

            </div>
        </div>
    </div>

    <div class="row d-flex justify-content-center">

        <!-- Breadcrumb -->
        <div class="col-8">
            <nav aria-label="breadcrumb">
                <ol class="breadcrumb bg">
                    <li class="breadcrumb-item"><a href="index.html">Inicio</a></li>
                    <li class="breadcrumb-item active" aria-current="page">Apartamentos</li>
                </ol>
            </nav>
        </div>

        <!-- Inmuebles -->
        <div class="col-4 mr-5">
            <div class="row d-flex justify-content-between">

                <!--Card1-->
                <div class="col-offset-4 float-left">
                    <div class="cd card mt-3" style="width: 18rem;">
                        <img src="../img/c1.jpg" width="100%" height="220" class="card-img-top" alt="...">
                        <div class="card-body">
                            <h5 class="card-title text-medium">Apartamento en venta</h5>
                            <p class="card-text text-muted text-small">KM.13 RUTA AL SALVADOR</p>
                            <a href="inmueble.jsp" class="btn primary text-light ">Detalles</a>
                        </div>
                        <div class="card" style="width: 18rem;">
                            <div class="card-header text-small">
                                Lic. Angela Vega
                            </div>
                        </div>
                    </div>
                </div>

                <!--Card2-->
                <div class="col-offset-4 float-left">
                    <div class="cd card mt-3" style="width: 18rem;">
                        <img src="../img/c2.jpg" width="100%" height="220" class="card-img-top" alt="...">
                        <div class="card-body">
                            <h5 class="card-title text-medium">Apartamento en venta</h5>
                            <p class="card-text text-muted text-small">KM.13 RUTA AL SALVADOR</p>
                            <a href="#" class="btn primary text-light ">Detalles</a>
                        </div>
                        <div class="card" style="width: 18rem;">
                            <div class="card-header text-small">
                                Lic. Angela Vega
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="row d-flex justify-content-between">

                <!--Card1-->
                <div class="col-offset-4 float-left">
                    <div class="cd card mt-3" style="width: 18rem;">
                        <img src="../img/c1.jpg" width="100%" height="220" class="card-img-top" alt="...">
                        <div class="card-body">
                            <h5 class="card-title text-medium">Apartamento en venta</h5>
                            <p class="card-text text-muted text-small">KM.13 RUTA AL SALVADOR</p>
                            <a href="#" class="btn primary text-light ">Detalles</a>
                        </div>
                        <div class="card" style="width: 18rem;">
                            <div class="card-header text-small">
                                Lic. Angela Vega
                            </div>
                        </div>
                    </div>
                </div>

                <!--Card2-->
                <div class="col-offset-4 float-left">
                    <div class="cd card mt-3" style="width: 18rem;">
                        <img src="../img/c2.jpg" width="100%" height="220" class="card-img-top" alt="...">
                        <div class="card-body">
                            <h5 class="card-title text-medium">Apartamento en venta</h5>
                            <p class="card-text text-muted text-small">KM.13 RUTA AL SALVADOR</p>
                            <a href="#" class="btn primary text-light ">Detalles</a>
                        </div>
                        <div class="card" style="width: 18rem;">
                            <div class="card-header text-small">
                                Lic. Angela Vega
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Paginacion -->
            <div class="col-12 d-flex justify-content-center my-5">

                <nav aria-label="Page navigation example">
                    <ul class="pagination">
                        <li class="page-item">
                            <a class="page-link" href="#" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                        <li class="page-item"><a class="page-link" href="#">1</a></li>
                        <li class="page-item"><a class="page-link" href="#">2</a></li>
                        <li class="page-item"><a class="page-link" href="#">3</a></li>
                        <li class="page-item">
                            <a class="page-link" href="#" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </li>
                    </ul>
                </nav>
            </div>
        </div>

        <!-- Aside derecho -->
        <div class="col-2">
            <aside>

                <!-- Filtros -->
                <div class="row bg-white d-flex justify-content-between p-3 mb-5">
                    <form class="col-12">
                        <h5>Filtros de busqueda</h5>
                        <div class="form-group row">
                            <input class="form-control" type="text" placeholder="Ingrese zona, sector, ciudad o cod. de inmueble">
                        </div>

                        <div class="form-group row d-flex justify-content-between">
                            <select class="form-control col-6">
                                <option selected>Habitaciones</option>
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
                                <option selected>Tipo de operación</option>
                                <option>Venta</option>
                                <option>Alquiler</option>
                            </select>
                        </div>

                        <button class="btn btn-block secondary text-light">Buscar</button>
                    </form>
                </div>

                <div class="row bg-white d-flex justify-content-between p-3">
                    <div class="col-12 mb-3">
                        <h5>Filtros por tipo de operación</h5>
                    </div>
                    <div class="col-12 mb-3">
                        <a href="">Alquiler</a>
                    </div>
                    <div class="col-12 mb-3">
                        <a href="">Venta</a>
                    </div>
                </div>

            </aside>
        </div>

    </div>
</body>

</html>