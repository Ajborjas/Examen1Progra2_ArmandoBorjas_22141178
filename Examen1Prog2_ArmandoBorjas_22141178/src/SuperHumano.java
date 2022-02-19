public class SuperHumano extends Persona {

    String superPoder;

    public SuperHumano(String nombre, String poder, String debilidad, String hereoOVillano, Integer fuerza, Integer habilidadMental, Integer habilidadFisica, String superPoder) {
        super(nombre, poder, debilidad, hereoOVillano, fuerza, habilidadMental, habilidadFisica);
        this.superPoder = superPoder;
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

    public static void addSuperH(String nombre, String poder, String debilidad, String hereoOVillano, Integer fuerza, Integer habilidadMental, Integer habilidadFisica, String superPoder) {
        for (Persona e : Escuadron.miembros) {
            if (e.getNombre().equals(nombre)) {
                System.out.println("Ya existe una persona con ese nombre");
            } else {
                Escuadron.miembros.add(new SuperHumano(nombre, poder, debilidad, hereoOVillano, fuerza, habilidadMental, habilidadFisica, superPoder));
            }
        }
        Escuadron.miembros.add(new SuperHumano(nombre, poder, debilidad, hereoOVillano, fuerza, habilidadMental, habilidadFisica, superPoder));
    }
}

