

drop database if exists obitelj;
create database obitelj default charset utf8;
use obitelj;

create table sestra(
    sifra int not null primary key auto_increment,
    introvertno boolean not null,
    haljina varchar(31),
    eura decimal(18,2) not null,
    hlace varchar(46),
    narukvica int 
);

create table punac(
    sifra int not null primary key auto_increment,
    ogrlica int not null,
    gustoca decimal(18,2) not null,
    hlace varchar(46)
);

create table zena(
sifra int not null primary key auto_increment,
treciputa datetime not null,
hlace varchar(46) not null,
kratkamajica varchar(46),
oib char(11),
bojaociju varchar(30),
haljina varchar(46) not null,
sestra int 
);

create table cura(
    sifra int not null primary key auto_increment,
    novcica decimal(18,2),
    gustoca decimal(18,2),
    lipa decimal(18,2),
    bojakose varchar(30),
    ogrlica int,
    suknja varchar(46),
    punac int
);


create table sestra_svekar(
    sestra int,
    svekar int
);

create table svekar(
    sifra int not null primary key auto_increment,
    bojaociju varchar(40),
    prstena int not null,
    dukserica varchar(40) not null,
    lipa decimal(18,2) not null,
    eura decimal(18,2) not null,
    majica varchar(46) not null 
);

create table muskarac(
    sifra int not null primary key auto_increment,
    bojaociju varchar(30),
    hlace varchar(30) not null,
    modelnaocala varchar(46) not null,
    eura decimal(18,2),
    zena int
);

create table mladic(
    sifra int not null primary key auto_increment,
    suknja varchar(40),
    kuna decimal(18,2),
    drugiputa datetime not null,
    asocijalno boolean not null,
    ekstroventno boolean,
    dukserica varchar(40),
    muskarac int not null
);


alter table sestra_svekar add foreign key (sestra) references sestra(sifra);
alter table sestra_svekar add foreign key (svekar) references svekar(sifra);
alter table zena add foreign key (sestra) references sestra(sifra);
alter table muskarac add foreign key (zena) references zena(sifra);
alter table mladic add foreign key (muskarac) references muskarac(sifra);
alter table cura add foreign key (punac) references punac(sifra);

# 1

insert into sestra(sifra, introvertno, haljina,eura,hlace,narukvica)
values (null,true,'New Yorker haljina',35.99,'Cvijetne hlace',3);

# 2

insert into sestra(sifra, introvertno, haljina,eura,hlace,narukvica)
values (null,false,'Orsay haljina',30.99,'Jeans hlace',2);

# 3

insert into sestra(sifra, introvertno, haljina,eura,hlace,narukvica)
values (null,true,'Bershka haljina',45.99,'Kratke hlace',1);



# 1

insert into svekar(sifra,bojaociju,prstena,dukserica,lipa,eura,majica)
values (null,'zelena',3,'Joma',35.25,45.55,'Umbro');

# 2

insert into svekar(sifra,bojaociju,prstena,dukserica,lipa,eura,majica)
values (null,'plava',2,'Puma',25.25,35.55,'Nike');

# 3

insert into svekar(sifra,bojaociju,prstena,dukserica,lipa,eura,majica)
values (null,'smeda',1,'Fila',45.25,25.55,'Adidas');



insert into sestra_svekar(sestra,svekar)
values (1,2), # 1
(2,3), # 2
(3,1); # 3


# 1

insert into zena(sifra,treciputa,hlace,kratkamajica,oib,bojaociju,haljina,sestra)
values(null,'2022-12-01 10:00:00','sive hlace','plava',null,'smeda','midi',1);

# 2

insert into zena(sifra,treciputa,hlace,kratkamajica,oib,bojaociju,haljina,sestra)
values(null,'2022-12-02 11:00:00','hlace sa uzorkom','svilena',null,'plava','dugacka',2);

# 3

insert into zena(sifra,treciputa,hlace,kratkamajica,oib,bojaociju,haljina,sestra)
values(null,'2022-12-03 13:00:00','svecane','pamucna',null,'zelena','kratka',3);

# 1

insert into muskarac (sifra,bojaociju,hlace,modelnaocala,eura,zena)
values (null,'smeda','rifle','Ray ban',50.98,1);

# 2

insert into muskarac (sifra,bojaociju,hlace,modelnaocala,eura,zena)
values (null,'plava','santene','Police',20.98,2);

# 3

insert into muskarac (sifra,bojaociju,hlace,modelnaocala,eura,zena)
values (null,'zelena','svecane','dioptrijske',55.98,3);

# 1

insert into mladic(sifra,suknja,kuna,drugiputa,asocijalno,ekstroventno,dukserica,muskarac)
values (null,'rozena',20.57,'2022-12-01 10:00:00', true,false,'Tom Taylor',1);

# 2

insert into mladic(sifra,suknja,kuna,drugiputa,asocijalno,ekstroventno,dukserica,muskarac)
values (null,'ljubicasta',15.57,'2022-12-02 11:00:00', false,true,'Under Armour',2);

# 3

insert into mladic(sifra,suknja,kuna,drugiputa,asocijalno,ekstroventno,dukserica,muskarac)
values (null,'zuta',10.57,'2022-12-03 13:00:00', true,true,'crna',3);

# 1

insert into punac (sifra,ogrlica,gustoca,hlace)
values (null,1,10.15,'duge');

# 2

insert into punac (sifra,ogrlica,gustoca,hlace)
values (null,2,15.15,'kratke');

# 3

insert into punac (sifra,ogrlica,gustoca,hlace)
values (null,3,9.15,'pamucne');

# 1

insert into cura(sifra,novcica,gustoca,lipa,bojakose,ogrlica,suknja,punac)
values (null,50.23,10.45,20.23,'smeda',1,'mala',1);

# 2

insert into cura(sifra,novcica,gustoca,lipa,bojakose,ogrlica,suknja,punac)
values (null,30.23,15.45,10.23,'plava',2,'velika',2);

# 3

insert into cura(sifra,novcica,gustoca,lipa,bojakose,ogrlica,suknja,punac)
values (null,40.23,5.45,10.23,'crna',1,'srednja',3);

update cura set gustoca=15.77 where sifra>=1;


delete from mladic where kuna>15.78;

update zena set hlace='ana';

select a.kratkamajica,a.hlace
from zena a
left join zena on a.kratkamajica=a.hlace 
where a.sifra>=1;

select* from mladic;

select a.asocijalno,f.dukserica,b.hlace
from mladic a
inner join muskarac b on a.muskarac=b.sifra 
inner join zena c on c.sifra=b.zena 
inner join sestra d on d.sifra=c.sestra 
inner join sestra_svekar e on e.svekar=d.sifra 
inner join svekar f on f.sifra=e.sestra 
where c.hlace like ('%a') and d.haljina like ('%a')
order by 3 desc;

select a.haljina,a.eura
from sestra a
left join sestra_svekar b on a.sifra=b.sestra 
where b.sestra is null;





