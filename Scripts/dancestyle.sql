-- DanceStyle 資料表
create table if not exists dancestyle(
	dancestyleid int not null auto_increment,
	userid int,
	breaking int,
	popping int,
	hiphop int,
	locking int,
	jazz int,
	waacking int,
	house int,
	dancehall int,
	girlstyle int,
	krump int,
	foreign key(userid) references user(userid),
	primary key(dancestyleid)
)