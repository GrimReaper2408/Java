import java.util.Scanner;
class Pen
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int pens,students,distributed,over;
        System.out.println("Enter number of pens and students: ");
        pens = sc.nextInt();
        students = sc.nextInt();
        over = pens%students;
        pens = pens -over;
        distributed = pens/students;
        System.out.println("The pen per student is "+distributed+" and remaining are "+over);
    }
}