use edunovaj14;
#1
insert into operater(ime,prezime, korisnik,lozinka,uloga,formatdatuma)
values ('Tomislav','Jakopec','tjakopec',md5('t'),'administrator','dd.MM.yyyy.');

#1. na? unosa podataka u tablice (najispravniji)
#1
insert into smjer(naziv,trajanje,cijena) values 
('Java programiranje',130,2999.99);
#2
insert into smjer(naziv,trajanje,cijena)
values ('Web programiranje',130,null);
#3
insert into smjer(trajanje,naziv,cijena)
values (null,'Android programiranje',null);



#2. način
#4
insert into smjer values (null,'EU fondovi',100,5000);

#3. način

insert into smjer(naziv,trajanje,cijena) values 
('Računalni servis',120,2000.99),
('Računalni operator',100,1500.99);



#1
insert into osoba(oib,ime,prezime,email,aktivan)
values ('00000000001','Tomislav','Jakopec','tjakopec@gmail.com',true);
#2
insert into osoba(oib,ime,prezime,email,aktivan)
values ('00000000002','Mario','Benčić','mm@gmail.com',true);
insert into osoba(oib,ime,prezime,email,aktivan)
values ('00000000003','Đorđe','Đorđević','mm@gmail.com',true);
insert into osoba(oib,ime,prezime,email,aktivan)
values ('00000000004','Mario','Hribar','mm@gmail.com',true);
insert into osoba(oib,ime,prezime,email,aktivan)
values ('00000000005','Krešimir','Papić','mm@gmail.com',true);
insert into osoba(oib,ime,prezime,email,aktivan)
values ('00000000006','Matej','Prpić','mm@gmail.com',true);
insert into osoba(oib,ime,prezime,email,aktivan)
values ('00000000007','Dubravka','Radovanović','mm@gmail.com',true);
insert into osoba(oib,ime,prezime,email,aktivan)
values ('00000000008','Goran','Trifunović','mm@gmail.com',true);
insert into osoba(oib,ime,prezime,email,aktivan)
values ('00000000009','Uroš','Livada','mm@gmail.com',true);

#1
insert into predavac(osoba,iban) values (1,'256');

#1
insert into grupa(smjer,predavac,naziv,brojpolaznika,datumpocetka) values
(1,1,'J14',15,'2014-10-28');
insert into grupa(smjer,predavac,naziv,brojpolaznika,datumpocetka) values
(2,1,'GH',15,null);
insert into grupa(smjer,predavac,naziv,brojpolaznika,datumpocetka) values
(3,1,'DF',null,'2014-10-28');
insert into grupa(smjer,predavac,naziv,brojpolaznika,datumpocetka) values
(4,1,'ERT',15,null);
insert into grupa(smjer,predavac,naziv,brojpolaznika,datumpocetka) values
(5,1,'S12',null,'2014-10-28');
#1-8
insert into polaznik(osoba,brojugovora) values
(2,null),
(3,null),
(4,null),
(5,null),
(6,null),
(7,null),
(8,null),
(9,null);

insert into clan(grupa,polaznik) values
(1,1),(1,2),(1,3),(1,4),(1,5),(1,6),(1,7),(1,8);


insert into operater(ime,prezime, korisnik,lozinka,uloga,formatdatuma)
values ('Tomislavaa','Jakopecaa','tjakopecaa',md5('taa'),'administrator','dd.MMMMM yyyy.');