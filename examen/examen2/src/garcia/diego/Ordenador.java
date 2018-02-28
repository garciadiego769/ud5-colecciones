package garcia.diego;

import java.util.ArrayList;
import java.util.List;

public class Ordenador {
    private String marca;
    private String modelo;
    private String fechaCompra;
    //Conexiones
    private Aula aulas;

    @Override
    public String toString() {
        return "Ordenador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fechaCompra='" + fechaCompra + '\'' +
                ", aulas=" + aulas +
                ", tecnicos=" + tecnicos +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Aula getAulas() {
        return aulas;
    }

    public void setAulas(Aula aulas) {
        this.aulas = aulas;
    }

    public List<Tecnico> getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(List<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }

    public Ordenador(String marca, String modelo, String fechaCompra) {

        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
    }

    private List <Tecnico> tecnicos=new ArrayList<>();

}
