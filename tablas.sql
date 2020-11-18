CREATE TABLE usuario (
	carnet INT NOT NULL,
	nombre VARCHAR(50) NOT NULL, 
	correo VARCHAR(50) NOT NULL, 
	clave VARCHAR(12) NOT NULL, 
	apellido VARCHAR(25) NOT NULL,
	cargo VARCHAR(25) NOT NULL
 ); 
 
 CREATE TABLE equipo (
	idEquipo INT NOT NULL, 
	Estado VARCHAR(25) NOT NULL,
	EnUso BOOLEAN NOT NULL,
	idElemento INT NOT NULL
 ); 
 
 CREATE TABLE novedad (
	idNovedad INT NOT NULL, 
	fecha DATE NOT NULL,
	Titulo VARCHAR(20) NOT NULL,
	Responsable  INT NOT NULL,
	Detalle VARCHAR(40) NOT NULL, 
	IdEquipo INT NOT NULL,
	idLaboratorio INT NOT NULL
 ); 
 
 CREATE TABLE laboratorio (
	idLaboratorio INT NOT NULL,
	idEquipo INT NOT NULL,
	Descripcion VARCHAR(40) NOT NULL
 );
 
 CREATE TABLE elemento (
	id INT NOT NULL,
	Nombre VARCHAR(25) NOT NULL,
	TipoElemento VARCHAR(15) NOT NULL,
	Marca VARCHAR(25) NOT NULL,
	descripcion VARCHAR(50) NOT NULL
);


----------------PK----------------
ALTER TABLE usuario ADD CONSTRAINT pk_Usuario PRIMARY KEY (carnet);
ALTER TABLE equipo ADD CONSTRAINT pk_Equipo PRIMARY KEY (idEquipo);
ALTER TABLE elemento ADD CONSTRAINT pk_Elemento PRIMARY KEY (id);
ALTER TABLE laboratorio ADD CONSTRAINT pk_laboratorio PRIMARY KEY (idLaboratorio);
ALTER TABLE novedad ADD CONSTRAINT pk_novedad PRIMARY KEY (idNovedad);
----------------FK----------------

ALTER TABLE equipo ADD CONSTRAINT FK_equipo_elemento FOREIGN KEY (idEquipo) REFERENCES elemento(id);
ALTER TABLE laboratorio ADD CONSTRAINT FK_laboratorio_equipo FOREIGN KEY (idEquipo) REFERENCES equipo(idEquipo);
ALTER TABLE novedad ADD CONSTRAINT FK_novedad_equipo FOREIGN KEY (idEquipo) REFERENCES equipo(idEquipo);
ALTER TABLE novedad ADD CONSTRAINT FK_novedad_laboratorio FOREIGN KEY (idLaboratorio) REFERENCES laboratorio(idLaboratorio);

----------------UK----------------
ALTER TABLE usuario ADD CONSTRAINT Uk_Usuario_correo UNIQUE (correo);




