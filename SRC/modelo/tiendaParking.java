package modelo;
import java.util.Scanner;

public class tiendaParking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Sistema Tienda Parking ---");
        
         // Código principal-->ejecutar todo..
         chofer_modelo obj_chofer=new chofer_modelo("Juan", "123456789", "LIC-123");
         chofer_modelo obj_chofer2=new chofer_modelo("carlos", "1091358510", "LIC-456");
         obj_chofer.setNombre_chofer("Carlos");
         
         String dato_nombre = obj_chofer.getNombre_chofer();
         System.out.println("Chofer modificado: " + dato_nombre);
         System.out.println(obj_chofer.toString());
         System.out.println(obj_chofer2.toString());
         
         // Instancias de carro_modelo
         carro_modelo obj_carro = new carro_modelo("ADB-134", "Toyota", "Corolla");
         carro_modelo obj_carro2 = new carro_modelo("YTR-986", "Honda", "Civic");
         
         System.out.println(obj_carro.toString());
         System.out.println(obj_carro2.toString());

         // Instancias de motor_modelo
         motor_modelo obj_motor = new motor_modelo("Gasolina", "1600cc");
         motor_modelo obj_motor2 = new motor_modelo("Diesel", "2000cc");
         
         System.out.println(obj_motor.toString());
         System.out.println(obj_motor2.toString());
         
         // Instancias de pasajero_modelo
         pasajero_modelo obj_pasajero = new pasajero_modelo("123516547", "Pedro Jose Martin Lopez");
         pasajero_modelo obj_pasajero2 = new pasajero_modelo("129758765", "Jose Daniel Quintero");
         
         System.out.println(obj_pasajero.toString());
         System.out.println(obj_pasajero2.toString());

        scanner.close();
    }
}
