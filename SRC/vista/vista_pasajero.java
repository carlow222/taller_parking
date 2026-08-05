package vista;

import java.util.Scanner;

public class vista_pasajero {
     
    public String[] pedir_datos_pasajero(){
        Scanner obj_teclado = new Scanner(System.in);
        System.out.println("\n--- Registro de Pasajero ---");
        System.out.print("Ingrese numero de cedula: ");
        String num_cedula = obj_teclado.nextLine();
        System.out.print("Ingrese nombre completo: ");
        String nom_completo = obj_teclado.nextLine();
        
        return new String[]{num_cedula, nom_completo};
    }
}
