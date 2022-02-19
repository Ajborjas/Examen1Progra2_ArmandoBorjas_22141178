import java.util.ArrayList;

public class Escuadron {

    private String nombre;
    private final String lugar_base;
    protected static Persona lider;
    private boolean heroeOVillano;
    protected static ArrayList<Persona> miembros;

    public Escuadron(String nombre, String lugar_base, boolean heroeOVillano) {
        this.nombre = nombre;
        this.lugar_base = lugar_base;
        this.heroeOVillano = heroeOVillano;
        miembros = new ArrayList<>();
    }

    public static void editEscuadron(String nombre, String nuevoNombre, String nuevolugar_base, boolean heroeOVillano) {
        for (Universo universo : Universo.universos) {
            if (universo.getSquads().toString().equals(nombre)) {
                universo.setSquads(new Escuadron(nuevoNombre, nuevolugar_base, heroeOVillano));
            } else {
                System.out.println("No existe el escuadron");
            }
        }
    }

    public static void deleteSquad(String nombre) {
        for (Universo universo : Universo.universos) {
            if (universo.getSquads().toString().equals(nombre)) {
                universo.setSquads(null);
            } else {
                System.out.println("No existe el escuadron");
            }
        }
    }

    public static void addMiembro(String nombre, String nombreM) {
        for (Escuadron universo : Universo.squads) {
            if (universo.getNombre().equals(nombre)) {
                for (Persona persona : Escuadron.miembros) {
                    if (persona.getHeroeOVillano().equals("heroe") && universo.isHeroeOVillano()) {
                        universo.setLider(nombreM);
                        miembros.add(persona);
                    } else if (persona.getHeroeOVillano().equals("villano") && !universo.isHeroeOVillano()) {
                        miembros.add(persona);
                    } else {
                        System.out.println("No existe el miembro");
                    }
                    if (persona.getNombre().equals(nombreM)) {
                        miembros.add(persona);
                    }
                }
                miembros.addAll(miembros);
            }
        }
    }

    public static void addEscuadron(String nombre, String lugar_base, boolean heroeOVillano) {
        for (Universo universo : Universo.universos) {
            if (universo.getNombre().equals(lugar_base)) {
                universo.setSquads(new Escuadron(nombre, lugar_base, heroeOVillano));
            } else {
                System.out.println("No existe el universo");
            }
        }
        Universo.setSquads(new Escuadron(nombre, lugar_base, heroeOVillano));
    }

    private Persona getLider() {
        return lider;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isHeroeOVillano() {
        return heroeOVillano;
    }

    public void setHeroeOVillano(boolean heroeOVillano) {
        this.heroeOVillano = heroeOVillano;
    }

    public static void setMiembros(ArrayList<Persona> miembros) {
        Escuadron.miembros = miembros;
    }

    public void setLider(String nombre) {
        for (Persona persona : miembros) {
            if (persona.getNombre().equals(nombre)) {
                this.lider = persona;
            }
        }
    }

    public String toString() {
        return "nombre=" + nombre + ", lugar_base=" + lugar_base + ", lider=" + lider + ", heroeOVillano=" + heroeOVillano + ", miembros=" + miembros + '}';
    }
}
