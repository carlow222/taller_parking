package vista;

import java.util.Scanner;


public class vista_pasajero {
     
    public void registrar_pasajero(){
        Scanner obj_teclado = new Scanner(System.in);
        String num_cedula = obj_teclado.nextLine();
        String nom_completo = obj_teclado.nextLine();
        
        Controlador obj_controlador = new Controlador();
        String info = obj_controlador.tomar_datos(num_cedula , nom_completo);
        System.out.println(info);
        obj_teclado.close();
        
    }
}
