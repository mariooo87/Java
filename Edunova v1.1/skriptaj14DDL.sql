drop database if exists edunovaj14;
create database edunovaj14 character set utf8;
use edunovaj14;

create table smjer(
sifra int not null primary key auto_increment,
naziv varchar(50) not null,
trajanje int,
cijena decimal(18,2)
)engine=innodb;


create table grupa(
sifra int not null primary key auto_increment,
smjer int not null,
predavac int,
naziv varchar(50) not null,
brojpolaznika int,
datumpocetka datetime
)engine=innodb;

create table predavac(
sifra int not null primary key auto_increment,
osoba int not null,
iban varchar(50),
slika longblob
)engine=innodb;

create table predavac_slika_arhiva(
predavac int not null,
slika longblob,
datum datetime not null
)engine=innodb;

create table polaznik(
sifra int not null primary key auto_increment,
osoba int not null,
brojugovora varchar(20)
)engine=innodb;

create table osoba(
sifra int not null primary key auto_increment,
oib char(11) not null,
ime varchar(50) not null,
prezime varchar(50) not null,
email varchar(50),
aktivan boolean
)engine=innodb;


create table clan(
grupa int not null,
polaznik int not null
)engine=innodb;


create table operater(
sifra int not null primary key auto_increment,
ime varchar(50) not null,
prezime varchar(50) not null,
korisnik varchar(50) not null,
lozinka char(32) not null,
uloga varchar(20),
formatdatuma varchar(50)
)engine=innodb;

create unique index i1 on operater(korisnik);


alter table grupa add foreign key (smjer) references smjer(sifra);
alter table grupa add foreign key (predavac) references predavac(sifra);

alter table predavac add foreign key (osoba) references osoba(sifra);

alter table polaznik add foreign key (osoba) references osoba(sifra);

alter table clan add foreign key (grupa) references grupa(sifra);
alter table clan add foreign key (polaznik) references polaznik(sifra);

alter table predavac_slika_arhiva add foreign key (predavac) references predavac(sifra);