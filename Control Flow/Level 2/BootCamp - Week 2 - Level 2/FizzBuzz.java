import java.util.Scanner;
class FizzBuzz
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num,cnt=0;
        System.out.println("Enter number: ");
        num = sc.nextInt();
        if(num>0)
        {
            for(int i=0;i<=num;i++)
            {
                cnt=0;
                if(i%3==0&&i%5==0)
                {
                    System.out.println("FizzBuzz");
                    cnt=1;
                    continue;
                }
                if(i%3==0)
                {
                    System.out.println("Fizz");
                    cnt=1;
                    continue;
                }
                if(i%5==0)
                {
                    System.out.println("Buzz");
                    cnt=1;
                    continue;
                }
                if(cnt==0)
                {
                    System.out.println(i);
                }
            }
        }
        else
        {
            System.out.println("Not a positive integer.");
        }
    }
}