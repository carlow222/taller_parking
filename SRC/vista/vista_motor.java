package vista;

import java.util.Scanner;

public class vista_motor {
     
    public String[] pedir_datos_motor(){
        Scanner obj_teclado = new Scanner(System.in);
        System.out.println("\n--- Registro de Motor ---");
        System.out.print("Ingrese tipo de motor: ");
        String tipo_motor = obj_teclado.nextLine();
        System.out.print("Ingrese numero de motor: ");
        String num_motor = obj_teclado.nextLine();
        
        return new String[]{tipo_motor, num_motor};
    }
}
