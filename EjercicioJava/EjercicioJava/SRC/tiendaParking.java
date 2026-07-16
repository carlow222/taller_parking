package SRC;
import java.util.Scanner;

public class tiendaParking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Sistema Tienda Parking ---");
        
        // Código principal-->ejecutar todo..
         chofer_modelo obj_chofer=new chofer_modelo("Juan", "Perez", "123456789");
         chofer_modelo obj_chofer2=new chofer_modelo("carlos", "Prieto", "1091358510");
         obj_chofer.setNombre_chofer("Carlos");
         
         String dato_nombre = obj_chofer.getNombre_chofer();
         
         // Instancias de carro_modelo
         carro_modelo obj_carro = new carro_modelo("ADB-134", "Toyota", "Corolla");
         carro_modelo obj_carro2 = new carro_modelo("YTR-986", "Honda", "Civic");
         
         System.out.println(obj_carro.toString());
         System.out.println(obj_carro2.toString());

         // Instancias de motor_modelo
         motor_modelo obj_motor = new motor_modelo("Gasolina", "1600cc", "120HP");
         motor_modelo obj_motor2 = new motor_modelo("Diesel", "2000cc", "150HP");
         
         System.out.println(obj_motor.toString());
         System.out.println(obj_motor2.toString());

        scanner.close();
    }
}
