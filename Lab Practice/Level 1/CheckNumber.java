import java.util.Scanner;
class CheckNumber

{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.print("\nEnter number: ");
            num[i] = sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            int a = num[i];
            if(a>0)
            {
                if(a%2==0)
                {
                    System.out.println("Number "+a+" is positive and even.");
                }
                else
                {
                    System.out.println("Number "+a+" is positive and odd.");
                }
            }
            else
            {
                System.out.println("Number "+a+" is negative.");
            }
        }
        int b = num[0];
        int c = num[4];
        if(b>c)
        {
            System.out.println("Number "+b+" is greater than "+c);
        }
        else if(c>b)
        {
            System.out.println("Number "+c+" is greater than "+b);
        }
        else
        {
            System.out.println("Both are equal.");
        }
    }
}
