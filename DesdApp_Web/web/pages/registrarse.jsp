<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <link rel="stylesheet" href="../css/registrar.css" type="text/css">

    </head>

    <body class="bg container-fluid">
        <!-- Nombre de la compañia -->
        <div class="row d-flex justify-content-center mt-5">
            <div id="company" class="col-6 text-center primary text-light rounded-top">
                <h2>GTM Bienes Raices</h2>
            </div>
        </div>


        <!-- Formulario de inicio de sesion -->
        <div class="row d-flex justify-content-center mb-5">
            <div id="div-login" class="col-6 p-5">
                <h2>Registrarme</h2>

                <form action="Controlador" class="needs-validation mt-5" novalidate>
                    <div class="form-row">
                      <div class="col-md-4 mb-3">
                        <label for="nombre" >Nombre</label>
                        <input type="text" class="form-control" name="txtNombre" id="nombre" placeholder="First name" value="Mark" required>
                        <div class="valid-tooltip">
                          Looks good!
                        </div>
                      </div>
                      <div class="col-md-4 mb-3">
                        <label for="apellido">Apellido</label>
                        <input type="text" class="form-control" name="txtApellido" id="apellido" placeholder="Last name" value="Otto" required>
                        <div class="valid-tooltip">
                          Looks good!
                        </div>
                      </div>
                      <div class="col-md-4 mb-3">
                        <label for="usserName">Username</label>
                        <div class="input-group">
                          <div class="input-group-prepend">
                            <span class="input-group-text" id="validationTooltipUsernamePrepend">@</span>
                          </div>
                            <input type="text" class="form-control" name="txtUsser" id="usserName" placeholder="Username" aria-describedby="validationTooltipUsernamePrepend" required>
                          <div class="invalid-tooltip">
                            Please choose a unique and valid username.
                          </div>
                        </div>
                      </div>
                    </div>
                    <div class="form-row">
                      <div class="col-md-6 mb-3">
                        <label for="direccion">Dirección</label>
                        <input type="text" class="form-control" name="txtDireccion" id="direccion" placeholder="City" required>
                        <div class="invalid-tooltip">
                          Please provide a valid city.
                        </div>
                      </div>
                      <div class="col-md-3 mb-3">
                        <label for="document">No. documento</label>
                        <input type="number" class="form-control" name="txtDocument" id="document" placeholder="Document" required>
                        <div class="invalid-tooltip">
                          Please provide a valid state.
                        </div>
                      </div>
                      <div class="col-md-3 mb-3">
                        <label for="nit">nit</label>
                        <input type="number" class="form-control" name="txtName" id="nit" placeholder="nit" required>
                        <div class="invalid-tooltip">
                          Please provide a valid zip.
                        </div>
                      </div>
                    </div>
                    <div class="form-row">
                        <div class="col-md-4 mb-3">
                            <label for="fechaNac">Fecha Nacimiento</label>
                            <input type="date" class="form-control" name="txtFechaNac" id="fechaNac" placeholder="8/17/2002" required>
                            <div class="invalid-tooltip">
                              Please provide a valid city.
                            </div>
                          </div>
                          <div class="col-md-4 mb-3">
                            <label for="cel">Celular</label>
                            <input type="number" class="form-control" name="txtCel" id="cel" placeholder="cel" required>
                            <div class="invalid-tooltip">
                              Please provide a valid state.
                            </div>
                          </div>
                          <div class="col-md-4 mb-3">
                            <label for="tel">Telefono</label>
                            <input type="number" class="form-control" name="txtTel" id="tel" placeholder="tel" required>
                            <div class="invalid-tooltip">
                              Please provide a valid zip.
                            </div>
                        </div>

                    </div>
                    <div class="form-row">
                      <div class="col-md-6 mb-3">
                        <label for="id">ID Persona</label>
                        <input type="number" class="form-control" name="idPer" id="id" placeholder="ID Persona" required>
                        <div class="invalid-tooltip">
                          Please provide a valid state.
                        </div>
                      </div>
                      <div class="col-md-6 mb-3">
                        <label for="tel">Tipo Documento</label>
                        <input type="number" class="form-control" name="txtTpDocument" id="tel" placeholder="1-2" required>
                        <div class="invalid-tooltip">
                          Please provide a valid zip.
                        </div>
                      </div>
                    </div>
                    <button class="btn mt-3 btn-primary" name="accion" value="Agregar" type="submit">Registrame</button>
                  </form>

               

                  
                <!-- Final de formulario de inicio -->
            </div>
        </div>

    </body>

</html>