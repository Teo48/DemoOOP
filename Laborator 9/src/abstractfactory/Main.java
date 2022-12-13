package abstractfactory;

public class Main {
  public static void main(String [] args) {
    FactoryProducer factoryProducer = new FactoryProducer();
    FurnitureFactory furnitureFactory = factoryProducer.getFactory(FurnitureFactoryType.VICTORIAN_FACTORY);
    furnitureFactory.createChair().sitOn();
  }
}
