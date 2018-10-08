package V3;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactoryC = new CountingDuckFactory();
        AbstractDuckFactory duckFactoryE = new EchoDuckFactory();
        AbstractDuckFactory duckFactory = new DuckFactory();
        simulator.simulate(duckFactory,duckFactoryC,duckFactoryE);
    }
    void simulate(AbstractDuckFactory duckFactory,AbstractDuckFactory duckFactoryC,AbstractDuckFactory duckFactoryE) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable rubberDuck = duckFactory.createRubberDuck();

        Quackable mallardDuckC = duckFactoryC.createMallardDuck();
        Quackable redheadDuckC = duckFactoryC.createRedheadDuck();
        Quackable rubberDuckC = duckFactoryC.createRubberDuck();

        Quackable mallardDuckE = duckFactoryE.createMallardDuck();
        Quackable redheadDuckE = duckFactoryE.createRedheadDuck();
        Quackable rubberDuckE = duckFactoryE.createRubberDuck();

        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());
        System.out.println("Duck Simulator");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeon);
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
        System.out.println("----------------------------------------------");
        simulate(mallardDuckE);
        simulate(redheadDuckE);
        simulate(rubberDuckE);
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
        System.out.println("----------------------------------------------");
        simulate(mallardDuckC);
        simulate(redheadDuckC);
        simulate(rubberDuckC);
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");//The ducks quacked 3 times


    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
