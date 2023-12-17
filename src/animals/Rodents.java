package animals;

import animals.ProtoAnimals;

public class Rodents extends ProtoAnimals {
    @Override
    void voice (){
        System.out.println("Грызуны тоненько пищат и когда радуются и когда испуганы.");
    }
    @Override
    public void hide() {

        System.out.println("Я грызун, я уменю хорошо рыть норки.");
        super.hide();
    }

}
