import java.util.Scanner;
class sideofSquare
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double peri,side;
        System.out.println("Enter perimeter of square: ");
        peri = sc.nextInt();
        side = peri/4;
        System.out.println("Side of Square is "+side);
    }
}