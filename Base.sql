use planetas;

create table planeta_editable (
ID_PLANETA serial primary key,
NOMBRE_SISTEMA VARCHAR (50) not null,
NOMBRE_PLANETA varchar (50) not null unique,
IMAGEN blob,
DIAMETRO int not null,
DIST_ESTRELLA int not null,
SATELITES int not null,
TIPO varchar (50) not null,
MASA varchar (50) not null,
ENANO BOOLEAN not null,
VERIFICADO BOOLEAN null
);

create table planeta (
ID_PLANETA serial primary key,
NOMBRE_SISTEMA VARCHAR (50) not null,
NOMBRE_PLANETA varchar (50) not null unique,
IMAGEN blob,
DIAMETRO int not null,
DIST_ESTRELLA int not null,
SATELITES int not null,
TIPO varchar (50) not null,
MASA varchar (50) not null,
ENANO int not null,
VERIFICADO BOOLEAN NOT NULL
);

drop table planeta_editable;
drop table planeta;

select * from planeta_editable;




