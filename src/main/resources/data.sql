create table if not exists Product(
    id serial primary key,
    name varchar not null
);
DELETE FROM Product;
INSERT INTO Product (id,name) values (1,'Iphone 17');
INSERT INTO Product (id,name) values (2,'Mackbook Pro');