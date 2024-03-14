<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Página calcularsomamostrar.php</title>
</head>
<body>
    <?php
        $A = $_POST['textoA'];
        $B = $_POST['textoB'];
        $soma = $A + $B;
        echo "A soma de " .$A ." + " .$B ." é igual a " .$soma .'<br>';
        if($soma>10){
            echo '<font color = "blue">'."Soma é maior que dez" .'</font>';
        }else{
            echo '<font color = "red">'."Soma é menor que dez" .'</font>';
        }
    ?>
</body>
</html>