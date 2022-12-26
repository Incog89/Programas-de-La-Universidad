<?php include 'Static/connect/dblogin.php';?>
<?php include 'includes/header.php';?>
<?php 
$user=$_POST['usuario'];
$password=$_POST['contrasena'];
$sql ="INSERT INTO usuarios(usuario, contrasena) values('$user','$password');";
    $query = mysqli_query($conn,$sql);
    sleep(3);
    header("Location: index.php");
?>