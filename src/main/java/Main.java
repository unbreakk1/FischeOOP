public class Main
{
    public static void main(String[] args)
    {
        Car firstCar = new Car("Ford","Mondeo","Red",1996,100);
        firstCar.StartUp();
        firstCar.speed = 0;

        Car secondCar = new Car("Ferrari","SF90","Black",2023,240);
        secondCar.StartUp();

        System.out.println("First Cars speed is: " + firstCar.Accelerate(firstCar ,firstCar.speed));
        System.out.println("Second Cars speed is: " + secondCar.Accelerate(secondCar ,secondCar.speed));


        // both cars exploded, so the speed is a lie.

        Person gernhardt = new Person("Gernhard Reinbolzen", 56, "male");
        gernhardt.Introduce();

        Person trude = new Person("Trude Einhorn", 8,"female");
        trude.Introduce();

        Person elvis = new Person("Elvis Fakley",120,"male");
        elvis.Introduce();
    }


}
