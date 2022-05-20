



Insert into customer (first_name, last_name, phone_number, email_address, email_offers, user_id)
values('test', 'customer', '6194533338', 'hannahhudson.dev@gmail.com', true, 1)


Insert into sale (total, is_delivery, customer_id)
values(17.94, true, 1);

Insert into pizza_sale (pizza_id, sale_id)
values(1, 1);


Select * from
pizza p
left join pizza_sale orders
on p.pizza_id = orders.pizza_id
left join sale s
on orders.sale_id = s.sale_id;

select * from sale