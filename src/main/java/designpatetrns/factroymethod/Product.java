package designpatetrns.factroymethod;

// Product Interface
interface Product {
    void display();
}

// Concrete Products
class ConcreteProductA implements Product {
    @Override
    public void display() {
        System.out.println("This is Concrete Product A.");
    }
}

class ConcreteProductB implements Product {
    @Override
    public void display() {
        System.out.println("This is Concrete Product B.");
    }
}
