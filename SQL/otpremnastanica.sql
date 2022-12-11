drop database if exists otpremnastanica;
create database otpremnastanica default charset utf8;
use otpremnastanica;

create table zaposlenik(
    sifra int not null primary key auto_increment,
    ime varchar(59),
    prezime varchar(50),
    oib char(11),
    email varchar(50),
    radnomjesto varchar(50)

);

create table odrzavanje(
    sifra int not null primary key auto_increment,
    datum datetime,
    zaposlenik int
);

create table posao(
sifra int not null primary key auto_increment,
naziv varchar(100)
);

create table naftno_polje(
    sifra int not null primary key auto_increment,
    naziv varchar(50)
    
);


create table busotina(
    sifra int not null primary key auto_increment,
    naziv varchar(20),
    aktivna boolean,
    naftno_polje int  
);


create table odrzavanje_posao_busotina(
    sifra int not null primary key auto_increment,
    odrzavanje int,
    posao int,
    busotina int,
    napomena varchar(100),
    tlak_tubinga decimal(18,2),
    tlak_casinga decimal(18,2),
    tlak_naftovoda decimal(18,2)
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
        ('2022-12-06 19:00:00-07:00:00',2),   # 4
        ('2022-12-07 07:00:00-19:00:00',4),   # 5
        ('2022-12-07 19:00:00-07:00:00',1),   # 6
        ('2022-12-08 07:00:00-19:00:00',4),   # 7
        ('2022-12-08 19:00:00-07:00:00',1),   # 8
        ('2022-12-09 07:00:00-19:00:00',3),   # 9
        ('2022-12-09 19:00:00-07:00:00',4),   # 10
        ('2022-12-10 07:00:00-19:00:00',3),   # 11
        ('2022-12-10 19:00:00-07:00:00',4),   # 12
        ('2022-12-11 07:00:00-19:00:00',2),   # 13
        ('2022-12-11 19:00:00-07:00:00',3),   # 14
        ('2022-12-12 07:00:00-19:00:00',2),   # 15
        ('2022-12-12 19:00:00-07:00:00',3);   # 16



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
		(4,9,11,8.5,38.9,7.5,'Bušotina radi dobro, kracer išao dobro'),                                            # 10
		(5,4,1,10.5,39.1,9.5,'Bušotina radi dobro, povučena kugla 3" na Č-La-3'),                                  # 11
		(5,4,2,10.5,39.5,9.4,'Bušotina radi dobro, povučena kugla 3" na Č-La-3'),                                  # 12
		(5,4,3,10.5,1.1,9.5,'Bušotina radi dobro, povučena kugla 3" na Č-La-3'),                                   # 13
		(5,4,4,11.5,39.8,10.5,'Bušotina radi dobro, povučena kugla 3" na Č-La-3'),                                 # 14
		(5,5,7,10.5,10.1,9.5,'Bušotina radi dobro,povučena kugla na Č-Cr-2 te aktivirana na bušotinu'),            # 15
		(5,5,8,10.5,1.5,9.5,'Bušotina radi dobro,povučena kugla na Č-Cr-2 te aktivirana na bušotinu'),             # 16
		(5,5,9,9.5,9.1,8.9,'Bušotina radi dobro,povučena kugla na Č-Cr-2 te aktivirana na bušotinu'),              # 17
		(5,5,10,10.5,7.1,9.5,'Bušotina radi dobro,povučena kugla na Č-Cr-2 te aktivirana na bušotinu'),            # 18
		(6,8,1,14.5,39.1,9.5,'Bušotina radi dobro,kracer išao dobro'),                                             # 19
		(6,9,11,7.5,40.1,9.1,'Bušotina radi dobro,kracer išao dobro'),                                             # 20
		(7,6,null,null,null,null,'Polja rade dobro'),                                                              # 21                                                                
        (8,8,1,13.5,38.1,9.2,'Bušotina radi dobro, kracer išao dobro'),                                            # 22
		(8,9,11,7.5,37.1,7.1,'Bušotina radi dobro, kracer išao dobro'),                                            # 23
		(9,7,5,11.5,7.1,9.3,'Bušotina radi dobro, povučena kugla 3" na Č-La-2'),                                   # 24
		(9,7,6,10.5,3.5,9.6,'Bušotina radi dobro, povučena kugla 3" na Č-La-2'),                                   # 25
		(10,8,1,12.5,37.1,9.8,'Bušotina radi dobro, kracer išao dobro'),                                           # 26
		(10,9,11,7.5,39.1,7.4,'Bušotina radi dobro, kracer išao dobro'),                                           # 27
		(11,6,null,null,null,null,'Polja rade dobro'),                                                             # 28
		(12,8,1,15.5,41.1,10.5,'Bušotina radi dobro, kracer išao dobro'),                                          # 29
		(12,9,11,12.5,7.1,9.9,'Bušotina radi dobro, kracer išao dobro'),                                           # 30
		(13,6,null,null,null,null,'Polja rade dobro'),                                                             # 31
		(14,8,1,13.5,39.1,9.7,'Bušotina radi dobro, kracer išao dobro'),                                           # 32
		(14,9,11,7.5,43.1,7.1,'Bušotina radi dobro, kracer išao dobro'),                                           # 33
		(15,1,1,16.5,39.1,11.5,'Bušotina radi dobro'),                                                             # 34
		(15,2,2,10.5,38.1,10.1,'Bušotina radi dobro'),                                                             # 35
		(15,2,3,9.5,1.5,9.1,'Bušotina radi dobro'),                                                                # 36
		(15,2,4,12.5,40.1,11.5,'Bušotina radi dobro'),                                                             # 37
		(16,8,1,13.5,37.1,10.5,'Bušotina radi dobro, kracer išao dobro'),                                          # 38
		(16,9,11,7.5,41.1,7.3,'Bušotina radi dobro, kracer išao dobro');                                           # 39
        
        