package controlador;

import modelo.carro_modelo;
import vista.vista_carro;

public class carro_controlador {
    public void registrar_carro() {
        vista_carro vista = new vista_carro();
        boolean registrado = false;
        
        while (!registrado) {
            try {
                String[] datos = vista.pedir_datos_carro();
                carro_modelo obj_carro = new carro_modelo(datos[0], datos[1], datos[2]);
                System.out.println("\nExito: Carro registrado exitosamente!");
                System.out.println(obj_carro.toString() + "\n");
                registrado = true;
            } catch (IllegalArgumentException e) {
                System.out.println("\n[ERROR] " + e.getMessage());
                System.out.println("Por favor, ingrese los datos nuevamente.\n");
            }
        }
    }
}
