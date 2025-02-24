import java.util.Scanner;
class Average
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int math,phy,chem,avg;
        System.out.println("Enter marks in Math, Physics, Chemistry in same order: ");
        math = sc.nextInt();
        phy = sc.nextInt();
        chem = sc.nextInt();
        avg = (math+phy+chem)/3;
        System.out.println("Average: "+avg);
    }
}