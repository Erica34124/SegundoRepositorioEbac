package domain;

public class Carro {
    private String motor;
    private String lataria;
    private String eletrica;
    private String rolagem;
    private boolean ligado = false;
    private boolean desligado = true;

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isDesligado() {
        return desligado;
    }

    public void setDesligado(boolean desligado) {
        this.desligado = desligado;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getLataria() {
        return lataria;
    }

    public void setLataria(String lataria) {
        this.lataria = lataria;
    }

    public String getEletrica() {
        return eletrica;
    }

    public void setEletrica(String eletrica) {
        this.eletrica = eletrica;
    }

    public String getRolagem() {
        return rolagem;
    }

    public void setRolagem(String rolagem) {
        this.rolagem = rolagem;
    }
}
