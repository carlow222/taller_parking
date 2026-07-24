package modelo;

import java.util.Scanner;
import controlador.chofer_controlador;
import controlador.carro_controlador;
import controlador.motor_controlador;
import controlador.pasajero_controlador;

public class tiendaParking {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean ejecutando = true;

        System.out.println("--- Sistema Tienda Parking ---");

        while (ejecutando) {
            System.out.println("\n========== MENU PRINCIPAL ==========");
            System.out.println("1. Registrar Chofer");
            System.out.println("2. Registrar Carro");
            System.out.println("3. Registrar Motor");
            System.out.println("4. Registrar Pasajero");
            System.out.println("5. Salir");
            System.out.println("====================================");
            System.out.print("Seleccione una opcion: ");

            String opcion = teclado.nextLine().trim();

            switch (opcion) {
                case "1":
                    chofer_controlador c_chofer = new chofer_controlador();
                    c_chofer.registrar_chofer();
                    break;
                case "2":
                    carro_controlador c_carro = new carro_controlador();
                    c_carro.registrar_carro();
                    break;
                case "3":
                    motor_controlador c_motor = new motor_controlador();
                    c_motor.registrar_motor();
                    break;
                case "4":
                    pasajero_controlador c_pasajero = new pasajero_controlador();
                    c_pasajero.registrar_pasajero();
                    break;
                case "5":
                    ejecutando = false;
                    System.out.println("\n¡Gracias por usar el Sistema Tienda Parking! Hasta luego.");
                    break;
                default:
                    System.out.println("\n[ERROR] Opcion invalida. Por favor seleccione un numero del 1 al 5.");
                    break;
            }
        }

        teclado.close();
    }
}
