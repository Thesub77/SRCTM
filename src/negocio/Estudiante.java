package negocio;

import datos.DB_Estudiante;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {

    // Variables de instancia
    protected int idEst;
    protected String carnet;

    // Constructores
    public Estudiante() {
        this.carnet = "";
        this.nombre = "";
        this.p_apellido = "";
        this.s_apellido = "";
    }

    public Estudiante(String carnet, String nombre, String p_apellido, String s_apellido) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.p_apellido = p_apellido;
        this.s_apellido = s_apellido;
    }
    
    // Metodos GET Y SET
    public int getIdEst() {
        return idEst;
    }

    public void setIdEst(int idEst) {    
        this.idEst = idEst;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getP_apellido() {
        return p_apellido;
    }

    public void setP_apellido(String p_apellido) {
        this.p_apellido = p_apellido;
    }

    public String getS_apellido() {
        return s_apellido;
    }

    public void setS_apellido(String s_apellido) {
        this.s_apellido = s_apellido;
    }

    // Metodo para realizar una insercion de un Estudiante en DB
    @Override
    public int insertarRegistro() throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        
        DB_Estudiante es_db = new DB_Estudiante(this);

        //Verificar si es una actualización o una nueva inserción
        if (!es_db.verificarEstudiante()) {
            return es_db.insertar(false);  //Se trata de una nueva inserción
        } else {
            return es_db.insertar(true); //Se trata de una actualización   
        }
    }

    // Metodo para mandar a leer los datos de un Estudiante
    @Override
    public Persona leerRegistro(String carnet) throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        
        DB_Estudiante bdEs = new DB_Estudiante();
        return (Persona) bdEs.buscarEstudiante(carnet);
    }

    // Metodo para mandar a anular un registro de Estudiante
    @Override
    public boolean borrarRegistro(String carnet) throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        
        DB_Estudiante bdEs = new DB_Estudiante();
        return bdEs.borrar(carnet);
    }
    
    // Metodo para listar Tutores
    public List<Estudiante> leerEstudiantes () throws 
                                                   ClassNotFoundException,
                                                   InstantiationException,
                                                   IllegalAccessException,
                                                   SQLException
    {
        DB_Estudiante bdTut = new DB_Estudiante ();
        return (ArrayList) bdTut.listadoEstudiantes();
    }//Fin
}
