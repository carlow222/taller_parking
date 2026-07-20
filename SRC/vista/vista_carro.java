package vista;

import java.util.Scanner;


public class vista_carro {
     
    public void registrar_carro(){
        Scanner obj_teclado = new Scanner(System.in);
        String placa_carro = obj_teclado.nextLine();
        String marca_carro = obj_teclado.nextLine();
        String modelo_carro = obj_teclado.nextLine();
        
        Controlador obj_controlador = new Controlador();
        String info = obj_controlador.tomar_datos(placa_carro , marca_carro, modelo_carro);
        System.out.println(info);
        obj_teclado.close();
        
    }
}
