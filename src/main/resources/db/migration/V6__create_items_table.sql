CREATE TABLE items(
item_id int auto_increment primary key,
name varchar(255),
price decimal(10,2),
description varchar(255),
menuId int,
FOREIGN KEY (menuId) REFERENCES menu(menu_id)
);