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

create table ulov(
    natjecanje int not null,
    ribic int not null,
    riba int not null,
    masa int not null
);

create table natjecanje(
    sifra int not null primary key auto_increment,
    vrsta varchar(50) not null,
    od datetime not null,
    do datetime not null,
    riboloviste int not null
); 


alter table ribic add foreign key (ribolovnodrustvo) references ribolovnodrustvo(sifra);
alter table ulov add foreign key (ribic) references ribic(sifra);
alter table ulov add foreign key (riba) references riba(sifra);
alter table ulov add foreign key (natjecanje) references natjecanje(sifra);
alter table natjecanje add foreign key (riboloviste) references riboloviste(sifra);


