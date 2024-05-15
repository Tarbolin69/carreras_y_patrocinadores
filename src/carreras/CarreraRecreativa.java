package carreras;

import Corredores.Corredor;

public class CarreraRecreativa extends Carrera {

    public CarreraRecreativa(int distancia, String nombre) {
        this.distancia = distancia;
        this.nombre = nombre;
    }

    @Override
    public void ingresarCorredor(Corredor corredor) {
        this.corredores.add(corredor);
    }

    @Override
    public boolean sePuedePatrocinar() {
        return false;
    }
}
