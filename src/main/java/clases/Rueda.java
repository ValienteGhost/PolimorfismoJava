package clases;
public class Rueda {
    private String marca;
    private String material;
    private String tamaño;

    public Rueda(String marca, String material, String tamaño) {
        this.marca = marca;
        this.material = material;
        this.tamaño = tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Rueda{" + "marca=" + marca + ", material=" + material + ", tama\u00f1o=" + tamaño + '}';
    }


}
