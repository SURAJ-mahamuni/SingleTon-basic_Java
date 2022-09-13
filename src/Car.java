public class Car {

    //declare car class to null
    private static Car car = null;

    //making constructor private
    private Car (){

    }

    //create method for accessing private constructor to making object of class
    public static Car getObject(){
        if(car == null){
            car = new Car();
        }
        return car;
    }

    //method
    public String accelerator(){
        return "Now started moving.....";
    }

    public String clutch(){
        return "Changing gear....";
    }

    public String brake(){
        return "will Slow down....";
    }

}
