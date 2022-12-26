<?php include 'includes/header.php';?>
 <H2>Autentificación</H2>
<form method="POST" name="frm1" id="frm1" action="validation.php"><!-- Metodo que manda lo conseguido dentro de los input de usuario y contrasena -->
 <div class="form_container">                                     <!-- hacia validation.php -->
    <label for="usuario" class="formulario_label">User:
    <input type="text" name="usuario" id="usuario" class="formulario_input">
    </label>  
</div> 
<div class="form_container">
    <label for="contrasena" class="formulario_label">Password:
    <input type="password" name="contrasena" id="contrasena" class="formulario_input">
    </label>
</div>                  
<div class="form_container">            
    <input type="button" class="formulario_btn" value="Enviar" onclick=validacion();> <!-- Boton que al ser cliceado trae la funcion generada en javaScript -->
</div>                                                                                <!-- para corroborar que los input no se encuentren vacios -->
</form> 
<script src="Static/js/validaciones.js"></script>  