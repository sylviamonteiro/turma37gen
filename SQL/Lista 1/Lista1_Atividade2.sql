create database db_ecommerce;
create table tb_produtos(
cod_produto int not null auto_increment,
nome_produto varchar (255),
preco double not null,
estoque int,
data_compra date,
primary key (cod_produto)
);

insert into tb_produtos(nome_produto,preco, estoque, data_compra) values
("")
("")
("")
("")
("")
("")
("")
("")

select from tb_produtos where preco>500;
select from tb_produtos where preco<500;