package SRC;

public class carro_modelo {
    private String placa_carro=""; 
    private String marca_carro="";
    private String modelo_carro="";

    //Constructor
    public carro_modelo(String placa_carro, String marca_carro, String modelo_carro) {
        this.placa_carro = placa_carro;
        this.marca_carro = marca_carro;
        this.modelo_carro = modelo_carro;
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
        this.placa_carro = placa_carro;
    }
    public void setMarca_carro(String marca_carro) {
        this.marca_carro = marca_carro;
    }
    public void setModelo_carro(String modelo_carro) {
        this.modelo_carro = modelo_carro;
    }

    public String toString() {
        return "Placa: " + placa_carro + " Marca: " + marca_carro + " Modelo: " + modelo_carro;
    }
}
