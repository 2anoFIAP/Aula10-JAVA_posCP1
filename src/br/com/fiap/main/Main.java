package br.com.fiap.main;

import br.com.fiap.bean.Radio;

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.setEstacao(89.1f);
        radio.setVolume(55);
        radio.aumentarVolume();
        radio.aumentarVolume();
        radio.setEstacao(93.5f);
        System.out.printf("Estacao: %.1fMhz\nVolume: %d", radio.getEstacao(), radio.getVolume());
    }
}
