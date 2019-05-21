public class DecoyDuck extends Duck{

    DecoyDuck(){
        setFlyBehaviour(new NoFlyAtAll());
        setQuackBehavious(new NoNoise());
    }

    @Override
    void display() {
        System.out.println("Looks like a deco duck");
    }

}
