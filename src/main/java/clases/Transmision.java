package clases;
public class Transmision {
    private String marca;
    private String potencia;

    public Transmision(String marca, String potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Transmision{" + "marca=" + marca + ", potencia=" + potencia + '}';
    }

 
}
