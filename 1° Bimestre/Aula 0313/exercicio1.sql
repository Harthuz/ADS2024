create database exercicio1 -- Cria novo banco de dados 

use exercicio1 -- Seleciona o banco de dados exercicio1

create table pet( -- Cria tabela = pet
    NumRegistro int, -- Define uma coluna para armazenar o número de registro do animal
    Nome varchar(80), -- "" o nome do animal
    Especie varchar(25), -- "" a espécie do animal
    Raca varchar(30), -- "" a raça do animal
    Cor varchar(40), -- "" a cor do animal
    Nascimento datetime, -- "" a data de nascimento do animal
    Sexo varchar(9) -- "" o sexo do animal
);
