<%-- 
    Document   : inicio
    Created on : Aug 2, 2019, 8:31:22 AM
    Author     : User
--%>

<%@page import="modelo.Zonas"%>
<%@page import="modelo.Municipios"%>
<%@page import="modelo.Departamentos"%>
<%@page import="modelo.TiposPropiedades"%>
<%@page import="modelo.BienesInmuebles"%>
<%@page import="modelo.VentaRenta"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.DAOVentaRenta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Inicio Clientes</title>

        <!-- Bootstrap Stylesheet -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="css/inicioClientes.css">
        <link rel="stylesheet" href="../js/inicioCli.js">
        <!-- Bootstrap Stylesheet -->

    </head>

    <body class="negro">
        <%
            ArrayList<VentaRenta> listaVentaRenta = (ArrayList) request.getAttribute("listaVentaRenta");
            ArrayList<TiposPropiedades> listaTipoP = (ArrayList) request.getAttribute("listaTiposPropiedades");
            ArrayList<Departamentos> listaDep = (ArrayList) request.getAttribute("listarDepartamentos");
            ArrayList<Municipios> listaMuni = (ArrayList) request.getAttribute("listarMunicipios");
            ArrayList<Zonas> listaZona = (ArrayList) request.getAttribute("listarZonas");


        %>

        <!-- Barra de navegacion Responsiva -->
        <nav class="navbar navbar-expand-lg navbar-expand-md mx-auto primary navbar-dark fixed-top">
            <div class="col-sm-3 col-md-1"><img src="img/let.PNG" width="120px">

            </div>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                    aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="index.jsp">Inicio
                            <span class="sr-only">(current)</span>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Favoritos</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Inmuebles
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="Controlador?accion=apartos">Apartamentos</a>
                            <a class="dropdown-item" href="Controlador?accion=bodegas">Bodegas</a>
                            <a class="dropdown-item" href="Controlador?accion=casas">Casas</a>
                            <a class="dropdown-item" href="Controlador?accion=edificios">Edificios</a>
                            <a class="dropdown-item" href="Controlador?accion=fincas">Fincas</a>
                            <a class="dropdown-item" href="Controlador?accion=locales">Locales</a>
                            <a class="dropdown-item" href="Controlador?accion=ofisinas">Oficinas</a>
                            <a class="dropdown-item" href="Controlador?accion=proyectos">Proyectos</a>
                            <a class="dropdown-item" href="Controlador?accion=terreno">Terrenos</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#">Something else here</a>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link">Contàctenos</a>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link">Mis Propiedades</a>
                    </li>
                </ul>

                <div class="form-row">
                    <div class="col">
                        <select class="custom-select custom-select-sm">
                            <!--Cargar lista de Venta Renta-->

                            <% for (VentaRenta elem : listaVentaRenta) {
                            %>
                            <option selected value="<%= elem.getEstadoNegId()%>"><%= elem.getNombre()%></option>
                            <%
                                }
                            %>

                            <option selected>Venta/Renta</option>

                        </select>
                    </div>
                    <div class="col">
                        <select class="custom-select custom-select-sm">

                            <% for (TiposPropiedades elem2 : listaTipoP) {
                            %>
                            <option selected value="<%= elem2.getTipoPropiedadId()%>"><%= elem2.getNombre()%></option>
                            <%
                                }
                            %>
                            <option selected>Inmuebles</option>
                        </select>
                    </div>
                    <div class="col">
                        <select class="custom-select custom-select-sm">

                            <% for (Departamentos depto : listaDep) {
                            %>
                            <option selected value="<%= depto.getDeptoId()%>"><%= depto.getNombre()%></option>
                            <%
                                }
                            %>
                            <option selected>Departamento</option>
                        </select>
                    </div>
                    <div class="col">
                        <select class="custom-select custom-select-sm">

                            <% for (Municipios muni : listaMuni) {
                            %>
                            <option selected value="<%= muni.getMuniIdi()%>"><%= muni.getNombre()%></option>
                            <%
                                }
                            %>
                            <option selected>Municipio</option>
                        </select>
                    </div>
                    <div class="col-2">
                        <select class="custom-select custom-select-sm ">
                            <% for (Zonas zona : listaZona) {
                            %>
                            <option selected value="<%= zona.getZonaId()%>"><%= zona.getNombre()%></option>
                            <%
                                }
                            %>
                            <option selected>Zona</option>

                        </select>
                    </div>
                </div>



                <ul>

                    <li class="nav-item dropdown ">
                        <a class="nav-link dropdown-toggle text-light" href="#" id="navbarDropdown" role="button"
                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Cerrar Sesion
                        </a>
                        <div class="dropdown-menu text-center" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="#"><img src="../img/persona.png" height="80" width="80"></a>
                            <a class="dropdown-item" href="#">Usuario</a>
                            <!--Boton para modificar los datos de usuario-->
                            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#basicExampleModal">
                                Modificar
                            </button>


                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#">Salir</a>
                        </div>
                    </li>
                </ul>



            </div>
        </nav>
        <!-- Fin de la barra de navegacion -->
        <!-- Modal para la modificacion de datos-->
        <div class="modal fade" id="basicExampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
             aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title"  id="exampleModalLabel">Modificar Datos</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">

                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">

                        <form>
                            <div>
                                <label for="exampleFormControlInput1">Nombre</label>
                                <input type="text" class="form-control" id="nombre" >
                                <label for="exampleFormControlInput1">Apellido</label>
                                <input type="text" class="form-control" id="apellido"> 
                                <label for="exampleFormControlInput1">Email</label>
                                <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com"><br>
                                <select class="custom-select custom-select-sm">
                                    <!--Cargar lista de Venta Renta-->S
                                    <option selected>Tipo Documento</option>
                                </select>
                                <div>
                                    <label for="exampleFormControlInput1">NO. Documento</label>
                                    <input type="text" class="form-control" id="documento" >
                                </div>
                                <label for="fechaNac">Fecha Nacimiento</label>
                                <input type="date" class="form-control" name="txtFechaNac" id="fechaNac" placeholder="01/01/1990" required>
                                <div class="invalid-tooltip">
                                    Please provide a valid city.
                                </div>
                                <div class="form-row">
                                    <div class="col-md-6 mb-3">
                                        <label for="cel">Celular</label>
                                        <input type="number" class="form-control" name="txtCel" id="cel"  required>
                                        <div class="invalid-tooltip">
                                            Please provide a valid state.
                                        </div>
                                    </div>
                                    <div class="col-md-4 mb-3">
                                        <label for="tel">Telefono</label>
                                        <input type="number" class="form-control" name="txtTel" id="tel"  required>
                                        <div class="invalid-tooltip">
                                            Please provide a valid zip.
                                        </div>
                                    </div>
                                </div>


                                <div class="form-row">
                                    <div class="col-md-6 mb-3">
                                        <label for="direccion">Dirección</label>
                                        <input type="text" class="form-control" name="txtDireccion" id="direccion" required>
                                        <div class="invalid-tooltip">
                                            Please provide a valid city.
                                        </div>
                                    </div>

                                    <div class="col-md-3 mb-3">
                                        <label for="nit">nit</label>
                                        <input type="text" class="form-control" name="txtNit" id="nit"  required>
                                        <div class="invalid-tooltip">
                                            Please provide a valid zip.
                                        </div>
                                    </div>
                                </div>

                            </div>
                        </form>

                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary">Guardar Cambios</button>
                    </div>
                </div>
            </div>
        </div>
        <!--Fin Modal para la modificacion de datos-->

        <!-- Cuerpo de la pagina -->
        <div class="text-center">
            <h1 style="margin-top:10%;">Scroll</h1>
            <h1 style="margin-top:10%;">Scroll</h1>
            <h1 style="margin-top:10%;">Scroll</h1>
            <h1 style="margin-top:10%;">Scroll</h1>
            <h1 style="margin-top:10%;">Scroll</h1>
            <h1 style="margin-top:10%;">Scroll</h1>
            <h1 style="margin-top:10%;">Scroll</h1>
            <h1 style="margin-top:10%;">Scroll</h1>
        </div>
        <!-- Scroll Demo Text -->

        <!-- Bootstrap Js -->
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
                integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
                integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
                integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
        <!-- Bootstrap Js -->

    </body>

</html>