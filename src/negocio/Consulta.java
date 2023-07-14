package negocio;

import datos.DB_Consulta;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Consulta {
    
    // Variable de instancia
    protected String titulo;
    protected String carrera;
    protected String modalidad;
    protected String fecha;
    protected String resumen;
    
    // Constructores
    public Consulta(){
        this.titulo = "";
    }
    
    public Consulta(String titulo){
        this.titulo = titulo;
    }

    // GET y SET
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
    
    
    // Listado de carreras
    public List <Consulta> listaTrabajosPorTit () throws ClassNotFoundException,
                                                 InstantiationException,
                                                 IllegalAccessException,
                                                 SQLException
    {
        //Crear la instancia de BD_Facultad
        DB_Consulta carr = new DB_Consulta(this);
        return (ArrayList) carr.leerTrabajosPorTitulo(); //Leer los registros
    }//Fin
}
