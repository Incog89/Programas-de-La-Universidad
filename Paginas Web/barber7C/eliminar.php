<?php include 'Static/connect/db.php';?>
<?php include 'includes/header.php';?>
<?php 
    if(isset($_GET['id'])){
        $ID = $_GET['id'];
        $SQL = "DELETE FROM servicios WHERE id=$ID;";
        $exec = mysqli_query($conexion,$SQL);
        sleep(2);
        header("Location: interface_U_D.php");
    }
?>

