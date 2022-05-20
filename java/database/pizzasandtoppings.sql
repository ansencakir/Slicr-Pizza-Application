INSERT INTO topping (topping_name, additional_price, is_vegetable) VALUES ('Pepperoni', 1.50, false);
INSERT INTO topping (topping_name, additional_price, is_vegetable) VALUES ('Sausage', 1.50, false);
INSERT INTO topping (topping_name, additional_price, is_vegetable) VALUES ('Extra Cheese', 0.50, false);
INSERT INTO topping (topping_name, additional_price, is_vegetable) VALUES ('Green Peppers', 0.75, true);
INSERT INTO topping (topping_name, additional_price, is_vegetable) VALUES ('Onions', 0.75, true);
INSERT INTO topping (topping_name, additional_price, is_vegetable) VALUES ('Mushrooms', 1.00, true);
INSERT INTO topping (topping_name, additional_price, is_vegetable) VALUES ('Chicken', 2.00, false);
INSERT INTO topping (topping_name, additional_price, is_vegetable) VALUES ('Bacon', 1.50, false);
INSERT INTO topping (topping_name, additional_price, is_vegetable) VALUES ('Anchovies', 1.00, false);
INSERT INTO topping (topping_name, additional_price, is_vegetable) VALUES ('Black Olives', 0.75, true);
INSERT INTO topping (topping_name, additional_price, is_vegetable) VALUES ('Pineapple', 1.50, true);
INSERT INTO topping (topping_name, additional_price, is_vegetable) VALUES ('Ham', 1.00, false);
INSERT INTO topping (topping_name, additional_price, is_vegetable) VALUES ('Tomatoes', 0.75, true);
INSERT INTO topping (topping_name, additional_price, is_vegetable) VALUES ('Cauliflower', 1.25, true);
INSERT INTO topping (topping_name, additional_price, is_vegetable) VALUES ('Spinach', 1.00, true);
INSERT INTO topping (topping_name, additional_price, is_vegetable) VALUES ('Artichokes', 1.20, true);
INSERT INTO topping (topping_name, additional_price, is_vegetable) VALUES ('Garlic', 0.50, true);
INSERT INTO topping (topping_name, additional_price, is_vegetable) VALUES ('Zucchini', 1.00, true);
INSERT INTO topping (topping_name, additional_price, is_vegetable) VALUES ('Hot Sauce', 0.50, false);
INSERT INTO topping (topping_name, additional_price, is_vegetable) VALUES ('Ranch', 0.50, false);
INSERT INTO topping (topping_name, additional_price, is_vegetable) VALUES ('Alfredo', 0.50, false);
INSERT INTO topping (topping_name, additional_price, is_vegetable) VALUES ('Mozzarella', 1.00, false);
INSERT INTO topping (topping_name, additional_price, is_vegetable) VALUES ('Vegan Mozz', 1.50, false);
INSERT INTO topping (topping_name, additional_price, is_vegetable) VALUES ('Fresh Basil', 0.50, true);



INSERT INTO size (size_id, size_description, diameter, base_price) VALUES ('S', 'Small', 12, 9.99);
INSERT INTO size (size_id, size_description, diameter, base_price) VALUES ('M', 'Medium', 14, 11.99);
INSERT INTO size (size_id, size_description, diameter, base_price) VALUES ('L', 'Large', 16, 13.99);

INSERT INTO pizza (pizza_name, size_id, price, is_specialty, is_available, img_url, additional_instructions)
VALUES ('The Westendorf', 'S', 17.49, TRUE, TRUE, 'the-westendorf-pizza.jpg', 'None');

INSERT INTO pizza (pizza_name, size_id, price, is_specialty, is_available, img_url, additional_instructions)
VALUES ('The Westendorf', 'M', 19.49, TRUE, TRUE, 'the-westendorf-pizza.jpg', 'None');

INSERT INTO pizza (pizza_name, size_id, price, is_specialty, is_available, img_url, additional_instructions)
VALUES ('The Westendorf', 'L', 21.49, TRUE, TRUE, 'the-westendorf-pizza.jpg', 'None');

INSERT INTO pizza (pizza_name, size_id, price, is_specialty, is_available, img_url, additional_instructions)
VALUES ('The Green', 'S', 17.94, TRUE, TRUE, 'the-green-pizza.jpg', 'None');

INSERT INTO pizza (pizza_name, size_id, price, is_specialty, is_available, img_url, additional_instructions)
VALUES ('The Green', 'M', 19.94, TRUE, TRUE, 'the-green-pizza.jpg', 'None');

INSERT INTO pizza (pizza_name, size_id, price, is_specialty, is_available, img_url, additional_instructions)
VALUES ('The Green', 'L', 21.94, TRUE, TRUE, 'the-green-pizza.jpg', 'None');

