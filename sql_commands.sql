show databases;
create database test_db;
use test_db;
show tables;

create table student(
 id int,
 sname varchar(50),
 class varchar(10),
 roll int,
 email varchar(30)
);

describe student;

insert into student(`id`,`sname`,`class`,`roll`,`email`) values(12322,'Aman','X',1,'aman@gmail.com');
insert into student(`id`,`sname`,`class`,`roll`,`email`) values(55557,'Shalini','X',2,'shalini@gmail.com');
insert into student(`id`,`sname`,`class`,`roll`,`email`) values(66555,'Navin','X',3,'navin@gmail.com');


select * from studentinfo;
select * from student where id=55557;
select * from student where sname='Aman';
select * from student where class='X';

update student set email='aman.verma@gmail.com' where id='12322';
update student set email='aman.verma@gmail.com', class='XI', roll=5 where id='12322';

delete from student where id=66555;
delete from student;


call getStudentRecordById(12322);
select  getMaxStudentId();
SET GLOBAL log_bin_trust_function_creators = 1;


alter table student add column phone bigint;
alter table student add column gender varchar(20), add column city varchar(30);
alter table student drop column roll;
alter table student modify column gender tinytext; 
alter table student modify column gender varchar(40);
alter table student change column gender sgender tinytext;
alter table student rename to studentinfo;	

describe studentinfo;

insert into studentinfo(`id`,`sname`,`class`,`email`,`phone`,`city`,`sgender`) values(435435,'Vimal','XI','aman@gmail.com',49898489598,'Mumbai','MALE');
insert into studentinfo(`id`,`sname`,`class`,`email`,`phone`,`city`,`sgender`) values(454546,'Ritika','XI','ritika@gmail.com',435435435,'Delhi','FEMALE');
insert into studentinfo(`id`,`sname`,`class`,`email`,`phone`,`city`,`sgender`) values(5654654,'Anita','XI','anita@gmail.com',456456546,'Mumbai','FEMALE');
insert into studentinfo(`id`,`sname`,`class`,`email`,`phone`,`city`,`sgender`) values(78686867,'Anil','XI','anil@gmail.com',54654654654,'Delhi','MALE');
insert into studentinfo(`id`,`sname`,`class`,`email`,`phone`,`city`,`sgender`) values(3534543,'Jasmine','X','jasmine@gmail.com',5654654654,'Kolkata','FEMALE');




select * from studentinfo where city='Mumbai'; 

select * from studentinfo where city='Mumbai' OR city='kolkata'; 

select * from studentinfo where city='Mumbai' AND sgender='female'; 

select * from studentinfo where city!='kolkata'; 
select * from studentinfo where city <> 'kolkata'; 
select * from studentinfo where city is null;
select * from studentinfo where city is not null; 
select * from studentinfo where city in('Delhi','Kolkata');
select * from studentinfo where city not in('Mumbai');

select * from studentinfo where sname like 'A%'; 
select * from studentinfo where sname like '%a'; 
select * from studentinfo where sname like '%A___a%'; 
select * from studentinfo where sname like '%ni%'; 
select * from studentinfo where sname not like 'S%'; 

select * from studentinfo where id between 10000 and 20000;
select * from studentinfo where id between 100000 and 500000;
select * from studentinfo where id not between 10000 and 20000;
select sname from studentinfo where id in(select id from studentinfo where id between 10000 and 20000);

select sname from studentinfo where exists(select email from studentinfo where sname like '%r____a%');
select sname from studentinfo where email=any(select email from studentinfo where sname like '%r____a%');


create table employee
(
id int primary key auto_increment,
ename varchar(50) not null,
salary double check(salary>0) ,
city varchar(30) default 'Mumbai',
phone bigint unique not null,
email varchar(30) not null unique
);

describe employee;
describe salary_breakup;
insert into employee(`ename`,`salary`,`city`,`phone`,`email`) values('Mr. Krian',30000,'Delhi',987464664,'kiran@test.com');
insert into employee(`ename`,`salary`,`phone`,`email`) values('Mr. Tarun',20000,989377373,'tarun@test.com');

select * from employee;
select * from salary_breakup;
create table salary_breakup
(
 sid int primary key,
 basic_salary double not null,
 hra double default 0,
 da double default 0,
 gross_salary double default 0,
 eid int,
 foreign key(eid) references employee(id) 
);

insert into salary_breakup values(78,30000,6000,8000,44000,1);
insert into salary_breakup values(67,40000,6000,8000,44000,5);

select distinct city from studentinfo;
select * from studentinfo order by sname;
select * from studentinfo order by sname asc;
select * from studentinfo order by sname desc;
select * from studentinfo order by id asc;
select * from studentinfo order by id desc;

create index ename_index on employee(ename);
create index email_city_index on employee(city,email);

show indexes from employee;

drop index email_city_index on employee;

select sum(salary) as total_salry from employee ; #alias
select avg(salary) from employee;
select min(salary) from employee;
select max(salary) from employee;
select count(salary) from employee;

select * from studentinfo;
select count(city) as citynames from studentinfo group by sname having count(sname)>1;

select user from mysql.user;
create user 'aman' identified by 'aman@123';

grant all  on *.*  to 'aman'@'%' with grant option;
revoke all,grant option from 'aman'@'%';

drop user aman;

create table customer
(
 cid long not null,
 cname varchar(100) not null,
 email varchar(30) unique,
 city varchar(40) not null
);
create table orders
(
 oid long not null,
 price double not null,
 odate date,
 cid long not null
);

insert into customer values(123,'Aman','aman@test.com','Mumbai'), (145,'Sunita','sunita@test.com','delhi'),(170,'Nidhi','nidhi@test.com','hyderabad'),(208,'Kunal','kunal@test.com','Chennai'),(233,'Shalini','shalini@test.com','Kolkata');
select * from customer;
insert into orders values(9387843,700,'2024-01-11',145),(54645645,1900,'2024-01-15',170),(34535345,2200,'2024-01-17',190),(34535333,2600,'2024-01-18',180);
select * from orders;

select customer.cid, customer.cname, orders.price, orders.odate from customer inner join orders on customer.cid=orders.cid;

