create database fornecedores

use fornecedores

create table tecido(
    nome varchar(50) not null, -- Nome do fornecedor, não pode ser nulo
    cnpj varchar(30) not null, -- Número de CNPJ do fornecedor do tecido, não pode ser nulo
    QtdLote int, -- Quantidade de tecidos no lote
    Preco float, -- Preço do lote
    FornecedorID int primary key identity -- ID do fornecedor do tecido, chave primária autoincrementada
)