import java.util.Scanner;
class LargestNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter 3 numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        if(num1>num2)
        {
            if(num1>num3)
            {
                System.out.println(num1+" is the largest");
            }
            else
            {
                System.out.println(num3+" is the largest");
            }
        }
        else
        {
            if(num2>num3)
            {
                System.out.println(num2+" is the largest");
            }
            else
            {
                System.out.println(num3+" is the largest");
            }
        }
        
    }
}
