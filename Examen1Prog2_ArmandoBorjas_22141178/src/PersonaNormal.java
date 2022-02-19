public class PersonaNormal extends Persona {
    public PersonaNormal(String nombre, String poder, String debilidad, String hereoVillano, Integer fuerza, Integer habilidadMental, Integer habilidadFisica) {
        super(nombre, poder, debilidad, hereoVillano, fuerza, habilidadMental, habilidadFisica);
    }

    public static void addPersonaN(String nombre, String poder, String debilidad, String hereoVillano, Integer fuerza, Integer habilidadMental, Integer habilidadFisica) {
        for (Persona e : Escuadron.miembros) {
            if (e.getNombre().equals(nombre)) {
                System.out.println("Ya existe una persona con ese nombre");
            } else {
                Escuadron.miembros.add(new PersonaNormal(nombre, poder, debilidad, hereoVillano, fuerza, habilidadMental, habilidadFisica));
            }
        }
        Escuadron.miembros.add(new PersonaNormal(nombre, poder, debilidad, hereoVillano, fuerza, habilidadMental, habilidadFisica));
    }


    public void final_chance(Persona p1, Persona p2) {

    }

}
