BEGIN TRANSACTION;


DROP TABLE IF EXISTS address, address_type, customer, sale, size, topping, pizza, pizza_topping, employee CASCADE;


CREATE TABLE address_type
(
	address_type_id serial,
	type_description varchar(35) not null,

	constraint pk_address_type_id primary key (address_type_id)
);


CREATE TABLE address
(
	address_id serial,
	street varchar(35) not null,
	city varchar(20) not null,
	zip_code varchar(10) not null,
	address_type_id int not null,
	user_id int not null,

	constraint pk_address primary key (address_id),
	constraint fk_address_user foreign key (user_id) references users (user_id),
	constraint fk_address_address_type foreign key (address_type_id) references address_type (address_type_id)
);


CREATE TABLE customer
(
	customer_id serial,
	first_name varchar(20) not null,
	last_name varchar(20) not null,
	phone_number varchar(10),
	email_address varchar(50),
	email_offers boolean not null,
	user_id int not null,

	constraint pk_customer primary key (customer_id),
	constraint fk_customer foreign key (user_id) references users (user_id)
);



CREATE TABLE size
(
	size_id varchar(2) not null,
	size_description varchar(20) not null,
	diameter int not null,
	base_price numeric(4,2) not null,

	constraint pk_size primary key (size_id)
);

CREATE TABLE pizza
(
	pizza_id serial,
	pizza_name varchar(20) not null,
	size_id varchar(2) not null,
	price numeric(4,2),
	is_specialty boolean not null,
	is_available boolean not null,
	img_url varchar(500),
	additional_instructions varchar(500),


	constraint pk_pizza primary key (pizza_id),
	constraint fk_pizza_size foreign key (size_id) references size (size_id)
);



CREATE TABLE sale
(
	sale_id serial,
	total numeric(6,2),
	is_delivery boolean not null,
	customer_id int,

	constraint pk_sale primary key (sale_id),
	constraint fk_sale_customer foreign key (customer_id) references customer (customer_id)
);


CREATE TABLE pizza_sale
(
	pizza_id int not null,
	sale_id int not null,

	constraint fk_pizza_sale_pizza foreign key (pizza_id) references pizza (pizza_id),
	constraint fk_pizza_sale_sale foreign key (sale_id) references sale (sale_id)
);



CREATE TABLE topping
(
	topping_name varchar(15) not null,
	additional_price numeric(3,2) not null,
	is_vegetable boolean not null,

	constraint pk_topping primary key (topping_name)
);




CREATE TABLE pizza_topping
(
	pizza_id int not null,
	topping_name varchar(15) not null,


	constraint fk_pizza_topping_pizza foreign key (pizza_id) references pizza (pizza_id),
	constraint fk_pizza_topping_topping foreign key (topping_name) references topping (topping_name)
);



CREATE TABLE employee
(
	employee_id serial,
	first_name varchar(20) not null,
	last_name varchar(20) not null,
	phone_number varchar(10),
	email_address varchar(50),
	salary numeric(4,2) not null,
	user_id int not null,

	constraint pk_employee primary key (employee_id),
	constraint fk_employee foreign key (user_id) references users (user_id)
);

COMMIT;