import java.util.Scanner;
class QuotientRemainder
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1,num2,quotient,remainder;
        System.out.println("Enter two numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        quotient = num1/num2;
        remainder = num1%num2;
        System.out.println("Quotient and remainderainder are "+quotient+" and "+remainder);
    }
}