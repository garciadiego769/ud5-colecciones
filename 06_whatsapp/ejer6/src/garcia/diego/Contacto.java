package garcia.diego;

import java.util.Objects;

public class Contacto {
    private String nombre;
    private String apellidos;
    private String mail;

    public Contacto() {
    }

    public Contacto(String nombre, String apellidos, String mail) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.mail = mail;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
//SIEMPRE GENERAR equals y HashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(mail, contacto.mail);
    }

    @Override
    public int hashCode() {

        return Objects.hash(mail);
    }
}
