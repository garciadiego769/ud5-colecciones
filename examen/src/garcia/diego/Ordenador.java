package garcia.diego;

import java.util.ArrayList;
import java.util.List;

public class Ordenador {
    private String marca;
    private String modelo;
    private String fechaCompra;

    //Conexion
    private Aula aula;
    private List <Tecnico> tecnicos = new ArrayList<>();


    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public List<Tecnico> getTecnicos() {
        return tecnicos;
    }



    public Ordenador(String marca, String modelo, String fechaCompra) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
    }

    public Ordenador() {
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fechaCompra='" + fechaCompra + '\'' +
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


}

