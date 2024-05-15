package carreras;

import Corredores.Corredor;

public class CarreraCalle extends Carrera {

    public CarreraCalle(int distancia, String nombre) {
        this.distancia = distancia;
        this.nombre = nombre;
        this.puntos = 2;
    }

    @Override
    public void ingresarCorredor(Corredor corredor) {
        if (this.distancia > 10_000) {
            if (corredor.esCertificadoMedicoValido()) {
                corredor.ingresarCarrera(this);
                this.corredores.add(corredor);
            }
        } else {
            this.corredores.add(corredor);
        }
    }

    @Override
    public boolean sePuedePatrocinar() {
        return corredores.size() >= 100;
    }
}
