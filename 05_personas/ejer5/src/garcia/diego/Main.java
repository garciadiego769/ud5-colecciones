package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nombre;
        String DNI;
        int opcion;

        Persona p = new Persona(); //1


        Set <Persona> p1 = new HashSet<>(); //Declaración conjunto 1
        Set <Persona> p2 = new HashSet<>(); //Declaración conjunto 2
        //Pedir datos al usuario

              p1.add(new Persona("152","Sara"));
              p1.add(new Persona("153","Sara"));
              p1.add(new Persona("154","Sara"));
              p1.add(new Persona("155","Sara"));
              p1.add(new Persona("156","Sara"));

            Set<Persona> p2 = new HashSet<>();
                p2.add(new Persona("101","Marta"));
                p2.add(new Persona("102","Marta"));
                p2.add(new Persona("103","Marta"));
                p2.add(new Persona("104","Marta"));
                p2.add(new Persona("105","Marta"));

                //- Un conjunto formado por todas las personas de los dos grupos, sin duplicados.
              Set<Persona> copia = new HashSet<>();
              copia.addAll(p2);
    }
}
