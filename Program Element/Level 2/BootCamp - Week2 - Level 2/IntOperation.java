import java.util.Scanner;
class IntOperation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter three numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int operation1 = (a + (b*c)), operation2 = ((a*b) + c), operation3 = (c + (a/b)), operation4 = ((a%b) + c);
        System.out.println("The answer to the operations are "+operation1+", "+operation2+", "+operation3+", "+operation4);
    }
}