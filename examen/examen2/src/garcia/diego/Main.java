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

        //conexiones
        List <Aula> aulas= new ArrayList<>();
        List <Ordenador> ordenadores=new ArrayList<>();
        List <Tecnico> tecnicos=new ArrayList<>();

        int opcion=0;

        aulas.add(new Aula("Egibide",101));
        aulas.add(new Aula("Ciudad Jardin",102));
        ordenadores.add(new Ordenador("HP","Pavilion","10/01/2017"));
        tecnicos.add(new Tecnico("Diego","75487532S",2));
        tecnicos.add(new Tecnico("Sara","Rodriguez",2));
        do{
            System.out.println("Ordena & Técnicos\n" +
                    "-----------------\n" +
                    "1. Nuevo técnico [10]\n" +
                    "2. Nueva aula [10]\n" +
                    "3. Nuevo ordenador (asociado a un aula) [20]\n" +
                    "4. Asignar ordenador a técnico para reparar [20]\n" +
                    "5. Listado de ordenadores de un aula [20]\n" +
                    "6. Listado de ordenadores de un técnico y aula en la que está cada uno [20]\n" +
                    "7. Salir");
            System.out.println("Escribe:");

                switch (opcion){
                    case 1:
                        //Nuevo Tecnico

                        //Pedir datos
                        System.out.println("Nombre:");
                        String nombre=br.readLine();
                        System.out.println("DNI:");
                        String DNI=br.readLine();
                        System.out.println("Años experiencia");
                        int anyosExperiencia=Integer.parseInt(br.readLine());

                        //Crear tecnico
                        tecnicos.add(new Tecnico(nombre,DNI,anyosExperiencia));

                        break;
                    case 2:
                         //Nueva aula

                        //pedir datos
                        System.out.println("Campus:");
                        nombre=br.readLine();
                        System.out.println("Numero:");
                        int numero=Integer.parseInt(br.readLine());

                        //Añadir aula
                        aulas.add(new Aula(nombre,numero));

                        break;
                    case 3:
                        //Nuevo pc asociado a un aula

                        //mostrar aulas
                        for (Aula aulasTemp:aulas) {
                            System.out.println(aulasTemp);}

                        System.out.println("Escribe nombre aula");
                        String nombreAula=br.readLine();
                        int i=0;

                        while (i<aulas.size() && !nombreAula.equalsIgnoreCase(aulas.get(i).getAula())){
                            i++;
                        }
                        if(i<aulas.size()){
                            Aula aulaEncontrada=aulas.get(i);
                        }

                        System.out.println("datos pc");
                        System.out.println("Marca:");
                        String marca=br.readLine();
                        System.out.println("Modelo:");
                        String modelo=br.readLine();
                        String fechaCompra=br.readLine();

                        //añadir objeto asociado
                        Ordenador o=new Ordenador(marca,modelo,fechaCompra);

                        aulas.get(i).getOrdenadores().add(o); //ida
                        o.setAulas(aulas.get(i));//vuelta
                        break;
                    case 4:
                        //Asignar ordenador a tecnico

                        //Mostrar ordenadores
                        for (Ordenador ordenadorTemp:ordenadores) {
                            System.out.println(ordenadorTemp);
                        }
                        System.out.println("Nombre:");
                        String nombreOrdenador=br.readLine();
                        //lo guardamos
                        int x=0;
                        while(x<ordenadores.size() && !nombreOrdenador.equalsIgnoreCase(ordenadores.get(x).getModelo())){
                            x++;
                        }
                        if(x<ordenadores.size()){
                            ordenadores.get(x);
                        }
                        Ordenador ordenadorEncontrado=ordenadores.get(x);
                        //Mostrar Tecnicos
                        for (Tecnico tecnicoTemp:tecnicos) {
                            System.out.println(tecnicoTemp);
                        }
                        System.out.println("Selecciona tecnico (nombre)");
                        String nombreTecnico=br.readLine();
                        int y=0;
                        while(y<tecnicos.size() && !nombreTecnico.equalsIgnoreCase(tecnicos.get(y).getNombre())){
                            y++;
                        }
                        if(y<tecnicos.size()){
                             tecnicos.get(y);
                        }
                        Tecnico tecnicoEncontrado=tecnicos.get(y);
                        //ASOCIACIÓN
                        tecnicoEncontrado.getOrdenadores().add(ordenadorEncontrado);
                        ordenadorEncontrado.getTecnicos().add(tecnicoEncontrado);
                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                }
             opcion = Integer.parseInt(br.readLine());


        } while (opcion!=7);
    }
}
