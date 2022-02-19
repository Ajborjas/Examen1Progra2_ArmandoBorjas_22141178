import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int opcion;
        Universo.defaultU();
        Universo.defaultSquad();
        Mutante.defaultPersonaje();

        System.out.println("Menu de opciones");
        do {
            System.out.println("""
                    0. Salir
                    1. Opciones Universo
                    2. Opciones Escuadrón
                    3. Opciones Persona
                    Ingrese una opción:""");
            opcion = leer.nextInt();

            if (opcion == 1) {
                System.out.println("Opciones del Universo");
                System.out.println("""
                        1. Crear universo
                        2. Modificar universo
                        3. Eliminar universo
                        4. Mostrar universo
                        Ingrese una opción:""");
                opcion = leer.nextInt();

                if (opcion == 1) {
                    System.out.println("Crear universo");
                    System.out.println("Ingrese el nombre del universo:");
                    String nombre = leer.next();
                    Universo.addUniverso(nombre);
                } else if (opcion == 2) {
                    System.out.println("Modificar universo");
                    System.out.println("Ingrese el nombre del universo:");
                    String nombre = leer.next();
                    System.out.println("Ingrese el nuevo nombre del universo:");
                    String nuevoNombre = leer.next();
                    Universo.editUniverso(nombre, nuevoNombre);
                } else if (opcion == 3) {
                    System.out.println("Eliminar universo");
                    System.out.println("Ingrese el nombre del universo:");
                    String nombre = leer.next();
                    Universo.deleteUniverso(nombre);
                } else if (opcion == 4) {
                    System.out.println("Mostrar universo");
                    System.out.println(Universo.listUniversos());
                }
            } else if (opcion == 2) {
                System.out.println("Opciones del Escuadrón");
                System.out.println("""
                        1. Crear escuadron
                        2. Modificar escuadron
                        3. Eliminar escuadron
                        4. Agregar miembros al escuadron
                        5. Mostrar escuadrones
                        6. Simular batalla
                        Ingrese una opción:""");
                opcion = leer.nextInt();

                if (opcion == 1) {
                    System.out.println("Crear escuadron");
                    System.out.println("Ingrese el nombre del escuadron:");
                    String nombre = leer.next();
                    System.out.println("Ingrese el lugar/base del escuadron:");
                    String lugar = leer.next();
                    System.out.println("""
                            Tipo de escuadron:
                            1. Heroe
                            2. Villano
                            Ingrese una opcion:""");
                    opcion = leer.nextInt();
                    if (opcion == 1) {
                        Escuadron.addEscuadron(nombre, lugar, true);
                    } else if (opcion == 2) {
                        Escuadron.addEscuadron(nombre, lugar, false);
                    } else {
                        System.out.println("Opcion no valida");
                    }
                } else if (opcion == 2) {
                    System.out.println("Modificar escuadron");
                    System.out.println("Ingrese el nombre del escuadron:");
                    String nombre = leer.next();
                    System.out.println("Ingrese el nuevo nombre del escuadron:");
                    String nuevoNombre = leer.next();
                    System.out.println("Ingrese el nuevo lugar/base del escuadron:");
                    String nuevoLugar = leer.next();
                    System.out.println("""
                            Tipo de escuadrón:
                            1. Héroe
                            2. Villano
                            Ingrese una opción:""");
                    opcion = leer.nextInt();
                    if (opcion == 1) {
                        Escuadron.editEscuadron(nombre, nuevoNombre, nuevoLugar, true);
                    } else if (opcion == 2) {
                        Escuadron.editEscuadron(nombre, nuevoNombre, nuevoLugar, false);
                    }
                } else if (opcion == 3) {
                    System.out.println("Eliminar escuadrón");
                    System.out.println("Ingrese el nombre del escuadrón:");
                    String nombre = leer.next();
                    Escuadron.deleteSquad(nombre);
                } else if (opcion == 4) {
                    System.out.println("Agregar miembros al escuadrón");
                    System.out.println("Ingrese el nombre del escuadrón:");
                    String nombre = leer.next();
                    System.out.println("Ingrese el nombre del miembro:");
                    String nombreMiembro = leer.next();
                    Escuadron.addMiembro(nombre, nombreMiembro);
                } else if (opcion == 5) {
                    System.out.println("Mostrar escuadrones");
                    Universo.listSquads();
                } else if (opcion == 6) {
                    System.out.println("Iniciando batalla");
                    Universo.listSquads();
                    System.out.println("Ingrese el nombre del escuadrón1:");
                    String nombre = leer.next();
                    System.out.println("Ingrese el nombre del escuadrón2:");
                    String nombre2 = leer.next();
                }
            } else if (opcion == 3) {
                System.out.println("Opciones Persona");
                System.out.println("""
                        1. Crear persona
                        2. Modificar persona
                        3. Eliminar persona
                        4. Listar personas
                        Ingrese una opción:""");
                opcion = leer.nextInt();

                if (opcion == 1) {
                    System.out.println("Crear persona");
                    System.out.println("""
                            Ingrese el tipo de persona:
                            1. Persona Normal
                            2. Mutante
                            3. Por Accidente Radioactivo
                            4. Super Humano
                            5. Extrasterrestre
                            Ingrese una opción:""");
                    opcion = leer.nextInt();

                    if (opcion == 1) {
                        System.out.println("Ingrese el nombre de la persona:");
                        String nombre = leer.next();
                        System.out.println("Ingrese el poder:");
                        String poder = leer.next();
                        System.out.println("Ingrese la debilidad:");
                        String debilidad = leer.next();
                        System.out.println("Ingrese si es heroe o villano:");
                        String tipo = leer.next().toLowerCase();
                        System.out.println("Ingrese los pts de fuerza:");
                        int fuerza = leer.nextInt();
                        System.out.println("Ingrese los pts de habilidad mental:");
                        int habilidad = leer.nextInt();
                        System.out.println("Ingrese los pts de habilidad fisica:");
                        int habilidadFisica = leer.nextInt();
                        if (Persona.verifyPts(fuerza, habilidad, habilidadFisica)) {
                            PersonaNormal.addPersonaN(nombre, poder, debilidad, tipo, fuerza, habilidad, habilidadFisica);
                        } else {
                            System.out.println("No puede ser un héroe o villano por sus pts de habilidad");
                        }
                    } else if (opcion == 2) {
                        System.out.println("Ingrese el nombre de la persona:");
                        String nombre = leer.next();
                        System.out.println("Ingrese el poder:");
                        String poder = leer.next();
                        System.out.println("Ingrese la debilidad:");
                        String debilidad = leer.next();
                        System.out.println("Ingrese si es heroe o villano:");
                        String tipo = leer.next().toLowerCase();
                        System.out.println("Ingrese los pts de fuerza:");
                        int fuerza = leer.nextInt();
                        System.out.println("Ingrese los pts de habilidad mental:");
                        int habilidad = leer.nextInt();
                        System.out.println("Ingrese los pts de habilidad fisica:");
                        int habilidadFisica = leer.nextInt();
                        System.out.println("Ingrese el factor Mutante:");
                        String factor = leer.next();
                        if (Persona.verifyPts(fuerza, habilidad, habilidadFisica)) {
                            Mutante.addMutante(nombre, poder, debilidad, tipo, fuerza, habilidad, habilidadFisica, factor);
                        } else {
                            System.out.println("No puede ser un héroe o villano por sus pts de habilidad");
                        }
                    } else if (opcion == 3) {
                        System.out.println("Ingrese el nombre de la persona:");
                        String nombre = leer.next();
                        System.out.println("Ingrese el poder:");
                        String poder = leer.next();
                        System.out.println("Ingrese la debilidad:");
                        String debilidad = leer.next();
                        System.out.println("Ingrese si es heroe o villano:");
                        String tipo = leer.next().toLowerCase();
                        System.out.println("Ingrese los pts de fuerza:");
                        int fuerza = leer.nextInt();
                        System.out.println("Ingrese los pts de habilidad mental:");
                        int habilidad = leer.nextInt();
                        System.out.println("Ingrese los pts de habilidad fisica:");
                        int habilidadFisica = leer.nextInt();
                        System.out.println("Ingrese la edad al momento del accidente:");
                        int edad = leer.nextInt();
                        if (Persona.verifyPts(fuerza, habilidad, habilidadFisica)) {
                            PorAccidenteRadioactivo.PorAccidenteRadioA.addAccidente(nombre, poder, debilidad, tipo, fuerza, habilidad, habilidadFisica, edad);
                        } else {
                            System.out.println("No puede ser un héroe o villano por sus pts de habilidad");
                        }
                    } else if (opcion == 4) {
                        System.out.println("Ingrese el nombre de la persona:");
                        String nombre = leer.next();
                        System.out.println("Ingrese el poder:");
                        String poder = leer.next();
                        System.out.println("Ingrese la debilidad:");
                        String debilidad = leer.next();
                        System.out.println("Ingrese si es heroe o villano:");
                        String tipo = leer.next().toLowerCase();
                        System.out.println("Ingrese los pts de fuerza:");
                        int fuerza = leer.nextInt();
                        System.out.println("Ingrese los pts de habilidad mental:");
                        int habilidad = leer.nextInt();
                        System.out.println("Ingrese los pts de habilidad fisica:");
                        int habilidadFisica = leer.nextInt();
                        System.out.println("Ingrese el superpoder:");
                        String superpoder = leer.next();
                        if (Persona.verifyPts(fuerza, habilidad, habilidadFisica)) {
                            SuperHumano.addSuperH(nombre, poder, debilidad, tipo, fuerza, habilidad, habilidadFisica, superpoder);
                        } else {
                            System.out.println("No puede ser un héroe o villano por sus pts de habilidad");
                        }
                    } else if (opcion == 5) {
                        System.out.println("""
                                1. Deidad
                                2. Alien
                                ingrese la opcion:""");
                        int opcion2 = leer.nextInt();
                        if (opcion2 == 1) {
                            System.out.println("Ingrese el nombre de la persona:");
                            String nombre = leer.next();
                            System.out.println("Ingrese el poder:");
                            String poder = leer.next();
                            System.out.println("Ingrese la debilidad:");
                            String debilidad = leer.next();
                            System.out.println("Ingrese si es heroe o villano:");
                            String tipo = leer.next().toLowerCase();
                            System.out.println("Ingrese los pts de fuerza:");
                            int fuerza = leer.nextInt();
                            System.out.println("Ingrese los pts de habilidad mental:");
                            int habilidad = leer.nextInt();
                            System.out.println("Ingrese los pts de habilidad fisica:");
                            int habilidadFisica = leer.nextInt();
                            System.out.println("Tiene creyentes? false/true:");
                            boolean creyente = leer.nextBoolean();
                            System.out.println("Ingrese la religion o mitologia:");
                            String religion = leer.next();
                            if (Persona.verifyPts(fuerza, habilidad, habilidadFisica)) {
                                Extrasterreste.Deidad.addDeidad(nombre, poder, debilidad, tipo, fuerza, habilidad, habilidadFisica, creyente, religion);
                            }
                        } else if (opcion2 == 2) {
                            System.out.println("Ingrese el nombre de la persona:");
                            String nombre = leer.next();
                            System.out.println("Ingrese el poder:");
                            String poder = leer.next();
                            System.out.println("Ingrese la debilidad:");
                            String debilidad = leer.next();
                            System.out.println("Ingrese si es heroe o villano:");
                            String tipo = leer.next().toLowerCase();
                            System.out.println("Ingrese los pts de fuerza:");
                            int fuerza = leer.nextInt();
                            System.out.println("Ingrese los pts de habilidad mental:");
                            int habilidad = leer.nextInt();
                            System.out.println("Ingrese los pts de habilidad fisica:");
                            int habilidadFisica = leer.nextInt();
                            System.out.println("Ingrese el planeta:");
                            String planeta = leer.next();
                            if (Persona.verifyPts(fuerza, habilidad, habilidadFisica)) {
                                Extrasterreste.Alien.addAlien(nombre, poder, debilidad, tipo, fuerza, habilidad, habilidadFisica, planeta);
                            }
                        }
                    }
                } else if (opcion == 2) {
                    System.out.println("Ingrese el nombre de la persona:");
                    String nombre = leer.next();
                    System.out.println("Ingrese el poder:");
                    String poder = leer.next();
                    System.out.println("Ingrese la debilidad:");
                    String debilidad = leer.next();
                    System.out.println("Ingrese si es heroe o villano:");
                    String tipo = leer.next().toLowerCase();
                    System.out.println("Ingrese los pts de fuerza:");
                    int fuerza = leer.nextInt();
                    System.out.println("Ingrese los pts de habilidad mental:");
                    int habilidad = leer.nextInt();
                    System.out.println("Ingrese los pts de habilidad fisica:");
                    int habilidadFisica = leer.nextInt();
                    Persona.editarPersona(nombre, poder, debilidad, tipo, fuerza, habilidad, habilidadFisica);
                } else if (opcion == 3) {
                    System.out.println("Ingrese el nombre de la persona:");
                    String nombre = leer.next();
                    Persona.deletePersona(nombre);
                } else if (opcion == 4) {
                    System.out.println("Lista de personas:");
                    Persona.listPersona();
                }
            }

        } while (opcion != 0);
    }
}
