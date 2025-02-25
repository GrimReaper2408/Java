import java.util.Scanner;
class NumFactor
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter num: ");
        num = sc.nextInt();
        System.out.print("Factors: ");
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}