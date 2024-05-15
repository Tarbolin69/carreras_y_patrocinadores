package carreras;

import Corredores.Corredor;
import patrocinadores.Patrocinable;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class Carrera implements Patrocinable {
    protected boolean completada = false;
    protected int distancia;
    protected int puntos;
    protected String nombre;
    protected Set<Corredor> corredores = new HashSet<>();

    public abstract void ingresarCorredor(Corredor corredor);

    public void completarCarrera() {
        if (!this.completada) {
            for (Corredor participantes : corredores) {
                participantes.completarCarrera(this, this.puntos);
            }
            this.completada = true;
            System.out.println("La carrera '" + this.nombre + "' ha sido completada!");
        } else {
            System.out.println("'" + this.nombre + "' ya finalizo");
        }
    }

    public int getPuntos() {
        return this.puntos;
    }

    public int getDistancia() {
        return distancia;
    }
}
