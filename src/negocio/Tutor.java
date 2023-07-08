package negocio;

import datos.DB_Tutor;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Tutor extends Empleado {

    public Tutor() {
        this.inss = "";
        this.nombre = "";
        this.p_apellido = "";
        this.s_apellido = "";
    }

    public Tutor(String inss, String nombre, String p_apellido, String s_apellido) {
        this.inss = inss;
        this.nombre = nombre;
        this.p_apellido = p_apellido;
        this.s_apellido = s_apellido;
    }

    public String getInss() {
        return inss;
    }

    public void setInss(String inss) {
        this.inss = inss;
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

    // Inicio de la sobre-escritura de metodos
    // Metodo para insertar un registro de Tutor
    @Override
    public int insertarRegistro() throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        DB_Tutor tut_db = new DB_Tutor(this);

        //Verificar si es una actualización o una nueva inserción
        if (!tut_db.verificarTutor()) {
            return tut_db.insertar(false);  //Se trata de una nueva inserción
        } else {
            return tut_db.insertar(true); //Se trata de una actualización   
        }
    }

    // Metodo para buscar un registro de Tutor
    @Override
    public Persona leerRegistro(String inss) throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        DB_Tutor bdT = new DB_Tutor();
        return (Persona) bdT.buscarTutor(inss);
    }

    // Metodo para eliminar un registro de Tutor
    @Override
    public boolean borrarRegistro(String inss) throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        
        DB_Tutor bdT = new DB_Tutor();
        return bdT.borrar(inss);
    }
    
    // Metodo para listar Tutores
    public List<Tutor> leerTutores () throws 
                                                   ClassNotFoundException,
                                                   InstantiationException,
                                                   IllegalAccessException,
                                                   SQLException
    {
        DB_Tutor bdTut = new DB_Tutor ();
        return (ArrayList) bdTut.listadoTutores();
    }//Fin de método

}
