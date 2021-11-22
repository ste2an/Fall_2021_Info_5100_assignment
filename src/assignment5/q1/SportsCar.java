package assignment5.q1;

public class SportsCar extends CarDecorator{


    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
       // basicCar.assemble();
        super.assemble();
        System.out.print("Adding feature of sports car. ");
    }
}
