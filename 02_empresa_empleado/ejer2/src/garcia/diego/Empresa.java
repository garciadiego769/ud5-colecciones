package garcia.diego;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String fechaFundacion;

    public Empresa(String nombre, String fechaFundacion) {
        this.nombre = nombre;
        this.fechaFundacion = fechaFundacion;
    }

    //Asociación
    private List<Empleado> empleados = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(String fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

}
