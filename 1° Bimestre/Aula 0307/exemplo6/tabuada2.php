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
        $num = $_POST['num'];
        while($i <= 10){
            $tab = $num * $i;
            echo $num ." x " .$i ." = " .$tab .'<br>';
            $i++;
        }
    ?>
</body>
</html>