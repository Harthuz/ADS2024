<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Maior e menor</title>
</head>
<body>
    <?php
        $num1 = $_POST['num1'];
        $num2 = $_POST['num2'];
        $num3 = $_POST['num3'];

        if($num1 >= $num2){
            if($num1 >= $num3){
                $maior = $num1;
            }
            if($num2 <= $num3){
                $menor = $num2;
            }
            else{
                $menor = $num3;
            }
        }
        if($num2 >= $num1){
            if($num2 >= $num3){
                $maior = $num2;
            }
            if($num3 <= $num1){
                $menor = $num3;
            }
            else{
                $menor = $num1;
            }
        }
        if($num3 >= $num1){
            if($num3 >= $num2){
                $maior = $num3;
            }
            if($num1 <= $num2){
                $menor = $num1;
            }
            else{
                $menor = $num2;
            }
        }

        echo $maior . '<br>' . $menor;
    ?>
</body>
</html>