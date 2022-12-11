drop database if exists obitelj5;
create database obitelj5 default charset utf8;
use obitelj5;


create table decko(
sifra int not null primary key auto_increment,
prviputa datetime,
zena int not null,
modelnaocala varchar(46) not null,
nausnica int 

);

create table zena(
    sifra int not null primary key auto_increment,
    novcica decimal(18,2),
    dukserica varchar(50),
    narukvica int not null,
    haljina varchar(50),
    hlace varchar(50),
    brat int
    
);

create table brat(
    sifra int not null primary key auto_increment,
    nausnica int not null,
    hlace varchar(30),
    treciputa datetime not null,
    narukvica int,
    prijatelj int 
    
);

create table prijatelj(
    sifra int not null primary key auto_increment,
    introvertno boolean not null,
    haljina varchar(30) not null,
    prstena int not null,
    stilfrizura varchar(50)
    
);


create table prijatelj_ostavljena(
    sifra int not null primary key auto_increment,
    prijatelj int,
    ostavljena int 
);

create table ostavljena(
    sifra int not null primary key auto_increment,
    kratkamajica varchar(50),
    maraka decimal(18,2) not null,
    prviputa datetime, 
    drugiputa datetime not null 
    
    
);

create table svekrva(
sifra int not null primary key auto_increment,
hlace varchar(40),
suknja varchar(50) not null,
ogrlica int,
treciputa datetime,
dukserica varchar(50),
narukvica int,
punac int 

);

create table punac(
sifra int not null primary key auto_increment,
majica varchar(40) not null,
suknja varchar(50),
ekstroventno boolean,
prviputa datetime

);




alter table decko add foreign key (zena) references zena(sifra);
alter table zena add foreign key (brat) references brat(sifra);
alter table brat add foreign key (prijatelj) references prijatelj(sifra);
alter table prijatelj_ostavljena add foreign key (prijatelj) references prijatelj(sifra);
alter table prijatelj_ostavljena add foreign key (ostavljena) references ostavljena(sifra);
alter table svekrva add foreign key (punac) references punac(sifra); 


        
 insert into ostavljena (maraka,drugiputa)
 values (20.34,'2022-12-8 09:00:00'),
 		(30.24,'2022-12-9 10:00:00'),
 		(10.54,'2022-12-10 11:00:00');


insert into prijatelj (introvertno, haljina, prstena)
values (true,'Orsay',10), 
		 (false,'Gucci',20),
		  (true,'Guess',15);
		 


insert into prijatelj_ostavljena (prijatelj, ostavljena)
values(1,2),
	   (3,1),
	   (2,3);
	  
	  


insert into brat (nausnica,treciputa,narukvica,prijatelj)
values (10,'2022-12-08 08:00:00',12,3),
		 (14,'2022-12-09 13:00:00',16,2),
		  (20,'2022-12-10 14:00:00',21,1);
		 


insert into zena (narukvica,brat)
values(15,3),
       (35,1),
       (51,2);
      
      


insert into decko (modelnaocala,zena,nausnica)
values ('Ray Ban',3,23),
        ('Police',1,28),
         ('dioptrijske',2,13);
        
  
 
 insert into punac(majica)
values ('Nike'),
        ('Adidas'),
         ('Puma');
        
        
        
        
        


insert into svekrva (suknja,ogrlica,narukvica,punac)
values ('Bershka ',13,23,3),
        ('Varteks',21,28,2),
         ('Mako',25,13,1);




update svekrva set suknja='Osijek';
		


delete from decko where modelnaocala<'AB';

select a.narukvica ,b.treciputa  
from brat a
left join brat b on a.sifra=b.narukvica 
where b.treciputa  is null;

select f.drugiputa,b.narukvica , a.zena  ,c.treciputa  ,d.prstena  
from decko a
inner join zena b on b.sifra=a.zena
inner join brat c on c.sifra=b.brat  
inner join prijatelj d on d.sifra=c.prijatelj  
inner join prijatelj_ostavljena e on d.sifra=e.prijatelj    
inner join ostavljena f on f.sifra=e.ostavljena     
where d.prstena and c.treciputa is not null
group by b.narukvica
order by 3 desc;


update prijatelj set prstena=219;

select a.prstena, a.introvertno,b.prijatelj
from prijatelj a
left join prijatelj_ostavljena b on a.sifra=b.prijatelj  
where b.prijatelj is null;

