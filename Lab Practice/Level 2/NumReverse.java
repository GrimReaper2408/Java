import java.util.Scanner;
class NumReverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] numrev = new int[10];
        System.out.println("Enter number to reverse: ");
        int num = sc.nextInt();
        int rem,num2 = num,cnt=0;
        while(num>0)
        {
            rem = num%10;
            numrev[cnt] = rem;
            cnt++;
            num/=10;
        }
        System.out.print("Number: ");
        for(int i=0;i<cnt;i++)
        {
            System.out.print(numrev[i]);
        }
    }
}
