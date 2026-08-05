package controlador;

import modelo.pasajero_modelo;
import vista.vista_pasajero;

import modelo.ApiModelo;

public class pasajero_controlador {
    private ApiModelo api;

    public pasajero_controlador(ApiModelo api) {
        this.api = api;
    }

    public void registrar_pasajero() {
        vista_pasajero vista = new vista_pasajero();
        boolean registrado = false;
        
        while (!registrado) {
            try {
                String[] datos = vista.pedir_datos_pasajero();
                pasajero_modelo obj_pasajero = new pasajero_modelo(datos[0], datos[1]);
                api.agregarPasajero(obj_pasajero);
                System.out.println("\nExito: Pasajero registrado exitosamente y guardado en API!");
                System.out.println(obj_pasajero.toString() + "\n");
                registrado = true;
            } catch (IllegalArgumentException e) {
                System.out.println("\n[ERROR] " + e.getMessage());
                System.out.println("Por favor, ingrese los datos nuevamente.\n");
            }
        }
    }
}
