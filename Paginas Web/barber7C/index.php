<?php include 'includes/header.php';?>
    <H5>Agregar servicios</H5>
    <form method="POST" name="frm1" id="frm1" action="altaservicios.php">
    <div class="form_container">
     <label for="nombre" class="formulario_label">
     Nombre del servicio:</label>
     <input type="text" name="nombre" id="nombre" class="formulario_input">
    </div> 
    <div class="form_container">
     <label for="precio" class="formulario_label">
      Precio del servicio:</label>
     <input type="text" name="precio" id="precio" class="formulario_input"        
         onkeypress="if((event.keyCode < 48) || (event.keyCode >57)){
         event.returnValue=false;
          } "  maxlength="4">
    </div>                  
    <BR>
    <div class="form_container">                    
    <input type="button" value="Enviar Datos"  class="formulario_btn" onclick="validacion()">                    
    <hr>
    <a href="consultageneral.php">
        <img src="./Static/img/icons8-¿por-qué-somos-hombre-80.png">
    </a>
    <a href="interface_U_D.php">
        <img src="./Static/img/icons8-actualizar-80.png">
    </a>
    <a href="./Static/convertirpdf/excel.php">
        <img src="./Static/img/icons8-actualizar-80.png">
    </a>
    <a href="./Static/convertirpdf/reporte.php">
        <img src="./Static/img/icons8-actualizar-80.png">
    </a>
    <script src='Static/js/appvlidacion.js'></script>         
</form>            
