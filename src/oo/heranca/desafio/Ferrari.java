package oo.heranca.desafio;

public class Ferrari extends Carro{

    Ferrari() {
        this(300);
    }

    Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 280;
    }

//    @Override
//    void acelerar() {
//        super.acelerar();
//    }
}
