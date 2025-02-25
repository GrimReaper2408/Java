import java.util.Scanner;
class SmallestNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter 3 numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        if(num1<num2)
        {
            if(num1<num3)
            {
                System.out.println(num1+" is the smallest");
            }
            else
            {
                System.out.println(num3+" is the smallest");
            }
        }
        else
        {
            if(num2<num3)
            {
                System.out.println(num2+" is the smallest");
            }
            else
            {
                System.out.println(num3+" is the smallest");
            }
        }
        
    }
}