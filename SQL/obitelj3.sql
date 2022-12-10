drop database if exists obitelj3;
create database obitelj3 default charset utf8;
use obitelj3;


create table prijatelj(
    sifra int not null primary key auto_increment,
    prstena int not null,
    sunja varchar(30),
    eura decimal(18,2),
    gustoca decimal(18,2),
    oib char(11) not null,
    becar int 
    
);

create table becar(
    sifra int not null primary key auto_increment,
    kratkamajica varchar(30) not null,
    novcica decimal(18,2),
    bojaociju varchar(50),
    snasa int
    
);

create table snasa(
    sifra int not null primary key auto_increment,
    introvertno boolean,
    treciputa datetime not null,
    haljina varchar(50) not null,
    zena int
    
    
);

create table zena(
    sifra int not null primary key auto_increment,
     lipa decimal(18,2) not null,
    suknja varchar(50),
    prstena int not null
    
    
);




create table zena_mladic(
    sifra int not null primary key auto_increment,
    zena int,
    mladic int 
);


create table mladic(
sifra int not null primary key auto_increment,
vesta varchar(40),
lipa decimal(18,2),
kuna decimal(18,2),
stilfrizura varchar(46)not null,
nausnica int not null

);

create table punac(
sifra int not null primary key auto_increment,
majica varchar(40) not null,
novcica decimal(18,2),
oib char(11),
maraka decimal(18,2),
ostavljen int,
treciputa datetime
);

create table ostavljen(
    sifra int not null primary key auto_increment,
    modelnaocala varchar(50),
    kuna decimal(18,2) not null,
    introvertno boolean  

    
    
);




alter table prijatelj add foreign key (becar) references becar(sifra);
alter table becar add foreign key (snasa) references snasa(sifra);
alter table snasa add foreign key (zena) references zena(sifra);
alter table zena_mladic add foreign key (zena) references zena(sifra);
alter table zena_mladic add foreign key (mladic) references mladic(sifra);
alter table punac add foreign key (ostavljen) references ostavljen(sifra);



insert into ostavljen (kuna)
values (10.45),
		(15.90),
		(20.34);



insert into punac (majica,ostavljen)
values ('Bershka',3),
		('New Yorker',1),
		('Pull and Bear',2);


insert into mladic (stilfrizura, nausnica)
values ('Irokeza',20),
		('Fudbalerka',10),
		('Jež frizura',15);



insert into zena (lipa,prstena)
values (29.10, 10),
		(30.25, 5),
		(15.65, 15);
	
	
	



insert into zena_mladic (zena,mladic)
values (1,3),
        (3,1),
        (2,2);


insert into snasa (treciputa, haljina,zena)
values ('2022-12-10 09:00:00','Gucci',3),
        ('2022-12-11 10:00:00','Guess',1),
        ('2022-12-12 11:00:00','Elfs',2);



insert into becar (kratkamajica, snasa)
values('Puma',2),
       ('Nike',1),
       ('Adidas',3);
      
  
 
 insert into prijatelj (prstena, oib, becar)
 values (12,38019931736,3),
 		(10,11468647310,2),
 		(15,46855775835,1);




update punac set majica='Osijek';


delete from prijatelj where prstena>17;

select a.haljina,b.treciputa 
from snasa a
left join snasa b on a.sifra=b.haljina 
where b.treciputa is null;

select f.nausnica,a.oib, b.kratkamajica  ,c.treciputa ,d.lipa   
from prijatelj a
inner join becar b on b.sifra=a.becar
inner join snasa c on c.sifra=b.snasa  
inner join zena d on d.sifra=c.zena  
inner join zena_mladic e on d.sifra=e.zena    
inner join mladic f on f.sifra=e.mladic     
where d.lipa not like '%29%' and c.treciputa is not null
order by 3 desc;

select a.lipa, a.prstena, b.zena
from zena a
left join zena_mladic b  on a.sifra=b.zena  
where b.zena is null;
 	