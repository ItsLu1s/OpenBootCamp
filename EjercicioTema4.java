public class Main {
    public static void main(String[] args) {
        int numeroif = 0;
        int numeroWhile = 1;
        String estacion = "OTOÑO";

        if(numeroif < 0){
            System.out.println("El número es negativo");
        } else if (numeroif > 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es cero");
        }

        System.out.println("-----");

        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        System.out.println("------");

        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);

        System.out.println("------");

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        System.out.println("------");

        switch (estacion){
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            case "OTOÑO":
                System.out.println("Es otoño");
                break;
            case "PRIMAVERA":
                System.out.println("Es primvera");
                break;
            default:
                System.out.println("Lo que introdujo no es una estación");
        }
    }
}
