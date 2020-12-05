CREATE TABLE usuario (
	carnet INT NOT NULL,
	correo VARCHAR(50) NOT NULL,
	clave VARCHAR(12) NOT NULL,
	nombre VARCHAR(50) NOT NULL, 
	apellido VARCHAR(25) NOT NULL,
	cargo VARCHAR(25) NOT NULL
 ); 
 
 CREATE TABLE equipo (
	idEquipo INT NOT NULL,
	nombre VARCHAR(25) NOT NULL, 
	estado VARCHAR(25) NOT NULL,
	enUso CHAR(2) NOT NULL,
	idLaboratorio INT NOT NULL
 ); 
 
 CREATE TABLE novedad (
	idNovedad INT NOT NULL, 
	fecha DATE NOT NULL,
	titulo VARCHAR(20) NOT NULL,
	responsable  VARCHAR(20) NOT NULL,
	detalle VARCHAR(40) NOT NULL,
	tipo VARCHAR(20) NOT NULL,
	estado VARCHAR(10) NOT NULL,
	idElemNovedad INT NOT NULL
 ); 
 
 CREATE TABLE laboratorio (
	idLaboratorio INT NOT NULL,
	nombre VARCHAR(30) NOT NULL,
	horario VARCHAR(30) NOT NULL,
	caracteristicas VARCHAR(40) NOT NULL
 );
 
 CREATE TABLE elemento (
	id INT NOT NULL,
	TipoElemento VARCHAR(15) NOT NULL,
	Marca VARCHAR(25) NOT NULL,
	descripcion VARCHAR(50) NOT NULL,
	idEquipo INT NOT NULL
);


----------------PK----------------
ALTER TABLE usuario ADD CONSTRAINT pk_Usuario PRIMARY KEY (carnet);
ALTER TABLE equipo ADD CONSTRAINT pk_Equipo PRIMARY KEY (idEquipo);
ALTER TABLE elemento ADD CONSTRAINT pk_Elemento PRIMARY KEY (id);
ALTER TABLE laboratorio ADD CONSTRAINT pk_laboratorio PRIMARY KEY (idLaboratorio);
ALTER TABLE novedad ADD CONSTRAINT pk_novedad PRIMARY KEY (idNovedad);
----------------FK----------------

alter table equipo add constraint fk_equipo_laboratorio foreign key (idLaboratorio) references Laboratorio(idLaboratorio);

----------------UK----------------
ALTER TABLE usuario ADD CONSTRAINT Uk_Usuario_correo UNIQUE (correo);




