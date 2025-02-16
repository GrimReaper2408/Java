import java.util.Scanner;
class intOperation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter three numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int op1 = (a + (b*c)), op2 = ((a*b) + c), op3 = (c + (a/b)), op4 = ((a%b) + c);
        System.out.println("The answer to the operations are "+op1+", "+op2+", "+op3+", "+op4);
    }
}