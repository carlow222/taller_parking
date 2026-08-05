package controlador;

import modelo.carro_modelo;
import vista.vista_carro;

import java.util.Scanner;
import modelo.ApiModelo;

public class carro_controlador {
    private ApiModelo api;

    public carro_controlador(ApiModelo api) {
        this.api = api;
    }

    public void registrar_carro() {
        vista_carro vista = new vista_carro();
        boolean registrado = false;
        
        while (!registrado) {
            try {
                String[] datos = vista.pedir_datos_carro();
                carro_modelo obj_carro = new carro_modelo(datos[0], datos[1], datos[2]);
                
                Scanner teclado = new Scanner(System.in);
                System.out.print("Ingrese fila para guardar el carro (0-2): ");
                int fila = Integer.parseInt(teclado.nextLine());
                System.out.print("Ingrese columna para guardar el carro (0-2): ");
                int col = Integer.parseInt(teclado.nextLine());
                
                api.agregarCarro(obj_carro, fila, col);
                
                System.out.println("\nExito: Carro registrado exitosamente y guardado en API!");
                System.out.println(obj_carro.toString() + "\n");
                registrado = true;
            } catch (IllegalArgumentException e) {
                System.out.println("\n[ERROR] " + e.getMessage());
                System.out.println("Por favor, ingrese los datos nuevamente.\n");
            }
        }
    }
}
