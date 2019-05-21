public class PinkDuck extends Duck {

    PinkDuck(){
        setFlyBehaviour(new FlyWithWings());
        setQuackBehavious(new QuackNoise());
    }

    @Override
    void display() {
        System.out.println("Looks like a pink duck");
    }

}
