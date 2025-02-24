import java.util.Scanner;
class HandshakeCalc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double people,handshakes;
        System.out.println("Enter number of people: ");
        people = sc.nextDouble();
        handshakes = ((people)*(people -1))/2;
        System.out.println("The number of handshakes is: "+handshakes);
    }
}