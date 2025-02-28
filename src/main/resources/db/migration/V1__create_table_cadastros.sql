create table cadastros(
    id bigint not null auto_increment,
    nome varchar(100) not null,
    email varchar(100) not null unique,
    senha varchar(100) not null unique,
    rua varchar(100) not null,
    numero varchar(100) not null,
    bairro varchar(100) not null,
    cidade varchar(100) not null,
    cep varchar(9) not null,

    primary key (id)
);