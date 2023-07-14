-- STORED PROCEDURES CREATION FOR Tutors TABLE --

-- INSERT Tutor Object --
CREATE PROC insertar_tutor
@INSS_tutor VARCHAR(8),
@nombre_tutor VARCHAR(32),
@p_apellido_tutor VARCHAR(16),
@s_apellido_tutor VARCHAR(16),
@activo SMALLINT
AS
BEGIN
	INSERT INTO Tutor
	VALUES (@INSS_tutor, @nombre_tutor, @p_apellido_tutor, @s_apellido_tutor, @activo)
END;

-- UPDATE Tutor Object --
CREATE PROC actualizar_tutor
@INSS_tutor VARCHAR(8),
@nombre_tutor VARCHAR(32),
@p_apellido_tutor VARCHAR(16),
@s_apellido_tutor VARCHAR(16)
AS
BEGIN
	UPDATE Tutor SET nombre_tutor = @nombre_tutor, p_apellido_tutor = @p_apellido_tutor, s_apellido_tutor = @s_apellido_tutor
	WHERE INSS_tutor = @INSS_tutor
END;

-- DELETE Tutor Object --
CREATE PROC eliminar_tutor
@INSS_tutor VARCHAR(8)
AS
BEGIN
	UPDATE Tutor
	SET activo = 0
	WHERE INSS_tutor = @INSS_tutor
END;

-- LIST Tutor Object --
CREATE PROCEDURE listar_tutor
AS
BEGIN
	SELECT *
	FROM Tutor
	WHERE activo = 1
END;

-- SELECT Tutor Object --
CREATE PROCEDURE buscar_tutor
@INSS_tutor VARCHAR(8)
AS
BEGIN
	SELECT * FROM Tutor
	WHERE INSS_tutor = @INSS_tutor AND activo = 1
END;

-- VERIFY If tutors object already exists --
CREATE PROCEDURE verificar_tutor
@INSS_tutor VARCHAR(8)
AS
BEGIN
	SELECT INSS_tutor FROM Tutor
	WHERE INSS_tutor = @INSS_tutor
END;

----------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------

-- STORED PROCEDURES CREATION FOR Evaluador's TABLE --

-- INSERT Evaluador Object --
CREATE PROC insertar_evaluador
@INSS_evaluador VARCHAR(8),
@nombre_evaluador VARCHAR(32),
@p_apellido_evaluador VARCHAR(16),
@s_apellido_evaluador VARCHAR(16),
@activo SMALLINT
AS
BEGIN
	INSERT INTO Evaluador
	VALUES (@INSS_evaluador, @nombre_evaluador, @p_apellido_evaluador, @s_apellido_evaluador, @activo)
END;

-- UPDATE Evaluador Object --
CREATE PROC actualizar_evaluador
@INSS_evaluador VARCHAR(8),
@nombre_evaluador VARCHAR(32),
@p_apellido_evaluador VARCHAR(16),
@s_apellido_evaluador VARCHAR(16)
AS
BEGIN
	UPDATE Evaluador SET nombre_evaluador = @nombre_evaluador, p_apellido_evaluador = @p_apellido_evaluador, s_apellido_evaluador = @s_apellido_evaluador
	WHERE INSS_evaluador = @INSS_evaluador
END;

-- DELETE Evaluador Object --
CREATE PROC eliminar_evaluador
@INSS_evaluador VARCHAR(8)
AS
BEGIN
	UPDATE Evaluador
	SET activo = 0
	WHERE INSS_evaluador = @INSS_evaluador
END;

-- LIST Evaluador Object --
CREATE PROCEDURE listar_evaluador
AS
BEGIN
	SELECT *
	FROM Evaluador
	WHERE activo = 1
END;

-- SELECT Evaluador Object --
CREATE PROCEDURE buscar_evaluador
@INSS_evaluador VARCHAR(8)
AS
BEGIN
	SELECT * FROM Evaluador
	WHERE INSS_evaluador = @INSS_evaluador AND activo = 1
END;

-- VERIFY If Evaluador object already exists --
CREATE PROCEDURE verificar_evaluador
@INSS_evaluador VARCHAR(8)
AS
BEGIN
	SELECT INSS_evaluador FROM Evaluador
	WHERE INSS_evaluador = @INSS_evaluador
END;

----------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------

-- STORED PROCEDURES CREATION FOR Estudiante's TABLE --

