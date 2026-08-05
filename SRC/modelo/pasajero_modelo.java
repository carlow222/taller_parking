 package modelo;

public class pasajero_modelo {
    private String num_cedula=""; 
    private String nom_completo="";
    
       //Constructor
    public pasajero_modelo(String num_cedula, String nom_completo) {
        setNum_cedula(num_cedula);
        setNom_completo(nom_completo);
    }

    //Getters
    public String getNum_cedula() {
        return num_cedula;
    }
    public String getNom_completo() {
        return nom_completo;
    }
    
     //Setters
    public void setNum_cedula(String num_cedula) {
        if (num_cedula == null || !num_cedula.matches("^\\d{7,10}$")) {
            throw new IllegalArgumentException("Cedula invalida: debe contener entre 7 y 10 digitos numéricos.");
        }
        this.num_cedula = num_cedula;
    }

    public void setNom_completo(String nom_completo) {
        if (nom_completo == null || nom_completo.trim().isEmpty() || !nom_completo.matches("^[a-zA-Z\\s]+$")) {
            throw new IllegalArgumentException("Nombre invalido: no puede estar vacio y solo se permiten letras y espacios.");
        }
        this.nom_completo = nom_completo;
    }
   
    public String toString() {
        return "num cedula: " + num_cedula + " nom completo: " + nom_completo;
    }
}