drop database if exists klubcitatelja;
create database klubcitatelja;
use klubcitatelja;

create table knjiga(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    vrsta varchar(50),
    autor varchar(50),
    datumizdavanja datetime,
    vlasnik int 

);


create table citatelj(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    oib char(11),
    email varchar(50)not null,
    vlasnik int 
    
);


create table knjiga_citatelj(
    knjiga int not null,
    citatelj int not null
);

alter table knjiga add foreign key (vlasnik) references citatelj(sifra);
alter table citatelj add foreign key (vlasnik) references citatelj(sifra);
alter table knjiga_citatelj add foreign key (knjiga) references knjiga(sifra);
alter table knjiga_citatelj add foreign key (citatelj) references citatelj(sifra);


insert into citatelj (ime,prezime,oib,email,vlasnik)
values ('Pero','Perić',null,'perop@gmail.com',1), # 1
	   ('Mato','Matić',null,'mmatic@gmail.com',2), # 2
	   ('Ivo','Ivić',null,'iivic@gmail.com',3); # 3

	  
insert into knjiga (naziv,vrsta,autor,vlasnik)
values ('Zlatarevo zlato','roman','August Šenoa',2), # 1
		('Starac i more','roman','Ernest Hemingway',1), # 2
		('Baraka pet Be','novela','Miroslav Krleža',3); # 3
	

insert into knjiga_citatelj (knjiga,citatelj)
values(1,3), # 1
(2,1), # 2
(3,2); # 3
	  

