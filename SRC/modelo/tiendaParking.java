package modelo;

import controlador.chofer_controlador;
import controlador.carro_controlador;
import controlador.motor_controlador;
import controlador.pasajero_controlador;

public class tiendaParking {

    public static void main(String[] args) {
        System.out.println("--- Sistema Tienda Parking ---");
        System.out.println("Por favor ingrese la informacion solicitada a continuacion:\n");
        
        
        chofer_controlador c_chofer = new chofer_controlador();
        c_chofer.registrar_chofer();
        
        
        carro_controlador c_carro = new carro_controlador();
        c_carro.registrar_carro();
        
        
        motor_controlador c_motor = new motor_controlador();
        c_motor.registrar_motor();
        
        
        pasajero_controlador c_pasajero = new pasajero_controlador();
        c_pasajero.registrar_pasajero();
        
        System.out.println("\n¡Todos los registros se han completado con exito!");
    }
}
