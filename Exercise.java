public class Exercise {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.SumarPuertas();
        miCoche.SumarPuertas();

        System.out.println(miCoche.puertas);
    }
}

class Coche {
    public int puertas = 0;

    public void SumarPuertas(){
        this.puertas++;
    }
}