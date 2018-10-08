package V2;

public class QuackEcho implements Quackable {

    Quackable duck;

    public QuackEcho(Quackable quackable){
        this.duck = quackable;

    }

    @Override
    public void quack() {
        duck.quack();
        System.out.print("Echo: ");
        duck.quack();
    }
}
