import java.util.ArrayList;

public class Mutante extends Persona {

    // Atributos
    protected ArrayList<String> factoresMutantes = new ArrayList<>();

    // Constructor
    public Mutante(String nombre, String poder, String debilidad, String hereoOVillano, Integer fuerza, Integer habilidadMental, Integer habilidadFisica, String factorMutant) {
        super(nombre, poder, debilidad, hereoOVillano, fuerza, habilidadMental, habilidadFisica);
        factoresMutantes.add(factorMutant);
    }

    public static void defaultPersonaje() {
        Mutante ad = new Mutante("Doctor Xavier", "Telequinesis", "No puede caminar xd", "heroe", 15, 100, 10, "Adamantium");
        Escuadron.miembros.add(ad);
        Mutante.setLider(ad);
        Extrasterreste.Alien a = new Extrasterreste.Alien("Alien", "psiquico", "Anti-telequinesis", "heroe", 40, 80, 45, "Aliense");
        Escuadron.miembros.add(a);
    }

    public static void addMutante(String nombre, String poder, String debilidad, String hereoOVillano, Integer fuerza, Integer habilidadMental, Integer habilidadFisica, String factorMutant) {
        for (Persona e : Escuadron.miembros) {
            if (e.getNombre().equals(nombre)) {
                System.out.println("Ya existe una persona con ese nombre");
            } else {
                Escuadron.miembros.add(new Mutante(nombre, poder, debilidad, hereoOVillano, fuerza, habilidadMental, habilidadFisica, factorMutant));
            }
        }
        Escuadron.miembros.add(new Mutante(nombre, poder, debilidad, hereoOVillano, fuerza, habilidadMental, habilidadFisica, factorMutant));
    }

    public static void setLider(Persona p) {
        for (Persona e : Escuadron.miembros) {
            if (e.getNombre().equals(p.getNombre())) {
                Escuadron.lider = e;
            }
        }
    }

    public void final_chance(Persona p1, Persona p2) {

    }
}

