<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Média Aluno</title>
    <style>
        body{
            font-family: Arial, Helvetica, sans-serif;
            text-align: center;
            font-weight: bold;
        }

        .aprovado{
            color: green;
        }

        .reporvado{
            color: red;
        }
    </style>
</head>
<body>
    <?php
        $nome = $_POST['nome'];
        $nota1 = $_POST['nota1'];
        $nota2 = $_POST['nota2'];
        $nota3 = $_POST['nota3'];
        $nota4 = $_POST['nota4'];
        
        if($nota1 == "" || $nota2 == "" || $nota3 == "" || $nota4 == ""){
            echo "Você não digitou todas as notas.";
        }else{
            if($nome != ""){
                if($nota1 > 0 && $nota2 > 0 && $nota3 > 0 && $nota4 > 0 && $nota1 <= 10&& $nota2 <= 10&& $nota3 <= 10&& $nota4 <= 10){
                    $media = ($nota1 + $nota2 + $nota3 + $nota4)/4;
                    if($media >= 5){
                        echo "<div class=aprovado>O(a) aluno(a) $nome foi aprovado</div>Média: $media";
                    }else{
                        echo "<div class=reporvado>O(a) aluno(a) $nome foi reprovado</div> Média: $media";
                    }
                }else{
                    echo "As notas variam de 1 a 10, digite valores válidos.";
                }
            }else{
                echo "Digite o nome do aluno.";
            }
        }
    ?>
</body>
</html>