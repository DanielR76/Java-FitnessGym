CREATE DATABASE Gimnasio;
USE Gimnasio;

/*Creacion de TABLAS*/

CREATE TABLE Cliente(
	idCliente VARCHAR(20),
	password VARCHAR (20) NOT NULL,
	nombre VARCHAR(20) NOT NULL,
	apellido VARCHAR(20) NOT NULL,
	telefono BIGINT NOT NULL,
	direccion VARCHAR(40) NOT NULL,
	edad BIGINT,
	sexo VARCHAR(20),
	EPS VARCHAR(20),
	correo VARCHAR(20),
	peso BIGINT,
	estatura BIGINT ,
    objetivo VARCHAR(20)DEFAULT'Tonificar',
	fecha Timestamp NOT NULl DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	nombreFamiliar VARCHAR(20),
	telefonoFamiliar BIGINT,
	parentesco VARCHAR(20)
	
);

ALTER TABLE Cliente
ADD CONSTRAINT PK_Cliente
PRIMARY KEY (idCliente);

CREATE TABLE Instructor(
	idInstructor VARCHAR(20),
	nombre VARCHAR(20),
	apellido VARCHAR(20),
	correo VARCHAR(20),
	direccion VARCHAR(20),
	telefono BIGINT,
	sexo VARCHAR(20),
	password BIGINT,
	idCliente VARCHAR(20)
);

ALTER TABLE Instructor
ADD CONSTRAINT  PK_Instructor
PRIMARY KEY (idInstructor);


CREATE TABLE Dieta(
	idDieta BIGINT ,
	nombreDieta VARCHAR(20) NOT NULL,
	cantidadCalorias VARCHAR(20) NOT NULL,
	descripcion VARCHAR(50) NOT NULL,
	contenido VARCHAR(30),
	idCliente VARCHAR(20) 
);

ALTER TABLE Dieta
ADD CONSTRAINT PK_Dieta
PRIMARY KEY (idDieta);

ALTER TABLE Dieta
MODIFY idDieta BIGINT AUTO_INCREMENT;

CREATE TABLE Rutina( 
	idRutina BIGINT,
	nombreRutina VARCHAR(20),
	objetivo VARCHAR(20),
	ejercicios BIGINT,	
	idCliente VARCHAR(20) 
);


ALTER TABLE Rutina
ADD CONSTRAINT PK_Rutina
PRIMARY KEY (idRutina);

ALTER TABLE Rutina
MODIFY idRutina BIGINT AUTO_INCREMENT;

CREATE TABLE Ejercicio(
	idEjercicio BIGINT ,
	nombre	VARCHAR(20) NOT NULL,
	grupoMuscular VARCHAR(100) NOT NULL,
	descripcion VARCHAR(100),
    foto BLOB,
	idRutina BIGINT 
);



ALTER TABLE Ejercicio
ADD CONSTRAINT PK_Ejercicio
PRIMARY KEY (idEjercicio);

ALTER TABLE Ejercicio
MODIFY idEjercicio BIGINT AUTO_INCREMENT;

CREATE TABLE Medida(
    idMedida BIGINT ,
    estatura VARCHAR(5) not null,
	hombros VARCHAR(5) not null,
    pecho VARCHAR(5) not null,
    cintura VARCHAR(5) not null,
	cuello VARCHAR(5) not null,
    biceps VARCHAR(5) not null,
	antebrazo VARCHAR(5),
	cadera VARCHAR(5) not null,      
	gemelos VARCHAR(5) not null,
	musloSuperior VARCHAR(5) not null,
	imc VARCHAR(5),
  fecha Timestamp NOT NULl DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  observacion VARCHAR(100),
	idHistorial BIGINT 
);


ALTER TABLE Medida
ADD CONSTRAINT PK_ListaProducto
PRIMARY KEY (idMedida);

ALTER TABLE Medida
MODIFY idMedida BIGINT AUTO_INCREMENT;

  CREATE TABLE Factura(
	idFactura INT NOT NULL,
    idCliente BIGINT NOT NULL,
    fecha Timestamp NOT NULl DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    valorNeto FLOAT(10) NOT NULL,
    valorDescuento FLOAT(10) NOT NULL,
	valorTotal FLOAT(10) NOT NULL	
);  

