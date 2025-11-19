class Main{
  int i = 0;
    public void display(){
        System.out.println("Hello "+i );
        i++;
        if(i<13){
            display();

        }

    }

    public static void main(String[] args) {

        Main obj =new Main();
        obj.display();
    }
}