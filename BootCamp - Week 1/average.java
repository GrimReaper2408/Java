//Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
import java.util.Scanner;
class average
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