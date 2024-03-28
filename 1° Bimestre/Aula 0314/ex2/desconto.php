<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Desconto.php</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            font-weight: bold;
        }

        .descontao{
            color: #007bff;
        }

        .valor{
            color: green;
        }

        .error{
            color: red;
        }
    </style>
</head>
<body>
    <?php
    $preco = $_POST['preco'];
    $porc = $_POST['porc'];

    if($preco > 0 && $porc > 0){
        if($porc >= 100){
            echo "<div class = descontao >Uau, que descontão!!! <br></div>";
        }
        $valordesconto = $preco * ($porc/100);
        $valorfinal = $preco-$valordesconto;

        echo "O valor do desconto foi de <div class = valor>R$$valordesconto</div> <br> Preço original: <div class = valor>R$$preco</div> <br> Valor final: <div class = valor>R$$valorfinal</div>";
    }else{
        if($preco = "" || $preco <= 0){
            echo "
            <div class = error>Erro</div>
            Digite um preço válido maior que 0. <br>";
        }
    
        if($porc <= 0 || $porc = ""){
            echo "
            <div class = error>Erro</div>
            Digite uma porcentagem de desconto válida maior que 0.";
        }
    }
    ?>
</body>
</html>