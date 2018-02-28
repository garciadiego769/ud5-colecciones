package garcia.diego;

import java.util.ArrayList;
import java.util.List;

public class Aula {
    private String campus;
    private int numero;
    //Conexion
    private List <Ordenador> ordenadores= new ArrayList<>();

    public Aula() {
    }

    @Override
    public String toString() {
        return "Aula{" +
                "campus='" + campus + '\'' +
                ", numero=" + numero +
                ", ordenadores=" + ordenadores +
                '}';
    }

    public Aula(String campus, int numero) {
        this.campus = campus;
        this.numero = numero;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Ordenador> getOrdenadores() {
        return ordenadores;
    }

    public void setOrdenadores(List<Ordenador> ordenadores) {
        this.ordenadores = ordenadores;
    }
}
