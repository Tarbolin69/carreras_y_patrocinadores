package Corredores;

import carreras.Carrera;
import patrocinadores.Patrocinable;

import java.util.HashSet;
import java.util.Set;

public class Corredor implements Patrocinable {
    private int maxDistancia;
    private int puntuaje = 0;
    private boolean certificadoMedico = true;
    private Set<Carrera> carrerasInscriptas = new HashSet<>();
    private Set<Carrera> carrerasParticipadas = new HashSet<>();

    public void faltaCertificadoRenovar() {
        this.certificadoMedico = false;
    }

    public void ingresarCarrera(Carrera carrera) {
        this.carrerasInscriptas.add(carrera);
    }

    public void completarCarrera(Carrera carrera, int puntos) {
            this.puntuaje += puntos;
            if (this.maxDistancia < carrera.getDistancia()) {
                this.maxDistancia = carrera.getDistancia();
            }
            this.carrerasInscriptas.remove(carrera);
            this.carrerasParticipadas.add(carrera);
    }

    public int getMaxDistancia () {
        return this.maxDistancia;
    }

    public int getPuntuaje() {
        return puntuaje;
    }

    public boolean esCertificadoMedicoValido() {
        return this.certificadoMedico;
    }

    @Override
    public boolean sePuedePatrocinar() {
        return this.carrerasParticipadas.size() > 3;
    }
}
