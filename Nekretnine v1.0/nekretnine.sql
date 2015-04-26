drop database if exists nekretnine;
create database nekretnine character set utf8;
use nekretnine;


create table nekretnina(
sifra int not null primary key auto_increment,
vrsta varchar(50) not null,
godinaizgradnje int not null,
lokacija varchar(50) not null,
stambenapovrsina char(10) not null,
povrsinaokucnice char(10) not null,
vrstagrijanja varchar(25) not null,
cijena decimal(18,2) not null,
brojetaza int not null,
brojsoba int not null,
vlasnickilist boolean,
gradevinskadozvola boolean,
uporabnadozvola boolean,
prodaja boolean,
kupnja boolean
)engine=innodb;


create table ponudapotraznja(
sifra int not null primary key auto_increment,
naziv varchar(50) not null,
datum datetime not null,
cijenasprovizijom decimal(18,2) not null,
kupnjanekretnine boolean,
prodajanekretnine boolean,
klijent int not null,
nekretnina int not null
)engine=innodb;





create table agent(
sifra int not null primary key auto_increment,
ime varchar(50) not null,
prezime varchar(50) not null,
oib char(11) not null,
brojtelefona varchar(20) not null,
email varchar(50),
korisnik varchar(50),
lozinka char(32)
)engine=innodb;


create table klijent(
sifra int not null primary key auto_increment,
ime varchar(50) not null,
prezime varchar(50) not null,
brojtelefona varchar(20) not null,
provizija decimal(18,2) not null,
iban varchar(50),
email varchar(50),
agent int not null
)engine=innodb;






alter table ponudapotraznja add foreign key (nekretnina) references nekretnina(sifra);

alter table klijent add foreign key (agent) references agent(sifra);
alter table ponudapotraznja add foreign key (klijent) references klijent(sifra);





insert into nekretnina(vrsta,godinaizgradnje,lokacija,stambenapovrsina,povrsinaokucnice,vrstagrijanja,
cijena,brojetaza,brojsoba,vlasnickilist,gradevinskadozvola,uporabnadozvola,prodaja,kupnja)
values ('Kuća',1988,'Višnjevac, Stambena ulica 21',300,645,'Plinsko centralno',120000,3,8,true,true,true,true,false);

insert into nekretnina(vrsta,godinaizgradnje,lokacija,stambenapovrsina,povrsinaokucnice,vrstagrijanja,
cijena,brojetaza,brojsoba,vlasnickilist,gradevinskadozvola,uporabnadozvola,prodaja,kupnja)
values ('Kuća',2001,'Zagreb, Bukovačka cesta 45',268,500,'Plinsko centralno',590000,3,7,true,true,true,true,false);

insert into nekretnina(vrsta,godinaizgradnje,lokacija,stambenapovrsina,povrsinaokucnice,vrstagrijanja,
cijena,brojetaza,brojsoba,vlasnickilist,gradevinskadozvola,uporabnadozvola,prodaja,kupnja)
values ('Kuća',2011,'Samobor, Maje Strozzi 5',350,800,'Plinsko centralno',400000,3,8,true,true,true,true,false);

insert into nekretnina(vrsta,godinaizgradnje,lokacija,stambenapovrsina,povrsinaokucnice,vrstagrijanja,
cijena,brojetaza,brojsoba,vlasnickilist,gradevinskadozvola,uporabnadozvola,prodaja,kupnja)
values ('Kuća',2010,'Čepin, Ivana Adamovića 17',800,4778,'Plinsko centralno',550000,3,7,true,true,true,true,false);

insert into nekretnina(vrsta,godinaizgradnje,lokacija,stambenapovrsina,povrsinaokucnice,vrstagrijanja,
cijena,brojetaza,brojsoba,vlasnickilist,gradevinskadozvola,uporabnadozvola,prodaja,kupnja)
values ('Kuća',2013,'Osijek, Prenjska ulica 45',286,150,'Plinsko centralno',260000,2,10,true,true,true,true,false);

insert into nekretnina(vrsta,godinaizgradnje,lokacija,stambenapovrsina,povrsinaokucnice,vrstagrijanja,
cijena,brojetaza,brojsoba,vlasnickilist,gradevinskadozvola,uporabnadozvola,prodaja,kupnja)
values ('Kuća',2012,'Korčula, Blato',550,16883,'Strujno centralno',3800000,2,8,true,true,true,true,false);

insert into nekretnina(vrsta,godinaizgradnje,lokacija,stambenapovrsina,povrsinaokucnice,vrstagrijanja,
cijena,brojetaza,brojsoba,vlasnickilist,gradevinskadozvola,uporabnadozvola,prodaja,kupnja)
values ('Kuća',1995,'Metković, Petra Krešimira IV',211,700,'Lož-ulje centralno',200000,2,8,true,true,true,true,false);

insert into nekretnina(vrsta,godinaizgradnje,lokacija,stambenapovrsina,povrsinaokucnice,vrstagrijanja,
cijena,brojetaza,brojsoba,vlasnickilist,gradevinskadozvola,uporabnadozvola,prodaja,kupnja)
values ('Kuća',1987,'Pakrac, Mali Banovac',160,13500,'Peć na drva',15000,2,5,true,true,true,true,false);

