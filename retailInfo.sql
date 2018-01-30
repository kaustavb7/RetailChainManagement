DROP TABLE IF EXISTS `retail_info`;
create table retail_info(retail_id int not null auto_increment, product_name varchar(100) not null, product_price varchar(100),product_rating varchar(20),product_status varchar(20),product_start_time datetime not null default CURRENT_TIMESTAMP,product_end_time datetime not null default CURRENT_TIMESTAMP,primary key(retail_id));
insert into retail_info values(1,'Stationary','330$','MEDIUM','ACTIVE',curtime(),curtime() + INTERVAL 3 HOUR);
insert into retail_info values(2,'Grocery','500$','MEDIUM','ACTIVE',curtime(),curtime() + INTERVAL 2 HOUR);
insert into retail_info values(3,'Electronics','450$','MEDIUM','ACTIVE',curtime(),curtime() + INTERVAL 3 HOUR);
insert into retail_info values(4,'Cosmetics','1000$','LOW','ACTIVE',curtime(),curtime() + INTERVAL 4 HOUR);
insert into retail_info values(5,'Medicine','200$','LOW','ACTIVE',curtime(),curtime() + INTERVAL 5 HOUR);
select * from retail_info;