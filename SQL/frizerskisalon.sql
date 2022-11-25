drop database if exists frizerskisalon;
create database frizerskisalon;
use frizerskisalon;

create table djelatnica(
    sifra  int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    oib char(11),
    email varchar(50) not null
);

create table usluga(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    cijena decimal(18,2),
    trajanje int 
);

create table posjeta(
    sifra int not null primary key auto_increment,
    vrijeme datetime,
    usluga int,
    djelatnica int not null,
    korisnik int
);

create table korisnik(
    sifra int not null primary key auto_increment,
    spol varchar(20) not null,
    duzinakose varchar(20)
);

alter table posjeta add foreign key (usluga) references usluga(sifra);
alter table posjeta add foreign key (djelatnica) references djelatnica(sifra);
alter table posjeta add foreign key (korisnik) references korisnik(sifra);


insert into djelatnica (ime,prezime,oib,email)
values ('Maja','Majić',60337390206,'mmajic@gmail.com'), # 1
		('Petra','Perić',22689119186,'pperic@gmail.com'), # 2
		('Jelena','Jelić',30960708580,'jjelic@gmail.com'); # 3
	

insert into korisnik (spol,duzinakose)
values ('zensko','duga'), # 1
		('musko','kratka'), # 2
		('zensko','do ramena'); # 3


insert into usluga (naziv,cijena,trajanje)
values('sisanje',60.99,60), # 1
	   ('brijanje',30.50,20), # 2
	   ('farbanje',99.99,120); # 3

insert into posjeta (usluga,djelatnica,korisnik)
values (1,1,1), # 1
	   (2,3,2), # 2
	   (3,2,3); # 3

update posjeta set vrijeme= '2022-11-21 10:00:00' where sifra=1;
update posjeta set vrijeme= '2022-11-22 08:00:00' where sifra=2;
update posjeta set vrijeme= '2022-11-23 16:00:00' where sifra=3;

