package vista;

import java.util.Scanner;


public class vista_chofer {
     
    public void registrar_chofer(){
        Scanner obj_teclado = new Scanner(System.in);
        String nombre_completo_chofer = obj_teclado.nextLine();
        String cedula_chofer = obj_teclado.nextLine();
        
        Controlador obj_controlador = new Controlador();
        String info = obj_controlador.tomar_datos(nombre_completo_chofer , cedula_chofer);
        System.out.println(info);
        obj_teclado.close();
        
    }
}
