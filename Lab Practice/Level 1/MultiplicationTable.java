import java.util.Scanner;
class MultiplicationTable
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
            System.out.println(num+" * "+table[i]+" = "+num*table[i]);
        }
    }
}
