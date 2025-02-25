import java.util.Scanner;
class NumPower
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num,power;
        System.out.println("Enter number and the power: ");
        num = sc.nextInt();
        power = sc.nextInt();
        for(int i=1;i<power;i++)
        {
            num = num*num;
        }
        System.out.println("Power number: "+num);
    }
}