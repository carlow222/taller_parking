package modelo;

public class carro_modelo {
    private String placa_carro=""; 
    private String marca_carro="";
    private String modelo_carro="";

    //Constructor
    public carro_modelo(String placa_carro, String marca_carro, String modelo_carro) {
        setPlaca_carro(placa_carro);
        setMarca_carro(marca_carro);
        setModelo_carro(modelo_carro);
    }

    //Getters
    public String getPlaca_carro() {
        return placa_carro;
    }
    public String getMarca_carro() {
        return marca_carro;
    }
    public String getModelo_carro() {
        return modelo_carro;
    }

    //Setters
    public void setPlaca_carro(String placa_carro) {
        if (placa_carro == null || !placa_carro.matches("^[A-Z]{3}-\\d{3}$")) {
            throw new IllegalArgumentException("Placa invalida: debe tener el formato ABC-123 (tres letras mayúsculas, guion, tres números).");
        }
        this.placa_carro = placa_carro;
    }
    public void setMarca_carro(String marca_carro) {
        if (marca_carro == null || marca_carro.trim().isEmpty()) {
            throw new IllegalArgumentException("Marca invalida: no puede estar vacia.");
        }
        this.marca_carro = marca_carro;
    }
    public void setModelo_carro(String modelo_carro) {
        if (modelo_carro == null || modelo_carro.trim().isEmpty()) {
            throw new IllegalArgumentException("Modelo invalido: no puede estar vacio.");
        }
        this.modelo_carro = modelo_carro;
    }
    
    public void buscar_placa (String info_placa){
        System.out.println("placa encontrada...");}

    public String toString() {
        return "Placa: " + placa_carro + " Marca: " + marca_carro + " Modelo: " + modelo_carro;
    }
}




