create database exercicio2 -- Cria novo banco de dados

use exercicio2 -- Seleciona o banco de dados exercicio2

create table departamento( -- Cria tabela = departamento
    CodFunc int, -- Define uma coluna para armazenar o código do funcionário
    NomeDepto carchar(50), -- "" o nome do departamento
);

create table Funcionario( -- Cria tabela = Funcionario
    CodFunc int, -- Define uma coluna para armazenar o código do funcionário
    NomeFunc varchar(50), -- "" o nome do funcionário
    CodDepto int, -- "" o código do departamento
    Ramal int NULL, -- "" o ramal (pode ser nulo)
    Salario float, -- "" o salário do funcionário
    DataAdmissao datetime, -- "" a data de admissão do funcionário
    DataCadastro datetime, -- "" a data de cadastro do funcionário
    Sexo char(1) -- "" o sexo do funcionário
);