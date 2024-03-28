<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Troca de números</title>
    <style>
        body{
            font-family: Arial, Helvetica, sans-serif;
            text-align: center;
            font-weight: bold;
        }
    </style>
</head>
<body>
    <?php
        $a = $_POST['valA'];
        $b = $_POST['valB'];

        echo "Valor inicial de A = $a <br> Valor inicial de B = $b <br><br>";

        $mem = $b;
        $b = $a;
        $a = $mem;

        echo "Valor final de A = $a <br> Valor final de B = $b";
    ?>
</body>
</html>