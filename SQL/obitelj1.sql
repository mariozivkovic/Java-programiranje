drop database if exists obitelj1;
create database obitelj1 default charset utf8;
use obitelj1;

create table decko(
    sifra int not null primary key auto_increment,
    indiferentno boolean,
    vesta varchar(31)not null,
    asocijalno boolean   
     
);

create table cura(
    sifra int not null primary key auto_increment,
    haljina varchar(30),
    drugiputa datetime not null,
    suknja varchar(46) not null,
    narukvica int,
    introvertno boolean,
    majica varchar(30),
    decko int 
);

create table neprijatelj(
sifra int not null primary key auto_increment,
majica varchar(40),
lipa decimal(18,2),
modelnaocala varchar(46),
kuna decimal(18,2),
oib char(11),
haljina varchar(46)not null,
cura  int 
);

create table brat(
    sifra int not null primary key auto_increment,
    asocijalno boolean,
    suknja varchar(30),
    ogrlica int not null,
    neprijatelj int 
    
);


create table decko_zarucnica(
    sifra int not null primary key auto_increment,
    decko int,
    zarucnica int 
);


create table zarucnica(
    sifra int not null primary key auto_increment,
    bojakose varchar(30),
    narukvica int,
    indiferentno boolean,
    lipa decimal(18,2),
    novcica decimal(18,2) not null 
);

create table prijatelj(
    sifra int not null primary key auto_increment,
    modelnaocala varchar(40),
    treciputa datetime not null,
    prviputa datetime,
    ekstroventno boolean,
    svekar int 
);

create table svekar(
    sifra int not null primary key auto_increment,
    stilfrizura varchar(50),
    ogrlica int, 
    asocijalno boolean
);
 




alter table cura add foreign key (decko) references decko(sifra);
alter table neprijatelj add foreign key (cura) references cura(sifra);
alter table brat add foreign key (neprijatelj) references neprijatelj(sifra);
alter table decko_zarucnica add foreign key (decko) references decko(sifra);
alter table decko_zarucnica add foreign key (zarucnica) references zarucnica(sifra);
alter table prijatelj add foreign key (svekar) references svekar(sifra);



insert into decko(vesta,asocijalno)
values ('Bershka',null),
		('New Yorker',null),
		('Pull and Bear',null);
	


insert into cura (drugiputa,suknja,decko)
values ('2022-12-07','Orsay',2),
		('2022-12-08','Guess',3),
		('2022-12-09','Elfs',1);
	


insert into neprijatelj (haljina,cura)
values('Zara',3),
	  ('Gucci',1),
	  ('Chanel',2);
	 


insert into brat (ogrlica,neprijatelj)
values (14,1),
		(14,2),
		(15,3);
	


insert into zarucnica (novcica)
values(50.25),
	  (35.56),
	  (21.87);


insert into decko_zarucnica(decko,zarucnica)
values(1,3),
	  (2,1),
	  (3,2);
	 




insert into prijatelj (treciputa)
	values('2022-12-01 09:00:00'),
		   ('2022-12-02 10:00:00'),
		   ('2022-12-03 11:00:00');



update prijatelj set treciputa='2020-04-30';

select*from brat;

delete from brat where ogrlica<>14;

select a.suknja,b.drugiputa 
from cura a
left join cura b on a.sifra=b.suknja 
where b.drugiputa is null;

select f.novcica,a.neprijatelj, b.haljina 
from brat a
inner join neprijatelj b on b.sifra=a.neprijatelj 
inner join cura c on c.sifra=b.cura 
inner join decko d on d.sifra=c.decko 
inner join decko_zarucnica e on d.sifra=e.zarucnica  
inner join zarucnica f on f.sifra=e.decko  
where d.vesta like '%ba' and c.drugiputa is not null
order by 3 desc;
