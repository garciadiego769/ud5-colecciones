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
        int i=0;
        //Conexiones
        List<Tecnico> tecnicos = new ArrayList<>();
        List<Ordenador> ordenadores = new ArrayList<>();
        List<Aula> aulas = new ArrayList<>();

        aulas.add(new Aula("Egibide",101));
        aulas.add(new Aula("Ciudad Jardin",102));
        ordenadores.add(new Ordenador("HP","Pavilion","10/01/2017"));
        tecnicos.add(new Tecnico("Diego","75487532S",2));
        tecnicos.add(new Tecnico("Sara","Rodriguez",2));
        do {
            System.out.println("Ordena & Técnicos\n" +
                    "-----------------\n" +
                    "1. Nuevo técnico [10]\n" +
                    "2. Nueva aula [10]\n" +
                    "3. Nuevo ordenador (asociado a un aula) [20]\n" +
                    "4. Asignar ordenador a técnico para reparar [20]\n" +
                    "5. Listado de ordenadores de un aula [20]\n" +
                    "6. Listado de ordenadores de un técnico y aula en la que está cada uno [20]\n" +
                    "7. Salir\n" +
                    "Opción:");
            respuesta = Integer.parseInt(br.readLine());

            switch (respuesta) {
                case 1:
                    //Nuevo Tecnico
                    System.out.println("Nombre:");
                    String nombre = br.readLine();
                    System.out.println("DNI:");
                    String DNI = br.readLine();
                    System.out.println("Años Experiencia:");
                    int anyiosExperiencia = Integer.parseInt(br.readLine());

                    tecnicos.add(new Tecnico(nombre, DNI, anyiosExperiencia));

                    break;
                case 2:
                    //Nueva aula
                    System.out.println("Campus:");
                    String campus = br.readLine();
                    System.out.println("Numero:");
                    int numero = Integer.parseInt(br.readLine());

                    aulas.add(new Aula(campus, numero));
                    break;
                case 3:
                    //Nuevo ordenador asociado a aula

                    //Mostrar aulas
                    for (Aula aulasTemp : aulas) {
                        System.out.println(aulasTemp);
                    }
                    //A que aula se quiere asociar?
                    System.out.println("Selecciona campus:");
                    campus = br.readLine();

                    //Buscar campus
                    int j = 0;

                    while (j < aulas.size() && !campus.equalsIgnoreCase(aulas.get(j).getCampus())) {
                        j++;
                    }
                    Aula aulaEncontrada = null;

                    //porqué ha parado?
                    if (j < aulas.size()) {
                        aulas.get(j); //guardamos
                    }

                    //Comprobamos

                    //Añadir ordenador
                    //Pedir datos
                    System.out.println("Marca:");
                    String marca = br.readLine();
                    System.out.println("Modelo:");
                    String modelo = br.readLine();
                    System.out.println("Fecha compra");
                    String fechCompra = br.readLine();
                    //crear ordenador
                    //ordenadores.add(new Ordenador(marca,modelo,fechCompra));
                    //asociarlo con aula
                    Ordenador o = new Ordenador(marca, modelo, fechCompra);
                    aulas.get(j).getOrdenadores().add(o);
                    o.setAula(aulas.get(j));
                    break;
                case 4:
                    //Asignar ordenador a técnico
                    //mostrar tecnicos
                    for (Tecnico tecnicoTemp : tecnicos) {
                        System.out.println(tecnicoTemp);
                    }
                    //preguntar nombre
                    System.out.println("Introduce nombre a asociar:");
                    nombre = br.readLine();

                    while (i < tecnicos.size() && !nombre.equalsIgnoreCase(tecnicos.get(i).getNombre())) {
                        i++;
                    }
                    if (i < tecnicos.size()) {
                        tecnicos.get(i);//guardamos
                    }
                    Tecnico tecnicoEncontrado = tecnicos.get(i);

                    //Mostrar ordenadores
                    for (Ordenador ordenadorTemp : ordenadores) {
                        System.out.println(ordenadorTemp);
                    }
                    //Cual quieres asociar?
                    System.out.println("¿Cuál quieres asociar?");
                    String nombreOrdenador = br.readLine();
                    int y = 0;
                    //Lo buscamos
                    while (y < ordenadores.size() && !nombreOrdenador.equalsIgnoreCase(ordenadores.get(i).getModelo())) {
                        y++;
                    }
                    //xq ha parado
                    if (y < ordenadores.size()) {
                        ordenadores.get(y);
                    }
                    Ordenador ordenadorEncontrado = ordenadores.get(y);

                    //ASOCIACIÓN
                    tecnicoEncontrado.getOrdenadores().add(ordenadorEncontrado);
                    ordenadorEncontrado.getTecnicos().add(tecnicoEncontrado);

                    break;
                case 5:
                    //Listar ordenadores de un aula

                    //mostrar aulas
                    for (Aula aulaTemp : aulas) {
                        System.out.println(aulaTemp);
                    }
                    //cual quieres asociar?¿
                    System.out.println("Introduce nombre campus a asociar:");
                    String nombreCampus = br.readLine();

                    while (i < aulas.size() && !nombreCampus.equalsIgnoreCase(aulas.get(i).getCampus())) {
                        i++;
                    }
                    if (i < ordenadores.size()) {
                        aulaEncontrada = aulas.get(i);
                    }else {
                        aulaEncontrada=null;
                    }

                    //buscar ordenadores asociados a ese aula){

                    for (Ordenador ordenadorTemp:aulas.get(i).getOrdenadores()) {
                        System.out.println(aulas.get(i).getOrdenadores());
                    }

                case 6:

                    break;
            }
        }
                while (respuesta != 7) ;

    }
}
