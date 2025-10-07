public class Main {
    public static void main(String[] args) {
     Triangle triangleA=new Triangle(15,8,15,8,17);
     Triangle triangleB = new Triangle(3,2.598,3,3,3);

     double triangleArea = triangleA.findArea();

        System.out.println(triangleArea);


        double triangleBArea=triangleB.findArea();
        System.out.println(triangleBArea);

        System.out.println(triangleA.sideLenThree);
        System.out.println(triangleA.base);

        System.out.println(Triangle.numOfSides);

    }


}






