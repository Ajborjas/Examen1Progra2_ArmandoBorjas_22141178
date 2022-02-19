public class PorAccidenteRadioactivo {

    public static class PorAccidenteRadioA extends Persona {
        protected Integer edadAlMomentoA;

        public PorAccidenteRadioA(String nombre, String poder, String debilidad, String hereoOVillano, Integer fuerza, Integer habilidadMental, Integer habilidadFisica, Integer edadAlMomentoA) {
            super(nombre, poder, debilidad, hereoOVillano, fuerza, habilidadMental, habilidadFisica);
            this.edadAlMomentoA = edadAlMomentoA;
        }

        public static void setLider(Persona p) {
            Escuadron.lider = p;
        }

        public void final_chance(Persona p1, Persona p2) {

        }

        public static void addAccidente(String nombre, String poder, String debilidad, String hereoOVillano, Integer fuerza, Integer habilidadMental, Integer habilidadFisica, Integer edadAlMomentoA) {
            for (Persona e : Escuadron.miembros) {
                if (e.getNombre().equals(nombre)) {
                    System.out.println("Ya existe una persona con ese nombre");
                } else {
                    Escuadron.miembros.add(new PorAccidenteRadioA(nombre, poder, debilidad, hereoOVillano, fuerza, habilidadMental, habilidadFisica, edadAlMomentoA));
                }
            }
            Escuadron.miembros.add(new PorAccidenteRadioA(nombre, poder, debilidad, hereoOVillano, fuerza, habilidadMental, habilidadFisica, edadAlMomentoA));
        }
    }

}
