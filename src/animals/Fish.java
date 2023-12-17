package animals;

import animals.ProtoAnimals;

public class Fish extends ProtoAnimals {
    @Override
    void voice(){
        System.out.println("Рыбы хлопают ртами, но звука мы не слышим.");

    }
    @Override
    public void hide() {
        System.out.println("рыбы не обращают внимания.");
    }
}
