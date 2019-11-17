drop table planeta;
drop table planeta_editable;
drop table sistema;
drop table sistema_editable;

create table sistema (
ID serial primary key,
NOMBRE VARCHAR (50) not null unique,
PLANETAS INT not null,
PLANETAS_ENANOS integer not null,
GALAXIA VARCHAR (50) not null
);

create table planeta (
ID serial primary key,
SISTEMA_ID SERIAL not null,
NOMBRE VARCHAR (50) not null unique,
DIAMETRO INT not null,
DIST_ESTRELLA INT not null,
SATELITES INT not null,
TIPO VARCHAR (50) not null,
MASA INT not null,
ENANO int not null,
VERIFICADO numeric default 1,
FOREIGN KEY (SISTEMA_ID) REFERENCES sistema(ID) 
);

create table sistema_editable (
ID serial primary key,
NOMBRE VARCHAR (50) not null unique,
PLANETAS INT not null,
PLANETAS_ENANOS int not null,
GALAXIA VARCHAR (50) not null
);

create table planeta_editable (
ID serial primary key,
SISTEMA_ID SERIAL not null,
NOMBRE VARCHAR (50) not null unique,
DIAMETRO INT not null,
DIST_ESTRELLA INT not null,
SATELITES INT not null,
TIPO VARCHAR (50) not null,
MASA INT not null,
ENANO int not null,
VERIFICADO int default 0,
FOREIGN KEY (SISTEMA_ID) REFERENCES sistema_editable(ID) 
);
