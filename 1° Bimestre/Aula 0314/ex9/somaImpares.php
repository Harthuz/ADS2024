<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Soma dos Ímpares</title>
</head>
<body>
    <?php
        $num1 = $_POST['num1'];
        $num2 = $_POST['num2'];
        

        if($num1 > $num2){
            $mm = $num1;
            $num1 = $num2;
            $num2 = $mm;
        }

        echo "A soma dos números ímpares entre $num1 e $num2 é de ";

        if($num1 == $num2){
            echo "Os números digitados são iguais.";
        }else{
            if($num1 % 2 == 0){
                $num1 += 1;
                $valor = $num1;
    
                while($valor <= $num2){
                    $soma += $valor;
                    $valor += 2;
                }
            }else{
                $valor = $num1;
                while($valor <= $num2){
                    $soma += $valor;
                    $valor += 2;
                }
            }
        }

        echo $soma
    ?>
</body>
</html>