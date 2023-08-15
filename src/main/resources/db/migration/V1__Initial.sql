CREATE TABLE IF NOT EXISTS CUSTOMER(
	ID varchar(255) PRIMARY KEY,
	NAME varchar(255) not null,
	EMAIL varchar(255) not null
);

insert into CUSTOMER (ID, NAME, EMAIL) values ('1', 'Ahmad', 'a@a.com');
insert into CUSTOMER (ID, NAME, EMAIL) values ('2', 'Sami', 's@s.com');
insert into CUSTOMER (ID, NAME, EMAIL) values ('3', 'Khalid', 'k@k.com');
insert into CUSTOMER (ID, NAME, EMAIL) values ('4', 'Rami', 'r@r.com');
insert into CUSTOMER (ID, NAME, EMAIL) values ('5', 'Basem', 'b@b.com');