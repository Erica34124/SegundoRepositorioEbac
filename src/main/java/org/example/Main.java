package org.example;

import domain.Peugeot;
import services.PeugeoutService;

public class Main {
    public static void main(String[] args) {
        PeugeoutService carro1 = new PeugeoutService();
        carro1.setPeugeot(new Peugeot("sedan", "preto", "4", 25000f));
        carro1.ligar();
        carro1.desligar();
        carro1.desligar();
        carro1.ligar();
        carro1.ligar();
        carro1.desligar();
        carro1.desligar();
        carro1.desligar();
        carro1.getInformations();
    }
}