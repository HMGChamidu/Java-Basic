package src;

public class Dog extends Pet {
    private String bread;

    public Dog(String name, int age, String breed){
        super(name, age);
    }

    @Override
    public void makeSound(){
        System.out.println(getName() + " says: Woof! Woof!");
    }

    @Override
    public String toString(){
        return "Dog - " + super.toString()+ ", Breed: " +bread;
    }
}