INSERT INTO pizza (pizza_name, size_id, price, is_specialty, is_available, img_url, additional_instructions)
VALUES ('Hawaiian', 'S', 13.99, TRUE, TRUE, 'hawaiian-pizza.jpg', 'None');

INSERT INTO pizza (pizza_name, size_id, price, is_specialty, is_available, img_url, additional_instructions)
VALUES ('Hawaiian', 'M', 15.99, TRUE, TRUE, 'hawaiian-pizza.jpg', 'None');

INSERT INTO pizza (pizza_name, size_id, price, is_specialty, is_available, img_url, additional_instructions)
VALUES ('Hawaiian', 'L', 17.99, TRUE, TRUE, 'hawaiian-pizza.jpg', 'None');

INSERT INTO pizza (pizza_name, size_id, price, is_specialty, is_available, img_url, additional_instructions)
VALUES ('Vegan Pepperoni', 'S', 12.99, TRUE, TRUE, 'vegan-pepperoni-pizza.jpg', 'None');

INSERT INTO pizza (pizza_name, size_id, price, is_specialty, is_available, img_url, additional_instructions)
VALUES ('Vegan Pepperoni', 'M', 14.99, TRUE, TRUE, 'vegan-pepperoni-pizza.jpg', 'None');

INSERT INTO pizza (pizza_name, size_id, price, is_specialty, is_available, img_url, additional_instructions)
VALUES ('Vegan Pepperoni', 'L', 16.99, TRUE, TRUE, 'vegan-pepperoni-pizza.jpg', 'None');

INSERT INTO pizza (pizza_name, size_id, price, is_specialty, is_available, img_url, additional_instructions)
VALUES ('Alfredo', 'S', 13.49, TRUE, TRUE, 'chicken-alfredo-pizza.jpg', 'None');

INSERT INTO pizza (pizza_name, size_id, price, is_specialty, is_available, img_url, additional_instructions)
VALUES ('Alfredo', 'M', 15.49, TRUE, TRUE, 'chicken-alfredo-pizza.jpg', 'None');

INSERT INTO pizza (pizza_name, size_id, price, is_specialty, is_available, img_url, additional_instructions)
VALUES ('Alfredo', 'L', 17.49, TRUE, TRUE, 'chicken-alfredo-pizza.jpg', 'None');

INSERT INTO pizza (pizza_name, size_id, price, is_specialty, is_available, img_url, additional_instructions)
VALUES ('Margherita', 'S', 11.74, TRUE, TRUE, 'marg-pizza.jpg', 'None');

INSERT INTO pizza (pizza_name, size_id, price, is_specialty, is_available, img_url, additional_instructions)
VALUES ('Margherita', 'M', 13.74, TRUE, TRUE, 'marg-pizza.jpg', 'None');

INSERT INTO pizza (pizza_name, size_id, price, is_specialty, is_available, img_url, additional_instructions)
VALUES ('Margherita', 'L', 15.74, TRUE, TRUE, 'marg-pizza.jpg', 'None');

INSERT INTO pizza (pizza_name, size_id, price, is_specialty, is_available, img_url, additional_instructions)
VALUES ('The Phil', 'S', 14.49, TRUE, TRUE, 'spinach-bacon-pizza.jpg', 'None');

INSERT INTO pizza (pizza_name, size_id, price, is_specialty, is_available, img_url, additional_instructions)
VALUES ('The Phil', 'M', 16.49, TRUE, TRUE, 'spinach-bacon-pizza.jpg', 'None');

INSERT INTO pizza (pizza_name, size_id, price, is_specialty, is_available, img_url, additional_instructions)
VALUES ('The Phil', 'L', 18.49, TRUE, TRUE, 'spinach-bacon-pizza.jpg', 'None');

INSERT INTO pizza (pizza_name, size_id, price, is_specialty, is_available, img_url, additional_instructions)
VALUES ('Buffalo Chicken', 'S', 12.99, TRUE, TRUE, 'buffalo-chicken-pizza.jpg', 'None');

INSERT INTO pizza (pizza_name, size_id, price, is_specialty, is_available, img_url, additional_instructions)
VALUES ('Buffalo Chicken', 'M', 14.99, TRUE, TRUE, 'buffalo-chicken-pizza.jpg', 'None');

INSERT INTO pizza (pizza_name, size_id, price, is_specialty, is_available, img_url, additional_instructions)
VALUES ('Buffalo Chicken', 'L', 16.99, TRUE, TRUE, 'buffalo-chicken-pizza.jpg', 'None');

INSERT INTO pizza (pizza_name, size_id, price, is_specialty, is_available, img_url, additional_instructions)
VALUES ('Build Your Own', 'S', 9.99, FALSE, TRUE, 'cheese-pizza.jpg', 'None');

