package controlador;

import java.sql.SQLException;
import negocio.Seminario;

public class CtrlSeminario {
    public static int insertar_seminario(String titulo_trabajo, String resumen_trabajo, String fecha,
            int estu1, int estu2, int estu3, int tutor, int carrera, int semestre)
            throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Seminario sem = new Seminario(titulo_trabajo, resumen_trabajo, fecha);
        sem.setEstudiante1(estu1);
        sem.setEstudiante2(estu2);
        sem.setEstudiante3(estu3);
        sem.setTutor(tutor);
        sem.setCarrera(carrera);
        sem.setSemestre(semestre);
        return sem.insertarRegistro();
    }
}
