-- drop schema pizzarestaurant;

create schema if not exists pizzarestaurant;
use pizzarestaurant;

-- customer	: id, cname, cage
create table customer(
	id int primary key auto_increment,
    cname varchar(20) not null,
    cage int not null
);
-- ingredient	: id, iname
create table ingredient(
	id int primary key auto_increment,
    iname varchar(20) not null
);
-- size		: id, sname
create table size(
	id int primary key auto_increment,
    sname varchar(20) not null
);
-- pizza 		: id, size_id
create table pizza(
	id int primary key auto_increment,
    size_id int,
    constraint pizza_fk foreign key (size_id) references size (id)
);
-- payment	: id, pname
create table payment(
	id int primary key auto_increment,
    pname varchar(20)
);

-- pizza_ingredients	: pizza_id, ingredient_id
create table pizza_ingredients(
	pizza_id int, 
    ingredient_id int,
    constraint pizza_ingredients_fk1 foreign key(pizza_id) references pizza(id),
    constraint pizza_ingredients_fk2 foreign key(ingredient_id) references ingredient(id)
);
-- orders			: id, customer_id, pizza_id, payment_id, order_date
create table orders(
	id int primary key auto_increment, 
    customer_id int, 
    pizza_id int, 
    payment_id int, 
    order_date date,
    constraint orders_fk1 foreign key(customer_id) references customer(id),
    constraint orders_fk2 foreign key(pizza_id) references pizza(id),
    constraint orders_fk3 foreign key(payment_id) references payment(id)
);

insert into size (sname) values
('Large'),
('Medium'),
('Small');

insert into ingredient(iname) values
('Mushroom'),
('Sausage'),
('Pepperoni'),
('Cheese'),
('Ham');

insert into payment(pname) values
('Cash'),
('Credit Card'),
('Paypal');

select * from payment;
select * from ingredient;
select * from size;


