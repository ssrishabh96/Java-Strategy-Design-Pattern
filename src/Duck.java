abstract public class Duck {

    private FlyBehaviour flyBehaviour;
    private QuackBehavious quackBehavious;


    public Duck(){}

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehavious(QuackBehavious quackBehavious) {
        this.quackBehavious = quackBehavious;
    }

    public void flyNow(){
        flyBehaviour.fly();
    }

    public void quackNow(){
        quackBehavious.makeSound();
    }

    abstract void display();

    public void swim(){
        System.out.println("I am swimming and chilling right now.");
    }
}
