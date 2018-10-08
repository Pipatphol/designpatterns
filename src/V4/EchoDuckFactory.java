package V4;

public class EchoDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackEcho(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackEcho(new RedheadDuck());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackEcho(new RubberDuck());
    }
}
