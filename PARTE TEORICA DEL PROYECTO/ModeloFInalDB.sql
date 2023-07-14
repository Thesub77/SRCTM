/*
 * ER/Studio Data Architect SQL Code Generation
 * Project :      ModeloFinal.DM1
 *
 * Date Created : Sunday, July 09, 2023 18:30:17
 * Target DBMS : Microsoft SQL Server 2017
 */

/* 
 * TABLE: Asesor 
 */

 --CREATE DATABASE SrctmDB;
 --USE SrctmDB;

CREATE TABLE Asesor(
    id_asesor             int            IDENTITY(1,1),
    id_maestro_detalle    int            NOT NULL,
    INSS_asesor           varchar(8)     NOT NULL,
    nombre_asesor         varchar(32)    NOT NULL,
    p_apellido_asesor     varchar(16)    NOT NULL,
    s_apellido_asesor     varchar(16)    NULL,
    activo                smallint       NOT NULL,
    CONSTRAINT PK11 PRIMARY KEY NONCLUSTERED (id_asesor)
)
go



IF OBJECT_ID('Asesor') IS NOT NULL
    PRINT '<<< CREATED TABLE Asesor >>>'
ELSE
    PRINT '<<< FAILED CREATING TABLE Asesor >>>'
go

/* 
 * TABLE: Cargo 
 */

CREATE TABLE Cargo(
    id_cargo_evaluador    int            IDENTITY(1,1),
    id_detalle_trabajo    int            NOT NULL,
    id_evaluador          int            NOT NULL,
    descripcion_cargo     varchar(64)    NOT NULL,
    activo                smallint       NOT NULL,
    CONSTRAINT PK19 PRIMARY KEY NONCLUSTERED (id_cargo_evaluador)
)
go



IF OBJECT_ID('Cargo') IS NOT NULL
    PRINT '<<< CREATED TABLE Cargo >>>'
ELSE
    PRINT '<<< FAILED CREATING TABLE Cargo >>>'
go

/* 
 * TABLE: Carrera 
 */

CREATE TABLE Carrera(
    id_carrera             int            IDENTITY(1,1),
    codigo_carrera         varchar(16)    NOT NULL,
    descripcion_carrera    varchar(64)    NOT NULL,
    activo                 smallint       NOT NULL,
    CONSTRAINT PK16 PRIMARY KEY NONCLUSTERED (id_carrera)
)
go



IF OBJECT_ID('Carrera') IS NOT NULL
    PRINT '<<< CREATED TABLE Carrera >>>'
ELSE
    PRINT '<<< FAILED CREATING TABLE Carrera >>>'
go

/* 
 * TABLE: Detalle_Protocolo 
 */

CREATE TABLE Detalle_Protocolo(
    id_detalle_protocolo    int         IDENTITY(1,1),
    id_maestro_detalle      int         NOT NULL,
    id_estudiante           int         NOT NULL,
    pendiente               smallint    NOT NULL,
    activo                  smallint    NOT NULL,
    CONSTRAINT PK3 PRIMARY KEY NONCLUSTERED (id_detalle_protocolo)
)
go



IF OBJECT_ID('Detalle_Protocolo') IS NOT NULL
    PRINT '<<< CREATED TABLE Detalle_Protocolo >>>'
ELSE
    PRINT '<<< FAILED CREATING TABLE Detalle_Protocolo >>>'
go

/* 
 * TABLE: Detalle_trabajo 
 */

CREATE TABLE Detalle_trabajo(
    id_detalle_trabajo    int         IDENTITY(1,1),
    id_maestro_detalle    int         NOT NULL,
    id_estudiante         int         NOT NULL,
    activo                smallint    NOT NULL,
    CONSTRAINT PK2 PRIMARY KEY NONCLUSTERED (id_detalle_trabajo)
)
go



IF OBJECT_ID('Detalle_trabajo') IS NOT NULL
    PRINT '<<< CREATED TABLE Detalle_trabajo >>>'
ELSE
    PRINT '<<< FAILED CREATING TABLE Detalle_trabajo >>>'
go

/* 
 * TABLE: Empleado 
 */

CREATE TABLE Empleado(
    id_empleado            int            IDENTITY(1,1),
    INSS_empleado          varchar(8)     NOT NULL,
    nombre_empleado        varchar(32)    NOT NULL,
    p_apellido_empleado    varchar(16)    NOT NULL,
    s_apellido_empleado    varchar(16)    NULL,
    activo                 smallint       NOT NULL,
    CONSTRAINT PK12 PRIMARY KEY NONCLUSTERED (id_empleado)
)
go



IF OBJECT_ID('Empleado') IS NOT NULL
    PRINT '<<< CREATED TABLE Empleado >>>'
ELSE
    PRINT '<<< FAILED CREATING TABLE Empleado >>>'
go

