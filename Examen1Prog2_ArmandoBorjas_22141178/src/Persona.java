public class Persona {

    private String nombre;
    private String poder;
    private String debilidad;
    private String heroeOVillano;
    private Integer fuerza, habilidadMental, habilidadFisica;
    private boolean tiene_Escuadron;

    public Persona(String nombre, String poder, String debilidad, String heroeOVillano, Integer fuerza, Integer habilidadMental, Integer habilidadFisica) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.heroeOVillano = heroeOVillano;
        this.fuerza = fuerza;
        this.habilidadMental = habilidadMental;
        this.habilidadFisica = habilidadFisica;
        tiene_Escuadron = false;
    }

    public static boolean verifyPts(int fuerza, int habilidadM, int habilidadF) {
        int pts = fuerza + habilidadM + habilidadF;
        return pts >= 100 && pts <= 150;
    }

    public static void editarPersona(String nombre, String poder, String debilidad, String heroeOVillano, Integer fuerza, Integer habilidadMental, Integer habilidadFisica) {
        for (Persona escuadron : Escuadron.miembros) {
            if (escuadron.getNombre().equals(nombre)) {
                escuadron.setPoder(poder);
                escuadron.setDebilidad(debilidad);
                escuadron.setHeroeOVillano(heroeOVillano);
                escuadron.setFuerza(fuerza);
                escuadron.setHabilidadMental(habilidadMental);
                escuadron.setHabilidadFisica(habilidadFisica);
            }
        }
    }

    public static void deletePersona(String nombre) {
        Escuadron.miembros.removeIf(escuadron -> escuadron.getNombre().equals(nombre));
    }

    public static void listPersona() {
        for (Persona persona : Escuadron.miembros) {
            System.out.println(persona.toString());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getHeroeOVillano() {
        return heroeOVillano;
    }

    public void setHeroeOVillano(String heroeOVillano) {
        this.heroeOVillano = heroeOVillano;
    }


    public Integer getFuerza() {
        return fuerza;
    }

    public void setFuerza(Integer fuerza) {
        this.fuerza = fuerza;
    }

    public Integer getHabilidadMental() {
        return habilidadMental;
    }

    public void setHabilidadMental(Integer habilidadMental) {
        this.habilidadMental = habilidadMental;
    }

    public Integer getHabilidadFisica() {
        return habilidadFisica;
    }

    public void setHabilidadFisica(Integer habilidadFisica) {
        this.habilidadFisica = habilidadFisica;
    }

    public boolean isTiene_Escuadron() {
        return tiene_Escuadron;
    }

    public void setTiene_Escuadron(boolean tiene_Escuadron) {
        this.tiene_Escuadron = tiene_Escuadron;
    }

    public void final_chance(Persona p1, Persona p2) {

    }

    public String toString() {
        return "Persona[" + "nombre:" + nombre + ", poder:" + poder + ", debilidad:" + debilidad + ", fuerza:" + fuerza + ", habilidadMental:" + habilidadMental + ", habilidadFisica:" + habilidadFisica + ", tiene_Escuadron:" + tiene_Escuadron + ']';
    }

}
