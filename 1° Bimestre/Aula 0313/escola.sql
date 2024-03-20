create database escola

use escola

create table funcionario(
    nome varchar(50) not null, -- Nome do funcionário, não pode ser nulo
    rg varchar(30), -- Número de RG do funcionário
    cpf varchar(30) not null, -- Número de CPF do funcionário, não pode ser nulo
    numRegistro int primary key, -- Número de registro do funcionário, chave primária da tabela
    cep varchar(30) not null, -- CEP do endereço do funcionário, não pode ser nulo
    sexo char(1), -- Sexo do funcionário
    estadoCivil varchar(20), -- Estado civil do funcionário
    telefone varchar(30), -- Número de telefone do funcionário
    email varchar(30) not null, -- Endereço de e-mail do funcionário, não pode ser nulo
    salario float, -- Salário do funcionário
    cargo varchar(50), -- Cargo do funcionário
    idade datetime -- Data de nascimento do funcionário
)