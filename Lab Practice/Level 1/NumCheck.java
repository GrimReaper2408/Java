import java.util.Scanner;
class NumCheck
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] table = new int[10];
        int sum=0,cnt=0;
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter number: ");
            int a = sc.nextInt();
            if(a<=0)
            {
                break;
            }
            table[i] = a;
            cnt++;
            sum+=a;
        }
        for(int i=0;i<cnt;i++)
        {
            System.out.println("Number"+(i+1)+": "+table[i]);
        }
        System.out.println("Sum is: "+sum);
    }
}
