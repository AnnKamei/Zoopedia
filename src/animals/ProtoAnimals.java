package animals;

public abstract class ProtoAnimals {
    public void hide(){
        System.out.println("Я умею хорошо пряться.");
    }
   abstract void voice();
   public void eat(){
        System.out.println("Когда я живу в зоопарке меня нужно кормить.");
    };
}
