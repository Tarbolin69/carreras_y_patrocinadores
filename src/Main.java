import Corredores.Corredor;
import carreras.CarreraAventura;
import carreras.CarreraCalle;
import carreras.CarreraRecreativa;
import patrocinadores.Patrocinador;

public class Main {
    public static void main(String[] args) {
        // Patrocinadores
        Patrocinador saucony = new Patrocinador();
        //Carreras
        CarreraRecreativa cienVueltas = new CarreraRecreativa(10_000, "Las Cien Vueltas");
        CarreraAventura blancaNieve = new CarreraAventura(40_000, 2_000, "Blancas Nieves");
        CarreraCalle troteSemanal = new CarreraCalle(12_000, "Trote Semanal - La Costa");
        CarreraAventura granRuta = new CarreraAventura(50_000, 2_100, "La Gran Ruta");
        saucony.patrocinar(granRuta); // Cumple con requerimiento de desnivel
        saucony.patrocinar(cienVueltas); // No se pueden promocionar carreras recreativas
        // Corredores
        Corredor juanGuzman = new Corredor();
        Corredor marioSanchez = new Corredor();
        Corredor jorgeLuna = new Corredor();
        jorgeLuna.faltaCertificadoRenovar(); // No va a poder ingresar
        Corredor martinMaiten = new Corredor();
        Corredor delfinaMira = new Corredor();
        Corredor sarahBrown = new Corredor();
        // Inscripciones
        cienVueltas.ingresarCorredor(juanGuzman);
        cienVueltas.ingresarCorredor(delfinaMira);
        cienVueltas.ingresarCorredor(sarahBrown);
        blancaNieve.ingresarCorredor(marioSanchez);
        blancaNieve.ingresarCorredor(delfinaMira);
        blancaNieve.ingresarCorredor(sarahBrown);
        troteSemanal.ingresarCorredor(juanGuzman);
        troteSemanal.ingresarCorredor(jorgeLuna);
        troteSemanal.ingresarCorredor(martinMaiten);
        troteSemanal.ingresarCorredor(sarahBrown);
        saucony.patrocinar(troteSemanal); // Solo tiene 4 integrantes, faltarian 96 corredores mas
        granRuta.ingresarCorredor(sarahBrown);
        granRuta.ingresarCorredor(marioSanchez);
        // Ahora completamos las carreras de cada corredor
        cienVueltas.completarCarrera();
        blancaNieve.completarCarrera();
        troteSemanal.completarCarrera();
        troteSemanal.completarCarrera(); // No se puede completar mas de una vez
        granRuta.completarCarrera();
        saucony.patrocinar(sarahBrown); // Corrio mas de 3 carreras
        saucony.patrocinar(jorgeLuna); // No corrio ninguna carrera
        System.out.println("---------------------------------");
        // Ahora vemos los puntos de cada corredor
        System.out.println("Juan tiene " + juanGuzman.getPuntuaje() + " puntos");
        System.out.println("Maria tiene " + marioSanchez.getPuntuaje() + " puntos");
        System.out.println("Jorge tiene " + jorgeLuna.getPuntuaje() + " puntos"); // 0 porque no pudo entrar
        System.out.println("Mario tiene " + marioSanchez.getPuntuaje() + " puntos");
        System.out.println("Delfina tiene " + delfinaMira.getPuntuaje() + " puntos");
        System.out.println("Sarah tiene " + sarahBrown.getPuntuaje() + " puntos");
        System.out.println("---------------------------------");
        // Distancia maxima de cada corredor
        System.out.println("Juan tiene una distancia maxima de " + juanGuzman.getMaxDistancia() + " metros");
        System.out.println("Maria tiene una distancia maxima de " + marioSanchez.getMaxDistancia() + " metros");
        System.out.println("Jorge tiene una distancia maxima de " + jorgeLuna.getMaxDistancia() + " metros"); // 0 porque no pudo entrar
        System.out.println("Mario tiene una distancia maxima de " + marioSanchez.getMaxDistancia() + " metros");
        System.out.println("Delfina tiene una distancia maxima de " + delfinaMira.getMaxDistancia() + " metros");
        System.out.println("Sarah tiene una distancia maxima de " + sarahBrown.getMaxDistancia() + " metros");
        System.out.println("---------------------------------");
        System.out.println("La cantidad de carreras y/o corredores patrocindaodes por Saucony es: " + saucony.cantidadPatrocinada());
    }
}