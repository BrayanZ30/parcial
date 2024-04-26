

import java.util.Scanner;




public class Parcial2BrayanJavierZuñigaG2 {
public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        int opcion;
        boolean salir = false;
        
        while (!salir) {
            System.out.println("CONCESIONARIO CAUCANA DE VEHICULOS S.A");
            System.out.println("REGISTRO DE VEHICULOS VENDIDOS");
            System.out.println("1 REGISTRO DE AUTOMOVILES");
            System.out.println("2 REGISTRO DE MOTOS");
            System.out.println("3 VENDEDOR");
            System.out.println("4 SALIR");
            System.out.print("SELECCIONE LA OPCION: ");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1 -> registrarAutomovil();
                case 2 -> registrarMoto();
                case 3 -> System.out.println("Nombre Apellido");
                case 4 -> salir = true;
                default -> System.out.println("opcion no valida. Por favor, seleccione una opcion valida.");
            }
        }
    }
}

public static void registrarAutomovil() {
}
public static void registrarMoto() {
}
public static void mostrarVendedor() {
        System.out.println("Brayan Javier Zuñiga Medina");
    }
}

 class Moto {
    private final String placa;
    private final int modelo;
    
    public Moto(String placa, int modelo, int cilindraje) {
        this.placa = placa;
        this.modelo = modelo;
    }
      public String getPlaca() {
        return placa;
    }
   public int getModelo() {
        return modelo;
        
    }
     public double getCilindraje() {
        double cilindraje = 0;
        return cilindraje;
    }
 }
    
   

 class sedan extends Moto {

        public sedan(String motor, String potencia, String tanque, String placa, int modelo, int cilindraje) {
            super(placa, modelo, cilindraje);
            this.motor = motor;
            this.potencia = potencia;
            this.tanque = tanque;
        }
    private final String motor;
    private final String potencia;
    private final String tanque;
    
    public sedan(String placa, int modelo, int cilindraje, String motor, String potencia, String tanque) {
        super(placa, modelo, cilindraje);
        this.motor = motor;
        this.potencia = potencia;
        this.tanque = tanque;
    }
    public String getMotor() {
        return motor;
    }
    
    public String getPotencia() {
        return potencia;
    }
    
    public String getTanque() {
        return tanque;
    }
    public String motorGarantia() {
        return switch (motor) {
            case "4T" -> "La garantía de la moto es por 2 años";
            case "monocilindrico" -> "La garantía de la moto es por 1 año";
            default -> "La garantía de la moto es por un año";
        };
    }
    }
    
     






           
                

                
    

   