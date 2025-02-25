import java.util.Scanner;
class PrintNum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num,j=0,k=0;
        int[] even = new int[100];
        int[] odd = new int[100];
        System.out.println("Enter number: ");
        num = sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            if(i%2==0)
            {
                even[j] = i;
                j++;
            }
            else
            {
                odd[k] = i;
                k++;
            }
        }
        System.out.print("Even numbers: ");
        for(int i=0;i<j;i++)
        {
            System.out.print(even[i] + " ");
        }
        System.out.println("");
        System.out.print("Odd numbers: ");
        for(int i=0;i<k;i++)
        {
            System.out.print(odd[i] + " ");
        }
    }
}