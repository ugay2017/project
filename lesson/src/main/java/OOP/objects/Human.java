package OOP.objects;

public class Human {

    public String name;
    public Dog dog;

    public void moveToBus(Bus bus) {
        if(dog == null) {
            System.out.println(name+ " moved to bus "+ bus.number);
        }else {
            System.out.println(name+ " moved to bus "+ bus.number+" with dog "+dog.name );
        }
    }

    public void moveFromBus(Bus bus) {
        if(dog == null) {
            System.out.println(name+ " moved to bus "+ bus.number);
        }else {
            System.out.println(name+ " moved to bus "+ bus.number+" with dog "+dog.name );
        }
    }

    public void addDog(Dog dog) {
        this.dog = dog;
    }
}
