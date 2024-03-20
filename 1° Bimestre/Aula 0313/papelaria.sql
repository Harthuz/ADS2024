create database papelaria

use papelaria

create table produtos(
    preco float not null, -- Preço do produto, não pode ser nulo
    qtdDisponivel int, -- Quantidade disponível do produto
    nome varchar(30) not null, -- Nome do produto, não pode ser nulo
    dataValidade datetime, -- Data de validade do produto
    codigoDeBarra int, -- Código de barras do produto
    id int primary key identity, -- ID do produto, chave primária autoincrementada
    marca varchar(20), -- Marca do produto
    cor varchar(10) -- Cor do produto
)