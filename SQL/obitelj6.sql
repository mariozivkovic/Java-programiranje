drop database if exists obitelj6;
create database obitelj6 default charset utf8;
use obitelj6;


create table mladic(
sifra int not null primary key auto_increment,
drugiputa datetime,
prstena int,
lipa decimal(18,2),
narukvica int not null

);

create table zarucnik(
    sifra int not null primary key auto_increment,
    novcica decimal(18,2),
    vesta varchar(50),
    modelnaocala varchar(50) not null,
    asocijalno boolean not null,
    narukvica int
    
);

create table zarucnik_mladic(
    sifra int not null primary key auto_increment,
    zarucnik int,
    mladic int 
    
);

create table ostavljen(
    sifra int not null primary key auto_increment,
    introvertno boolean not null,
    lipa decimal(18,2),
    prstena int,
    kratkamajica varchar(50) not null,
    zarucnik int 
    
);



create table prijateljica(
    sifra int not null primary key auto_increment,
    haljina varchar(50),
    novcica decimal(18,2),
    gustoca decimal(18,2) not null, 
    ogrlica int,
    ostavljen int
    
    
);

create table sestra(
sifra int not null primary key auto_increment,
hlace varchar(40) not null,
bojakose varchar(50),
lipa decimal(18,2),
maraka decimal(18,2),
stilfrizura varchar(50)not null,
prijateljica int

);

create table cura(
sifra int not null primary key auto_increment,
modelnaocala varchar(50),
introvertno boolean,
treciputa datetime,
lipa decimal(18,2),
narukvica int,
kuna decimal(18,2)

);


create table punica(
sifra int not null primary key auto_increment,
majica varchar(50),
eura decimal(18,2) not null,
prstena int,
cura int 

);


alter table zarucnik_mladic add foreign key (mladic) references mladic(sifra);
alter table zarucnik_mladic add foreign key (zarucnik) references zarucnik(sifra);
alter table ostavljen add foreign key (zarucnik) references zarucnik(sifra);
alter table prijateljica add foreign key (ostavljen) references ostavljen(sifra);
alter table sestra add foreign key (prijateljica) references prijateljica(sifra);
alter table punica add foreign key (cura) references cura(sifra); 


        
 insert into mladic(prstena,narukvica)
 values (20,15),
 		(30,23),
 		(10,35);

insert into zarucnik (modelnaocala,asocijalno, narukvica)
values ('Ray Ban',true,10), 
		 ('Police',false,20),
		  ('dioptrijske',true,15);
		 


insert into zarucnik_mladic  (zarucnik, mladic)
values(1,2),
	   (3,1),
	   (2,3);
	  
	  
	 


insert into ostavljen (introvertno ,prstena ,kratkamajica ,zarucnik)
values (true,23,'Puma',3),
		 (false,14,'Adidas',2),
		  (true,20,'Nike',1);
		 


insert into prijateljica  (gustoca,ogrlica, ostavljen)
values(15.3,25,3),
       (35.2,15,1),
       (51.2,10,2);
      
      


insert into sestra (hlace,stilfrizura ,prijateljica)
values ('Orsay','Punđa',3),
        ('New Yorker','Rep',1),
         ('Zara','Pletenica',2);
        
 
 
 insert into cura(narukvica)
values (12),
        (15),
         (18);
        
        
        
        


insert into punica (eura,prstena,cura)
values (13.25,23,3),
        (21.56,28,2),
         (25.32,13,1);

        



update punica set eura=15.77;
		


delete from sestra where hlace<'AB';

select a.kratkamajica ,b.introvertno  
from ostavljen a
left join ostavljen b on a.sifra=b.kratkamajica 
where b.introvertno  is null;

select f.narukvica ,b.gustoca  , a.stilfrizura  ,c.introvertno  ,d.asocijalno  
from sestra a
inner join prijateljica b on b.sifra=a.prijateljica 
inner join ostavljen c on c.sifra=ostavljen  
inner join zarucnik d on d.sifra=c.zarucnik  
inner join zarucnik_mladic e on d.sifra=e.zarucnik    
inner join mladic f on f.sifra=e.mladic     
where c.introvertno is not null and d.asocijalno is not null
group by b.gustoca 
order by 3 desc;


select a.asocijalno, a.modelnaocala ,b.zarucnik
from zarucnik a
left join zarucnik_mladic b on a.sifra=b.zarucnik
where b.zarucnik is null;
