package animals;

import animals.ProtoAnimals;

public class Zookeeper {
    public void  makeHide(ProtoAnimals protoAnimals){
        System.out.println("Когда он подходит");
        protoAnimals.hide();
        }
    public void  giveEat(ProtoAnimals protoAnimals){
            System.out.println("Cмотритель должен следить, чтобы животные были сыты");
        protoAnimals.eat();
        }


}
