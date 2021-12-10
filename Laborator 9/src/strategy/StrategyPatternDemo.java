package strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd()); // Strategy strategy = new OperationAdd();
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract()); // Strategy strategy = new OperationSubstract();
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply()); // Strategy strategy = new OperationMultiply();
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
