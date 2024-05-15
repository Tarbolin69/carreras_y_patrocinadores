package patrocinadores;

import java.util.HashSet;
import java.util.Set;

public class Patrocinador {
    private Set<Patrocinable> patrocinados = new HashSet<>();

    public void patrocinar(Patrocinable candidato) {
        if (candidato.sePuedePatrocinar()) {
            patrocinados.add(candidato);
        } else {
            System.out.println("El candidato no pudo ser patrocinado");
        }
    }
    public int cantidadPatrocinada() {
        return patrocinados.size();
    }
}
