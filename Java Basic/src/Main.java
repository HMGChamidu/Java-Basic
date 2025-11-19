

public class  Main {

    public static void main(String[] args) {
             int x =1; //Local


        doSomething();
    }

    static void doSomething(){
        int x =2; //LOCAL
        System.out.println(x);
    }
}