<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Salário</title>
</head>
<body>
    <?php
        $sal = $_POST['sal'];

        if($sal <= 0){
            echo "Digite um valor válido no campo salário; Maior que 1.";
        }else{
            $bonus = $sal*(10/100);
            $imposto = $sal*(20/100);
            $sal_final = $sal + $bonus - $imposto;

            echo "Valor da gratificação: R$$bonus <br> Valor do imposto de renda: R$$imposto <br> Salários final: R$$sal_final";
        }
    ?>
</body>
</html>