insert into nekretnina(vrsta,godinaizgradnje,lokacija,stambenapovrsina,povrsinaokucnice,vrstagrijanja,
cijena,brojetaza,brojsoba,vlasnickilist,gradevinskadozvola,uporabnadozvola,prodaja,kupnja)
values ('Kuća',1998,'Slavonski Brod, Josipa Runjanina 93',196,530,'Plinsko centralno',190000,2,5,true,true,true,true,false);

insert into nekretnina(vrsta,godinaizgradnje,lokacija,stambenapovrsina,povrsinaokucnice,vrstagrijanja,
cijena,brojetaza,brojsoba,vlasnickilist,gradevinskadozvola,uporabnadozvola,prodaja,kupnja)
values ('Kuća',2007,'Slavonski Brod, Antuna Bačića 3',299,471,'Plinsko centralno',160000,2,7,true,true,true,true,false);



insert into nekretnina(vrsta,godinaizgradnje,lokacija,stambenapovrsina,povrsinaokucnice,vrstagrijanja,
cijena,brojetaza,brojsoba,vlasnickilist,gradevinskadozvola,uporabnadozvola,prodaja,kupnja)
values ('Stan',2012,'Osijek, Trg slobode',100,0,'Toplana - centralno',115000,1,3,true,true,true,true,false);

insert into nekretnina(vrsta,godinaizgradnje,lokacija,stambenapovrsina,povrsinaokucnice,vrstagrijanja,
cijena,brojetaza,brojsoba,vlasnickilist,gradevinskadozvola,uporabnadozvola,prodaja,kupnja)
values ('Stan',2008,'Osijek, Divaltova ulica',69,0,'Plinsko centralno',57900,1,3,true,true,true,true,false);

insert into nekretnina(vrsta,godinaizgradnje,lokacija,stambenapovrsina,povrsinaokucnice,vrstagrijanja,
cijena,brojetaza,brojsoba,vlasnickilist,gradevinskadozvola,uporabnadozvola,prodaja,kupnja)
values ('Stan',1979,'Bjelovar, Ulica Jurja Haulika',45,0,'Plinsko centralno',52000,1,3,true,true,true,true,false);

insert into nekretnina(vrsta,godinaizgradnje,lokacija,stambenapovrsina,povrsinaokucnice,vrstagrijanja,
cijena,brojetaza,brojsoba,vlasnickilist,gradevinskadozvola,uporabnadozvola,prodaja,kupnja)
values ('Stan',2005,'Solin, Gašpići',55,0,'Plinsko centralno',52000,1,3,true,true,true,false,false);

insert into nekretnina(vrsta,godinaizgradnje,lokacija,stambenapovrsina,povrsinaokucnice,vrstagrijanja,
cijena,brojetaza,brojsoba,vlasnickilist,gradevinskadozvola,uporabnadozvola,prodaja,kupnja)
values ('Stan',2011,'Zadar, Diklo',57,0,'Plinsko centralno',120000,1,3,true,true,true,true,false);



insert into nekretnina(vrsta,godinaizgradnje,lokacija,stambenapovrsina,povrsinaokucnice,vrstagrijanja,
cijena,brojetaza,brojsoba,vlasnickilist,gradevinskadozvola,uporabnadozvola,prodaja,kupnja)
values ('Poslovni prostor',1997,'Osijek, Industrijska četvrt',340,370,'Plinsko centralno',130000,2,8,true,true,true,true,false);

insert into nekretnina(vrsta,godinaizgradnje,lokacija,stambenapovrsina,povrsinaokucnice,vrstagrijanja,
cijena,brojetaza,brojsoba,vlasnickilist,gradevinskadozvola,uporabnadozvola,prodaja,kupnja)
values ('Poslovni prostor',1972,'Osijek, Gornji grad',107,0,'Plinsko centralno',107000,1,3,true,true,true,true,false);



insert into agent(ime,prezime,oib,brojtelefona,email,korisnik,lozinka)
values ('Mario','Benčić','07341200660','0991112222','mariooo87@gmail.com','mbencic',md5('mario123'));

insert into agent(ime,prezime,oib,brojtelefona,email,korisnik,lozinka)
values ('Ivan','Horvat','07341200666','0991232233','ivan.horvat@gmail.com','ihorvat',md5('ivan123'));



insert into klijent(ime,prezime,brojtelefona,provizija,iban,email,agent)
values ('Ivo','Ivić','0951234455',5,'HR7712345672233445566','ivo.ivic@gmail.com',1);

insert into klijent(ime,prezime,brojtelefona,provizija,iban,email,agent)
values ('Pero','Perić','0911234488',4.5,'HR7714345676437465920','pero.peric@hotmail.com',2);

insert into klijent(ime,prezime,brojtelefona,provizija,iban,email,agent)
values ('Marko','Marković','0911223355',3.5,'HR7712345672233445599','marko.markovic@net.hr',1);

























