package modelo;

public class motor_modelo {
    private String tipo_motor=""; 
    private String num_motor="";
    private String cilindraje="";

    //Constructor
    public motor_modelo(String tipo_motor, String num_motor, String cilindraje) {
        setTipo_motor(tipo_motor);
        setNum_motor(num_motor);
        setCilindraje(cilindraje);
    }

    //Getters
    public String getTipo_motor() {
        return tipo_motor;
    }
    public String getNum_motor() {
        return num_motor;
    }
    public String getCilindraje() {
        return cilindraje;
    }
    
    //Setters
    public void setTipo_motor(String tipo_motor) {
        if (tipo_motor == null) {
            throw new IllegalArgumentException("Tipo de motor invalido: no puede ser nulo.");
        }
        String tipoLower = tipo_motor.trim().toLowerCase();
        if (!tipoLower.equals("gasolina") && !tipoLower.equals("diesel") && !tipoLower.equals("electrico")) {
            throw new IllegalArgumentException("Tipo de motor invalido: debe ser Gasolina, Diesel o Electrico.");
        }
        this.tipo_motor = tipo_motor;
    }
    public void setNum_motor(String num_motor) {
        if (num_motor == null || num_motor.trim().isEmpty()) {
            throw new IllegalArgumentException("Numero de motor invalido: no puede estar vacio.");
        }
        this.num_motor = num_motor;
    }
    public void setCilindraje(String cilindraje) {
        if (cilindraje == null || cilindraje.trim().isEmpty()) {
            throw new IllegalArgumentException("Cilindraje invalido: no puede estar vacio.");
        }
        this.cilindraje = cilindraje;
    }

    public String toString() {
        return "Tipo Motor: " + tipo_motor + " Num Motor: " + num_motor + " Cilindraje: " + cilindraje;
    }
}
