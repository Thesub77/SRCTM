package negocio;

import datos.DB_Empleado;
import java.sql.SQLException;

public class emp extends Empleado{
    
    // Constructores
    public emp() {
        this.inss = "";
        this.nombre = "";
        this.p_apellido = "";
        this.s_apellido = "";
    }

    public emp(String inss, String nombre, String p_apellido, String s_apellido) {
        this.inss = inss;
        this.nombre = nombre;
        this.p_apellido = p_apellido;
        this.s_apellido = s_apellido;
    }
    
    // Getter y Setters
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
    // Metodo para insertar un registro de Empleado
    @Override
    public int insertarRegistro() throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        DB_Empleado em_db = new DB_Empleado(this);

        //Verificar si es una actualización o una nueva inserción
        if (!em_db.verificarEmpleado()) {
            return em_db.insertar(false);  //Se trata de una nueva inserción
        } else {
            return em_db.insertar(true); //Se trata de una actualización   
        }
    }

    // Metodo para buscar un registro de Empleado
    @Override
    public Persona leerRegistro(String inss) throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        DB_Empleado bdEm = new DB_Empleado();
        return (Persona) bdEm.buscarEmpleado(inss);
    }

    // Metodo para eliminar un registro de Empleado
    @Override
    public boolean borrarRegistro(String inss) throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        
        DB_Empleado bdEm = new DB_Empleado();
        return bdEm.borrar(inss);
    }
}
