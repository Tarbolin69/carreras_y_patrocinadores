package carreras;

import Corredores.Corredor;

public class CarreraAventura extends Carrera {
    private int desnivel;
    private int maxCupo = 10;

    public CarreraAventura(int distancia, int desnivel, String nombre) {
        this.distancia = distancia;
        this.desnivel = desnivel;
        this.nombre = nombre;
        this.puntos = (distancia / 20_000) + (desnivel / 1_000);
    }

    public void incrementarCupo(int incremento) {
        this.maxCupo += incremento;
    }

    @Override
    public void ingresarCorredor(Corredor corredor) {
        if (maxCupo != 0) {
            corredor.ingresarCarrera(this);
            this.corredores.add(corredor);
            maxCupo -= 1;
        } else {
            System.out.println("No se pueden ingresar mas corredores");
        }
    }

    @Override
    public boolean sePuedePatrocinar() {
        if (desnivel >= 2000) {
            return true;
        } else {
            for (Corredor participantes : corredores) {
                if (participantes.getPuntuaje() >= 5) {
                    return true;
                }
            }
            return false;
        }
    }
}
