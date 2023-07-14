package negocio;

import java.sql.SQLException;
import java.util.Date;

public abstract class Trabajo_Culminacion {

    protected String titulo_trabajo;
    protected String resumen_trabajo;
    protected String fecha;

    public abstract int insertarRegistro() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException;

    public abstract Trabajo_Culminacion leerRegistro(String value) throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException;

    public abstract boolean borrarRegistro(String value) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException;
}
