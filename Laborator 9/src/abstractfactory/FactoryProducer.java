package abstractfactory;

public class FactoryProducer {
  public FurnitureFactory getFactory(FurnitureFactoryType furnitureFactoryType) {
    switch (furnitureFactoryType) {
      case MODERN_FACTORY: return new ModernFactory();
      case VICTORIAN_FACTORY: return new VictorianFactory();
    }

    return null;
  }
}
