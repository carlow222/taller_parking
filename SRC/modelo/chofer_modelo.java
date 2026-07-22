package modelo;

public class chofer_modelo {
    private String nombre_chofer=""; 
    private String cedula_chofer="";
    private String licencia_chofer="";

    //Constructor
    public chofer_modelo(String nombre_chofer,String dato_cedula,String dato_licencia)
    {
        setNombre_chofer(nombre_chofer);
        setCedula_chofer(dato_cedula);
        setLicencia_chofer(dato_licencia);
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
        if (nombre_chofer == null || nombre_chofer.trim().isEmpty() || !nombre_chofer.matches("^[a-zA-Z\\s]+$")) {
            throw new IllegalArgumentException("Nombre invalido: no puede estar vacio y solo se permiten letras y espacios.");
        }
        this.nombre_chofer = nombre_chofer;
    }
    public void setCedula_chofer(String cedula_chofer) {
        if (cedula_chofer == null || !cedula_chofer.matches("^\\d{7,10}$")) {
            throw new IllegalArgumentException("Cedula invalida: debe contener entre 7 y 10 digitos numéricos.");
        }
        this.cedula_chofer = cedula_chofer;
    }
    public void setLicencia_chofer(String licencia_chofer) {
        if (licencia_chofer == null || !licencia_chofer.startsWith("LIC-")) {
            throw new IllegalArgumentException("Licencia invalida: debe iniciar con 'LIC-'.");
        }
        this.licencia_chofer = licencia_chofer;
    }

    public String toString() {
        return "Nombre: " + nombre_chofer + " Cedula: " + cedula_chofer + " Licencia: " + licencia_chofer;
    }
}
