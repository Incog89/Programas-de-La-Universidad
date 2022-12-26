<?php include 'includes/header.php';?>
    <H5>Agregar Usuario</H5>
    <form method="POST" name="frm1" id="frm1" action="insertarUsuario.php">
    <div class="form_container">
     <label for="usuario" class="formulario_label">
     Nombre del Usuario:</label>
     <input type="text" name="usuario" id="usuario" class="formulario_input">
    </div> 
    <div class="form_container">
     <label for="contrasena" class="formulario_label">
     Contraseñas</label>
     <input type="password" name="contrasena" id="contrasena" class="formulario_input">        
    </div>                  
    <BR>
    <div class="form_container">                    
    <input type="button" value="Enviar Datos"  class="formulario_btn" onclick="validacion()">                    
    <script src='Static/js/validacionesPass.js'></script>         
</form>  
<hr>
<a href="index.php">Volver al inicio</a>   
<?php include 'includes/footer.php';?>