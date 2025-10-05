import  java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat= true;

        while(isOnRepeat){
            System.out.println("Playing current song");
            System.out.println("Woud you like to take this song off of repeat? if so, answer yes ");
            String answer= input.next();

            if(answer.equals("yes")){
                isOnRepeat=false;
            }
        }
        System.out.println("Playing next song");



    }
}
