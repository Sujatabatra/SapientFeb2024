create database sapientfeb2024;

use sapientfeb2024;

create table employee(
empid int primary key,
name varchar(30),
designation varchar(30),
department varchar(30),
salary double);

insert into employee values(1,"AAA","Manager","Sales",75000),
(2,"BBB","Associate","IT",45000),
(3,"CCC","Sr. Manager","HR",175000),
(4,"DDD","Team Lead","IT",60000),
(5,"EEE","Associate","Sales",40000);

select * from employee;