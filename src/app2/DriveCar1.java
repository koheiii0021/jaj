package app2;

class DriveCar1 {
    public static void main(String[] args){
        Car1 car = new Car1(2525);

        car.run(30);
        car.display();

        car.run(20);
        car.display();
    }
}
