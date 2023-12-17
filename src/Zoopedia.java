import animals.Birds;
import animals.Fish;
import animals.Rodents;
import animals.Zookeeper;

public class Zoopedia {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();
        Birds bird = new Birds();
        Fish fish = new Fish();
        Rodents rodent =new Rodents();
System.out.println("Смотритель зоопарка обходит свои свои владения");
zookeeper.makeHide(bird);
zookeeper.makeHide(fish);
zookeeper.makeHide(rodent);
System.out.println("Смотритель не только осматривает животных, но и кормит:");
zookeeper.giveEat(bird);
zookeeper.giveEat(fish);
zookeeper.giveEat(rodent);
    }
}
