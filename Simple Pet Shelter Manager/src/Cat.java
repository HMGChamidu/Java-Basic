package src;

public class Cat extends Pet {
    private boolean isVaccinated;

    Cat(String name, int age, boolean isVaccinated){
        super(name,age);
        this.isVaccinated = isVaccinated;
    }

    @Override
          public void makeSound(){
        System.out.println(getName()+ " says: Meeeow~ Purrr. ");
    }

    @Override

       public String toString(){
        String status = isVaccinated ? "Yes" : "No";
        return "Cat - " + super.toString() + ", Vaccinated: "+status;

    }
}
