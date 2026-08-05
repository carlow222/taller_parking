package controlador;

import modelo.ApiModelo;

public class controlador_maestro {
    private static controlador_maestro instancia;
    private ApiModelo api;

    private controlador_maestro() {
        // Inicializamos la API
        api = new ApiModelo("http://localhost", "root", "1234");
    }

    public static controlador_maestro getInstancia() {
        if (instancia == null) {
            instancia = new controlador_maestro();
        }
        return instancia;
    }
    
    public ApiModelo getApi() {
        return api;
    }

    public void iniciar() {
        System.out.println("--- Sistema Tienda Parking ---");

        if (api.validar_conexion()) {
            System.out.println("Conexion a la API exitosa.");
        } else {
            System.out.println("Fallo al conectar a la API.");
        }

        // Iniciar interfaz gráfica
        java.awt.EventQueue.invokeLater(() -> {
            new visual.MenuPrincipal().setVisible(true);
        });
    }
}
