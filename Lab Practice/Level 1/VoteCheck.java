import java.util.Scanner;
class VoteCheck
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter age:");
            ages[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            if(ages[i]<0)
            {
                System.out.println("Invalid age.");
            }
            else if(ages[i]>=18)
            {
                System.out.println("The student wiht age "+ages[i]+" can vote.");
            }
            else if(ages[i]<18)
            {
                System.out.println("The student with age "+ages[i]+" cannot vote.");
            }
        }
    }
}
