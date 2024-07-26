CREATE TABLE tb_cliente (
	id BIGINT,
	nome VARCHAR(50) NOT NULL,
    codigo VARCHAR NOT NULL,
	CONSTRAINT pk_id_cliente primary key(id)
);

create sequence sq_cliente
start 1
increment 1
owned by tb_cliente.id;

CREATE TABLE tb_produto (
	id BIGINT,
	nome VARCHAR(50) NOT NULL,
    codigo VARCHAR NOT NULL,
	CONSTRAINT pk_id_produto primary key(id)
);

create sequence sql_produto
start 1
increment 1
owned by tb_produto.id;