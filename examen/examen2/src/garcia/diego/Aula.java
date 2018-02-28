package garcia.diego;

import java.util.ArrayList;
import java.util.List;

public class Aula {
    private String aula;
    private int numero;
    //Conexion
    private List <Ordenador> ordenadores=new ArrayList<>();

    @Override
    public String toString() {
        return "Aula{" +
                "aula='" + aula + '\'' +
                ", numero=" + numero +
                '}';
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
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

    public Aula(String aula, int numero) {
        this.aula = aula;
        this.numero = numero;

    }
}
