drop table if exists emprunter;
drop table if exists client;
drop table if exists exemplaire;
drop table if exists ecrire;
drop table if exists livre;
drop table if exists auteur;

create table client(
	idClient INTEGER primary key auto_increment, 
	nom VARCHAR(30), 
	prenom VARCHAR(30), 
	dateNaissance DATE
)
engine = InnoDB;

create table auteur(
	idAuteur INTEGER primary key auto_increment,
	nom VARCHAR(30),
	prenom VARCHAR(30)
)
engine = InnoDB;

create table livre(
	idLivre INTEGER primary key auto_increment,
	titre VARCHAR(100),
	editeur VARCHAR(50),
	datePublication DATE,
	nbrPages INTEGER not null
)
engine = InnoDB;

create table exemplaire(
	idExemplaire VARCHAR(30) primary key,
	idLivre INTEGER, 
	etat VARCHAR(30), 
	foreign key (idLivre) references livre(idLivre) 
)
engine = InnoDB;

create table emprunter(
	idClient INTEGER not null,
	idExemplaire VARCHAR(30) not null,
	dateEmprunt DATE not null,
	dateRetour DATE not null,
	primary key (idClient, idExemplaire),
	foreign key (idClient) references client(idClient),
	foreign key (idExemplaire) references exemplaire(idExemplaire)
)
engine = InnoDB;

create table ecrire(
	idAuteur INTEGER not null,
	idLivre INTEGER not null,
	primary key (idAuteur, idLivre),
	foreign key (idAuteur) references auteur(idAuteur),
	foreign key (idLivre) references livre(idLivre)
)
engine = InnoDB;