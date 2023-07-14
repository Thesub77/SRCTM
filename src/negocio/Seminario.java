package negocio;

import datos.DB_Seminario;
import java.sql.SQLException;
import java.util.Date;

public class Seminario extends Trabajo_Culminacion{
    // Variables para almacenar los id
    protected int estudiante1;
    protected int estudiante2;
    protected int estudiante3;
    protected int tutor;
    protected int carrera;
    protected int modalidad = 1;
    protected int semestre;
    
    // Constructores
    public Seminario( ){
        this.titulo_trabajo = "";
        this.resumen_trabajo = "";
        this.fecha = "";
    }
    
    public Seminario(String titulo_trabajo, String resumen_trabajo, String fecha){
        this.titulo_trabajo = titulo_trabajo;
        this.resumen_trabajo = resumen_trabajo;
        this.fecha = fecha;
    }

    // GET y SET
    public int getEstudiante1() {
        return estudiante1;
    }

    public void setEstudiante1(int estudiante1) {
        this.estudiante1 = estudiante1;
    }

    public int getEstudiante2() {
        return estudiante2;
    }

    public void setEstudiante2(int estudiante2) {
        this.estudiante2 = estudiante2;
    }

    public int getEstudiante3() {
        return estudiante3;
    }

    public void setEstudiante3(int estudiante3) {
        this.estudiante3 = estudiante3;
    }

    public int getTutor() {
        return tutor;
    }

    public void setTutor(int tutor) {
        this.tutor = tutor;
    }

    public int getCarrera() {
        return carrera;
    }

    public void setCarrera(int carrera) {
        this.carrera = carrera;
    }

    public String getTitulo_trabajo() {
        return titulo_trabajo;
    }

    public void setTitulo_trabajo(String titulo_trabajo) {
        this.titulo_trabajo = titulo_trabajo;
    }

    public String getResumen_trabajo() {
        return resumen_trabajo;
    }

    public void setResumen_trabajo(String resumen_trabajo) {
        this.resumen_trabajo = resumen_trabajo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getModalidad() {
        return modalidad;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    
    // Metodos
    @Override
    public int insertarRegistro() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException{
        
        DB_Seminario sem_db = new DB_Seminario(this);

        //Verificar si es una actualización o una nueva inserción
        if (!sem_db.verificarSeminario()) {
            return sem_db.insertar(false);  //Se trata de una nueva inserción
        } else {
            return sem_db.insertar(true); //Se trata de una actualización   
        }
    }

    @Override
    public Seminario leerRegistro(String value) throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException{
        
        Seminario s = new Seminario();
        return s;
    }

    @Override
    public boolean borrarRegistro(String value) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException{
        
        return true;
    }
}
