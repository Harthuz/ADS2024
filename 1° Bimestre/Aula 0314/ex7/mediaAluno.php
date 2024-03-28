<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Média/ Aprovação</title>
</head>
<body>
    <?php
        $nota1 = $_POST['nota1'];
        $nota2 = $_POST['nota2'];
        $nota3 = $_POST['nota3'];
        $nota4 = $_POST['nota4'];
        
        if($nota1 == "" || $nota2 == "" || $nota3 == "" || $nota4 == ""){
            echo "Você não digitou todas as notas.";
        }else{
            if($nota1 >= 0 && $nota2 >= 0 && $nota3 >= 0 && $nota4 >= 0 && $nota1 <= 10&& $nota2 <= 10&& $nota3 <= 10&& $nota4 <= 10){
                $media = ($nota1 + $nota2 + $nota3 + $nota4)/4;
                if($media >= 6){
                    echo "Aluno aprovado com a média: $media";
                }else{
                    if($media < 3){
                        echo "Aluno retido com média: $media";
                    }else{
                        echo "Aluno deverá fazer um exame pois teve média: $media";
                    }
                }
                
            }else{
                echo "As notas variam de 0 a 10, digite valores válidos.";
            }
        }
    ?>
</body>
</html>