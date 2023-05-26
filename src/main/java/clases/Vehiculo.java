package clases;
public class Vehiculo {
    private String tipo;
    private String marca; 
    private Motor motor;
    private Rueda rueda;
    private Transmision transmision;

    public Vehiculo(String tipo, String marca, Motor motor, Rueda rueda, Transmision transmision) {
        this.tipo = tipo;
        this.marca = marca;
        this.motor = motor;
        this.rueda = rueda;
        this.transmision = transmision;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Rueda getRueda() {
        return rueda;
    }

    public void setRueda(Rueda rueda) {
        this.rueda = rueda;
    }

    public Transmision getTransmision() {
        return transmision;
    }

    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "tipo=" + tipo + ", marca=" + marca + ", motor=" + motor + ", rueda=" + rueda + ", transmision=" + transmision + '}';
    }

 
}
