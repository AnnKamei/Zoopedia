package animals;

public class Birds extends ProtoAnimals {
      @Override
      public void hide() {
        System.out.println("птицы могут есть из кормушек, а могут с земли");
    }
    @Override
    void voice() {
        System.out.println("Даже вороны, наверное, щебечут когда им несут еду");
    }

}
