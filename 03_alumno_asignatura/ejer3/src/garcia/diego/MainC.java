package com.jaureguialzo;

import garcia.diego.Alumno;
import garcia.diego.Asignatura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Alumno> alumnos = new ArrayList<>();
        List<Asignatura> asignaturas = new ArrayList<>();

        // Depuración
        alumnos.add(new Alumno("Ion", "Jaureguialzo", "ijaureguialzo@egibide.org"));
        asignaturas.add(new Asignatura("Programación", 8));

        int opcion;
        do {
            System.out.println("1. Crear nuevo alumno.\n" +
                    "2. Crear nueva asignatura.\n" +
                    "3. Matricular alumno en asignatura.\n" +
                    "4. Listado de alumnos matriculados en una asignatura.\n" +
                    "5. Listado de asignaturas en las que está matriculado un alumno y total de horas.\n" +
                    "6. Salir");

            System.out.print("Opción: ");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 1:
                    // Nuevo Alumno

                    // Pedir los datos
                    System.out.print("Nombre: ");
                    String nombre = br.readLine();
                    System.out.print("Apellido: ");
                    String apellido = br.readLine();
                    System.out.print("Email: ");
                    String email = br.readLine();

                    // Crear el objeto y rellenarlo

                    Alumno a = new Alumno();

                    a.setNombre(nombre);
                    a.setApellido(apellido);
                    a.setEmail(email);
*//*
                    Alumno a = new Alumno(nombre, apellido, email);

                    // Añadir el objeto a la lista
                    alumnos.add(a);

                    break;
                case 2:

                    // Nueva Asignatura

                    // Pedir los datos
                    System.out.print("Nombre: ");
                    nombre = br.readLine();
                    System.out.print("Número de horas semanales: ");
                    int numHoras = Integer.parseInt(br.readLine());

                    // Crear el objeto y rellenarlo + Añadir el objeto a la lista
                    asignaturas.add(new Asignatura(nombre, numHoras));

                    break;
                case 3:
                    // Matricular alumno en asignatura

                    // ¿Qué alumno?
                    Alumno alumnoEncontrado = buscarAlumno(br, alumnos);

                    // ¿Qué asignatura?
                    Asignatura asignaturaEncontrada = buscarAsignatura(br, asignaturas);

                    // Relacionar alumno y asignatura
                    if (asignaturaEncontrada != null &&
                            alumnoEncontrado != null) {

                        // Tenemos los dos objetos disponibles

                        // Añadir al alumno en la lista de la asignatura
                        asignaturaEncontrada.getAlumnos().add(alumnoEncontrado);

                        // Añadir la asignatura en la lista del alumno
                        alumnoEncontrado.getAsignaturas().add(asignaturaEncontrada);

                        System.out.println("Alumno matriculado correctamente");

                    } else {
                        System.out.println("ERROR: Algo ha ido mal...");
                    }

                    break;
                case 4:

                    // Listado de alumnos matriculados en una asignatura

                    // ¿Qué asignatura?
                    asignaturaEncontrada = buscarAsignatura(br, asignaturas);

                    // Recorrer y mostrar los alumnos
                    // Expresión lambda: r->{}
                    System.out.println("Alumnos de: " + asignaturaEncontrada.getNombre());

                    asignaturaEncontrada.getAlumno().forEach(al -> {
                        System.out.println(al);
                    });

                    break;
                case 5:

                    // Listado de asignaturas de un alumno y total de horas

                    // ¿Qué alumno?
                    alumnoEncontrado = buscarAlumno(br, alumnos);

                    // Total de horas
                    int total = 0;

                    // Recorrer y mostrar
                    System.out.println("Asignaturas de: " + alumnoEncontrado.getNombre());

                    Iterator<Asignatura> it = alumnoEncontrado.getAsignaturas().iterator();
                    while (it.hasNext()) {
                        Asignatura as = it.next();
                        System.out.println(as);
                        total += as.getHorasSemanales();
                    }

                    System.out.format("Total de horas: %d", total);

                    break;
                case 6:
                    break;
                default:
                    break;
            }

        } while (opcion != 6);

    }

    private static Alumno buscarAlumno(BufferedReader br, List<Alumno> alumnos) throws IOException {

        // Mostrar todos los alumnos
        System.out.println("Alumnos del centro");
        for (Alumno alumTemp : alumnos) {
            System.out.println(alumTemp);
        }

        // Pedir el nombre del alumno
        System.out.print("Alumno a matricular: ");
        String nombreAlumno = br.readLine();

        // Buscar al alumno en la lista y guardar su posición
        int i = 0;
        while (i < alumnos.size() &&
                !nombreAlumno.equalsIgnoreCase(alumnos.get(i).getNombre())
                ) {
            i++;
        }

        Alumno alumnoEncontrado = null;

        if (i < alumnos.size()) {
            // Encontrado!
            alumnoEncontrado = alumnos.get(i);
        }

        return alumnoEncontrado;
    }

    private static Asignatura buscarAsignatura(BufferedReader br, List<Asignatura> asignaturas) throws IOException {

        // Mostrar todos las asignaturas
        System.out.println("Asignaturas del centro");
        for (Asignatura asigTemp : asignaturas) {
            System.out.println(asigTemp);
        }

        // Pedir el nombre de la asignatura
        System.out.print("Asignatura a buscar: ");
        String nombreAsignatura = br.readLine();

        // Buscar la asignatura en la lista y guardar su posición
        int i = 0;
        while (i < asignaturas.size() &&
                !nombreAsignatura.equalsIgnoreCase(asignaturas.get(i).getNombre())
                ) {
            i++;
        }

        Asignatura asignaturaEncontrada = null;

        if (i < asignaturas.size()) {
            // Encontrada!
            asignaturaEncontrada = asignaturas.get(i);
        }

        return asignaturaEncontrada;
    }
}
*/