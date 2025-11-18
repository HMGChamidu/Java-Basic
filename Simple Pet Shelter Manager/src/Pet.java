package src;

public abstract class Pet {
    private String name;
    private int age ;

    public Pet(String name, int age){
        this.name = name;
        this.age = age;

    }

    public String getName(){
        return name;

    }

    public abstract void makeSound();

    @Override
    public String toString(){
        return "Name: " + name+ ", Age: " +age;
    }
}
