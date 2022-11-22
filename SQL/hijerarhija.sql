drop database if exists hijerarhija;
create database hijerarhija;
use hijerarhija;

create table zaposlenik(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    placa decimal(18,2),
    nadredjeni int 
);

alter table zaposlenik add foreign key (nadredjeni) references zaposlenik(sifra);
