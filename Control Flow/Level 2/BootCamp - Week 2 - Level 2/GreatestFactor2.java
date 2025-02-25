import java.util.Scanner;
class GreatestFactor2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num,cnt;
        System.out.println("Enter num: ");
        num = sc.nextInt();
        cnt=num-1;
        System.out.print("Greatest Factor: ");
        while(num>0)
        {
            if(num%cnt==0)
            {
                System.out.print(cnt);
                System.exit(0);
            }
            cnt--;
        }
    }
}
