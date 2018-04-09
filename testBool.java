import java.util.Scanner;
class hypotenuse{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the two sides");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = Math.sqrt(a*a +b*b);
    System.out.println("Hypotenuse is" + c);
  }
}
