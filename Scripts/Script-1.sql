-- DanceStyle 資料表
create table if not exists dancestyle2(
	dancestyleid int not null auto_increment,
	userid int,
	breaking boolean not null default 0,
	popping boolean not null default 0,
	hiphop boolean not null default 0,
	locking boolean not null default 0,
	jazz boolean not null default 0,
	waacking boolean not null default 0,
	house boolean not null default 0,
	dancehall boolean not null default 0,
	girlstyle boolean not null default 0,
	krump boolean not null default 0,
	foreign key(userid) references user(userid),
	primary key(dancestyleid)
)