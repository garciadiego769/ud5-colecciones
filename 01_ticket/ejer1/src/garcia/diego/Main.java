package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Número: ");
        int numero = Integer.parseInt(br.readLine());
        System.out.print("Fecha: ");
        String fecha = br.readLine();
        System.out.print("Hora: ");
        String hora = br.readLine();

        Ticket ticket = new Ticket(numero,fecha,hora);

        char continuar;

        do {
            System.out.print("Descripción: ");
            String descripcion = br.readLine();
            System.out.print("Unidades: ");
            int unidades = Integer.parseInt(br.readLine());
            System.out.print("Precio: ");
            double precio = Double.parseDouble(br.readLine());

            LineaTicket linea = new LineaTicket(descripcion,unidades,precio);

            ticket.getLineas().add(linea);
            linea.setTicket(ticket);

            System.out.print("¿Continuar? (s|n): ");
            continuar = br.readLine().toLowerCase().charAt(0);
        }while(continuar == 's');

        for (int i = 0; i < ticket.getLineas().size(); i++) {
            System.out.println(ticket.getLineas().get(i));
        }
    }
}
