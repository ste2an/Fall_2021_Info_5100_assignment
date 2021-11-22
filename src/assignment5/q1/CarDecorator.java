package assignment5.q1;

public abstract class CarDecorator implements Car{

    protected Car basicCar;

    public CarDecorator(Car car) {
        this.basicCar = car;
    }

    @Override
    public void assemble() {
        basicCar.assemble();
    }
}
