<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Página tabuada.php</title>
</head>
<body>
    <?php
        $i = 0;
        while($i <= 10){
            $tab = 2 * $i;
            echo "2 x " .$i ." = " .$tab .'<br>';
            $i++;
        }
    ?>
</body>
</html>