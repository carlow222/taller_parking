package vista;

import java.util.Scanner;

public class vista_chofer {
     
    public String[] pedir_datos_chofer(){
        Scanner obj_teclado = new Scanner(System.in);
        System.out.println("--- Registro de Chofer ---");
        System.out.print("Ingrese nombre completo: ");
        String nombre_completo_chofer = obj_teclado.nextLine();
        System.out.print("Ingrese cedula: ");
        String cedula_chofer = obj_teclado.nextLine();
        System.out.print("Ingrese licencia: ");
        String licencia_chofer = obj_teclado.nextLine();
        
        return new String[]{nombre_completo_chofer, cedula_chofer, licencia_chofer};
    }
}
