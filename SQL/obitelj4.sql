drop database if exists obitelj4;
create database obitelj4 default charset utf8;
use obitelj4;


create table ostavljena(
    sifra int not null primary key auto_increment,
    ogrlica int not null,
    majica varchar(30),
    carape varchar(50),
    stilfrizura varchar(50) not null,
    punica int 
    
);

create table punica(
    sifra int not null primary key auto_increment,
    hlace varchar(30),
    modelnaocala varchar(50),
    vesta varchar(50),
    ogrlica int,
    nausnica int not null,
    treciputa datetime,
    punac int  
);

create table punac(
    sifra int not null primary key auto_increment,
    majica varchar(50) not null,
    prviputa datetime not null,
    dukserica varchar(50),
    svekar int
    
    
);

create table svekar(
    sifra int not null primary key auto_increment,
    eura decimal(18,2),
    haljina varchar(50),
    narukvica int not null,
    bojakose varchar(50),
    majica varchar(50) not null,
    carape varchar(50) not null 
    
    
);




create table svekar_cura(
    sifra int not null primary key auto_increment,
    svekar int,
    cura int 
);


create table cura(
sifra int not null primary key auto_increment,
vesta varchar(40),
maraka decimal(18,2),
carape varchar(46),
asocijalno boolean not null

);

create table mladic(
sifra int not null primary key auto_increment,
kratkamajica varchar(40),
haljina varchar(50) not null,
asocijalno boolean,
zarucnik int

);

create table zarucnik(
    sifra int not null primary key auto_increment,
    oib char(11),
    lipa decimal(18,2) not null,
    indiferentno boolean  

    
    
);




alter table ostavljena add foreign key (punica) references punica(sifra);
alter table punica add foreign key (punac) references punac(sifra);
alter table punac add foreign key (svekar) references svekar(sifra);
alter table svekar_cura add foreign key (svekar) references svekar(sifra);
alter table svekar_cura add foreign key (cura) references cura(sifra);
alter table mladic add foreign key (zarucnik) references zarucnik(sifra);





insert into cura (asocijalno)
values (true),
		(false),
		(true);



insert into svekar (narukvica,majica,carape)
values (10,'Bershka','Pamucne'),
		(15,'New Yorker','Vunene'),
		(20,'Pull and Bear','Pletene');




insert into svekar_cura (svekar,cura)
values (1,3),
		(3,2),
		(2,1);



insert into punac (majica,prviputa,svekar)
values ('Puma','2022-12-09 09:00:00', 2),
		('Adidas','2022-12-10 10:00:00', 1),
		('Nike','2022-12-11 11:00:00', 3);
	
	
	



insert into punica (ogrlica,nausnica,punac)
values (1,12,3),
        (5,15,1),
        (10,20,2);

 

insert into ostavljena  (ogrlica,stilfrizura ,punica)
values (6,'Punđa',3),
        (16,'Rep',1),
        (23,'Raspustena kosa',2);

 

insert into zarucnik  (lipa)
values(12.34),
       (31.78),
       (53.11);
      
 
 
 insert into mladic (haljina,zarucnik)
 values ('Orsay',3),
 		('Chanel',2),
 		('Zara',1);


update mladic set haljina='Osijek';



delete from ostavljena where ogrlica=17;

select a.majica,b.prviputa 
from punac a
left join punac b on a.sifra=b.majica 
where b.prviputa is null;

select f.asocijalno ,a.stilfrizura , b.nausnica  ,c.prviputa ,d.majica   
from ostavljena a
inner join punica b on b.sifra=a.punica
inner join punac c on c.sifra=b.punac  
inner join svekar d on d.sifra=c.svekar  
inner join svekar_cura e on d.sifra=e.svekar    
inner join cura f on f.sifra=e.cura     
where d.majica like '%a%' and c.prviputa is not null
group by b.nausnica
order by 3 desc;

select a.majica, a.carape
from svekar a
left join svekar_cura b  on a.sifra=b.svekar  
where b.svekar is null;
 		 