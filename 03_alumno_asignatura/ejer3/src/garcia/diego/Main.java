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
       String nombre;
       String apellidos;
       String mail;

        List<Alumno> alumnos= new ArrayList<>();
        List<Asignatura> asignaturas=new ArrayList<>();
        alumnos.add(new Alumno("Ion", "Jaureguialzo", "ijaureguialzo@egibide.org"));
        asignaturas.add(new Asignatura("Programación", 8));
       do{
           System.out.println("1. Crear nuevo alumno. \n" +
                   "2. Crear nueva asignatura. \n" +
                   "3. Matricular alumno en asignatura. \n" +
                   "4. Listado de alumnos matriculados en una asignatura. \n" +
                   "5. Listado de asignaturas en las que está matriculado un alumno y total de horas. \n" +
                   "6. Salir ");
           System.out.println("Escribe:");
           respuesta=Integer.parseInt(br.readLine());

           switch (respuesta){
               case 1:
                   //nuevo alumno

                   System.out.println("Nombre:");
                   nombre=br.readLine();
                   System.out.println("Apellidos:");
                   apellidos=br.readLine();
                   System.out.println("Email:");
                   mail=br.readLine();

                   Alumno a = new Alumno(nombre,apellidos,mail);

                   alumnos.add(a);
                   break;
               case 2:
                   //Nueva asignatura
                   System.out.println("Nombre:");
                   nombre=br.readLine();
                   System.out.println("Horas Semanales:");
                   int horasSemanales = Integer.parseInt(br.readLine());

                   Asignatura as=new Asignatura(nombre,horasSemanales);

                   asignaturas.add(as);
                   break;
               case 3:
                   //Añadir alumno a asignatura

                   //Mostrar todos los alumnos
                   for (Alumno al:alumnos) {
                       System.out.println(al);
                   }
                   //Pedir nombre alumno
                   System.out.println("Nombre alumno:");
                   nombre=br.readLine();

                   //buscar alumno y guardar posicion
                   int i=0;
                   while (i < alumnos.size() &&
                           !nombre.equalsIgnoreCase(alumnos.get(i).getNombre())
                           ) {
                       i++;
                   }
                   Alumno alumnoencontrado=null;

                   if (i<alumnos.size()){
                    alumnoencontrado=alumnos.get(i);
                   }

                   //Que asignatura??
                   System.out.println("Asignaturas:");
                   for (Asignatura asigTemp:asignaturas) {
                       System.out.println(asigTemp);
                   }
                   //Pedir nombre asignatura
                   System.out.println("Nombre asignatura");
                   nombre=br.readLine();

                   int j=0;
                   while (j<asignaturas.size() &&
                           !nombre.equalsIgnoreCase(asignaturas.get(i).getNombre())){
                       i++;
                   }
                   Asignatura asignaturaEncontrada = null;

                   if (i<asignaturas.size()){
                       //Encontrada!!
                       asignaturaEncontrada=asignaturas.get(i);
                   }

                   //Ya tenemos los dos encontrados, pero comprobamos
                   if(asignaturaEncontrada!=null && alumnoencontrado!=null){
                       //todo OK
                       //Añadimos al alumno en la lista de la asignatura
                       asignaturaEncontrada.getAlumnos().add(alumnoencontrado);
                       //Añadimos la asignatura en la lista del alumno
                       alumnoencontrado.getAsignaturas().add(asignaturaEncontrada);

                       System.out.println("Alumno matriculado correctamente");
                   }else{
                       System.out.println("Algo ha ido mal");
                   }
                   break;
               case 4: //Listado de alumnos matriculados en una asignatura
                   //Que asignatura??


           }
       }while (respuesta!=6);
    }
}
