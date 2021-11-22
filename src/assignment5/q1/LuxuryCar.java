package assignment5.q1;

public class LuxuryCar extends CarDecorator{


    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
      // basicCar.assemble();
        super.assemble();
        System.out.print("Adding feature of Luxury Car. ");
    }
}
