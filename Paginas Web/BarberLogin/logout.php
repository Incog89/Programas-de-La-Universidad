<?php include 'includes/header.php';?>
<?php
session_start();
session_destroy();
header("Location: index.php");   
?>