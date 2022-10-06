package services;

import domain.Peugeot;

/**
 * @author Érica
 * <ol>
 *     <li>Domain</li>
 *     <li>Controllers</li>
 *     <li>Services</li>
 * </ol>
 * {@link https://lms.ebaconline.com.br/lesson/60db7844-2d4e-4692-927d-dcccaecc4703/}
 * @see <a>https://lms.ebaconline.com.br/lesson/60db7844-2d4e-4692-927d-dcccaecc4703/</a>
 */
public class PeugeoutService implements Actions {

    private Peugeot peugeot;

    public Peugeot getPeugeot() {
        return peugeot;
    }

    public void setPeugeot(Peugeot peugeot) {
        this.peugeot = peugeot;
    }
//verificação das caracteristicas do carro
    public void getInformations() {
        System.out.println(peugeot.getCor());
        System.out.println(peugeot.getModelo());
        System.out.println(peugeot.getValor());
        System.out.println(peugeot.getMotor());
    }
/*
Logica para ligar o carro
 */
    @Override
    public void ligar() {
        if (this.peugeot.isLigado()) {
            this.peugeot.setDesligado(true);
            System.out.println("O carro está ligado!");
        } else {
            System.out.println("Ligando o carro");
            this.peugeot.setLigado(true);
            this.peugeot.setDesligado(true);
        }
    }

    @Override
    public void desligar() {
        if (this.peugeot.isLigado()) {
            this.peugeot.setDesligado(true);
            this.peugeot.setLigado(false);
            System.out.println("Desligando o Carro... ");
        } else {
            this.peugeot.setDesligado(true);
            this.peugeot.setLigado(false);
            System.out.println("O carro já estava desligado! ");
        }
    }

    @Override
    public void andar() {
        System.out.println("Carro andando ...");
    }

    @Override
    public void parar() {
        System.out.println("Carro parando ...");

    }
}