/* 
 * TABLE: Estudiante 
 */

CREATE TABLE Estudiante(
    id_estudiante            int            IDENTITY(1,1),
    carnet_estudiante        varchar(8)     NOT NULL,
    nombre_estudiante        varchar(32)    NOT NULL,
    p_apellido_estudiante    varchar(16)    NOT NULL,
    s_apellido_estudiante    varchar(16)    NULL,
    egresado                 smallint       NOT NULL,
    activo                   smallint       NOT NULL,
    CONSTRAINT PK5 PRIMARY KEY NONCLUSTERED (id_estudiante)
)
go



IF OBJECT_ID('Estudiante') IS NOT NULL
    PRINT '<<< CREATED TABLE Estudiante >>>'
ELSE
    PRINT '<<< FAILED CREATING TABLE Estudiante >>>'
go

/* 
 * TABLE: Evaluador 
 */

CREATE TABLE Evaluador(
    id_evaluador            int            IDENTITY(1,1),
    INSS_evaluador          varchar(8)     NOT NULL,
    nombre_evaluador        varchar(32)    NOT NULL,
    p_apellido_evaluador    varchar(16)    NOT NULL,
    s_apellido_evaluador    varchar(16)    NULL,
    activo                  smallint       NOT NULL,
    CONSTRAINT PK4 PRIMARY KEY NONCLUSTERED (id_evaluador)
)
go



IF OBJECT_ID('Evaluador') IS NOT NULL
    PRINT '<<< CREATED TABLE Evaluador >>>'
ELSE
    PRINT '<<< FAILED CREATING TABLE Evaluador >>>'
go

/* 
 * TABLE: Modalidad_graduacion 
 */

CREATE TABLE Modalidad_graduacion(
    id_modalidadGraduacion             int            IDENTITY(1,1),
    codigo_modalidadGraduacion         varchar(16)    NOT NULL,
    descripcion_modalidadGraduacion    varchar(32)    NOT NULL,
    activo                             smallint       NOT NULL,
    CONSTRAINT PK14 PRIMARY KEY NONCLUSTERED (id_modalidadGraduacion)
)
go



IF OBJECT_ID('Modalidad_graduacion') IS NOT NULL
    PRINT '<<< CREATED TABLE Modalidad_graduacion >>>'
ELSE
    PRINT '<<< FAILED CREATING TABLE Modalidad_graduacion >>>'
go

/* 
 * TABLE: Registro_trabajo 
 */

CREATE TABLE Registro_trabajo(
    id_registro_trabajo    int identity(1,1)    NOT NULL,
    id_maestro_detalle     int         NOT NULL,
    id_usuario             int         NOT NULL,
    activo                 smallint    NOT NULL,
    CONSTRAINT PK90 PRIMARY KEY NONCLUSTERED (id_registro_trabajo)
)
go



IF OBJECT_ID('Registro_trabajo') IS NOT NULL
    PRINT '<<< CREATED TABLE Registro_trabajo >>>'
ELSE
    PRINT '<<< FAILED CREATING TABLE Registro_trabajo >>>'
go

/* 
 * TABLE: Trabajo_Carrera 
 */

CREATE TABLE Trabajo_Carrera(
    id_trabajo_carrera    int         IDENTITY(1,1),
    id_maestro_detalle    int         NOT NULL,
    id_carrera            int         NOT NULL,
    activo                smallint    NOT NULL,
    CONSTRAINT PK18 PRIMARY KEY NONCLUSTERED (id_trabajo_carrera)
)
go



IF OBJECT_ID('Trabajo_Carrera') IS NOT NULL
    PRINT '<<< CREATED TABLE Trabajo_Carrera >>>'
ELSE
    PRINT '<<< FAILED CREATING TABLE Trabajo_Carrera >>>'
go

/* 
 * TABLE: Trabajo_Culminacion 
 */

CREATE TABLE Trabajo_Culminacion(
    id_maestro_detalle        int             IDENTITY(1,1),
    id_modalidadGraduacion    int             NOT NULL,
    id_tutor                  int             NOT NULL,
    titulo_trabajo            varchar(512)    NOT NULL,
    resumen_trabajo           varchar(512)    NOT NULL,
    fecha_trabajo             date            NOT NULL,
    semestre_defendido        smallint        NOT NULL,
    activo                    smallint        NOT NULL,
    CONSTRAINT PK15 PRIMARY KEY NONCLUSTERED (id_maestro_detalle)
)
go



IF OBJECT_ID('Trabajo_Culminacion') IS NOT NULL
    PRINT '<<< CREATED TABLE Trabajo_Culminacion >>>'
ELSE
    PRINT '<<< FAILED CREATING TABLE Trabajo_Culminacion >>>'
go

/* 
 * TABLE: Tutor 
 */

