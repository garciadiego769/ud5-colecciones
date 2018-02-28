/*package garcia.diego;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MainCorregido {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Map<String, Contacto> agenda = new LinkedHashMap<>();

/*
        agenda.put("12345", new Contacto("Ion", "Jaureguialzo", "ijaureguialzo@egibide.org"));
        agenda.put("54321", new Contacto("Pepito", "Grillo", "pgrillo@egibide.org"));
        agenda.put("23456", new Contacto("Pepito", "Grillo", "pgrillo@egibide.org"));
        agenda.put("65432", new Contacto("Pepito", "Grillo", "pgrillo@egibide.org"));
*/
/*
    int opcion;
        do {

        System.out.println("Gestión de contactos\n" +
                "11. Nuevo contacto.\n" +
                "12. Eliminar contacto.\n" +
                "Búsqueda\n" +
                "21. Buscar contacto por número de teléfono.\n" +
                "22. Buscar contacto por nombre.\n" +
                "Listados\n" +
                "31. Listado de todos los contactos, tal como se han añadido.\n" +
                "32.Listado de todos los contactos, ordenados por número de teléfono.\n" +
                "4. Salir");
        System.out.print("Opcion: ");
        opcion = Integer.parseInt(br.readLine());

        switch (opcion) {
            case 11:

                // Nuevo contacto
                System.out.print("Teléfono: ");
                String telefono = br.readLine();
                System.out.print("Nombre: ");
                String nombre = br.readLine();
                System.out.print("Apellidos: ");
                String apellidos = br.readLine();
                System.out.print("Email: ");
                String email = br.readLine();

                agenda.put(telefono, new Contacto(nombre, apellidos, email));

                break;
            case 12:

                // Borrar un contacto

                System.out.print("Teléfono a borrar: ");
                String borrame = br.readLine();

                if (agenda.remove(borrame) != null) {
                    System.out.println("Borrado OK");
                } else {
                    System.out.println("No existe...");
                }

                break;
            case 21:

                // Buscar contacto por número de teléfono

                System.out.print("Teléfono a buscar: ");
                String buscame = br.readLine();

                System.out.println(agenda.get(buscame));

                break;
            case 22:

                // Buscar contacto por nombre

                System.out.print("Nombre a buscar: ");
                String encuentrame = br.readLine();

                agenda.forEach((tel, con) -> {
                    if (con.getNombre().equalsIgnoreCase(encuentrame)) {
                        System.out.println(tel + " - " + con);
                    }
                });

                break;
            case 31:

                // Listado de todos los contactos tal como se han añadido

                agenda.forEach((k, v) -> {
                    System.out.println(k + " - " + v);
                });

                break;
            case 32:

                // Listado de contactos ordenados por teléfono

                SortedMap<String, Contacto> agendaOrdenada = new TreeMap<>(agenda);

                agendaOrdenada.forEach((k, v) -> {
                    System.out.println(k + " - " + v);
                });

                break;
            case 4:
                break;
            default:
                break;
        }

    } while (opcion != 4);

}
}
*/