# C:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Korisnik\Documents\GitHub\Ribolov\ribolov.sql

drop database if exists ribolov;
create database ribolov character set utf8;
use ribolov;

create table riboloviste(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    vrstavode varchar(50) not null
);

create table ribolovnodrustvo(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    mjesto varchar(50) not null,
    oib char(11),
    iban varchar(50)
);

create table riba(
    sifra int not null primary key auto_increment,
    vrsta varchar(50) not null
);

create table ribic(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    oib char(11),
    ribolovnodrustvo int not null
);

create table natjecanje(
    sifra int not null primary key auto_increment,
    vrsta varchar(50) not null,
    od datetime not null,
    do datetime not null,
    riboloviste int not null
); 

create table ulov(
    sifra int not null primary key auto_increment,
    natjecanje int not null,
    ribic int not null,
    riba int not null,
    masa int not null
);


alter table ribic add foreign key (ribolovnodrustvo) references ribolovnodrustvo(sifra);
alter table ulov add foreign key (ribic) references ribic(sifra);
alter table ulov add foreign key (riba) references riba(sifra);
alter table ulov add foreign key (natjecanje) references natjecanje(sifra);
alter table natjecanje add foreign key (riboloviste) references riboloviste(sifra);

insert into riboloviste(naziv, vrstavode)
values 
('Stara Drava, P. Podgajci', 'Stajačica, rukavac'),
('Vučica, Ivanovci', 'Tekučica, rijeka'),
('Mrtvača, Ladimirevci', 'Stajačica, bara'),
('Ribnjak, Golinci', 'Stajačica, ribnjak'),
('Bajer, Bizovac', 'Stajačica, bajer');

insert into ribolovnodrustvo(ime, mjesto)
values 
('SRD Linjak', 'Ivanovci'),
('SRU Valpovka', 'Valpovo'),
('USR Amur', 'Ladimirevci'),
('Smuđ', 'Satnica'),
('UŠR Karaš', 'Šag');

insert into riba(vrsta)
values 
('Šaran'),
('Smuđ'),
('Štuka'),
('Babuška'),
('Ostalo');

insert into ribic(ime, prezime, ribolovnodrustvo)
values ('Ilija', 'Mandić', 1),
('Josip', 'Maltašić', 2),
('Luka', 'Basa', 3),
('Sarah', 'Starčević', 4),
('Ingrid', 'Gliša', 5);

insert into natjecanje (vrsta, od, do, riboloviste)
values ('1. kolo - Županijska liga', '2022-05-22 9:00', '2022-05-22 12:00', 1),
('2. kolo - Županijska liga', '2022-06-12 9:00', '2022-06-12 12:00', 2),
('3. kolo - Županijska liga', '2022-07-01 9:00', '2022-07-01 12:00', 3),
('Županijski kup', '2022-07-09 9:00', '2022-07-09 15:00', 4),
('Državni kup', '2022-09-01 9:00', '2022-09-04 12:00', 5);


