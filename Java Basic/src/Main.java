class Main{
    public void greeting(){
        System.out.println("Welcome");
    }
    public void display(){
        System.out.println("Hello");
        greeting();
    }

    public static void main(String[] args) {

        Main obj =new Main();
        obj.display();
    }
}