-- INSERT Evaluador Object --
CREATE PROC insertar_estudiante
@carnet_estudiante VARCHAR(8),
@nombre_estudiante VARCHAR(32),
@p_apellido_estudiante VARCHAR(16),
@s_apellido_estudiante VARCHAR(16),
@egresado SMALLINT,
@activo SMALLINT
AS
BEGIN
	INSERT INTO Estudiante
	VALUES (@carnet_estudiante, @nombre_estudiante, @p_apellido_estudiante, @s_apellido_estudiante, @egresado, @activo)
END;

-- UPDATE Estudiante Object --
CREATE PROC actualizar_estudiante
@carnet_estudiante VARCHAR(8),
@nombre_estudiante VARCHAR(32),
@p_apellido_estudiante VARCHAR(16),
@s_apellido_estudiante VARCHAR(16)
AS
BEGIN
	UPDATE Estudiante SET nombre_estudiante = @nombre_estudiante, p_apellido_estudiante = @p_apellido_estudiante, s_apellido_estudiante = @s_apellido_estudiante
	WHERE carnet_estudiante = @carnet_estudiante
END;

-- DELETE Estudiante Object --
CREATE PROC eliminar_estudiante
@carnet_estudiante VARCHAR(8)
AS
BEGIN
	UPDATE Estudiante
	SET activo = 0
	WHERE carnet_estudiante = @carnet_estudiante
END;

-- LIST Estudiante Object --
CREATE PROCEDURE listar_estudiante
AS
BEGIN
	SELECT *
	FROM Estudiante
	WHERE activo = 1
END;

-- SELECT Estudiante Object --
CREATE PROCEDURE buscar_estudiante
@carnet_estudiante VARCHAR(8)
AS
BEGIN
	SELECT * FROM Estudiante
	WHERE carnet_estudiante = @carnet_estudiante AND activo = 1
END;

-- VERIFY If Estudiante object already exists --
CREATE PROCEDURE verificar_estudiante
@carnet_estudiante VARCHAR(8)
AS
BEGIN
	SELECT carnet_estudiante FROM Estudiante
	WHERE carnet_estudiante = @carnet_estudiante
END;

----------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------

-- STORED PROCEDURES CREATION FOR Empleado's TABLE --

-- INSERT Empleado Object --
CREATE PROC insertar_empleado
@INSS_empleado VARCHAR(8),
@nombre_empleado VARCHAR(32),
@p_apellido_empleado VARCHAR(16),
@s_apellido_empleado VARCHAR(16),
@activo SMALLINT
AS
BEGIN
	INSERT INTO Empleado
	VALUES (@INSS_empleado, @nombre_empleado, @p_apellido_empleado, @s_apellido_empleado, @activo)
END;

-- UPDATE Empleado Object --
CREATE PROC actualizar_empleado
@INSS_empleado VARCHAR(8),
@nombre_empleado VARCHAR(32),
@p_apellido_empleado VARCHAR(16),
@s_apellido_empleado VARCHAR(16)
AS
BEGIN
	UPDATE Empleado SET nombre_empleado = @nombre_empleado, p_apellido_empleado = @p_apellido_empleado, s_apellido_empleado = @s_apellido_empleado
	WHERE INSS_empleado = @INSS_empleado
END;

-- DELETE Empleado Object --
CREATE PROC eliminar_empleado
@INSS_empleado VARCHAR(8)
AS
BEGIN
	UPDATE Empleado
	SET activo = 0
	WHERE INSS_empleado = @INSS_empleado
END;

-- LIST Empleado Object --
CREATE PROCEDURE listar_empleado
AS
BEGIN
	SELECT *
	FROM Empleado
	WHERE activo = 1
END;

-- SELECT Empleado Object --
CREATE PROCEDURE buscar_empleado
@INSS_empleado VARCHAR(8)
AS
BEGIN
	SELECT * FROM Empleado
	WHERE INSS_empleado = @INSS_empleado AND activo = 1
END;

-- VERIFY If Empleado object already exists --
CREATE PROCEDURE verificar_empleado
@INSS_empleado VARCHAR(8)
AS
BEGIN
	SELECT INSS_empleado FROM Empleado
	WHERE INSS_empleado = @INSS_empleado
END;

----------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------

-- STORED PROCEDURES CREATION FOR Modalidad's TABLE --

-- INSERT Modalidad Object --
CREATE PROC insertar_modalidadGraduacion
@codigo_modalidadGraduacion VARCHAR(16),
@descripcion_modalidadGraduacion VARCHAR(32),
@activo SMALLINT
AS
BEGIN
	INSERT INTO Modalidad_graduacion
	VALUES (@codigo_modalidadGraduacion, @descripcion_modalidadGraduacion, @activo)
