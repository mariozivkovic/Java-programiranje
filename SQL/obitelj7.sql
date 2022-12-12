drop database if exists obitelj7;
create database obitelj7 default charset utf8;
use obitelj7;


create table decko(
sifra int not null primary key auto_increment,
treciputa datetime,
bojakose varchar(50) not null,
lipa decimal(18,2),
kuna decimal(18,2),
ogrlica int,
ekstroventno boolean 

);

create table muskarac(
    sifra int not null primary key auto_increment,
    drugiputa datetime not null,
    haljina varchar(50),
    treciputa datetime
    
);

create table muskarac_decko(
    sifra int not null primary key auto_increment,
    muskarac int,
    decko int 
    
);

create table becar(
    sifra int not null primary key auto_increment,
    eura decimal(18,2),
    treciputa datetime not null,
    prviputa datetime not null,
    muskarac int 
    
);



create table neprijatelj(
    sifra int not null primary key auto_increment,
    kratkamajica varchar(50),
    introvertno boolean not null,
    indiferentno boolean,
    ogrlica int,
    becar int 
    
    
);

create table brat(
sifra int not null primary key auto_increment,
introvertno boolean,
novcica decimal(18,2)not null,
treciputa datetime,
neprijatelj int not null 

);

create table prijateljica(
sifra int not null primary key auto_increment,
vesta varchar(50),
introvertno boolean,
nausnica int


);


create table cura(
sifra int not null primary key auto_increment,
vesta varchar(50),
gustoca decimal(18,2),
ogrlica int,
nausnica int,
drugiputa datetime, 
indiferentno boolean not null,
prijateljica int 

);


alter table muskarac_decko add foreign key (muskarac) references muskarac(sifra);
alter table muskarac_decko add foreign key (decko) references decko(sifra);
alter table becar add foreign key (muskarac) references muskarac(sifra);
alter table neprijatelj add foreign key (becar) references becar(sifra);
alter table brat add foreign key (neprijatelj) references neprijatelj(sifra);
alter table cura add foreign key (prijateljica) references prijateljica(sifra); 


        
 insert into decko(bojakose,ogrlica)
 values ('smeda',15),
 		('plava',23),
 		('crna',35);
 	


insert into muskarac (drugiputa)
values ('2022-12-10 08:00:00'), 
		 ('2022-12-11 09:00:00'),
		  ('2022-12-12 10:00:00');
		 
 

insert into muskarac_decko  (muskarac, decko)
values(1,2),
	   (3,1),
	   (2,3);
	  
	  
	 
insert into becar (treciputa,prviputa,muskarac)
values ('2022-12-05 07:00:00','2022-12-06 08:00:00',3),
		 ('2022-12-07  09:00:00','2022-12-08 10:00:00',2),
		  ('2022-12-09 11:00:00','2022-12-10 13:00:00',1);
		 


insert into neprijatelj  (introvertno ,ogrlica, becar)
values(true,25,3),
       (false,15,1),
       (true,10,2);
      
      


insert into brat (novcica,neprijatelj)
values (14.32,3),
        (54.67,1),
         (12.75,2);
        
  
 
 insert into prijateljica (nausnica)
values (12),
        (15),
         (18);
        
        
        
        

insert into cura(ogrlica,nausnica,indiferentno, prijateljica)
values (25,23,true,3),
        (56,28,false,2),
         (32,13,true,1);

        


update cura set indiferentno= false;
		

delete from brat where novcica<>12.75;

select a.prviputa  ,b.treciputa  
from becar a
left join becar b on a.sifra=b.prviputa  
where b.treciputa  is null;

select f.bojakose  ,b.introvertno  , a.neprijatelj  ,c.treciputa  ,d.drugiputa  
from brat a
inner join neprijatelj b on b.sifra=a.neprijatelj 
inner join becar c on c.sifra=b.becar  
inner join muskarac d on d.sifra=c.muskarac  
inner join muskarac_decko e on d.sifra=e.muskarac    
inner join decko f on f.sifra=e.decko      
where c.treciputa  is not null and d.drugiputa is not null
group by b.introvertno  
order by 3 desc;


select a.drugiputa , a.treciputa  ,b.muskarac 
from muskarac a
left join muskarac_decko b on a.sifra=b.muskarac 
where b.muskarac is null;
