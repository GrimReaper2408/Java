import java.util.Scanner;
class FizzBuzzWhile
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num,cnt=0,i=0;
        System.out.println("Enter number: ");
        num = sc.nextInt();
        if(num>0)
        {
            while(i<=num)
            {
                cnt=0;
                if(i%3==0&&i%5==0)
                {
                    System.out.println("FizzBuzz");
                    cnt=1;
                    i++;
                    continue;
                }
                if(i%3==0)
                {
                    System.out.println("Fizz");
                    cnt=1;
                    i++;
                    continue;
                }
                if(i%5==0)
                {
                    System.out.println("Buzz");
                    cnt=1;
                    i++;
                    continue;
                }
                if(cnt==0)
                {
                    System.out.println(i);
                    i++;
                }
                
            }
        }
        else
        {
            System.out.println("Not a positive integer.");
        }
    }
}