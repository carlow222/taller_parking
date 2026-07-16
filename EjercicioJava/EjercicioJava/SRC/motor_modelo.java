package SRC;

public class motor_modelo {
    private String tipo_motor=""; 
    private String cilindrada="";
    private String potencia="";

    //Constructor
    public motor_modelo(String tipo_motor, String cilindrada, String potencia) {
        this.tipo_motor = tipo_motor;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }

    //Getters
    public String getTipo_motor() {
        return tipo_motor;
    }
    public String getCilindrada() {
        return cilindrada;
    }
    public String getPotencia() {
        return potencia;
    }

    //Setters
    public void setTipo_motor(String tipo_motor) {
        this.tipo_motor = tipo_motor;
    }
    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }
    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String toString() {
        return "Tipo Motor: " + tipo_motor + " Cilindrada: " + cilindrada + " Potencia: " + potencia;
    }
}
