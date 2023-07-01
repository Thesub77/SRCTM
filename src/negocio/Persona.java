package negocio;

import java.sql.SQLException;

public abstract class Persona {

    protected String nombre;
    protected String p_apellido;
    protected String s_apellido;

    public abstract int insertarRegistro () throws ClassNotFoundException,
                                                  InstantiationException,
                                                  IllegalAccessException,
                                                  SQLException;
    
    public abstract Persona leerRegistro (String value) throws 
                                                    ClassNotFoundException,
                                                    InstantiationException,
                                                    IllegalAccessException,
                                                    SQLException;
            
    public abstract boolean borrarRegistro (String value) throws ClassNotFoundException,
                                                 InstantiationException,
                                                 IllegalAccessException,
                                                 SQLException;
    
    
}
