<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Números Ímpares</title>
</head>
<body>
    <?php
        $num1 = $_POST['num1'];
        $num2 = $_POST['num2'];

        if($num1 < $num2){
            $mm = $num1;
            $num1 = $num2;
            $num2 = $mm; 
        }

        echo "Lista dos números ímpares entre $num1 e $num2 em ordem decrescente: <br>";

        if($num1 == $num2){
            echo "Os números digitados são iguais";
        }else{
            if($num1 % 2 == 0){
                $num1 -= 1;
                $valor = $num1;
                while($valor >= $num2){
                    echo $valor .', ';
                    $valor -= 2;
                }
            }
        }
    ?>
</body>
</html>