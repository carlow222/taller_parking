package modelo;

public class pasajero_modelo {
    public String num_cedula=""; 
    public String nom_completo="";
    
       //Constructor
    public pasajero_modelo(String num_cedula, String nom_completo) {
        this.num_cedula = num_cedula;
        this.nom_completo = nom_completo;
       
    }

    //Getters
    public String getNum_cedula() {
        return num_cedula;
    }
    
     //Setters
    public void setNom_completo(String nom_completo) {
        this.nom_completo = nom_completo;
    }
   

    public String toString() {
        return "num cedula: " + num_cedula + " nom completo: " + nom_completo;
    }
}