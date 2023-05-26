package clases;
public class Motor {
    
    private int pistones;
    private String marca;

    public Motor(int pistones, String marca) {
        this.pistones = pistones;
        this.marca = marca;
    }

    public int getPistones() {
        return pistones;
    }

    public void setPistones(int pistones) {
        this.pistones = pistones;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Motor{" + "pistones=" + pistones + ", marca=" + marca + '}';
    }
    
}
