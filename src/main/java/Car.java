public class Car
{
    String brand;
    String model;
    String color;
    int year;
    int speed;

    public Car(String brand, String model, String color, int year, int speed)
    {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.speed = speed;
    }

    public void StartUp()
    {
        System.out.println("Car started...." + "Oh wtf?!?! " + "BOOOOOoooOoOoOoOM");
        System.out.println("you had a car! 8)");
    }

    public int Accelerate(Car car,int speed)
    {
        if(speed > 0)
        {
            speed += 10;
            return speed;
        }
        else
        {
            System.out.println(" what should've been a "+ car.brand + " is now a fireball. Great Job!");
            return 0;
        }
    }

}
