import java.util.Scanner;
class MultiDisplay
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] table = new int[10];
        for(int i=0;i<10;i++)
        {
            table[i] = i+1;
        }
        int num;
        System.out.println("Enter number: ");
        num = sc.nextInt();
        for(int i=0;i<10;i++)
        {
            if(table[i]>=6&&table[i]<=9)
            {
                System.out.println(num+" * "+table[i]+" = "+num*table[i]);
            }
        }
    }
}
