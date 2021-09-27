CREATE DATABASE RH;

USE RH;

create table funcionarios id INT PRIMARY KEY auto_increment;

alter table funcionarios add column (salario DECIMAL,
cargo varchar(60)); 

INSERT INTO funcionarios (nome, cpf, telefone, salario, cargo) VALUES

("Julio", "11111111111", "999999997","7000", "dev junior"),
("Julia", "11111111112", "999999996","1000", "dev junior"),
("Julie", "11111111113", "999999995","7000", "dev junior"),
("Julii", "11111111114", "999999994","5200", "dev junior"),
("Julic", "11111111115", "999999993","5000", "dev junior"),
("Julib", "11111111116", "999999992","5000", "dev junior"),
("Julid", "11111111117", "999999991","7000", "dev junior");

select * from funcionarios;

select nome, salario from funcionarios where salario >= 2000; 
select nome, salario from funcionarios where salario < 2000; 

update funcionarios set salario = 2000 where id = 3;


