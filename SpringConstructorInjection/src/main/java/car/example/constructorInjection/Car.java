package car.example.constructorInjection;

public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }
    public void getDetails(){
        System.out.println(specification.toString());
    }

}
