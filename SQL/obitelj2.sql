drop database if exists obitelj2;
create database obitelj2 default charset utf8;
use obitelj2;

create table punica(
    sifra int not null primary key auto_increment,
    kratkamajica varchar(50),
    vesta varchar(31)not null,
    asocijalno boolean,
    kuna decimal(18,2), 
    snasa int  
     
);

create table snasa(
    sifra int not null primary key auto_increment,
    kuna decimal(18,2) not null,
    treciputa datetime,
    eura decimal(18,2),
    ostavljena int,
    introvertno boolean
    
);

create table ostavljena(
sifra int not null primary key auto_increment,
majica varchar(40) not null,
lipa decimal(18,2)not null,
modelnaocala varchar(46),
kuna decimal(18,2),
prijatelj int 
);

create table prijatelj(
    sifra int not null primary key auto_increment,
    indiferentno boolean,
    haljina varchar(30) not null,
    lipa decimal(18,2) not null,
    kuna decimal(18,2),
    dukserica varchar(50) 
    
);


create table prijatelj_brat(
    sifra int not null primary key auto_increment,
    prijatelj int,
    brat int 
);


create table brat(
    sifra int not null primary key auto_increment,
    oib char(11),
    ekstroventno boolean not null,
    ogrlica int 
);

create table cura(
    sifra int not null primary key auto_increment,
    dukserica varchar(50), 
    maraka decimal(18,2),
    drugiputa datetime,
    majica varchar(50),
    novcica decimal(18,2),
    ogrlica int
);

create table svekar(
    sifra int not null primary key auto_increment,
    novcica decimal(18,2),
    suknja varchar(50) not null,
    bojakose varchar(50),
    prstena int, 
    narukvica int, 
    cura int 
);
 




alter table punica add foreign key (snasa) references snasa(sifra);
alter table snasa add foreign key (ostavljena) references ostavljena(sifra);
alter table ostavljena add foreign key (prijatelj) references prijatelj(sifra);
alter table prijatelj_brat add foreign key (prijatelj) references prijatelj(sifra);
alter table prijatelj_brat add foreign key (brat) references brat(sifra);
alter table svekar add foreign key (cura) references cura(sifra);


insert into brat (ekstroventno, ogrlica)
values(true,3),
	  (false,1),
	  (true,2);

insert into prijatelj (haljina,lipa)
values ('Bershka',15.45),
		('Orsay',20.41),
		('New Yorker',30.67);

insert into prijatelj_brat  (prijatelj, brat)
	values(3,1),
		   (1,3),
		   (2,2);


insert into ostavljena  (majica,lipa,prijatelj)
values('Zara',10.21,1),
	  ('Gucci',35.60,2),
	  ('Chanel',40.51,3);

insert into snasa (kuna,treciputa,ostavljena)
values (50.89, null,2),
		(35.20, null,1),
		(23.45, null,3);

insert into punica (vesta,snasa)
values ('Bershka',2),
		('New Yorker',1),
		('Pull and Bear',3);
	

insert into svekar (suknja)
values ('plava'),('crvena'),('zelena');


update svekar set suknja='Osijek';



delete from punica where kratkamajica='AB';


select a.majica, a.lipa 
from ostavljena a
left join ostavljena b on a.sifra=b.majica 
where a.lipa not like '%9%' 
and a.lipa not like '%10%' 
and a.lipa not like '%20%'
and a.lipa not like '%30%'
and a.lipa not like '%35%';

select f.ekstroventno,a.vesta, b.kuna ,c.lipa,d.haljina   
from punica a
inner join snasa b on b.sifra=a.snasa
inner join ostavljena c on c.sifra=b.ostavljena  
inner join prijatelj d on d.sifra=c.prijatelj  
inner join prijatelj_brat e on d.sifra=e.prijatelj    
inner join brat f on f.sifra=e.brat    
where c.lipa<>91 and d.haljina like '%a%'
order by 3 desc;

select a.lipa, a.haljina, b.prijatelj
from prijatelj a
left join prijatelj_brat b  on a.sifra=b.prijatelj  
where b.prijatelj is null;


