package designpatetrns.factroymethod;

/***
 Solution using Abstract Class
 ****/

// Creator Abstract Class
abstract class Creator {
    public abstract Product factoryMethod();
}

// Concrete Creators
class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}

class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}

// Client Code
public class FactoryMethodAbstractClass {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.factoryMethod();
        productA.display();

        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.factoryMethod();
        productB.display();
    }
}
