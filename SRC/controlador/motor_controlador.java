package controlador;

import modelo.motor_modelo;
import vista.vista_motor;

public class motor_controlador {
    public void registrar_motor() {
        vista_motor vista = new vista_motor();
        boolean registrado = false;
        
        while (!registrado) {
            try {
                String[] datos = vista.pedir_datos_motor();
                motor_modelo obj_motor = new motor_modelo(datos[0], datos[1]);
                System.out.println("\nExito: Motor registrado exitosamente!");
                System.out.println(obj_motor.toString() + "\n");
                registrado = true;
            } catch (IllegalArgumentException e) {
                System.out.println("\n[ERROR] " + e.getMessage());
                System.out.println("Por favor, ingrese los datos nuevamente.\n");
            }
        }
    }
}
