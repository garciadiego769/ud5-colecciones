package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int respuesta = 0;
        //Asociación
        List<Empresa> empresas = new ArrayList<>();

        do {
            System.out.println("SELECCIONA:" +
                    "\n" +
                    "    1. Crear nueva empresa.\n" +
                    "    2. Añadir empleado a empresa ya existente.\n" +
                    "    3. Listado de empresas.\n" +
                    "    4. Listado detallado de empresas y empleados.\n" +
                    "    5. Salir\n" + "Opción:");

            respuesta = Integer.parseInt(br.readLine());
            switch (respuesta) {
                case 1:
                    //Nueva empresa
                    System.out.println("Nombre empresa:");
                    String nombre = br.readLine();

                    System.out.println("Año fundacion:");
                    String anyoFundacion = br.readLine();

                    Empresa e = new Empresa(nombre, anyoFundacion); //Introducimos nombre y año f., lo guardamos en las variables del OBJETO

                    empresas.add(e); //Creamos la empresa en la colección

                    break;
                case 2: //Añadir empleado a empresa existente
                    //Tenemos que mostrar todas las empresas para que el usuario elija a cual añadir
                    for (int i = 0; i < empresas.size(); i++) {
                        System.out.println(i + ") " + empresas.get(i).getNombre());
                    }
                    System.out.println("Elije la empresa:");
                    int seleccion = Integer.parseInt(br.readLine());

                    //Crear un empleado
                    System.out.println("Nombre empleado:");
                    nombre = br.readLine();
                    System.out.println("Apellidos:");
                    String apellidos = br.readLine();
                    System.out.println("Fecha nacimiento:");
                    String fechaNac = br.readLine();
                    System.out.println("Nombre contratación:");
                    String fechaCon = br.readLine();

                    Empleado emp = new Empleado(nombre, apellidos, fechaNac, fechaCon);

                    empresas.get(seleccion).getEmpleados().add(emp); //1 (ida) Sacamos la empresa deseada
                    emp.setEmpresa(empresas.get(seleccion)); //2 (vuelta)

                    break;
                case 3:
                    for (int i = 0; i < empresas.size(); i++) {
                        System.out.println(i + ") " + empresas.get(i).getNombre());
                    }
                    break;

                case 4: //Listado detallado de empresas y empleados
                    for (int i = 0; i < empresas.size(); i++) {
                        System.out.println(i + ") " + empresas.get(i).getNombre());
                        System.out.println(empresas.get(i).getEmpleados());
                    }
                    break;
            }
        } while (respuesta != 5);
    }


}
