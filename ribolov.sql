# C:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Korisnik\Documents\GitHub\Ribolov\ribolov.sql

drop database if exists ribolov;
create database ribolov;
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
    oib int,
    iban char(11)
);

create table ribic(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    oib int,
    ribolovnodrustvo int not null
);

create table riba(
    sifra int not null primary key auto_increment,
    masa decimal(18,2) not null,
    duljina decimal (18,2) not null,
    riboloviste int not null,
    ribic int not null
);

create table natjecanje(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    od datetime not null,
    do datetime not null,
    ribic int not null,
    ribolovnodrustvo int not null,
    riba int not null
); 


