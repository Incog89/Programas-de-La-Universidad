create database transportesei;
use transportesei;

CREATE TABLE Rutas(
    LugarSalida VARCHAR(100),
    Distancia FLOAT,
    Codigo Int primary key,
    LugarLLegada VARCHAR(100),
    Activada int
);

SELECT *FROM Rutas;


INSERT INTO RUTAS VALUES("ALBFKÑW",2142, 1,"LNPLKBW",1);
INSERT INTO VIAJES VALUES(1, current_timestamp(), current_timestamp(), 
"2022/06/07", 214.2,"JNLK","WREYR",1,1,1,0);
SELECT Ruta FROM Viajes, Rutas where Viajes.Codigo = Rutas.Codigo;


CREATE TABLE Viajes(
    Codigo INT primary key,
    HoraSalida Time,
    HoraLLegada Time,
    Fecha DATE,
    Precio FLOAT,
    Autobus VARCHAR(100),
    Chofer VARCHAR(100),
    Ruta INT,
    Activada int,
    Lugares int,
    LugaresVendidos int,
    FOREIGN KEY (Ruta) REFERENCES  Rutas(Codigo)
);
SELECT * FROM RUTAS;

CREATE TABLE Boletos(
    CodigoRuta int primary key ,
    CodigoViaje int unique key ,
    AsientosVendidos int,
    AsientosLibro int,
    Precio Float,
    Total Float,
    Foreign key (CodigoRuta) references rutas(Codigo),
    FOREIGN KEY (CodigoViaje) references Viajes(Codigo)
);

CREATE TABLE VENTAB(
    CodigoRuta int,
    CodigoViaje int,
    CantidadAsientos int,
    Precio float,
    Total float,
    FOREIGN KEY (CodigoRuta) references Boletos(CodigoRuta),
    FOREIGN KEY (CodigoViaje) references Viajes(Codigo)
);
DROP TABLE VENTAB;
INSERT INTO VENTAB VALUES(1,1,3,232,244);
INSERT INTO BOLETOS VALUES(1,1,2,3,234,300);-- 
SELECT *FROM VENTAB;
SELECT *FROM BOLETOS;

#usuario = "Hola";
#contra = "1234";
#usuarioA = "Admin";
#contraA = "Admin123";