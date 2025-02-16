import java.util.Scanner;
class quotientRemainder
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1,num2,quo,rem;
        System.out.println("Enter two numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        quo = num1/num2;
        rem = num1%num2;
        System.out.println("Quotient and remainder are "+quo+" and "+rem);
    }
}