package V2;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }
    void simulate() {
        Quackable mallardDuck = new QuackCounter(new QuackEcho(new MallardDuck()));
        Quackable redheadDuck = new QuackCounter(new QuackEcho(new RedheadDuck()));
        Quackable rubberDuck = new QuackCounter(new QuackEcho(new RubberDuck()));

        Quackable mallardDuck2 = new QuackEcho(new QuackCounter(new MallardDuck()));
        Quackable redheadDuck2 = new QuackEcho(new QuackCounter(new RedheadDuck()));
        Quackable rubberDuck2 = new QuackEcho(new QuackCounter(new RubberDuck()));

        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());
        System.out.println("Duck Simulator");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeon);
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");//The ducks quacked 3 times
        System.out.println("---------------------------------");
        simulate(mallardDuck2);
        simulate(redheadDuck2);
        simulate(rubberDuck2);
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");//The ducks quacked 6 times

    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
