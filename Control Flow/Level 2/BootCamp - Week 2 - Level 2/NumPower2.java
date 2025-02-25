import java.util.Scanner;
class NumPower2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num,power,i=1;
        System.out.println("Enter number and the power: ");
        num = sc.nextInt();
        power = sc.nextInt();
        while(i<power)
        {
            num = num*num;
            i++;
        }
        System.out.println("Power number: "+num);
    }
}