package garcia.diego;

import java.util.ArrayList;
import java.util.List;

public class Tecnico {
    private String nombre;
    private String DNI;
    private int anyosExperiencia;

    //Conexion
    private List<Ordenador> ordenadores = new ArrayList<>();

    public Tecnico() {
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", anyosExperiencia=" + anyosExperiencia +
                ", ordenadores=" + ordenadores +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getAnyosExperiencia() {
        return anyosExperiencia;
    }

    public void setAnyosExperiencia(int anyosExperiencia) {
        this.anyosExperiencia = anyosExperiencia;
    }

    public List<Ordenador> getOrdenadores() {
        return ordenadores;
    }

    public void setOrdenadores(List<Ordenador> ordenadores) {
        this.ordenadores = ordenadores;
    }

    public Tecnico(String nombre, String DNI, int anyosExperiencia) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.anyosExperiencia = anyosExperiencia;
    }
}
