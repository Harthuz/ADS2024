<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gerador de Tabuada.php</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        .container {
            width: 80%;
            padding: 0px 10px;
            border-radius: 8px;
        }
        .error {
            color: red;
            font-weight: bold;
        }
        .tabuada {
            color: #007bff;
            font-weight: bold;
        }
    </style>
</head>
<body>
    <div class="container">
        <?php
        $num = isset($_POST['num']) ? $_POST['num'] : "";

        if ($num == "") {
            echo "<p class='error'>Parece que você não digitou nada :(</p>";
        } else {
            if ($num > 0) {
                echo "<p class='tabuada'>Tabuada do $num</p>";
                for ($i = 1; $i <= 10; $i++) {
                    $result = $num * $i;
                    echo "$num x $i = $result <br>";
                }
            } else {
                echo "<p>Você digitou 0 :) </p>";
                echo "<p class='tabuada'>Todo número multiplicado por 0 é igual a... 0</p>";
            }
        }
        ?>
    </div>
</body>
</html>
