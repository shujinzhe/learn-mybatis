###手写servlet方式
###查询和添加花卉信息sql

###创建数据库
create database if not exists mybatis327;
use mybatis327

###创建表
create table if not exists flower(
id int(10) primary key auto_increment comment '编号',
name varchar(20) comment '花卉名称',
price double comment '花卉价格',
production varchar(30) comment '花卉产地'
) comment '花卉信息表';

###插入数据
insert into flower values(default,'蒲公英',25.0,'蒙古');
insert into flower values(default,'桃花',13.0,'中国北部');
insert into flower values(default,'海棠',25.0,'江苏');
