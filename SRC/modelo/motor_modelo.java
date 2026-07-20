package modelo;

public class motor_modelo {
    private String tipo_motor=""; 
    private String num_motor="";

    //Constructor
    public motor_modelo(String tipo_motor, String num_motor) {
        this.tipo_motor = tipo_motor;
        this.num_motor = num_motor;
    }

    //Getters
    public String getTipo_motor() {
        return tipo_motor;
    }
    public String getNum_motor() {
        return num_motor;
    }
    
    //Setters
    public void setTipo_motor(String tipo_motor) {
        this.tipo_motor = tipo_motor;
    }
    public void setNum_motor(String num_motor) {
        this.num_motor = num_motor;
    }

    public String toString() {
        return "Tipo Motor: " + tipo_motor + " Num Motor: " + num_motor;
    }
}
