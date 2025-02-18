import java.util.Scanner;
class SideofSquare
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double perimeter,side;
        System.out.println("Enter perimeter of square: ");
        perimeter = sc.nextInt();
        side = perimeter/4;
        System.out.println("Side of Square is "+side);
    }
}