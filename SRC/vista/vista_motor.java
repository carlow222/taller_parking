package vista;

import java.util.Scanner;


public class vista_motor {
     
    public void registrar_motor(){
        Scanner obj_teclado = new Scanner(System.in);
        String tipo_motor = obj_teclado.nextLine();
        String num_motor = obj_teclado.nextLine();
        
        Controlador obj_controlador = new Controlador();
        String info = obj_controlador.tomar_datos(tipo_motor , num_motor);
        System.out.println(info);
        obj_teclado.close();
        
    }
}
