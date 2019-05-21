public class ModelDuck extends Duck {

    ModelDuck(){
        setFlyBehaviour(new NoFlyAtAll());
        setQuackBehavious(new NoNoise());
    }

    @Override
    void display() {
        System.out.println("Looks like a model usual model duck");
    }
}
