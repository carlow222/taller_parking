package modelo;

import java.util.ArrayList;
import java.util.List;

public class ApiModelo {
     String clave = "";
     String root = "";
     String url = "" ;
     
     
     private List<chofer_modelo> listaChoferes;
     private List<pasajero_modelo> listaPasajeros;
     
     
     private carro_modelo[][] matrizCarros;
     private motor_modelo[][] matrizMotores;
             
     public ApiModelo(String url, String usuario, String clave){
        this.clave = clave;
        this.root = usuario;
        this.url = url; 
        
        
        this.listaChoferes = new ArrayList<>();
        this.listaPasajeros = new ArrayList<>();
        this.matrizCarros = new carro_modelo[3][3];
        this.matrizMotores = new motor_modelo[3][3];
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    public boolean validar_conexion(){
        if (this.clave.equals("1234")) {
            return true;
        }
        else{
            return false;
        }
    }
    
    public void desconexion(){
        System.out.println("Desconexion realizada..."); 
    } 
    
   
    public void agregarChofer(chofer_modelo chofer) {
        this.listaChoferes.add(chofer);
    }
    
    public void agregarPasajero(pasajero_modelo pasajero) {
        this.listaPasajeros.add(pasajero);
    }
    
   
    public void mostrarChoferes() {
        System.out.println("--- Lista de Choferes ---");
        for (int i = 0; i < listaChoferes.size(); i++) {
            System.out.println(listaChoferes.get(i).toString());
        }
    }
    
    public void mostrarPasajeros() {
        System.out.println("--- Lista de Pasajeros ---");
        for (int i = 0; i < listaPasajeros.size(); i++) {
            System.out.println(listaPasajeros.get(i).toString());
        }
    }
    
    public void buscar_chofer(String info_cedula) {
        System.out.println("cliente se esta buscando...");
        boolean encontrado = false;
        for (int i = 0; i < listaChoferes.size(); i++) {
            if (listaChoferes.get(i).getCedula_chofer().equals(info_cedula)) {
                System.out.println("Chofer encontrado: " + listaChoferes.get(i).toString());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Chofer no encontrado.");
        }
    }
    
    
    public void agregarCarro(carro_modelo carro, int fila, int col) {
        if (fila >= 0 && fila < 3 && col >= 0 && col < 3) {
            this.matrizCarros[fila][col] = carro;
        } else {
            System.out.println("Índices fuera de rango para la matriz de carros.");
        }
    }
    
    public void agregarMotor(motor_modelo motor, int fila, int col) {
        if (fila >= 0 && fila < 3 && col >= 0 && col < 3) {
            this.matrizMotores[fila][col] = motor;
        } else {
            System.out.println("Índices fuera de rango para la matriz de motores.");
        }
    }
    
    
    public void mostrarCarros() {
        System.out.println("--- Matriz de Carros (3x3) ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizCarros[i][j] != null) {
                    System.out.println("Posición [" + i + "][" + j + "]: " + matrizCarros[i][j].toString());
                } else {
                    System.out.println("Posición [" + i + "][" + j + "]: Vacio");
                }
            }
        }
    }
    
    public void mostrarMotores() {
        System.out.println("--- Matriz de Motores (3x3) ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizMotores[i][j] != null) {
                    System.out.println("Posición [" + i + "][" + j + "]: " + matrizMotores[i][j].toString());
                } else {
                    System.out.println("Posición [" + i + "][" + j + "]: Vacio");
                }
            }
        }
    }
    
    // Metodos agregados para la Interfaz Grafica
    public String obtenerTextoChoferes() {
        StringBuilder sb = new StringBuilder();
        sb.append("--- Lista de Choferes ---\n");
        if (listaChoferes.isEmpty()) sb.append("No hay choferes registrados.\n");
        for (chofer_modelo c : listaChoferes) {
            sb.append(c.toString()).append("\n");
        }
        return sb.toString();
    }
    
    public String obtenerTextoPasajeros() {
        StringBuilder sb = new StringBuilder();
        sb.append("--- Lista de Pasajeros ---\n");
        if (listaPasajeros.isEmpty()) sb.append("No hay pasajeros registrados.\n");
        for (pasajero_modelo p : listaPasajeros) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
    
    public String obtenerTextoCarros() {
        StringBuilder sb = new StringBuilder();
        sb.append("--- Matriz de Carros (3x3) ---\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sb.append("Posición [").append(i).append("][").append(j).append("]: ");
                if (matrizCarros[i][j] != null) {
                    sb.append(matrizCarros[i][j].toString()).append("\n");
                } else {
                    sb.append("Vacio\n");
                }
            }
        }
        return sb.toString();
    }
    
    public String obtenerTextoMotores() {
        StringBuilder sb = new StringBuilder();
        sb.append("--- Matriz de Motores (3x3) ---\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sb.append("Posición [").append(i).append("][").append(j).append("]: ");
                if (matrizMotores[i][j] != null) {
                    sb.append(matrizMotores[i][j].toString()).append("\n");
                } else {
                    sb.append("Vacio\n");
                }
            }
        }
        return sb.toString();
    }
}