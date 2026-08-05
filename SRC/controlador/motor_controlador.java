package controlador;

import modelo.motor_modelo;
import vista.vista_motor;

import java.util.Scanner;
import modelo.ApiModelo;

public class motor_controlador {
    private ApiModelo api;

    public motor_controlador(ApiModelo api) {
        this.api = api;
    }

    public void registrar_motor() {
        vista_motor vista = new vista_motor();
        boolean registrado = false;
        
        while (!registrado) {
            try {
                String[] datos = vista.pedir_datos_motor();
                motor_modelo obj_motor = new motor_modelo(datos[0], datos[1], datos[2]);
                
                Scanner teclado = new Scanner(System.in);
                System.out.print("Ingrese fila para guardar el motor (0-2): ");
                int fila = Integer.parseInt(teclado.nextLine());
                System.out.print("Ingrese columna para guardar el motor (0-2): ");
                int col = Integer.parseInt(teclado.nextLine());
                
                api.agregarMotor(obj_motor, fila, col);
                
                System.out.println("\nExito: Motor registrado exitosamente y guardado en API!");
                System.out.println(obj_motor.toString() + "\n");
                registrado = true;
            } catch (IllegalArgumentException e) {
                System.out.println("\n[ERROR] " + e.getMessage());
                System.out.println("Por favor, ingrese los datos nuevamente.\n");
            }
        }
    }
}
