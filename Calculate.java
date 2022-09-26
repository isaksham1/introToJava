 import java.util.Scanner;
public class Calculate {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        double pai=3.14;
        double r;
        System.out.println("****** Manu *******") ;
        System.out.println("1. Calculate Area of Circle");
        System.out.println("2. Calculate Circumference of a Circle");
        System.out.println("3. Exit.");
        int i=sc.nextInt();
        switch(i){

            case 1: {
                System.out.print("Enter the Radius :");
                r= sc.nextDouble();
                System.out.println("Area of Circle" +(pai*r*r));
            }
            case 2:{
                System.out.print("Enter the Radius :");
                r= sc.nextDouble();
                System.out.println("Circumference of Circle" +(2*pai*r));

            }
            case 3:{
                System.out.println("Exit");
            }

        }
   }
}
    

