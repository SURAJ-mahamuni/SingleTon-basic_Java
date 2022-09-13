public class Main {
    public static void main(String args[]){

        Car c1 = Car.getObject();
        System.out.println("BMW "+c1.accelerator());

        System.out.println("BMW "+c1.brake());

        System.out.println("BMW "+c1.clutch());
        System.out.println();

        Car c2 = Car.getObject();
        System.out.println("Lamborghini "+c2.accelerator());
        System.out.println("Lamborghini "+c2.brake());
        System.out.println("Lamborghini "+c2.clutch());
    }
}
