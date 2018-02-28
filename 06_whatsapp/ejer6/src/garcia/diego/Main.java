package garcia.diego;

import javafx.scene.media.SubtitleTrack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int respuesta;
        Map<String, Contacto> agenda = new LinkedHashMap<>(); //Creamos el mapa

        do {
            System.out.println("1. Gestión de contactos \n" +
                    "  11. Nuevo contacto. \n" +
                    "  12. Eliminar contacto. \n" +
                    "2. Búsqueda \n" +
                    "  21. Buscar contacto por número de teléfono. \n" +
                    "  22. Buscar contacto por nombre. \n" +
                    "3. Listados \n" +
                    " 31. Listado de todos los contactos, tal como se han añadido. \n" +
                    "  32. Listado de todos los contactos, ordenados por número de teléfono. \n" +
                    "40. Salir ");
            respuesta = Integer.parseInt(br.readLine());


            agenda.put("12345", new Contacto("Ion", "Jaureguialzo", "ijaureguialzo@egibide.org"));
            agenda.put("54321", new Contacto("Pepito", "Grillo", "pgrillo@egibide.org"));
            agenda.put("23456", new Contacto("Pepito", "Grillo", "pgrillo@egibide.org"));
            agenda.put("65432", new Contacto("Pepito", "Grillo", "pgrillo@egibide.org"));
            switch (respuesta) {
                case 11: //Nuevo contacto

                    //pedir datos
                    System.out.println("Introduce telefono:");
                    String telefono = br.readLine();
                    System.out.println("Introduce nombre:");
                    String nombre = br.readLine();
                    System.out.println("Introduce apellido:");
                    String apellido = br.readLine();
                    System.out.println("Introduce mail:");
                    String mail = br.readLine();

                    //Añadir contacto
                    agenda.put(telefono, new Contacto(nombre, apellido, mail)); //aprovechamos para generar el objeto Contacto
                    break;
                case 12: //Eliminar contacto


                    //¿Qué contacto se quiere borrar?
                    System.out.println("Teléfono a borrar:");
                    String borrame = br.readLine();

                    if (agenda.remove(borrame) != null) {
                        System.out.println("Borrado OK");
                    } else {
                        System.out.println("No existe");
                    }
                    break;
                case 21:
                    //Buscar contacto por numero de telefono

                    //pedir numero
                    System.out.println("Introduce nº telf:");
                    String buscame = br.readLine();

                    System.out.println(agenda.get(buscame));
                    break;
                case 22:  //Buscar contacto por nombre
                    //pedir nombre
                    System.out.println("Nombre a buscar:");
                    String encuentrame=br.readLine();

                    //tenemos que recorrer todo el diccionario para encontrarlo
                    agenda.forEach(tel con);
                    break;
                case 31:

                    break;
                case 32:

                    break;
                default:
                    break;
            }
        } while (respuesta != 40);

    }
}
