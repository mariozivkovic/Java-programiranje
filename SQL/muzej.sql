drop database if exists muzej;
create database muzej default charset utf8;
use muzej;

create table kustos(
    sifra  int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    oib char(11),
    email varchar(50) not null
);

create table izlozba(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    datumpocetka datetime not null,
    datumzavrsetka datetime,
    kustos int not null,
    sponzor int 
);

create table djelo(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    umjetnik varchar(50) not null,
    maksimalnodjela int not null
    
);

create table sponzor(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    brojugovora varchar(20),
    oib char(11)
);

create table djelo_izlozba(
    djelo int not null,
    izlozba int not null 
);

alter table izlozba add foreign key (kustos) references kustos(sifra);
alter table izlozba add foreign key (sponzor) references sponzor(sifra);
alter table djelo_izlozba add foreign key (djelo) references djelo(sifra);
alter table djelo_izlozba add foreign key (izlozba) references izlozba(sifra);



insert into kustos (ime,prezime,oib,email)
values ('Pero','Perić',51282257865,'pperic@gmail.com'), # 1
('Vlado','Vladić',31717779978,'vvladic@gmail.com'), # 2
('Marko','Marić',92107302559,'mmaric@gmail.com'); # 3


insert into sponzor (ime)
values ('INA'), # 1
('HEP'), # 2
('Generali'); # 3



insert into izlozba (naziv,datumpocetka,datumzavrsetka,kustos,sponzor)
values ('Proljeće','2022-5-25 10:00:00','2022-5-28 12:00:00',1,1), # 1
      ('Ljeto','2022-07-20 10:00:00','2022-07-23 12:00:00',2,2), # 2
      ('Jesen','2022-10-5 10:00:00','2022-10-8 12:00:00',3,3); # 3
     

insert into djelo (naziv,umjetnik,maksimalnodjela)
values ('Cvijeće u cvatu','Drago Dragić',5), # 1
		('Valovi mora','Ante Antić',5), # 2
		('Opadanje lišća','Maja Majić',5); # 3
	


insert into djelo_izlozba (djelo,izlozba)
values(1,1),(2,2),(2,3);












