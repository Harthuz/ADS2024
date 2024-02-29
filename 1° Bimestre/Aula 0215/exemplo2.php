<html>

<head>

    <title>PHP - Uso de variáveis</title>

    <body>
        
        <?php
        
            // declarando variáveis
            $var1 = 1; // inteiro
            $varX = 9.50; // ponto flutuante
            $varY = 9.50; // ponto flutuante
            $var2 = $varX + $varY; // recebendo o resultado de uma expressão
            $varSTR ="AtribuiString"; // variável de texto - string
            $varletra = "a"; // variavel caracter
            $varbool = true; // atribuição lógica

            echo "Exemplo de uma aplicação em PHP";
            print "<P>";

            echo "Conteúdo de var1: ";
            echo $var1;
            print "<P>";

            echo "Conteúdo de varX: ";
            echo $varX;
            print "<P>";

            echo "Conteúdo de varY: ";
            echo $varY;
            print "<P>";

            echo "Conteúdo de var2: ";
            echo $var2;
            print "<P>";

            echo "Conteúdo de varSTR: ";
            echo $varSTR;
            print "<P>";

            echo "Conteúdo de varletra: ";
            echo $varletra;
            print "<P>";
            echo "Conteúdo de varbool: ";
            echo $varbool;

        ?>

    </body>

</head>

</html>