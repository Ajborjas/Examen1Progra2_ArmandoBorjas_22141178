import java.util.ArrayList;

public class Universo {

    private String nombre;
    protected static ArrayList<Universo> universos = new ArrayList<>();
    protected static ArrayList<Escuadron> squads;

    public Universo(String nombre) {
        this.nombre = nombre;
        squads = new ArrayList<>();
    }

    public static void defaultU() {
        Universo universo = new Universo("Alfa");
        Universo.universos.add(universo);
    }

    public static void defaultSquad() {
        Escuadron.addEscuadron("X-mens", "Alfa", false);
        Escuadron.addEscuadron("Marvel", "Alfa", true);
    }


    public static void deleteUniverso(String nombre) {
        universos.removeIf(universo -> universo.getNombre().equals(nombre));
    }

    public static void editUniverso(String nombre, String nuevoNombre) {
        for (Universo universo : universos) {
            if (universo.getNombre().equals(nombre)) {
                universo.setNombre(nuevoNombre);
            }
        }
    }

    public static String listUniversos() {
        for (Universo universo : universos) {
            return universo.toString();
        }
        return "";
    }

    public static void addUniverso(String nombre) {
        for (Universo universo : universos) {
            if (universo.getNombre().equals(nombre)) {
                System.out.println("Ya existe un universo con ese nombre");
            } else {
                System.out.println("Universo creado");
                Universo universo1 = new Universo(nombre);
                universos.add(universo1);
            }
        }
        universos.add(new Universo(nombre));
    }

    public static void listSquads() {
        for (Escuadron squad : squads) {
            System.out.println(squad.toString());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Escuadron> getSquads() {
        return squads;
    }

    public static void setSquads(Escuadron squads) {
        Universo.squads.add(squads);
    }

    @Override
    public String toString() {
        return "Universo[" + "nombre:" + nombre + ']';
    }

}