ALTER TABLE Factura
ADD CONSTRAINT PK_Factura
PRIMARY KEY (idFactura);

ALTER TABLE FACTURA
MODIFY idFactura INT AUTO_INCREMENT;

CREATE TABLE Producto(
    idProducto INT NOT NULL,
    concepto VARCHAR(50) NOT NULL,
    valor FLOAT(10) NOT NULL,
    imagen LONGBLOB NULL
);

ALTER TABLE Producto
ADD CONSTRAINT PK_Producto
PRIMARY KEY (idProducto);

ALTER TABLE Producto
MODIFY idProducto INT AUTO_INCREMENT;

CREATE TABLE ProductoPorFactura(
    idProductoPorFactura INT,
    idFactura INT,
    idProducto INT,
    cantidad INT
);
ALTER TABLE ProductoPorFactura
ADD CONSTRAINT PK_ProductoPorFactura
PRIMARY KEY (idProductoPorFactura);

CREATE TABLE Contabilidad(
idContabilidad BIGINT ,
ingreso BIGINT,
egreso BIGINT,
descripcion VARCHAR(100)
);

ALTER TABLE Contabilidad
ADD CONSTRAINT IdContabilidad
PRIMARY KEY (IdContabilidad);

ALTER TABLE Contabilidad
MODIFY idContabilidad INT AUTO_INCREMENT;

CREATE TABLE Novedades(
idNovedades BIGINT ,
nombreEvento VARCHAR(20),
ubicacionEvento VARCHAR (20),
 fecha Timestamp NOT NULl DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 descripcion VARCHAR(100) NOT NULL,
 idInstructor VARCHAR (20)

);
ALTER TABLE Novedades 
ADD CONSTRAINT idNovedades
PRIMARY KEY (idNovedades);

ALTER TABLE Novedades
MODIFY idNovedades BIGINT AUTO_INCREMENT;

CREATE TABLE Inventario (
idInventario BIGINT ,
nombre VARCHAR(20),
valor INT,
tipo VARCHAR(20),
foto BLOB,
descripcion VARCHAR(100)
);
ALTER TABLE Inventario
ADD CONSTRAINT idInventario
PRIMARY KEY (idInventario);

ALTER TABLE Inventario
MODIFY idInventario BIGINT AUTO_INCREMENT;

CREATE TABLE Sugerencias (
idSugerencias BIGINT ,
nombre VARCHAR (20),
Asunto VARCHAR (20),
Comentario VARCHAR (100),
idCliente VARCHAR(20)
);
ALTER TABLE Sugerencias
ADD CONSTRAINT idSugerencias
PRIMARY KEY (idSugerencias);

ALTER TABLE Sugerencias
MODIFY idSugerencias BIGINT AUTO_INCREMENT;

/*Creacion llaves foraneas*/
ALTER TABLE Novedades
ADD CONSTRAINT fk_Novedades_Instructor
FOREIGN KEY (idInstructor)
REFERENCES Instructor (idInstructor);

ALTER TABLE Sugerencias
ADD CONSTRAINT fk_Sugerencias_cliente
FOREIGN KEY (idCliente)
REFERENCES Cliente (idCliente);

ALTER TABLE Instructor
ADD CONSTRAINT fk_Instructor_Cliente
FOREIGN KEY (idCliente)
REFERENCES Cliente (idCliente);


ALTER TABLE Dieta
ADD CONSTRAINT fk_Dieta_Cliente
FOREIGN KEY (idCliente)
REFERENCES Cliente (idCliente);

ALTER TABLE Rutina
ADD CONSTRAINT fk_Rutina_Cliente
FOREIGN KEY (idCliente)
REFERENCES Cliente (idCliente);

ALTER TABLE Ejercicio
ADD CONSTRAINT fk_Ejercicio_Rutina
FOREIGN KEY (idRutina)
REFERENCES Rutina (idRutina);

ALTER TABLE ProductoPorFactura
ADD CONSTRAINT FK_ProductoPorFactura_Factura
FOREIGN KEY (idFactura)
REFERENCES Factura (idFactura);

ALTER TABLE ProductoPorFactura
ADD CONSTRAINT FK_ProductoPorFactura_Producto
FOREIGN KEY (idProducto)
REFERENCES Producto (idProducto);
