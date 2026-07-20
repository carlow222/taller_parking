package modelo;

public class chofer_modelo {
    private String nombre_chofer=""; 
    String cedula_chofer="";
    String licencia_chofer="";

    //Constructor
    public chofer_modelo(String nombre_chofer,String dato_cedula,String dato_licencia)
    {
        this.nombre_chofer=nombre_chofer;
        this.cedula_chofer=dato_cedula;
        this.licencia_chofer=dato_licencia;
    }

    //Getters
    public String getNombre_chofer() {
        return nombre_chofer;
    }
    public String getCedula_chofer() {
        return cedula_chofer;
    }
    public String getLicencia_chofer() {
        return licencia_chofer;
    }

    //Setters
    public void setNombre_chofer(String nombre_chofer) {
        this.nombre_chofer = nombre_chofer;
    }
    public void setCedula_chofer(String cedula_chofer) {
        this.cedula_chofer = cedula_chofer;
    }
    public void setLicencia_chofer(String licencia_chofer) {
        this.licencia_chofer = licencia_chofer;
    }

    public String toString() {
        return "Nombre: " + nombre_chofer + " Cedula: " + cedula_chofer + " Licencia: " + licencia_chofer;
    }
}