INSERT INTO pizza (pizza_name, size_id, price, is_specialty, is_available, img_url, additional_instructions)
VALUES ('Build Your Own', 'M', 11.99, FALSE, TRUE, 'cheese-pizza.jpg', 'None');

INSERT INTO pizza (pizza_name, size_id, price, is_specialty, is_available, img_url, additional_instructions)
VALUES ('Build Your Own', 'L', 13.99, FALSE, TRUE, 'cheese-pizza.jpg', 'None');



INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Westendorf' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Pepperoni'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Westendorf' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Sausage'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Westendorf' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Chicken'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Westendorf' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Bacon'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Westendorf' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Ham'));

INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Green' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Zucchini'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Green' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Spinach'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Green' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Artichokes'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Green' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Black Olives'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Green' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Mushrooms'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Green' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Onions'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Green' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Green Peppers'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Green' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Vegan Mozz'));

INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Hawaiian' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Pineapple'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Hawaiian' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Ham'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Hawaiian' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Bacon'));

INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Vegan Pepperoni' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Vegan Mozz'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Vegan Pepperoni' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Zucchini'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Vegan Pepperoni' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Garlic'));

INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Alfredo' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Alfredo'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Alfredo' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Chicken'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Alfredo' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Spinach'));

INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Margherita' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Mozzarella'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Margherita' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Tomatoes'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Margherita' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Fresh Basil'));

INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Phil' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Spinach'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Phil' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Bacon'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Phil' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Sausage'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Phil' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Garlic'));

INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Buffalo Chicken' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Chicken'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Buffalo Chicken' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Hot Sauce'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Buffalo Chicken' AND size_id = 'S'),
(SELECT topping_name FROM topping WHERE topping_name = 'Ranch'));



INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Westendorf' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Pepperoni'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Westendorf' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Sausage'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Westendorf' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Chicken'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Westendorf' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Bacon'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Westendorf' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Ham'));

INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Green' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Zucchini'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Green' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Spinach'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Green' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Artichokes'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Green' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Black Olives'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Green' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Mushrooms'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Green' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Onions'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Green' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Green Peppers'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Green' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Vegan Mozz'));

INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Hawaiian' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Pineapple'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Hawaiian' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Ham'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Hawaiian' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Bacon'));

INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Vegan Pepperoni' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Vegan Mozz'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Vegan Pepperoni' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Zucchini'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Vegan Pepperoni' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Garlic'));

INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Alfredo' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Alfredo'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Alfredo' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Chicken'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Alfredo' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Spinach'));

INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Margherita' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Mozzarella'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Margherita' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Fresh Basil'));

INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Margherita' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Tomatoes'));

INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Phil' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Spinach'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Phil' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Bacon'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Phil' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Sausage'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Phil' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Garlic'));

INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Buffalo Chicken' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Chicken'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Buffalo Chicken' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Hot Sauce'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Buffalo Chicken' AND size_id = 'M'),
(SELECT topping_name FROM topping WHERE topping_name = 'Ranch'));


INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Westendorf' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Pepperoni'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Westendorf' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Sausage'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Westendorf' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Chicken'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Westendorf' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Bacon'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Westendorf' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Ham'));

INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Green' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Zucchini'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Green' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Spinach'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Green' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Artichokes'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Green' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Black Olives'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Green' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Mushrooms'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Green' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Onions'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Green' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Green Peppers'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Green' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Vegan Mozz'));

INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Hawaiian' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Pineapple'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Hawaiian' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Ham'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Hawaiian' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Bacon'));

INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Vegan Pepperoni' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Vegan Mozz'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Vegan Pepperoni' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Zucchini'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Vegan Pepperoni' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Garlic'));

INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Alfredo' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Alfredo'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Alfredo' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Chicken'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Alfredo' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Spinach'));

INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Margherita' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Mozzarella'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Margherita' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Tomatoes'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Margherita' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Fresh Basil'));

INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Phil' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Spinach'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Phil' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Bacon'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Phil' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Sausage'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'The Phil' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Garlic'));

INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Buffalo Chicken' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Chicken'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Buffalo Chicken' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Hot Sauce'));
INSERT INTO pizza_topping (pizza_id, topping_name)
VALUES (
(SELECT pizza_id FROM pizza WHERE pizza_name = 'Buffalo Chicken' AND size_id = 'L'),
(SELECT topping_name FROM topping WHERE topping_name = 'Ranch'));


INSERT INTO address_type (type_description)
VALUES ('Billing');
INSERT INTO address_type (type_description)
VALUES ('Delivery');

