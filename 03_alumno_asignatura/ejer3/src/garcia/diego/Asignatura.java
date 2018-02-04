package garcia.diego;


import java.util.ArrayList;
import java.util.List;

public class Asignatura {
    private String nombre;
    private int horasSemanales;

    public Asignatura() {
    }

    //Conexión
    private List<Alumno> alumnos = new ArrayList<>();


    public Asignatura(String nombre, int horasSemanales) {
        this.nombre = nombre;
        this.horasSemanales = horasSemanales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }
 //Encapsular con el main. SÓLO GETTER
    public List<Alumno> getAlumnos() {
        return alumnos;
    }
}
