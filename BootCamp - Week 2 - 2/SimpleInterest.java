import java.util.Scanner;
class SimpleInterest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double Interest, Principal, Rate, Time;
        System.out.println("Enter principal, rate and time: ");
        Principal = sc.nextDouble();
        Rate = sc.nextDouble();
        Time = sc.nextDouble();
        Interest = (Principal * Rate * Time)/100;
        System.out.println("The interest is: "+Interest);
    }
}