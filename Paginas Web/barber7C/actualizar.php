<?php include 'Static/connect/db.php';?>
<?php
    if(isset($_GET['id'])){
        $ID = $_GET['id'];
        $query1 = "SELECT *FROM servicios WHERE id=$ID;";
        $resul_services = mysqli_query($conexion,$query1);
        if(mysqli_num_rows($resul_services)==1){
            $row = mysqli_fetch_array($resul_services);
            $nombre = $row['nombre'];
            $precio = $row['precio'];
            //echo $nombre . "|" . $precio;
        }
    }
    if(isset($_POST['update'])){
        $ID = $_GET['id'];
        $nombre = $_POST['nombre'];
        $precio = $_POST['precio'];
        $query = "UPDATE servicios SET nombre='$nombre', precio = $precio where id=$ID;";
        mysqli_query($conexion,$query);
        header("Location: interface_U_D.php");
    }
?>
<?php include 'includes/header.php';?>
<form action="actualizar.php?id=<?php echo $_GET['id']?>" method = "POST">
    <div class="form_container">
         <label for="nombre" class="formulario_label">
        Nombre del servicio:</label>
        <input type="text" name="nombre" id="nombre" class="formulario_input"
        value="<?php echo $nombre?>">
    </div>
    <div class="form_container">
     <label for="precio" class="formulario_label">
      Precio del servicio:</label>
     <input type="text" name="precio" id="precio" class="formulario_input" 
        maxlength="4" value="<?php echo $precio?>">
    </div>
    <hr>
    <button name="update" class="formulario_btn">ACTUALIZAR</button>    
</form>
