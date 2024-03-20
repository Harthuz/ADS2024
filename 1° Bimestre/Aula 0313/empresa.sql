create database empresa

use empresa

create table departamento(
    Nome varchar(30) not null, -- Nome do departamento, não pode ser nulo
    QtdPessoas int, -- Quantidade de pessoas no departamento
    NomeResponsavel varchar(50) not null, -- Nome do responsável pelo departamento, não pode ser nulo
    ID int primary key identity, -- ID do departamento, chave primária autoincrementada
    finalidade varchar(255), -- Finalidade ou descrição do departamento
    Local varchar(100) default 'Av. Das Américas' -- Localização do departamento, automaticamente preenchida com o endereço da sede da empresa
)