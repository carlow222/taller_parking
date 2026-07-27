package controlador;

import modelo.chofer_modelo;
import vista.vista_chofer;

public class chofer_controlador {
    public void registrar_chofer() {
        vista_chofer vista = new vista_chofer();
        boolean registrado = false;
        
        while (!registrado) {
            try {
                String[] datos = vista.pedir_datos_chofer();
                chofer_modelo obj_chofer = new chofer_modelo(datos[0], datos[1], datos[2]);
                System.out.println("\nExito: Chofer registrado exitosamente!");
                System.out.println(obj_chofer.toString() + "\n");
                registrado = true;
            } catch (IllegalArgumentException e) {
                System.out.println("\n[ERROR] " + e.getMessage());
                System.out.println("Por favor, ingrese los datos nuevamente.\n");
            }
        }
    }
}
