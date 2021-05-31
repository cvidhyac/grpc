drop table add_to_cart if exists;
drop table product_service if exists;

create TABLE product_service (
  id int(11) NOT NULL AUTO_INCREMENT,
  product_name varchar(50) DEFAULT NULL,
  quantity int(11) DEFAULT NULL,
  PRIMARY KEY (id)
);


insert into product_service
values
(1,'soap', 28),
(2,'candy', 35),
(3,'toys', 45),
(4,'watch', 35),
(5,'phone', 35);


create TABLE add_to_cart (
  id int(11) NOT NULL AUTO_INCREMENT,
  product_id int(11),
  product_name varchar(50) DEFAULT NULL,
  quantity int(11) DEFAULT NULL,
  PRIMARY KEY (id),
  foreign key (product_id) references product_service(id)
 );

insert into add_to_cart values (1,1,'soap',1);