CREATE TABLE Tutor(
    id_tutor            int            IDENTITY(1,1),
    INSS_tutor          varchar(8)     NOT NULL,
    nombre_tutor        varchar(32)    NOT NULL,
    p_apellido_tutor    varchar(16)    NOT NULL,
    s_apellido_tutor    varchar(16)    NULL,
    activo              smallint       NOT NULL,
    CONSTRAINT PK9 PRIMARY KEY NONCLUSTERED (id_tutor)
)
go



IF OBJECT_ID('Tutor') IS NOT NULL
    PRINT '<<< CREATED TABLE Tutor >>>'
ELSE
    PRINT '<<< FAILED CREATING TABLE Tutor >>>'
go

/* 
 * TABLE: Usuario 
 */

CREATE TABLE Usuario(
    id_usuario         int             IDENTITY(1,1),
    id_empleado        int             NOT NULL,
    correo_emp         varchar(128)    NOT NULL,
    contrasenia_emp    varchar(32)     NOT NULL,
    activo             smallint        NOT NULL,
    CONSTRAINT PK1 PRIMARY KEY NONCLUSTERED (id_usuario)
)
go



IF OBJECT_ID('Usuario') IS NOT NULL
    PRINT '<<< CREATED TABLE Usuario >>>'
ELSE
    PRINT '<<< FAILED CREATING TABLE Usuario >>>'
go

/* 
 * TABLE: Asesor 
 */

ALTER TABLE Asesor ADD CONSTRAINT RefTrabajo_Culminacion17 
    FOREIGN KEY (id_maestro_detalle)
    REFERENCES Trabajo_Culminacion(id_maestro_detalle)
go


/* 
 * TABLE: Cargo 
 */

ALTER TABLE Cargo ADD CONSTRAINT RefEvaluador53 
    FOREIGN KEY (id_evaluador)
    REFERENCES Evaluador(id_evaluador)
go

ALTER TABLE Cargo ADD CONSTRAINT RefDetalle_trabajo56 
    FOREIGN KEY (id_detalle_trabajo)
    REFERENCES Detalle_trabajo(id_detalle_trabajo)
go


/* 
 * TABLE: Detalle_Protocolo 
 */

ALTER TABLE Detalle_Protocolo ADD CONSTRAINT RefEstudiante55 
    FOREIGN KEY (id_estudiante)
    REFERENCES Estudiante(id_estudiante)
go

ALTER TABLE Detalle_Protocolo ADD CONSTRAINT RefTrabajo_Culminacion21 
    FOREIGN KEY (id_maestro_detalle)
    REFERENCES Trabajo_Culminacion(id_maestro_detalle)
go


/* 
 * TABLE: Detalle_trabajo 
 */

ALTER TABLE Detalle_trabajo ADD CONSTRAINT RefEstudiante46 
    FOREIGN KEY (id_estudiante)
    REFERENCES Estudiante(id_estudiante)
go

ALTER TABLE Detalle_trabajo ADD CONSTRAINT RefTrabajo_Culminacion19 
    FOREIGN KEY (id_maestro_detalle)
    REFERENCES Trabajo_Culminacion(id_maestro_detalle)
go


/* 
 * TABLE: Registro_trabajo 
 */

ALTER TABLE Registro_trabajo ADD CONSTRAINT RefTrabajo_Culminacion23 
    FOREIGN KEY (id_maestro_detalle)
    REFERENCES Trabajo_Culminacion(id_maestro_detalle)
go

ALTER TABLE Registro_trabajo ADD CONSTRAINT RefUsuario57 
    FOREIGN KEY (id_usuario)
    REFERENCES Usuario(id_usuario)
go


/* 
 * TABLE: Trabajo_Carrera 
 */

ALTER TABLE Trabajo_Carrera ADD CONSTRAINT RefTrabajo_Culminacion32 
    FOREIGN KEY (id_maestro_detalle)
    REFERENCES Trabajo_Culminacion(id_maestro_detalle)
go

ALTER TABLE Trabajo_Carrera ADD CONSTRAINT RefCarrera33 
    FOREIGN KEY (id_carrera)
    REFERENCES Carrera(id_carrera)
go


/* 
 * TABLE: Trabajo_Culminacion 
 */

ALTER TABLE Trabajo_Culminacion ADD CONSTRAINT RefTutor24 
    FOREIGN KEY (id_tutor)
    REFERENCES Tutor(id_tutor)
go

ALTER TABLE Trabajo_Culminacion ADD CONSTRAINT RefModalidad_graduacion25 
    FOREIGN KEY (id_modalidadGraduacion)
    REFERENCES Modalidad_graduacion(id_modalidadGraduacion)
go


/* 
 * TABLE: Usuario 
 */

ALTER TABLE Usuario ADD CONSTRAINT RefEmpleado1 
    FOREIGN KEY (id_empleado)
    REFERENCES Empleado(id_empleado)
go


