import java.util.Scanner;
class doubleOperation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter three numbers: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double op1 = (a + (b*c)), op2 = ((a*b) + c), op3 = (c + (a/b)), op4 = ((a%b) + c);
        System.out.println("The answer to the operations are "+op1+", "+op2+", "+op3+", "+op4);
    }
}