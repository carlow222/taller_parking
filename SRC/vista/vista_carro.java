package vista;

import java.util.Scanner;

public class vista_carro {
     
    public String[] pedir_datos_carro(){
        Scanner obj_teclado = new Scanner(System.in);
        System.out.println("\n--- Registro de Carro ---");
        System.out.print("Ingrese placa: ");
        String placa_carro = obj_teclado.nextLine();
        System.out.print("Ingrese marca: ");
        String marca_carro = obj_teclado.nextLine();
        System.out.print("Ingrese modelo: ");
        String modelo_carro = obj_teclado.nextLine();
        
        return new String[]{placa_carro, marca_carro, modelo_carro};
    }
}
