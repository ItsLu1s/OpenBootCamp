public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.nombre = "Juan Carlos";
        cliente.edad = 20;
        cliente.telefono = 4563286;
        cliente.credito = 12345.3;

        System.out.println(cliente.nombre);
        System.out.println(cliente.edad);
        System.out.println(cliente.telefono);
        System.out.println("Su crédito es de " + cliente.credito + " euros.");
        
        trabajador.nombre = "Camilo Andrés";
        trabajador.edad = 32;
        trabajador.telefono = 4874908;
        trabajador.salario = 10000.5;

        System.out.println(trabajador.nombre);
        System.out.println(trabajador.edad);
        System.out.println(trabajador.telefono);
        System.out.println("El salario es de " + trabajador.salario + "euros anuales");
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona {
    double salario;
}
