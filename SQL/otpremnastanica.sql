drop database if exists otpremnastanica;
create database otpremnastanica default charset utf8;
use otpremnastanica;

create table zaposlenik(
    sifra int not null primary key auto_increment,
    ime varchar(59)not null,
    prezime varchar(50)not null,
    oib char(11),
    email varchar(50)not null,
    radnomjesto varchar(50) not null

);

create table odrzavanje(
    sifra int not null primary key auto_increment,
    datum datetime,
    zaposlenik int not null 
);

create table posao(
sifra int not null primary key auto_increment,
naziv varchar(100) not null
);

create table naftno_polje(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null
    
);


create table busotina(
    sifra int not null primary key auto_increment,
    naziv varchar(20) not null,
    aktivna boolean not null,
    naftno_polje int  not null
);


create table odrzavanje_posao_busotina(
    sifra int not null primary key auto_increment,
    odrzavanje int not null,
    posao int not null,
    busotina int not null,
    napomena varchar(100),
    tlak_tubinga decimal(18,2) not null,
    tlak_casinga decimal(18,2) not null,
    tlak_naftovoda decimal(18,2) not null
);

alter table odrzavanje add foreign key (zaposlenik) references zaposlenik(sifra);
alter table busotina add foreign key (naftno_polje) references naftno_polje(sifra);
alter table odrzavanje_posao_busotina add foreign key (odrzavanje) references odrzavanje(sifra);
alter table odrzavanje_posao_busotina add foreign key (posao) references posao(sifra);
alter table odrzavanje_posao_busotina add foreign key (busotina) references busotina(sifra);



insert into zaposlenik (ime,prezime,oib,email,radnomjesto)
values ('Mario','Živković', 47014940109,'mzivkovic@gmail.com','Viši mobilni operater1'),
       ('Ante','Tomić', 92284205967,'atomic@gmail.com','Viši mobilni operater1'),
        ('Josip','Žagar', 19436503181,'jzagar@gmail.com','Viši mobilni operater2'),
         ('Zoran','Krivošija', 25423574017,'zkrivosija@gmail.com','Viši mobilni operater1');
        


insert into odrzavanje (datum,zaposlenik)
values ('2022-12-05 07:00:00-19:00:00',1),    # 1
		('2022-12-05 19:00:00-07:00:00',2),   # 2
		('2022-12-06 07:00:00-19:00:00',1),   # 3
        ('2022-12-06 19:00:00-07:00:00',2);   # 4
       



insert into posao (naziv)
values ('Aktiviranje kugle 3",uzimanje uzorka,zapisivanje nivoa aditiva u DPA rezervoaru,spuštanje kracera'), # 1
        ('Aktiviranje kugle 3",zapisivanje nivoa aditiva u DPA rezervoaru,uzimanje uzorka'),                  # 2
        ('Aktiviranje kugle 3",zapisivanje nivoa aditiva u DPA rezervoaru'),                                  # 3
        ('Povlačenje kugle 3" na češlju La-3'),                                                               # 4
        ('Povlačenje kugle 3" na češlju Cr-2 te aktiviranje iste na bušotinu'),                               # 5
        ('Kontrola rada bušotina i njihalica'),                                                               # 6
        ('Povlačenje kugle 3" na češlju La-2'),                                                               # 7
        ('Spuštanje kracera,zamjena dijagrama'),                                                              # 8
        ('spuštanje kracera');                                                                                # 9
       
       


insert into naftno_polje (naziv)
values ('Crnac'),          # 1
		('Ladislavci'),    # 2
		('Beničanci'),     # 3
		('Kućanci');       # 4
	


insert into busotina (naziv,aktivna,naftno_polje)
values ('La-20',true,2),    # 1
		('La-10',true,2),   # 2
		('La-17',true,2),   # 3
		('La-13',true,2),   # 4
		('La-18',true,2),   # 5
		('La-12',true,2),   # 6
		('Cr-3',true,1),    # 7
		('Cr-13',true,1),   # 8
		('Cr-14',true,1),   # 9
		('Cr-12',true,1),   # 10
		('Ku-4',true,4);    # 11
	


insert into odrzavanje_posao_busotina (odrzavanje,posao,busotina,tlak_tubinga,tlak_casinga,tlak_naftovoda,napomena)
values (1,1,1,10.5,39.1,9.5,'Bušotina radi dobro'),                                                                # 1
		(1,2,2,11.5,38.1,10.5,'Bušotina radi dobro'),                                                              # 2
		(1,2,3,9.5,1.5,9.1,'Bušotina radi dobro'),                                                                 # 3
		(1,2,4,12.1,39.5,11.5,'Bušotina radi dobro'),                                                              # 4
		(2,8,1,10.5,39.1,9.5,'Bušotina radi dobro,kracer išao dobro'),                                             # 5
		(2,9,11,10.1,40.1,9.5,'Bušotina radi dobro,kracer išao dobro'),                                            # 6
		(3,3,5,12.5,7.1,9.5,'Bušotina radi dobro'),                                                                # 7
		(3,3,6,10.5,3.5,9.2,'Bušotina radi dobro'),                                                                # 8
		(4,8,1,10.3,39.2,9.5,'Bušotina radi dobro,kracer išao dobro'),                                             # 9
		(4,9,11,8.5,38.9,7.5,'Bušotina radi dobro, kracer išao dobro');                                            # 10
	
        