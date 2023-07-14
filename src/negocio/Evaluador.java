package negocio;

import datos.DB_Evaluador;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Evaluador extends Empleado {

    public Evaluador() {
        this.inss = "";
        this.nombre = "";
        this.p_apellido = "";
        this.s_apellido = "";
    }

    public Evaluador(String inss, String nombre, String p_apellido, String s_apellido) {
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

    // Metodo para insertar un registro de Evaluador
    @Override
    public int insertarRegistro() throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        
        DB_Evaluador eva_db = new DB_Evaluador(this);

        //Verificar si es una actualización o una nueva inserción
        if (!eva_db.verificarEvaluador()) {
            return eva_db.insertar(false);  //Se trata de una nueva inserción
        } else {
            return eva_db.insertar(true); //Se trata de una actualización  
        }
    }

    // Metodo para buscar un registro de Evaluador
    @Override
    public Persona leerRegistro(String inss) throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        
        DB_Evaluador bdE = new DB_Evaluador();
        return (Persona) bdE.buscarEvaluador(inss);
    }

    // Metodo para anular un registro de Evaluador
    @Override
    public boolean borrarRegistro(String inss) throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        
        DB_Evaluador bdE = new DB_Evaluador();
        return bdE.borrar(inss);
    }

    // Metodo para listar Tutores
    public List<Evaluador> leerEvaluadores () throws 
                                                   ClassNotFoundException,
                                                   InstantiationException,
                                                   IllegalAccessException,
                                                   SQLException
    {
        DB_Evaluador bdTut = new DB_Evaluador ();
        return (ArrayList) bdTut.listadoEvaluadores();
    }//Fin de método
}
