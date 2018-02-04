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

        int respuesta;

        List<Asignatura> asignaturas = new ArrayList<>();
        List<Alumno> alumnos = new ArrayList<>();
//Datos de depuración, para no introducir datos cada vez que se lanze el programa
        alumnos.add(new Alumno("Diego", "Garcia", "aaa@aa.com"));
        asignaturas.add(new Asignatura("Programación", 8));
        do {
            System.out.println("1. Crear nuevo alumno. \n" +
                    "2. Crear nueva asignatura. \n" +
                    "3. Matricular alumno en asignatura. \n" +
                    "4. Listado de alumnos matriculados en una asignatura. \n" +
                    "5. Listado de asignaturas en las que está matriculado un alumno y total de horas. \n" +
                    "6. Salir \n" + "Escribe:");
            respuesta = Integer.parseInt(br.readLine());

            switch (respuesta) {
                case 1:
                    //Nuevo alumno
                    //Pedir datos
                    System.out.println("Nombre:");
                    String nombre = br.readLine();
                    System.out.println("Apellido:");
                    String apellido = br.readLine();
                    System.out.println("Mail:");
                    String mail = br.readLine();
                    //Crear objeto y rellenarlo
                    Alumno a = new Alumno(nombre, apellido, mail); //usamos el constructor
                            /*    también podemos hacer
                            a.setNombre(nombre);
                            a.setApellidos(apellido);
                            a.setEmail(mail);*/

                    //Añadir objeto a lista
                    alumnos.add(a);
                    break;
                case 2:
                    //Nueva asignatura
                    //Pedir datos
                    System.out.println("Nombre:");
                    nombre = br.readLine();

                    System.out.println("Nº horas semanales:");
                    int numHoras = Integer.parseInt(br.readLine());

                    //Crear objeto y rellenarlo
                    //Añadir el objeto a la lista
                    asignaturas.add(new Asignatura(nombre, numHoras));
                    break;
                case 3:
                    //Matricular a un alumno en una asignatura

                    //Qué alumno?
                    //1. Mostrar todos
                    for (Alumno alumTemp : alumnos) {
                        System.out.println(alumTemp);
                    }
                    //Pedir nombre
                    System.out.println("Nombre alumno a matricular:");
                    String nombreAlumno = br.readLine();
                    //Recorrer la coleccion y buscar alumno
                    int i = 0;
                    while (i < alumnos.size() && !nombreAlumno.equalsIgnoreCase(alumnos.get(i).getNombre())) {
                        //Dejamos que el bucle avanze siempre que NO encontremos el nombre
                        i++;
                    }
                    //Preguntamos porqué se ha parado
                    if (i < alumnos.size()) {
                        //Encontrado
                    }
                    //Qué asignatura?
                    //Relacionar alumno y asignatura
                    //Añadir al alumno en la lista de la asignatura
                    //Añadir la asignatura en la lista del alumno
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;

            }
        } while (respuesta != 6);

    }
}
