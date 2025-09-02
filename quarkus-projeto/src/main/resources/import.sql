insert into Categoria (nome) values ('Bebidas');
insert into Categoria (nome) values ('Carnes');
insert into Categoria (nome) values ('Limpezas');
insert into Categoria (nome) values ('Congelados');
insert into Categoria (nome) values ('Hortifruti');
insert into Categoria (nome) values ('Laticinios');
insert into Categoria (nome) values ('Doces');
insert into Categoria (nome) values ('Padaria');
insert into Categoria (nome) values ('Higiene pessoal');
insert into Categoria (nome) values ('Mercearia');


insert into Fabricante (nome) values ('JBS');
insert into Fabricante (nome) values ('Coca Cola Company');
insert into Fabricante (nome) values ('Ype');
insert into Fabricante (nome) values ('Frutap');
insert into Fabricante (nome) values ('Seara');
insert into Fabricante (nome) values ('Nestle');
insert into Fabricante (nome) values ('Colgate');
insert into Fabricante (nome) values ('Pepsi');
insert into Fabricante (nome) values ('Monster');
insert into Fabricante (nome) values ('OMO');
insert into Fabricante (nome) values ('Lacta');
insert into Fabricante (nome) values ('Brahma');


insert into Produto (nome, quantidade, preco, validade, categoria_codigo, fabricante_codigo) values ('Pepsi 2 litros', 10, 7.50, '2025-11-15', 1, 8);
insert into Produto (nome, quantidade, preco, validade, categoria_codigo, fabricante_codigo) values ('Carne Bovina 1kg', 15, 25.90, '2025-09-15', 2, 1);
insert into Produto (nome, quantidade, preco, validade, categoria_codigo, fabricante_codigo) values ('Sabão líquido Ypê 3L', 20, 18.70, '2026-01-01', 3, 3);
insert into Produto (nome, quantidade, preco, validade, categoria_codigo, fabricante_codigo) values ('Pizza Congelada Seara', 8, 14.90, '2026-03-20', 4, 5);
insert into Produto (nome, quantidade, preco, validade, categoria_codigo, fabricante_codigo) values ('Maçã Gala 1kg', 30, 7.20, '2025-09-10', 5, 4);
insert into Produto (nome, quantidade, preco, validade, categoria_codigo, fabricante_codigo) values ('Leite Ninho 1L', 25, 5.80, '2025-10-05', 6, 6);
insert into Produto (nome, quantidade, preco, validade, categoria_codigo, fabricante_codigo) values ('Chocolate Lacta Ao Leite 90g', 50, 4.90, '2025-12-01', 7, 11);
insert into Produto (nome, quantidade, preco, validade, categoria_codigo, fabricante_codigo) values ('Pão de Forma', 40, 6.00, '2025-09-05', 8, 6);
insert into Produto (nome, quantidade, preco, validade, categoria_codigo, fabricante_codigo) values ('Pasta de dente Colgate 350ml', 18, 12.50, '2026-02-18', 9, 7);
insert into Produto (nome, quantidade, preco, validade, categoria_codigo, fabricante_codigo) values ('Arroz Tipo 1 5kg', 35, 22.00, '2026-06-30', 10, 1);

insert into Funcionario (cpf, nome) values ('12345678901', 'João Silva');
insert into Funcionario (cpf, nome) values ('23456789012', 'Maria Oliveira');
insert into Funcionario (cpf, nome) values ('34567890123', 'Pedro Santos');
insert into Funcionario (cpf, nome) values ('45678901234', 'Ana Costa');
insert into Funcionario (cpf, nome) values ('56789012345', 'Carlos Pereira');
insert into Funcionario (cpf, nome) values ('67890123456', 'Juliana Martins');
insert into Funcionario (cpf, nome) values ('78901234567', 'Fernanda Rocha');
insert into Funcionario (cpf, nome) values ('89012345678', 'Bruno Lima');
insert into Funcionario (cpf, nome) values ('90123456789', 'Paula Fernandes');
insert into Funcionario (cpf, nome) values ('01234567890', 'Ricardo Alves');

insert into Cliente (cpf, nome) values ('111-222-333-44', 'Lucas Mendes');
insert into Cliente (cpf, nome) values ('22233344455', 'Carla Souza');
insert into Cliente (cpf, nome) values ('33344455566', 'Thiago Ribeiro');
insert into Cliente (cpf, nome) values ('44455566677', 'Amanda Costa');
insert into Cliente (cpf, nome) values ('55566677788', 'Rodrigo Lima');
insert into Cliente (cpf, nome) values ('66677788899', 'Vanessa Rocha');
insert into Cliente (cpf, nome) values ('77788899900', 'Felipe Oliveira');
insert into Cliente (cpf, nome) values ('88899900011', 'Beatriz Martins');
insert into Cliente (cpf, nome) values ('99900011122', 'Renato Alves');
insert into Cliente (cpf, nome) values ('00011122233', 'Tatiane Ferreira');
