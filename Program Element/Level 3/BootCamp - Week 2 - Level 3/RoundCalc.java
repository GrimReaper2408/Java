import java.util.Scanner;
class RoundCalc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double perimeter, rounds, distance = 5000,sides;
        System.out.println("Enter length of sides: ");
        sides = sc.nextDouble();
        perimeter = sides * 3;
        rounds = distance / perimeter;
        System.out.println("The number of rounds is: "+rounds);
    }
}