CREATE TABLE usuario (
	usuario VARCHAR(50) NOT NULL, 
	estado BOOLEAN NOT NULL, 
	contraseña VARCHAR(12) NOT NULL
 ); 

 
 CREATE TABLE equipo (
	idEquipo NUMBER(5) NOT NULL, 
	idLaboratorio NUMBER(4) NOT NULL
 ); 
 
 CREATE TABLE novedad (
	idEquipo NUMBER(5) NOT NULL, 
	idElemento NUMBER(20) NOT NULL, 
	fecha DATE NOT NULL, 
	titulo VARCHAR(20) NOT NULL,
	responsable VARCHAR(25) NOT NULL,
	detalle VARCHAR(100) NOT NULL
 ); 
 
 CREATE TABLE laboratorio (
	idLaboratorio NUMBER(4) NOT NULL,
	nombre VARCHAR(30) NOT NULL,
	descripcion VARCHAR(100) NOT NULL
	
 );
 
 CREATE TABLE elemento (
	idEquipo NUMBER(5) NOT NULL,
	idElemento NUMBER(20) NOT NULL,
	fecha DATE NOT NULL,
	tipoElemento VARCHAR(8) NOT NULL,
	descripcion VARCHAR(100) NOT NULL
);


----------------PK----------------
ALTER TABLE usuario
ADD CONSTRAINT Pk_usuario
PRIMARY KEY (usuario);

ALTER TABLE equipo
ADD CONSTRAINT Pk_equipos_id
PRIMARY KEY (idEquipo);

ALTER TABLE laboratorio
ADD CONSTRAINT Pk_laboratorio_id
PRIMARY KEY (idLaboratorio);

ALTER TABLE elemento
ADD CONSTRAINT Pk_elementoId
PRIMARY KEY (idElemento);
----------------FK----------------

ALTER TABLE equipo
ADD CONSTRAINT FK_equipo_laboratorio
FOREIGN KEY (idLaboratorio) REFERENCES laboratorio(idLaboratorio);

ALTER TABLE novedad
ADD CONSTRAINT FK_novedad_elementos
FOREIGN KEY (idElemento) REFERENCES elemento(idElemento);

ALTER TABLE elemento
ADD CONSTRAINT FK_elemento_equipos
FOREIGN KEY (idEquipo) REFERENCES equipo(idEquipo);






