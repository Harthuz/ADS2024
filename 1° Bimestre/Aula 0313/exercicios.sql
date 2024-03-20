-- Exercicio 1

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

-- Exercicio 2

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

-- Exercicio: Empresa

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

-- Exercicio: Escola

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

-- Exercicio: Fornecedores

create database fornecedores

use fornecedores

create table tecido(
    nome varchar(50) not null, -- Nome do fornecedor, não pode ser nulo
    cnpj varchar(30) not null, -- Número de CNPJ do fornecedor do tecido, não pode ser nulo
    QtdLote int, -- Quantidade de tecidos no lote
    Preco float, -- Preço do lote
    FornecedorID int primary key identity -- ID do fornecedor do tecido, chave primária autoincrementada
)

-- Exercicio: Papelaria

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