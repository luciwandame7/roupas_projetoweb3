package model;

public class Roupa {
        private int id;
        private String tipo;
        private String cor;
        private String marca;
        private String material;

    public Roupa(){}    
        
    public Roupa(String tipo, String cor, String marca, String material) {
        this.tipo = tipo;
        this.cor = cor;
        this.marca = marca;
        this.material = material;
    }
    
    public Roupa(int id, String tipo, String cor, String marca, String material) {
        this.id = id;
        this.tipo = tipo;
        this.cor = cor;
        this.marca = marca;
        this.material = material;
    }

    public int getCodRoupa() {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String Marca) {
        this.marca = Marca;
    }
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String Material) {
        this.material = Material;
}

   
}