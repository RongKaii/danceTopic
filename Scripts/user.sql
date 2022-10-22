-- User 資料表
create table if not exists user(
	userid int not null auto_increment,
	username varchar(30) not null,
	dancername varchar(255) not null,
	password varchar(255) not null,
	useremail varchar(255) not null unique,
	birth varchar(30) not null,
	sex varchar(30) not null,
	area varchar(30) not null,
	createtime timestamp default current_timestamp,
	primary key(userid)
);