END;

-- UPDATE Modalidad Object --
CREATE PROC actualizar_modalidadGraduacion
@codigo_modalidadGraduacion VARCHAR(16),
@descripcion_modalidadGraduacion VARCHAR(32)
AS
BEGIN
	UPDATE Modalidad_graduacion SET descripcion_modalidadGraduacion = @descripcion_modalidadGraduacion
	WHERE codigo_modalidadGraduacion = @codigo_modalidadGraduacion
END;

-- DELETE Modalidad Object --
CREATE PROC eliminar_modalidadGraduacion
@codigo_modalidadGraduacion VARCHAR(16)
AS
BEGIN
	UPDATE Modalidad_graduacion
	SET activo = 0
	WHERE codigo_modalidadGraduacion = @codigo_modalidadGraduacion
END;

-- LIST Modalidad Object --
CREATE PROCEDURE listar_modalidadGraduacion
AS
BEGIN
	SELECT *
	FROM Modalidad_graduacion
	WHERE activo = 1
END;

-- SELECT Modalidad Object --
CREATE PROCEDURE buscar_modalidadGraduacion
@codigo_modalidadGraduacion VARCHAR(16)
AS
BEGIN
	SELECT * FROM Modalidad_graduacion
	WHERE codigo_modalidadGraduacion = @codigo_modalidadGraduacion AND activo = 1
END;

-- VERIFY If Modalidad object already exists --
CREATE PROCEDURE verificar_modalidadGraduacion
@codigo_modalidadGraduacion VARCHAR(16)
AS
BEGIN
	SELECT codigo_modalidadGraduacion FROM Modalidad_graduacion
	WHERE codigo_modalidadGraduacion = @codigo_modalidadGraduacion
END;

----------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------

-- STORED PROCEDURES CREATION FOR Carrera's TABLE --

-- INSERT Carrera Object --
CREATE PROC insertar_carrera
@codigo_carrera VARCHAR(16),
@descripcion_carrera VARCHAR(32),
@activo SMALLINT
AS
BEGIN
	BEGIN TRY
	BEGIN TRANSACTION

		INSERT INTO Carrera
			VALUES (@codigo_carrera, @descripcion_carrera, @activo)

	COMMIT TRAN
	END TRY
	BEGIN CATCH
		IF @@TRANCOUNT > 0
			ROLLBACK TRAN
			SELECT @@TRANCOUNT[Numero de transacciones], ERROR_NUMBER() [Codigo de error], ERROR_MESSAGE() [Error], ERROR_LINE() [Linea en consulta], ERROR_PROCEDURE() [Procedimiento almacenado];
	END CATCH
END;


-- UPDATE Carrera Object --
CREATE PROC actualizar_carrera
@codigo_carrera VARCHAR(16),
@descripcion_carrera VARCHAR(32)
AS
BEGIN
	UPDATE Carrera SET descripcion_carrera = @descripcion_carrera
	WHERE codigo_carrera = @codigo_carrera
END;

-- DELETE Carrera Object --
CREATE PROC eliminar_carrera
@codigo_carrera VARCHAR(16)
AS
BEGIN
	UPDATE Carrera
	SET activo = 0
	WHERE codigo_carrera = @codigo_carrera
END;

-- LIST Carrera Object --
CREATE PROCEDURE listar_carrera
AS
BEGIN
	SELECT *
	FROM Carrera
	WHERE activo = 1
END;

-- SELECT Carrera Object --
CREATE PROCEDURE buscar_carrera
@codigo_carrera VARCHAR(16)
AS
BEGIN
	SELECT * FROM Carrera
	WHERE codigo_carrera = @codigo_carrera AND activo = 1
END;

-- VERIFY If Carrera object already exists --
CREATE PROCEDURE verificar_carrera
@codigo_carrera VARCHAR(16)
AS
BEGIN
	SELECT codigo_carrera FROM Carrera
	WHERE codigo_carrera = @codigo_carrera
END;

----------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------

-- STORED PROCEDURES CREATION FOR Seminario's register --

