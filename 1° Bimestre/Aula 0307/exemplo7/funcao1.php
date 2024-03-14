<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>função 1</title>
</head>
<body>
    <?php
        function escreve_separa($cadeia){
            for ($i=0;$i<strlen($cadeia);$i++){
                echo $cadeia[$i];
                if ($i<strlen($cadeia)-1)
                    echo "-";
            }
        }
        escreve_separa ("Hernandes");
        echo "<p>";
        escreve_separa ("Texto mais comprido, para ver o que faz");
    ?>
</body>
</html>