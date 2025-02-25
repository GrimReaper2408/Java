import java.util.Scanner;
class MultipleCalc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter number: ");
        num = sc.nextInt();
        System.out.print("Mulitples: ");
        for(int i=1;i<=100;i++)
        {
            if(num*i<100)
            {
                System.out.print((num*i)+" ");
            }
        }
    }
}