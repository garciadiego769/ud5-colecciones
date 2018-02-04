package garcia.diego;

public class LineaTicket {
    private String descripcion;
    private int unidades;
    private double precio;

    // Asociación
    private Ticket ticket;

    public LineaTicket(String descripcion, int unidades, double precio) {
        this.descripcion = descripcion;
        this.unidades = unidades;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