-- INSERTAR UN SEMINARIO --
CREATE PROC insertar_seminario
@id_tutor int,
@titulo_trabajo varchar(512),
@resumen_trabajo varchar(512),
@fecha date,
@semestre int,
@activo_tablaTrabajoCulminacion int,
@id_usuario int,
@activo_tablaRegistroTrabajo int,
@id_carrera int,
@activo_tablaTrabajoCarrera int,
@id_estudiante1 int,
@id_estudiante2 int,
@id_estudiante3 int
AS
BEGIN
	BEGIN TRY
    -- Iniciar la transacción
    BEGIN TRANSACTION

    -- Declarar una variable de tabla temporal para almacenar el valor de id_maestroDetalle
    DECLARE @temp TABLE (id_maestroDetalle INT);

    -- Insertar el registro en la tabla maestroDetalle y obtener el valor de id_maestroDetalle
    INSERT INTO Trabajo_Culminacion
		(id_modalidadGraduacion, id_tutor, titulo_trabajo, resumen_trabajo, fecha_trabajo, semestre_defendido, activo)
		OUTPUT INSERTED.id_maestro_detalle INTO @temp
    VALUES
		(1, @id_tutor, @titulo_trabajo, @resumen_trabajo, @fecha, @semestre, @activo_tablaTrabajoCulminacion);

    -- Obtener el valor de id_maestroDetalle de la variable de tabla temporal
    DECLARE @id_maestroDetalle INT;
    SELECT @id_maestroDetalle = id_maestroDetalle FROM @temp;

	-- Insertar el usuario que hizo el registro del maestroDetalle
	INSERT INTO Registro_trabajo
		(id_maestro_detalle, id_usuario, activo)
	VALUES
		(@id_maestroDetalle, @id_usuario, @activo_tablaRegistroTrabajo);

    -- Insertar el registro en la tabla Carrera utilizando el valor de id_maestroDetalle
    INSERT INTO Trabajo_Carrera
		(id_maestro_detalle, id_carrera, activo)
    VALUES
		(@id_maestroDetalle, @id_carrera, @activo_tablaTrabajoCarrera);

    -- Insertar los detalles en la tabla Detalle utilizando el valor de id_maestroDetalle
    INSERT INTO Detalle_trabajo
		(id_maestro_detalle, id_estudiante, activo)
    VALUES
		(@id_maestroDetalle, @id_estudiante1, 1),
		(@id_maestroDetalle, @id_estudiante2, 1),
		(@id_maestroDetalle, @id_estudiante3, 1);

    -- Confirmar la transacción
    COMMIT TRANSACTION

	END TRY
	BEGIN CATCH
		-- En caso de error, revertir la transacción
		IF @@TRANCOUNT > 0
			ROLLBACK TRANSACTION

		-- Manejar el error
		DECLARE @ErrorMessage NVARCHAR(4000);
		DECLARE @ErrorSeverity INT;
		DECLARE @ErrorState INT;

		SELECT @ErrorMessage = ERROR_MESSAGE(),
			   @ErrorSeverity = ERROR_SEVERITY(),
			   @ErrorState = ERROR_STATE();

		RAISERROR (@ErrorMessage, @ErrorSeverity, @ErrorState);
	END CATCH
END;

-- Actualizar Seminario --
CREATE PROC actualizar_seminario
@resumen_trabajo VARCHAR(512),
@id_tutor INT,
@titulo_trabajo VARCHAR(512),
@fecha_trabajo DATE,
@semestre_defendido INT,
@id_carrera INT
AS
BEGIN
	BEGIN TRY
	BEGIN TRANSACTION

	-- Declarar una variable de tabla temporal para almacenar el valor de id_maestroDetalle
    --DECLARE @temp TABLE (id_maestroDetalle INT);

		DECLARE @id_maestro_detalle INT;
		SET @id_maestro_detalle = (SELECT id_maestro_detalle FROM Trabajo_Culminacion
		WHERE resumen_trabajo = @resumen_trabajo)

		UPDATE Trabajo_Culminacion
		SET id_tutor = @id_tutor, titulo_trabajo = @titulo_trabajo, fecha_trabajo = @fecha_trabajo, semestre_defendido = @semestre_defendido
		WHERE id_maestro_detalle = @id_maestro_detalle

		UPDATE Trabajo_Carrera
		SET id_carrera = @id_carrera
		WHERE id_maestro_detalle = @id_maestro_detalle

		-- Confirmar la transacción
		COMMIT TRANSACTION

	END TRY
	BEGIN CATCH
		-- En caso de error, revertir la transacción
		IF @@TRANCOUNT > 0
			ROLLBACK TRANSACTION

		-- Manejar el error
		DECLARE @ErrorMessage NVARCHAR(4000);
		DECLARE @ErrorSeverity INT;
		DECLARE @ErrorState INT;

		SELECT @ErrorMessage = ERROR_MESSAGE(),
			   @ErrorSeverity = ERROR_SEVERITY(),
			   @ErrorState = ERROR_STATE();

		RAISERROR (@ErrorMessage, @ErrorSeverity, @ErrorState);
	END CATCH
