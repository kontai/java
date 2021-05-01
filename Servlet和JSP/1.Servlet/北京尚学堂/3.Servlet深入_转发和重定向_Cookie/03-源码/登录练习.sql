##创建用户表
create table t_user(
	uid int(10) not null auto_increment,
	uname varchar(100) not null,
	pwd varchar(100) not null,
	primary key(uid)
)
##添加测试数据
insert into t_user values(default,'zhangsan','123');
insert into t_user values(default,'lisi','456');
select * from t_user