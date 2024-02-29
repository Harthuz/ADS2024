<html>
<head>
    <title>Página calcularsalario.php</title>
</head>
<body>
    <?php
    $valor = $_POST['txtvalor']; 
    $horas = $_POST['txthoras']; 
    $salario = $valor * $horas;
    echo "De acordo com as informações inseridas, o seu salário é R$: " . $salario;
    ?>
</body>
</html>