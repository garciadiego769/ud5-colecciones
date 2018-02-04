package garcia.diego;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private String apellidos;
    private String email;

    public Alumno() {
    }

    //Conexión
    private List<Asignatura> asignaturas = new ArrayList<>();


    public Alumno(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
//Crear getter de la lista. NO SETTER PARA NO MANIPULARLA
public List<Asignatura> getAsignaturas() {
    return asignaturas;}

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


