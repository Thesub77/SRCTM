package negocio;

import datos.DB_Reportes;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Reportes {

    // Variables de instancia
    protected String carrera;
    protected String titulo;
    protected String fecha;

    // Constructor sin parametros
    public Reportes() {
        this.carrera = "";
        this.titulo = "";
        this.fecha = "";
    }

    // GET y SET
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    // Metodo para listar los seminarios por carrera
    public List <Reportes> SeminariosPorCarrera () throws ClassNotFoundException,
                                                 InstantiationException,
                                                 IllegalAccessException,
                                                 SQLException
    {
        //Crear la instancia de BD_Facultad
        DB_Reportes carr = new DB_Reportes();
        return (ArrayList) carr.seminariosPorCarrera(); //Leer los registros
    }//Fin
}
