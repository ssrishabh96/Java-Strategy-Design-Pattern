import javax.swing.*;

public class DuckSimulator {

    public static void main(String args[]){

        ModelDuck modelDuck= new ModelDuck();
        modelDuck.display();
        modelDuck.quackNow();
        modelDuck.setFlyBehaviour(new FlyWithWings());

        DecoyDuck decoyDuck= new DecoyDuck();
        decoyDuck.display();
        decoyDuck.quackNow();
        decoyDuck.setQuackBehavious(new QuackNoise());
        decoyDuck.quackNow();


    }
}
