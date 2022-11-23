drop database if exists muzej;
create database muzej;
use muzej;

create table kustos(
    sifra  int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    oib char(11),
    email varchar(50) not null
);

create table izlozba(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    datumpocetka datetime not null,
    datumzavrsetka datetime,
    kustos int not null,
    sponzor int 
);

create table djelo(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    umjetnik varchar(50) not null,
    maksimalnodjela int not null,
    izlozba int not null
);

create table sponzor(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    brojugovora varchar(20),
    oib char(11)
);

alter table izlozba add foreign key (kustos) references kustos(sifra);
alter table izlozba add foreign key (sponzor) references sponzor(sifra);
alter table djelo add foreign key (izlozba) references izlozba(sifra);

# 1
insert into kustos(sifra,ime,prezime,oib,email)
values(null,'Pero','Peric',null,'pero.peric@gmail.com');

# 2

insert into kustos (sifra,ime,prezime,oib,email)
values(null,'Marko','Maric',null,'marko.maric@gmail.com');

# 3

insert into kustos (sifra,ime,prezime,oib,email)
values(null,'Vlado','Vladic',null,'vlado.vladic@gmail.com');

# 1

insert into sponzor (sifra,ime,brojugovora,oib)
values(null,'Ina',null,null);

# 2

insert into sponzor (sifra,ime,brojugovora,oib)
values(null,'HEP','22\18',null);

# 3

insert into sponzor (sifra,ime,brojugovora,oib)
values(null,'Generali',null,'40145900839');

# 1

insert into izlozba (sifra,naziv,datumpocetka,datumzavrsetka,kustos,sponzor)
values(null,'Izabrana djela','2022-11-23',null,1,1);

# 2

insert into izlozba (sifra,naziv,datumpocetka,kustos,sponzor)
values(null,'Portreti','2022-11-27',2,2);

# 3

insert into izlozba (sifra,naziv,kustos,sponzor)
values(null,'Priroda u boji',3,3);

# 1

insert into djelo (sifra,naziv,umjetnik,maksimalnodjela,izlozba)
values(null,'Mona Lisa','Leonardo da Vinci',20,1);

# 2

insert into djelo (sifra,naziv,umjetnik,izlozba,maksimalnodjela)
values(null,'The Starry Night','Vincent Van Gogh',2,15);

# 3

insert into djelo (sifra,naziv,umjetnik,izlozba,maksimalnodjela)
values(null,'The Scream','Edvard Munch',3,10);







