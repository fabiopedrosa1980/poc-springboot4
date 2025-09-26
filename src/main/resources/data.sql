create table if not exists Product(
    id serial primary key,
    name varchar not null
);
DELETE FROM Product;
INSERT INTO Product (name) values ('Iphone 17');
INSERT INTO Product (name) values ('Mackbook Pro');