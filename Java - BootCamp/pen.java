import java.util.Scanner;
class pen
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int pens,students,distri,over;
        System.out.println("Enter number of pens and students: ");
        pens = sc.nextInt();
        students = sc.nextInt();
        over = pens%students;
        pens = pens -over;
        distri = pens/students;
        System.out.println("The pen per student is "+distri+" and remaining are "+over);
    }
}