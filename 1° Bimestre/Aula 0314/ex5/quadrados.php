<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Soma dos quadrados</title>
    <style>
        body{
            font-family: Arial, Helvetica, sans-serif;
            text-align: center;
            font-size: large;
        }
    </style>
</head>
<body>
    <?php
        $num1 = $_POST['num1'];
        $num2 = $_POST['num2'];
        $num3 = $_POST['num3'];

        $result = ($num1*$num1)+($num2*$num2)+($num3*$num3);
        echo "$num1 ² + $num2 ² + $num3 ² = $result";
    ?>
</body>
</html>