package servicios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class Conexion {
    
    // Variables para manejar la base de datos
    public Connection conexion = null; //Tipo Connection con el motor de BD
    public PreparedStatement pst;      //Ejecutor de sentencia SQL
    public String s_conexion = null;   
    public ResultSet resultado = null ;//Resultados obtenidos de una consulta

    // Variables para conectar a una base de datos
    protected String jdbc;
    protected String driver;
    protected String host;
    protected String database;
    protected int puerto;
    protected String username;
    protected String password;
    protected String un_sql;
    protected String intSegurity;
    
    // Constructor
    public Conexion() throws java.lang.ClassNotFoundException,
                             java.lang.InstantiationException,
                             java.lang.IllegalAccessException, 
                             java.sql.SQLException
    {
        jdbc =System.getProperty("jdbc");
        driver = System.getProperty("driver");
        host= System.getProperty("databasehost");
        database = System.getProperty("database");
        puerto = Integer.parseInt(System.getProperty("port"));
        username = System.getProperty("username");
        password = System.getProperty("password");
        intSegurity = System.getProperty("true");
    }//Fin del constructor
    
    // Inicializador de instancias
    public void initdb () throws java.lang.ClassNotFoundException,
                                 java.lang.InstantiationException,
                                 java.lang.IllegalAccessException,
                                 java.sql.SQLException
    {
        s_conexion = jdbc + host + ":" + puerto + ";" + "databaseName=" 
                   + database;
    }//Fin metodo initdb
}//Fin de la clase
