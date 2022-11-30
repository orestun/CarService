public class Car {

    private Engine engine;
    private String make;
    private String model;
    private int year;

    public Car(Engine engine, String make, String model,int year){
        this.engine = engine;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void changeEngine(Engine engine){
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }


    @Override
    public String toString() {
        return "Car[" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                ']';
    }

    public static void main(String[] args) {
        Engine petrolEngine = new PetrolEngine();
        Engine dieselEngine = new DieselEngine();
        Engine electricEngine = new ElectricEngine();

        Car car1 = new Car(petrolEngine,"Porsche","911",2022);
        System.out.println(car1);
        car1.start();

        Car car2 = new Car(electricEngine,"Porsche","Taycan",2021);
        System.out.println(car2);
        car2.start();

        Car car3 = new Car(dieselEngine,"Porsche","Panamera",2021);
        System.out.println(car3);
        car3.start();
        car3.changeEngine(petrolEngine);
        System.out.println(car3);
        car3.start();
    }
}


