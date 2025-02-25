import java.util.Scanner;
class MultipleCalc2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num,cnt=1;
        System.out.println("Enter number: ");
        num = sc.nextInt();
        System.out.print("Mulitples: ");
        while(cnt<100)
        {
            if(num*cnt<100)
            {
                System.out.print((num*cnt)+" ");
            }
            cnt++;
        }
    }
}
