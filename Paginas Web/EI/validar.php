<?php include 'Static/connect/db.php';?>
<?php


if(isset($_POST['registrar'])){

    if(strlen($_POST['usuario']) >=1  && strlen($_POST['contrasena'])  
    >=1 && strlen($_POST['rol']) >= 1 ){// script para la validacion de nuevos usuarios
                                        // si cumple los parametros suficientes
    $nombre = trim($_POST['usuario']);  //este puede tomar los datos dados en el registro
    $password = trim($_POST['contrasena']);//de nuevos usuarios para la insercion en la base de datos
    $rol = trim($_POST['rol']);

    $consulta= "INSERT INTO usuarios (usuario, contrasena, rol)
    VALUES ('$nombre', '$password', '$rol' )";

    mysqli_query($conn, $consulta);
    mysqli_close($conn);

    header('Location: Servicios.php');
  }
}
?>