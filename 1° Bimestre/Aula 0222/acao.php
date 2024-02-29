<html>
    <head>
        <title>Documento aacao.php</title>
    </head>
    <body>
        <?php
            $Vnome=$_POST["nome"];
            $Vidade= $_POST["idade"];

            echo "Oi!! " . $Vnome .  " . " . "<br>" . "Você tem " . $Vidade . " anos!!";
        ?>
    </body>
</html>