import java.util.Scanner;
class DoubleOperation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter three numbers: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double operation1 = (a + (b*c)), operation2 = ((a*b) + c), operation3 = (c + (a/b)), operation4 = ((a%b) + c);
        System.out.println("The answer to the operations are "+operation1+", "+operation2+", "+operation3+", "+operation4);
    }
}