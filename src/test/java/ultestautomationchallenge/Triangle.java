package ultestautomationchallenge;

public class Triangle {

    public int determineTriangleType(int a,int b,int c){
        ///System.out.println("Hi");
        //first we have to determine if a triangle can be formed by the 3 lengths (integers) which form the sides
        ///this can be achieved by checking if it satisfies the following
        ///if(a+b > c && a+c > b && b+c > a)
        ///else we have to report that cannot form a triangle or Error
        ///Then look for scalene triangle. If no sides are equal, then report as scalene
        ///if 2 sides are equal then report as isosceles
        ///if all 3 sides are equal then report as equilateral triangle

        if(a+b > c && a+c > b && b+c > a){
            System.out.println("A triangle can be formed with the 3 sides :"+a+","+b+","+c+" provided");

            ///scalene triangle - all 3 sides are not equal
            if(a!=b && a!=c && b!=c){
                System.out.println("A scalene triangle can be formed with the 3 sides :"+a+","+b+","+c+" provided");
                return 1;
            }

            //////isosceles triangle
            else if((a+b+c)%3!=0){
                System.out.println("A isosceles triangle can be formed with the 3 sides :"+a+","+b+","+c+" provided");
                return 2;
            }
            else {
                System.out.println("An equilateral triangle can be formed with the 3 sides :"+a+","+b+","+c+" provided");
                return 3;
            }
        }
        else{
            System.out.println("A triangle cannot be formed with the 3 sides :"+a+","+b+","+c+" provided as they don't satisfy the condition a+b > c && a+c > b && b+c > a");
            return 4;
        }



    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        ///t.determineType(8,8,8);
        System.out.println("returned value : "+t.determineTriangleType(20,25,28));
    }

}
