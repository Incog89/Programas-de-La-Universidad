<?php include 'Static/connect/db.php';?>
<?php include 'includes/header.php';?>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<h1>CONSULTA GENERAL</h1>
<table class="table table-dark">
<thead class="thead-dark">
<tr>
    <td>ID</td> <td>SERVICIO</td> <td>INVERSION</td>
</tr>
</thead>
<?php
    $consulta = "SELECT * FROM servicios;";
    $resul = mysqli_query($conexion, $consulta);
    while($row = mysqli_fetch_array($resul)){ ?>
    <tr>
        <td><?php echo $row['id'];   ?></td>
        <td><?php echo $row['nombre'];   ?></td>
        <td><?php echo $row['precio'];   ?></td>
    </tr>

<?php } ?>
</table>