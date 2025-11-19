class Main{
  int i = 0;
    public int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return n*factorial(n-1);

        }

    }

    public static void main(String[] args) {
        int y = 6;
        Main obj =new Main();
      int  result = obj.factorial(y);
        System.out.println(result);
    }
}