END;

-- ELIMINAR un SEMINARIO --
CREATE PROC eliminar_seminario
@resumen_trabajo VARCHAR(512)
AS
BEGIN
	BEGIN TRY
	BEGIN TRANSACTION

	-- Declarar una variable de tabla temporal para almacenar el valor de id_maestroDetalle
    --DECLARE @temp TABLE (id_maestroDetalle INT);

		DECLARE @id_maestro_detalle INT;
		SET @id_maestro_detalle = (SELECT id_maestro_detalle FROM Trabajo_Culminacion
		WHERE resumen_trabajo = @resumen_trabajo)

		UPDATE Trabajo_Culminacion
		SET activo = 0
		WHERE id_maestro_detalle = @id_maestro_detalle

		UPDATE Registro_trabajo
		SET activo = 0
		WHERE id_maestro_detalle = @id_maestro_detalle

		UPDATE Trabajo_Carrera
		SET activo = 0
		WHERE id_maestro_detalle = @id_maestro_detalle

		UPDATE Detalle_trabajo
		SET activo = 0
		WHERE id_maestro_detalle = @id_maestro_detalle

		-- Confirmar la transacción
		COMMIT TRANSACTION

	END TRY
	BEGIN CATCH
		-- En caso de error, revertir la transacción
		IF @@TRANCOUNT > 0
			ROLLBACK TRANSACTION

		-- Manejar el error
		DECLARE @ErrorMessage NVARCHAR(4000);
		DECLARE @ErrorSeverity INT;
		DECLARE @ErrorState INT;

		SELECT @ErrorMessage = ERROR_MESSAGE(),
			   @ErrorSeverity = ERROR_SEVERITY(),
			   @ErrorState = ERROR_STATE();

		RAISERROR (@ErrorMessage, @ErrorSeverity, @ErrorState);
	END CATCH
END;

-- VERIFY If un SEMINARIO ya existe --
CREATE PROCEDURE verificar_seminario
@resumen_trabajo VARCHAR(512)
AS
BEGIN
	SELECT id_maestro_detalle FROM Trabajo_Culminacion
	WHERE resumen_trabajo = @resumen_trabajo
END;

-- CONSULTAR REGISTROS POR TITULO --
CREATE PROC consulta_porTitulo
@titulo_trabajo VARCHAR (512)
AS
BEGIN

	SELECT C.descripcion_carrera, MD.descripcion_modalidadGraduacion, TC.titulo_trabajo, TC.fecha_trabajo, TC.resumen_trabajo
	FROM Trabajo_Culminacion AS TC
	INNER JOIN Modalidad_graduacion AS MD
	ON TC.id_modalidadGraduacion = MD.id_modalidadGraduacion
	INNER JOIN Tutor AS T
	ON TC.id_tutor = T.id_tutor
	INNER JOIN Trabajo_Carrera AS TRC
	ON TC.id_maestro_detalle = TRC.id_maestro_detalle
	INNER JOIN Carrera AS C
	ON TRC.id_carrera = C.id_carrera
	WHERE TC.titulo_trabajo LIKE CONCAT('%', @titulo_trabajo, '%')

END;
-- EXECUTE consulta_porTitulo 'Me'

----------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------

-- REPORTES --

-- SEMINARIO ORDENADO POR CARRERA --
CREATE PROCEDURE SeminarioPorCarreraReport
AS
BEGIN
	SELECT C.descripcion_carrera, TC.titulo_trabajo, TC.fecha_trabajo
	FROM Trabajo_Culminacion AS TC
	INNER JOIN Modalidad_graduacion AS MG
	ON TC.id_modalidadGraduacion = MG.id_modalidadGraduacion
	INNER JOIN Tutor AS T
	ON TC.id_tutor = T.id_tutor
	INNER JOIN Trabajo_Carrera AS TRC
	ON TC.id_maestro_detalle = TRC.id_maestro_detalle
	INNER JOIN Carrera AS C
	ON TRC.id_carrera = C.id_carrera
	ORDER BY C.descripcion_carrera
END;